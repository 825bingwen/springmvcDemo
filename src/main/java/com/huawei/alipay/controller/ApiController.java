package com.huawei.alipay.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayMobilePublicMessageCustomSendRequest;
import com.alipay.api.response.AlipayMobilePublicMessageCustomSendResponse;
import com.huawei.alipay.util.AlipayAPIClientFactory;

@Controller
@RequestMapping(value = "/api")
public class ApiController{
	
	private static Logger logger = LoggerFactory.getLogger(ApiController.class);

	@ResponseBody
	@RequestMapping(value = "/alipayPush", method = RequestMethod.GET , produces = "application/json; charset=utf-8")
	public String get(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		
		String requestMsg = request.getParameter("param");
		Map<String, String> reqMap = new HashMap<String, String>();
		
		try {
            // 2.1 构建一个业务响应消息，开发者根据自行业务构建，这里只是一个简单的样例
            AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
            AlipayMobilePublicMessageCustomSendRequest aliRequest = new AlipayMobilePublicMessageCustomSendRequest();
            aliRequest.setBizContent(requestMsg);

            // 2.2 使用SDK接口类发送响应
            AlipayMobilePublicMessageCustomSendResponse aliResponse = alipayClient
                .execute(aliRequest);

            // 2.3 开发者根据响应结果处理结果
            //这里只是简单的打印，请开发者根据实际情况自行进行处理
            if (null != aliResponse && aliResponse.isSuccess()) {
            	reqMap.put("resCode", aliResponse.getCode().toString());
            	reqMap.put("resMsg", "消息推送成功");
            	logger.info("异步发送成功，结果为：" + aliResponse.getBody());
            } else {
            	reqMap.put("resCode", aliResponse.getCode().toString());
            	reqMap.put("resMsg", "异步发送失败 code=" + aliResponse.getCode() + "msg："
                        + aliResponse.getMsg());
            	logger.info("异步发送失败 code=" + aliResponse.getCode() + "msg："
                                   + aliResponse.getMsg());
            }
        } catch (Exception e) {
        	e.printStackTrace();
        	logger.error("异步发送失败");
        }
		return net.sf.json.JSONObject.fromObject(reqMap).toString();
	}
}
