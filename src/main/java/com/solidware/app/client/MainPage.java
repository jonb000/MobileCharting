package com.solidware.app.client;

/*
 * Copyright (c) 2010 Zhihua (Dennis) Jiang
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */


import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.gwtmobile.ui.client.event.SelectionChangedEvent;
import com.gwtmobile.ui.client.page.Page;
import com.gwtmobile.ui.client.utils.Utils;
import com.gwtmobile.ui.client.widgets.ListPanel;

public class MainPage extends Page {

	@UiField ListPanel list;

	private static MainPageUiBinder uiBinder = GWT
	.create(MainPageUiBinder.class);

	interface MainPageUiBinder extends UiBinder<Widget, MainPage> {
	}

	public MainPage() {
		initWidget(uiBinder.createAndBindUi(this));
		
		Window.addResizeHandler(new ResizeHandler() {		
			
			public void onResize(ResizeEvent event) {
				Utils.Console("gwtmobile-msg:window resized to " + event.getWidth() + " " + event.getHeight());
			}
		});
	}

	@UiHandler("list")
	void onListSelectionChanged(SelectionChangedEvent e) {
		switch (e.getSelection()) {
		case 0:
			ButtonPage bp = new ButtonPage();
			this.goTo(bp);
			break;
		}
		
	}



}
