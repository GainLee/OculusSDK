package com.oculusvr.api;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : OVR_CAPI.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ovrRecti_ extends Structure {
  /** C type : ovrVector2i */
  public ovrVector2i_ Pos;
  /** C type : ovrSizei */
  public ovrSizei_ Size;
  public ovrRecti_() {
    super();
  }
  protected List<? > getFieldOrder() {
    return Arrays.asList("Pos", "Size");
  }
  /**
   * @param Pos C type : ovrVector2i<br>
   * @param Size C type : ovrSizei
   */
  public ovrRecti_(ovrVector2i_ Pos, ovrSizei_ Size) {
    super();
    this.Pos = Pos;
    this.Size = Size;
  }
  public static class ByReference extends ovrRecti_ implements Structure.ByReference {
    
  };
  public static class ByValue extends ovrRecti_ implements Structure.ByValue {
    
  };
}