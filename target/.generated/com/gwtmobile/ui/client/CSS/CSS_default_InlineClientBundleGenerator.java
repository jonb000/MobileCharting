package com.gwtmobile.ui.client.CSS;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class CSS_default_InlineClientBundleGenerator implements com.gwtmobile.ui.client.CSS.CSS {
  private static CSS_default_InlineClientBundleGenerator _instance0 = new CSS_default_InlineClientBundleGenerator();
  private void arrowdownInitializer() {
    arrowdown = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "arrowdown",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 22, 22, false, false
    );
  }
  private static class arrowdownInitializer {
    static {
      _instance0.arrowdownInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return arrowdown;
    }
  }
  public com.google.gwt.resources.client.ImageResource arrowdown() {
    return arrowdownInitializer.get();
  }
  private void arrowupInitializer() {
    arrowup = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "arrowup",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 22, 22, false, false
    );
  }
  private static class arrowupInitializer {
    static {
      _instance0.arrowupInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return arrowup;
    }
  }
  public com.google.gwt.resources.client.ImageResource arrowup() {
    return arrowupInitializer.get();
  }
  private void transitionsInitializer() {
    transitions = new com.gwtmobile.ui.client.CSS.Transitions() {
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
        return "transitions";
      }
      public String getText() {
        return (".GEF0STNBLI,.GEF0STNBNI,.GEF0STNBMI{-webkit-transition-property:" + ("-webkit-transform")  + ";-webkit-transition-duration:" + ("300ms")  + ";-webkit-transition-timing-function:" + ("ease-in-out")  + ";position:" + ("absolute")  + ";}.GEF0STNBLI.GEF0STNBHI,.GEF0STNBLI.GEF0STNBII.GEF0STNBKI.GEF0STNBOI{-webkit-transform:" + ("translate3d(100%,0,0)")  + ";}.GEF0STNBLI.GEF0STNBII.GEF0STNBOI,.GEF0STNBLI.GEF0STNBHI.GEF0STNBKI{-webkit-transform:" + ("translate3d(-100%,0,0)")  + ";}.GEF0STNBLI.GEF0STNBII,.GEF0STNBLI.GEF0STNBII.GEF0STNBKI,.GEF0STNBLI.GEF0STNBHI.GEF0STNBOI,.GEF0STNBLI.GEF0STNBHI.GEF0STNBKI.GEF0STNBOI{-webkit-transform:" + ("translate3d(0,0,0)")  + ";}.GEF0STNBNI.GEF0STNBHI{z-index:" + ("1")  + ";-webkit-transform:" + ("translate3d(0,100%,0)")  + ";}.GEF0STNBNI.GEF0STNBII.GEF0STNBKI,.GEF0STNBMI.GEF0STNBHI,.GEF0STNBMI.GEF0STNBII.GEF0STNBKI{z-index:" + ("1")  + ";}.GEF0STNBNI.GEF0STNBII,.GEF0STNBNI.GEF0STNBHI.GEF0STNBKI,.GEF0STNBMI.GEF0STNBII,.GEF0STNBMI.GEF0STNBHI.GEF0STNBKI{z-index:") + (("0")  + ";}.GEF0STNBNI.GEF0STNBII.GEF0STNBKI.GEF0STNBOI{-webkit-transform:" + ("translate3d(0,100%,0)")  + ";}.GEF0STNBNI.GEF0STNBII,.GEF0STNBNI.GEF0STNBHI.GEF0STNBKI,.GEF0STNBNI.GEF0STNBII.GEF0STNBKI,.GEF0STNBNI.GEF0STNBHI.GEF0STNBOI{-webkit-transform:" + ("translate3d(0,0,0)")  + ";}.GEF0STNBMI.GEF0STNBHI,.GEF0STNBMI.GEF0STNBII.GEF0STNBKI.GEF0STNBOI{-webkit-transform:" + ("translate3d(0,-100%,0)")  + ";}.GEF0STNBMI.GEF0STNBII,.GEF0STNBMI.GEF0STNBHI.GEF0STNBKI,.GEF0STNBMI.GEF0STNBII.GEF0STNBKI,.GEF0STNBMI.GEF0STNBHI.GEF0STNBOI{-webkit-transform:" + ("translate3d(0,0,0)")  + ";}.GEF0STNBEI{-webkit-transition-property:" + ("opacity")  + ";-webkit-transition-duration:" + ("1000ms")  + ";-webkit-transition-timing-function:" + ("ease-in-out")  + ";position:" + ("absolute")  + ";}.GEF0STNBEI.GEF0STNBHI,.GEF0STNBEI.GEF0STNBHI.GEF0STNBKI,.GEF0STNBEI.GEF0STNBII.GEF0STNBOI,.GEF0STNBEI.GEF0STNBII.GEF0STNBKI.GEF0STNBOI{opacity:" + ("0")  + ";}.GEF0STNBEI.GEF0STNBII,.GEF0STNBEI.GEF0STNBII.GEF0STNBKI,.GEF0STNBEI.GEF0STNBHI.GEF0STNBOI,.GEF0STNBEI.GEF0STNBHI.GEF0STNBKI.GEF0STNBOI{opacity:" + ("1") ) + (";}.GEF0STNBFI,.GEF0STNBGI{-webkit-transition-property:" + ("-webkit-transform")  + ";-webkit-transition-duration:" + ("300ms")  + ";-webkit-transition-timing-function:" + ("ease-out")  + ";-webkit-transform-style:" + ("preserve-3d")  + ";-webkit-backface-visibility:" + ("hidden")  + ";position:" + ("absolute")  + ";}.GEF0STNBFI.GEF0STNBII,.GEF0STNBFI.GEF0STNBII.GEF0STNBKI{-webkit-transform:" + ("perspective(4000)"+ " " +"rotateY(0)"+ " " +"scale(1)")  + ";}.GEF0STNBFI.GEF0STNBII.GEF0STNBOI,.GEF0STNBGI.GEF0STNBHI.GEF0STNBKI{-webkit-transform:" + ("perspective(4000)"+ " " +"rotateY(-90deg)"+ " " +"scale(0.8)")  + ";}.GEF0STNBGI.GEF0STNBHI,.GEF0STNBFI.GEF0STNBII.GEF0STNBKI.GEF0STNBOI{-webkit-transform:" + ("perspective(4000)"+ " " +"rotateY(90deg)"+ " " +"scale(0.8)")  + ";}.GEF0STNBGI.GEF0STNBHI.GEF0STNBOI,.GEF0STNBGI.GEF0STNBHI.GEF0STNBKI.GEF0STNBOI{-webkit-transform:" + ("perspective(4000)"+ " " +"rotateY(0)"+ " " +"scale(1)")  + ";}.GEF0STNBJI{-webkit-transition-property:") + (("-webkit-transform")  + ";-webkit-transition-duration:" + ("250ms")  + ";-webkit-transition-timing-function:" + ("ease-in-out")  + ";position:" + ("absolute")  + ";}.GEF0STNBJI.GEF0STNBHI,.GEF0STNBJI.GEF0STNBII.GEF0STNBKI.GEF0STNBOI{-webkit-transform:" + ("scale(0)")  + ";}.GEF0STNBJI.GEF0STNBHI.GEF0STNBKI,.GEF0STNBJI.GEF0STNBHI.GEF0STNBKI.GEF0STNBOI{-webkit-transform:" + ("scale(1)")  + ";z-index:" + ("-1")  + ";}.GEF0STNBJI.GEF0STNBHI.GEF0STNBOI,.GEF0STNBJI.GEF0STNBII.GEF0STNBKI{-webkit-transform:" + ("scale(1)")  + ";}.GEF0STNBPI,.GEF0STNBAJ{-webkit-transition-property:" + ("-webkit-transform")  + ";-webkit-transition-duration:" + ("200ms")  + ";-webkit-transition-timing-function:" + ("linear") ) + (";}.GEF0STNBPI.GEF0STNBII{z-index:" + ("10")  + ";-webkit-transform:" + ("translate3d(0,0,0)"+ " " +"scale(1)")  + ";opacity:" + ("1")  + ";}.GEF0STNBAJ.GEF0STNBHI{z-index:" + ("10")  + ";}.GEF0STNBPI.GEF0STNBHI,.GEF0STNBAJ.GEF0STNBII{z-index:" + ("0")  + ";}.GEF0STNBAJ.GEF0STNBHI.GEF0STNBOI,.GEF0STNBPI.GEF0STNBII.GEF0STNBKI,.GEF0STNBAJ.GEF0STNBHI.GEF0STNBKI.GEF0STNBOI{-webkit-transform:" + ("translate3d(0,0,0)"+ " " +"scale(1)")  + ";opacity:" + ("1")  + ";}.GEF0STNBPI.GEF0STNBII.GEF0STNBOI,.GEF0STNBAJ.GEF0STNBII,.GEF0STNBPI.GEF0STNBHI.GEF0STNBKI.GEF0STNBOI,.GEF0STNBAJ.GEF0STNBHI.GEF0STNBKI{-webkit-transform:" + ("translate3d(-50%,0,0)"+ " " +"scale(0.8)")  + ";opacity:" + ("1")  + ";}.GEF0STNBPI.GEF0STNBHI,.GEF0STNBAJ.GEF0STNBII.GEF0STNBOI,.GEF0STNBPI.GEF0STNBHI.GEF0STNBKI,.GEF0STNBAJ.GEF0STNBII.GEF0STNBKI.GEF0STNBOI{-webkit-transform:" + ("translate3d(0,0,0)"+ " " +"scale(0.4)")  + ";opacity:") + (("0.4")  + ";}.GEF0STNBPI.GEF0STNBHI.GEF0STNBOI,.GEF0STNBAJ.GEF0STNBHI,.GEF0STNBPI.GEF0STNBII.GEF0STNBKI.GEF0STNBOI,.GEF0STNBAJ.GEF0STNBII.GEF0STNBKI{-webkit-transform:" + ("translate3d(50%,0,0)"+ " " +"scale(0.8)")  + ";opacity:" + ("1")  + ";}");
      }
      public java.lang.String fade(){
        return "GEF0STNBEI";
      }
      public java.lang.String flip0(){
        return "GEF0STNBFI";
      }
      public java.lang.String flip1(){
        return "GEF0STNBGI";
      }
      public java.lang.String in(){
        return "GEF0STNBHI";
      }
      public java.lang.String out(){
        return "GEF0STNBII";
      }
      public java.lang.String pop(){
        return "GEF0STNBJI";
      }
      public java.lang.String reverse(){
        return "GEF0STNBKI";
      }
      public java.lang.String slide(){
        return "GEF0STNBLI";
      }
      public java.lang.String slidedown(){
        return "GEF0STNBMI";
      }
      public java.lang.String slideup(){
        return "GEF0STNBNI";
      }
      public java.lang.String start(){
        return "GEF0STNBOI";
      }
      public java.lang.String swap0(){
        return "GEF0STNBPI";
      }
      public java.lang.String swap1(){
        return "GEF0STNBAJ";
      }
    }
    ;
  }
  private static class transitionsInitializer {
    static {
      _instance0.transitionsInitializer();
    }
    static com.gwtmobile.ui.client.CSS.Transitions get() {
      return transitions;
    }
  }
  public com.gwtmobile.ui.client.CSS.Transitions transitions() {
    return transitionsInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABYAAAAWCAYAAADEtGw7AAACT0lEQVR42p2VzatxURTG/cUmBhhcYmKAEApFxIAy8BH5CPksFPJdZCAUyYCkTNbtWbVPrvfc12XVc52793p+Z+29zj5HoXgRFouF5KT4NLxeL+XzeRqPx3Q4HOh+v7NwjTHMIefPQFRTKBRou93SY9xuN9ZjIAe5L1fgcrmo0+lIxsvlQsfjUVaYEwEPvL9WKqCobL/f/0liFfDKVo4liSp3u91bEtWD8QPq8XhouVzS+Xym9Xr9keAFAywJnEgk6HQ60WazodVqRYvFgmazGXcfwjXGoPl8zmOj0UgahwdeMMCS9rZcLnOHhXk6nZLP5yOVSkUajYb8fj8NBgMaDocUiUTo6+uLlEolOZ1OvonwgQEW7zX+tNttviuAUK/XY+j1euUnAPBYLEaZTIa0Wi0vHYHxVqtFk8mEfWCAJYH7/T5PoiKo2+2Sw+GgQCDAgGazSTqdjvR6PaVSKR7Dr9ls5qdB+MAASwIDhCqF8H+xWGQQEhFut5tBCFSsVqt5Bajw2SuBK5UK31kIyfV6nYLBIC9XHAoAsT0Gg4FvVKvVOPfRC5YERiexV49qNBpcNeYBERGNRslkMvG7AjnPPrCkgxIKhaharf4jdDidTpPRaGQg9hXVwlwqlWQ9YEnPMRoFAECPghmnKZlMcjOtVivF43HK5XI895wPBvJ+nD48AYA8C0sGKJvNsnCNMblcMGRfQuFwWAK8K3h/fX3abDbeIyzpHcED78sXPY4zmoUm/U/IQe5bnyq73c6fHlQDAJoG4RpjmEPOx9++Tz+m359uxYgMZNcfAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABYAAAAWCAYAAADEtGw7AAACW0lEQVR42p2V3Yu5QRTH/c3cSEoKJbRWtCgiLly4WBblnWTzUt5JaJVQJBekLTfn1/fUTGz2Z5n6rtmZ8/3MOTPzPI9CcadZrVa6JcWzzePxUDqdpsFgQNvtls7nMwt9jGEOMX8GIptMJkOr1You2/f3N+uyIQaxdytwOp3UaDSk8Xg80m63uynMiQYPvL9mKqDIbLPZ/EmiCnhvZo6SRJbr9fohiezBuIK63W6azWZ0OBxosVhcaT6f03Q6pdFoxJpMJjz2Mw5eMMCS4Pf3d9rv97RcLunr60sKgbgBPp+P1Go1qVQqent7o36/z4tdxsILBlhybwuFAp8wgoWQGQCxWIyhOLDT6UR6vZ7C4TD1ej2OufSAARbvNf7U63VeVZQLAVqpVMhgMFC1WpU3YDwek1arpWw2S91ul4bDofSAAZYEt9ttDkAWUKfTYRjm/H4/A/F/PB7nPn5NJhMvjFjhAwMsCW42m9RqtaSwaiAQ4C1A+dgG9JVKJR8UmsVi4SevVqtdecGS4GKxyPdQCJnodDouG83lcpHZbCabzcZANCyg0WioXC5fecGSYJzk5+enVKlUIofDwSVHIhEyGo2USCQomUxyH9uDOVSBdwa2SXjBkg9KMBjklYVwsjC+vr7yowpoLpdjAY4twBxuTD6fv/KCJe8xgj4+PhgIIRgQPEkQ+hj7OY6bgTHhAwOsq6cP5QnDswLj5ksoFApRKpV6SvD++vp8eXnhPUJJjwgeeO++6L1eL98GnPD/hBjEPvSpstvtfPrIBoBoNMpCH2OYQ8zT375nP6b/AA7vxXxPGlHQAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource arrowdown;
  private static com.google.gwt.resources.client.ImageResource arrowup;
  private static com.gwtmobile.ui.client.CSS.Transitions transitions;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      arrowdown(), 
      arrowup(), 
      transitions(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("arrowdown", arrowdown());
        resourceMap.put("arrowup", arrowup());
        resourceMap.put("transitions", transitions());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'arrowdown': return this.@com.gwtmobile.ui.client.CSS.CSS::arrowdown()();
      case 'arrowup': return this.@com.gwtmobile.ui.client.CSS.CSS::arrowup()();
      case 'transitions': return this.@com.gwtmobile.ui.client.CSS.CSS::transitions()();
    }
    return null;
  }-*/;
}
