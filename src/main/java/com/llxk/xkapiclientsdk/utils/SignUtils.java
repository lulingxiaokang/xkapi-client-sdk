package com.llxk.xkapiclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * ClassName: SignUtils
 * Package: com.llxk.xkapiinterface.utils
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc 签名工具
 * @Date 2023/8/24 23:21
 */
public class SignUtils {

    /**
     * 生成签名
     * @param body
     * @param secretKey
     * @return
     */
    public static String getSign(String body, String secretKey){
        Digester md5 = new Digester(DigestAlgorithm.SHA256);
        String context = body.toString() + "." + secretKey;
        return md5.digestHex(context);
    }
}
