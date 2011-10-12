package com.solidware.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ButtonPage_ButtonPageUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.solidware.app.client.ButtonPage>, com.solidware.app.client.ButtonPage.ButtonPageUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("OK")
    SafeHtml html1();
     
    @Template("OK")
    SafeHtml html2();
     
    @Template("Cancel")
    SafeHtml html3();
     
    @Template("Yes")
    SafeHtml html4();
     
    @Template("No")
    SafeHtml html5();
     
    @Template("Cancel")
    SafeHtml html6();
     
    @Template("<span id='{0}'></span> <span id='{1}'></span>")
    SafeHtml html7(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.solidware.app.client.ButtonPage owner) {

    com.solidware.app.client.ButtonPage_ButtonPageUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.solidware.app.client.ButtonPage_ButtonPageUiBinderImpl_GenBundle) GWT.create(com.solidware.app.client.ButtonPage_ButtonPageUiBinderImpl_GenBundle.class);
    com.solidware.app.client.ButtonPage_ButtonPageUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label2 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.gwtmobile.ui.client.widgets.HeaderPanel header = (com.gwtmobile.ui.client.widgets.HeaderPanel) GWT.create(com.gwtmobile.ui.client.widgets.HeaderPanel.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.gwtmobile.ui.client.widgets.Button ok1 = (com.gwtmobile.ui.client.widgets.Button) GWT.create(com.gwtmobile.ui.client.widgets.Button.class);
    com.gwtmobile.ui.client.widgets.ListItem f_ListItem5 = (com.gwtmobile.ui.client.widgets.ListItem) GWT.create(com.gwtmobile.ui.client.widgets.ListItem.class);
    com.gwtmobile.ui.client.widgets.Button ok2 = (com.gwtmobile.ui.client.widgets.Button) GWT.create(com.gwtmobile.ui.client.widgets.Button.class);
    com.gwtmobile.ui.client.widgets.Button cancel2 = (com.gwtmobile.ui.client.widgets.Button) GWT.create(com.gwtmobile.ui.client.widgets.Button.class);
    com.gwtmobile.ui.client.widgets.ListItem f_ListItem6 = (com.gwtmobile.ui.client.widgets.ListItem) GWT.create(com.gwtmobile.ui.client.widgets.ListItem.class);
    com.gwtmobile.ui.client.widgets.Button yes3 = (com.gwtmobile.ui.client.widgets.Button) GWT.create(com.gwtmobile.ui.client.widgets.Button.class);
    com.gwtmobile.ui.client.widgets.Button no3 = (com.gwtmobile.ui.client.widgets.Button) GWT.create(com.gwtmobile.ui.client.widgets.Button.class);
    com.gwtmobile.ui.client.widgets.Button cancel3 = (com.gwtmobile.ui.client.widgets.Button) GWT.create(com.gwtmobile.ui.client.widgets.Button.class);
    com.gwtmobile.ui.client.widgets.ListItem f_ListItem7 = (com.gwtmobile.ui.client.widgets.ListItem) GWT.create(com.gwtmobile.ui.client.widgets.ListItem.class);
    com.gwtmobile.ui.client.widgets.ListItem f_ListItem8 = (com.gwtmobile.ui.client.widgets.ListItem) GWT.create(com.gwtmobile.ui.client.widgets.ListItem.class);
    com.gwtmobile.ui.client.widgets.ListPanel f_ListPanel4 = (com.gwtmobile.ui.client.widgets.ListPanel) GWT.create(com.gwtmobile.ui.client.widgets.ListPanel.class);
    com.gwtmobile.ui.client.widgets.ScrollPanel f_ScrollPanel3 = (com.gwtmobile.ui.client.widgets.ScrollPanel) GWT.create(com.gwtmobile.ui.client.widgets.ScrollPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html7(domId0, domId1).asString());

    f_Label2.setText("Button");
    header.add(f_Label2);
    header.setLeftButton("Back");
    ok1.setHTML(template.html1().asString());
    f_ListItem5.add(ok1);
    f_ListPanel4.add(f_ListItem5);
    ok2.setHTML(template.html2().asString());
    f_ListItem6.add(ok2);
    cancel2.setHTML(template.html3().asString());
    f_ListItem6.add(cancel2);
    f_ListPanel4.add(f_ListItem6);
    yes3.setHTML(template.html4().asString());
    f_ListItem7.add(yes3);
    no3.setHTML(template.html5().asString());
    f_ListItem7.add(no3);
    cancel3.setHTML(template.html6().asString());
    f_ListItem7.add(cancel3);
    f_ListPanel4.add(f_ListItem7);
    f_ListPanel4.add(f_ListItem8);
    f_ListPanel4.setSecondaryStyle("" + style.modify() + "");
    f_ListPanel4.setSelectable(false);
    f_ScrollPanel3.add(f_ListPanel4);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(header, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(f_ScrollPanel3, domId1Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onClickOk1(event);
      }
    };
    ok1.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onClickOk2(event);
      }
    };
    ok2.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onClickCancel2(event);
      }
    };
    cancel2.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onClickYes3(event);
      }
    };
    yes3.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onClickNo3(event);
      }
    };
    no3.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onClickCancel(event);
      }
    };
    cancel3.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6);

    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
