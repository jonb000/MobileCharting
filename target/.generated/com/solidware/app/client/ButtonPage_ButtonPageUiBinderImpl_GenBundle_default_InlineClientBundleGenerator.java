package com.solidware.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ButtonPage_ButtonPageUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.solidware.app.client.ButtonPage_ButtonPageUiBinderImpl_GenBundle {
  private static ButtonPage_ButtonPageUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new ButtonPage_ButtonPageUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.solidware.app.client.ButtonPage_ButtonPageUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return (".GEF0STNBBJ>div>div{-webkit-box-flex:" + ("1")  + ";margin:" + ("0"+ " " +"0.5em"+ " " +"0"+ " " +"0.5em")  + ";}");
      }
      public java.lang.String modify(){
        return "GEF0STNBBJ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.solidware.app.client.ButtonPage_ButtonPageUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.solidware.app.client.ButtonPage_ButtonPageUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.solidware.app.client.ButtonPage_ButtonPageUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.solidware.app.client.ButtonPage_ButtonPageUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
