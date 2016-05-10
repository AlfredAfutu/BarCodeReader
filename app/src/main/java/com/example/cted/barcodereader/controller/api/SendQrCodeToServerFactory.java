/**
 * File generated by Magnet rest2mobile 1.1 - Apr 20, 2015 5:26:22 PM
 * @see {@link http://developer.magnet.com}
 */

package com.example.cted.barcodereader.controller.api;

import com.magnet.android.mms.MagnetMobileClient;
import com.magnet.android.mms.controller.ControllerFactory;
import com.magnet.android.mms.controller.AbstractControllerSchemaFactory;
import com.magnet.android.mms.controller.RequestSchema;
import com.magnet.android.mms.controller.RequestSchema.JMethod;
import com.magnet.android.mms.controller.RequestSchema.JMeta;
import com.magnet.android.mms.controller.RequestSchema.JParam;

import java.util.Arrays;
import java.util.Collection;


public class SendQrCodeToServerFactory extends ControllerFactory<SendQrCodeToServer> {
  public SendQrCodeToServerFactory(MagnetMobileClient magnetClient) {
    super(SendQrCodeToServer.class, SendQrCodeToServerSchemaFactory.getInstance().getSchema(), magnetClient);
  }

  // Schema factory for controller SendQrCodeToServer
  public static class SendQrCodeToServerSchemaFactory extends AbstractControllerSchemaFactory {
    private static SendQrCodeToServerSchemaFactory __instance;

    public static synchronized SendQrCodeToServerSchemaFactory getInstance() {
      if(null == __instance) {
        __instance = new SendQrCodeToServerSchemaFactory();
      }

      return __instance;
    }

    private SendQrCodeToServerSchemaFactory() {}

    protected synchronized void initSchemaMaps() {
      if(null != schema) {
        return;
      }

      schema = new RequestSchema();
      schema.setRootPath("");

      //controller schema for controller method qrCodeSend
      JMethod method1 = addMethod("qrCodeSend",
        "qrCode/send",
        "POST",
        void.class,
        null,
        null,
        null);
      method1.setBaseUrl("http://gemroc-dev.gemroc.com");
      method1.addParam("userId",
        "QUERY",
        String.class,
        null,
        "",
        true);
      method1.addParam("qrCode",
        "QUERY",
        String.class,
        null,
        "",
        true);
      method1.addParam("barcodereader-api",
        "HEADER",
        String.class,
        null,
        "",
        true);
    }

  }

}
