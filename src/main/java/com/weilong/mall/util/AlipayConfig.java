package com.weilong.mall.util;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016103000779865";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCJYt8+5ecXIw9QSCh+rYRZB4+C81nZeIfYDsZZCSrH23cvy5YJIpYxd00b4NiYEqATapjJIB2wCOR45hIt8H2xxhqgDXv1f9HH6DgVnOaDSu/O0a9IgD+jhJC3kdUZeQitfB44USO6/1lns4H9JTidrtOS7SJmJDbO89bgevaG+aGIDt3Ij7Kb5+FKtbU7/PBQ84K+wIzgxyJTFb6YS9u3vaVAGmOpzyKnVG1jXOQHv60MTP9k16uK85cYtkfJt443689qfbFVXtM5dMp9/1vV9YQDj8tMk8RrDuKEr+m6pl+NYsImGw++3pfeBwSBtVon1eSNbMdotLvEU7UzEDUvAgMBAAECggEAZbaVoXOES1ThmYZStLayLVezoDeaZa8eo48Mug5XZe/Npc0MH2dD2wuAQwuMT8o6SSW6R+1HDXUH8ZokC27pIBySybwx8efX4DDElPu8jaeFM5F6PCr28pDKs518L4e0LPyfQwKPeXpjLqtvqYNNDzDH4xc9SHG3QjC0/S0MJ5DAZ0Mxp+8rPwtoUpy6vkcl46fbcQvV7afa1Hi56S6pbd0UU9atQ+QvPHr2S9sJRnzGDcMogVH5PFZuK9sWFHMS9UWmRD8ij9Ry/dhH3kCv30VizgHMJJlaFanIQW67I3JsIaMBO7UFT+mdPWQOL8QRNZRWXjFAiZxTBha7tQVQAQKBgQDaUHgPKp/c/RBpMtjQYyC/+MmATYowsIsDLirs9SJnGj90IJ6fRPsKBBM7kw65c/4bf2XmPe2G6+/1SJNKKwSivTbYnpHjeD51JXlcbfFovXy/xbyQH0Coy7upqNrJp+4vRHhjSLY5ZZwzxjYz0Owp915aoHVz6N5ztQfscHN4LwKBgQChGhuinkUqQn6fJbkdQ+SmpH2WwuQvDwcapa3rVTK6Uj3PnUs4dMaoOwcvKSYqvOuraVBV3iHuLhBIGyLalqxLzKHTE9FCvz9VlPTxFqLfzl3TdhDjQ2nS0PwygqY/rS0x/nZyy2EzsJijytGj+HzeVixCMtMeAUSCCvBvANLTAQKBgG8+f98iljFylpE0gry1NnP8HxmM6XTkEQH+3Yq/YtdszZasJIf+C3nQF8jMp70ieQKkCVWoisespCq136/0ebk/d5osOyTRGepxvQS3VUNNAytpZCuAcV9R6X+Ldmk5dCqL1lipLYnT2COdxfLja+P6lA7UIuV8bRZC0hXOO1irAoGANveqgDTSUpX3kCOV4rdcl8M+GqeKpcfR27S1/7rFIS+YaXM4zB2D/riNPfkjTafCHW1EfNfa6eKLqZ6gqMaKKR68BEIZv1VzraayYGQh1I0cFF+PaYuB2u11b2KGiOl0pz80ePyNwM47dn9oQjMxn8b1OO0QfYdfMaO735P/WwECgYAFJk8sxVV/AvoPkRDKC74zK/L9dT+GYIURXB30L0lycpp5vcNKUnlNA05wFwOzaZzmhlliqH2uH/deHZPIAea0YhWY20bgGuX5PO6Lg/LD/JGInsw3EpmihomHr3fKxNe6KFEsl5w0Z6NfHtSzduSFVkl3NmJyiexrOgo3JNM4bg==";


    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgSKjC9YqTkZwawg2/beC4OsOoV7/OC8vIGYD1ncXdaAzhxwVMPM1hafrtmkEwFEmrumaHIhQC/vNF9dP2xGCFwSn/tSnY/xrr1Pf2HtRnwx4fOSu/BkN6AZXPRzEVS6sn1OnjHI3RJukCQSIU9qlKdtZvEehHVfaxWPpGcV6PrnWMsPdKTQtd/AeNTtlRvAjw0f6vfqtdS00SqiC6rXMjKs5fIS4068wamBwUR/WwWqXqIK++3eJahwXmc5DcmJbyCcarp/0Yxz05+3ggCyQ5TQE3r/sI/tzAJyiUTqUFvId+F/psOhd9y14fm+5RnbeI2wjKa4mIgKjAd5tg7oFHwIDAQAB";


    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/toysmall/paySuccess";
   // public static String notify_url = "http://127.0.0.1:8080/toysmall/alipayNotify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/toysmall/alipaySuccess";
   // public static String return_url = "http://127.0.0.1:8080/toysmall/alipayReturn";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
