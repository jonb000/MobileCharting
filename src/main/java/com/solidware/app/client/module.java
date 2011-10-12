package com.solidware.app.client;

import com.solidware.app.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

import com.gwtmobile.ui.client.utils.Utils;
import com.gwtmobile.ui.client.widgets.*;
import com.gwtmobile.ui.client.page.*;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class module implements EntryPoint {
  
	  MainPage mainPage;
		
		
		public void onModuleLoad() {
			new Timer() {
				@Override
				public void run() {
					if (mainPage == null) {
						Utils.Console("Loading main ui...");
						mainPage = new MainPage();
						Page.load(mainPage);
					}
					else {
						this.cancel();
					}
				}
			}.scheduleRepeating(50);
		}

   
  }

