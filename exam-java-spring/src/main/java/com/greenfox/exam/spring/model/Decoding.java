package com.greenfox.exam.spring.model;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.springframework.util.Base64Utils;

/**
 * Created by Viktor on 2017-06-06.
 */
public class Decoding {

  public static String encode(String value) throws Exception {
    return  Base64.getEncoder().encodeToString(value.getBytes(StandardCharsets.UTF_8));
  }

  public static String decode(String value) throws Exception {
    byte[] decodedValue = Base64.getDecoder().decode(value);
    return new String(decodedValue, StandardCharsets.UTF_8);
  }

  public static void main(String[] args) throws Exception {


    String code = "VHJpYmVzIG9mIExhZ29wdXMgQmFja2VuZCBTZXJ2aWNl";
    byte[] array = code.getBytes();
    String res2 = Base64Utils.decode(code);
    System.out.println( res2 + " string --> "  + res2);
      /*
       * output
       *   try this howto base64 -> dHJ5IHRoaXMgaG93dG8=
       *   dHJ5IHRoaXMgaG93dG8= string --> try this howto
       */
  }
}
