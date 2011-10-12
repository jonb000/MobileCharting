package com.solidware.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MainPage_MainPageUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.solidware.app.client.MainPage>, com.solidware.app.client.MainPage.MainPageUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span> <span id='{1}'></span>")
    SafeHtml html1(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.solidware.app.client.MainPage owner) {

    com.solidware.app.client.MainPage_MainPageUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.solidware.app.client.MainPage_MainPageUiBinderImpl_GenBundle) GWT.create(com.solidware.app.client.MainPage_MainPageUiBinderImpl_GenBundle.class);
    com.solidware.app.client.MainPage_MainPageUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.gwtmobile.ui.client.widgets.HeaderPanel f_HeaderPanel2 = (com.gwtmobile.ui.client.widgets.HeaderPanel) GWT.create(com.gwtmobile.ui.client.widgets.HeaderPanel.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label f_Label8 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label f_Label10 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.gwtmobile.ui.client.widgets.ListItem f_ListItem9 = (com.gwtmobile.ui.client.widgets.ListItem) GWT.create(com.gwtmobile.ui.client.widgets.ListItem.class);
    com.gwtmobile.ui.client.widgets.ListPanel list = (com.gwtmobile.ui.client.widgets.ListPanel) GWT.create(com.gwtmobile.ui.client.widgets.ListPanel.class);
    com.gwtmobile.ui.client.widgets.ScrollPanel f_ScrollPanel4 = (com.gwtmobile.ui.client.widgets.ScrollPanel) GWT.create(com.gwtmobile.ui.client.widgets.ScrollPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0, domId1).asString());

    f_Label3.setText("Hello GWT Mobile UI!");
    f_HeaderPanel2.add(f_Label3);
    f_Label5.setText("Animations");
    list.add(f_Label5);
    f_Label6.setText("Panels");
    list.add(f_Label6);
    f_Label7.setText("Widgets");
    list.add(f_Label7);
    f_Label8.setText("Server Communication");
    list.add(f_Label8);
    f_Label10.setText("Themes");
    f_ListItem9.add(f_Label10);
    f_ListItem9.setShowArrow(false);
    f_ListItem9.setDisabled(true);
    list.add(f_ListItem9);
    list.setShowArrow(true);
    f_ScrollPanel4.add(list);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(f_HeaderPanel2, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(f_ScrollPanel4, domId1Element);


    final com.gwtmobile.ui.client.event.SelectionChangedHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.gwtmobile.ui.client.event.SelectionChangedHandler() {
      public void onSelectionChanged(com.gwtmobile.ui.client.event.SelectionChangedEvent event) {
        owner.onListSelectionChanged(event);
      }
    };
    list.addSelectionChangedHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.list = list;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
