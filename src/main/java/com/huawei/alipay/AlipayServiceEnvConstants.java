/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.huawei.alipay;

/**
 * 支付宝服务窗环境常量（demo中常量只是参考，需要修改成自己的常量值）
 * 
 * @author taixu.zqq
 * @version $Id: AlipayServiceConstants.java, v 0.1 2014年7月24日 下午4:33:49 taixu.zqq Exp $
 */
public class AlipayServiceEnvConstants {

    /**支付宝公钥-从支付宝服务窗获取*/
    public static final String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";

    /**签名编码-视支付宝服务窗要求*/
    public static final String SIGN_CHARSET      = "GBK";

    /**字符编码-传递给支付宝的数据编码*/
    public static final String CHARSET           = "GBK";

    /**签名类型-视支付宝服务窗要求*/
    public static final String SIGN_TYPE         = "RSA";

    /** 服务窗appId  */
    //TODO !!!! 注：该appId必须设为开发者自己的服务窗id  这里只是个测试id
    public static final String APP_ID            = "2015070800159743";

    //开发者请使用openssl生成的密钥替换此处  请看文档：https://fuwu.alipay.com/platform/doc.htm#2-1接入指南
    //TODO !!!! 注：该私钥为测试账号私钥  开发者必须设置自己的私钥 , 否则会存在安全隐患 
    public static final String PRIVATE_KEY       = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAOX/1b9aZZQY5Oelx10fS09F2OH0JBlQ+jOq/hhVNgA2u9cFU6fW7biZ43QngyJQ63RJIBKedd91QqgLvo4OQipgHF88BzId0XVltn7YUuU+TDaHMYz1QugQdAOZ7NNe/J076nhtUnR343T/EhaTU2kDOTC8WXrvPcIGVZjFvUF/AgMBAAECgYB2kvWkiDsUJd1lG49zj92oic7tdothzeCf4IjNDKkhZRZkHSfqwKCf6h5cVL6DY4pv0f9J+g203WQ29I8R94HeEpliBoGg6zAe0uwsWFVhbxgjAqKpenJawnYKYKt1DYtnBXVZJ7L7U34TF1nOx12CRTIkkOoikxhNVhWxAzmGGQJBAPhDE+vHmbNIfJu66yEamKpReO2EVmRsLWn+99TuOQEMiuxgarD6lQn1OxVZ9nlVyxe8FjJli8jjNE0v9rdgRgUCQQDtKwlR15l4garp29H+ahLLDSykJIxR79J5K/XrhELgcEC8O//kdEc+hN2EbLoVynnHyIaVsRRlYQ8SoTYQQNyzAkA/0I44VzBNA170cNGryrhfX13kP9YtLhlmW6G83BdPC7hSFl6Wa3MQAjdTv7I5cjIoQbK69Zs+4hg5lxCmBls5AkEAjX8rpER5L8hM7BFWC+/FHpfRlmynuwrWC60Kn2TdcYIHXUZ+uRIWn1otvyAPNYkDdwpQIWbwwDtT/s1nr/LCuQJBAJgRwcDBsC+B/5hBRvia1yWoAgmtCpY6SjorCvZTL/FLa19bEIUy7L/E6bywQCOsUjRSUiF8fwF0i36FWR6UDYk=";

    //TODO !!!! 注：该公钥为测试账号公钥  开发者必须设置自己的公钥 ,否则会存在安全隐患
    public static final String PUBLIC_KEY        = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDl/9W/WmWUGOTnpcddH0tPRdjh9CQZUPozqv4YVTYANrvXBVOn1u24meN0J4MiUOt0SSASnnXfdUKoC76ODkIqYBxfPAcyHdF1ZbZ+2FLlPkw2hzGM9ULoEHQDmezTXvydO+p4bVJ0d+N0/xIWk1NpAzkwvFl67z3CBlWYxb1BfwIDAQAB";

    /**支付宝网关*/
    public static final String ALIPAY_GATEWAY    = "https://openapi.alipay.com/gateway.do";
    
    /**授权访问令牌的授权类型*/
    public static final String GRANT_TYPE        = "authorization_code";
}
