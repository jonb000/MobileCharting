package com.solidware.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MainPage_MainPageUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.solidware.app.client.MainPage_MainPageUiBinderImpl_GenBundle {
  private static MainPage_MainPageUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new MainPage_MainPageUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.solidware.app.client.MainPage_MainPageUiBinderImpl_GenCss_style() {
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
        return ("");
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.solidware.app.client.MainPage_MainPageUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.solidware.app.client.MainPage_MainPageUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.solidware.app.client.MainPage_MainPageUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.solidware.app.client.MainPage_MainPageUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
