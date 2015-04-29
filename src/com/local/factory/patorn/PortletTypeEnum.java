package com.local.factory.patorn;

public enum PortletTypeEnum {

	IMAGE_SLIDERPORTLET("image_slider_portlet"), RICH_TEXT_PORTLET(
			"rich_text_portlet"), OTHER_PORTLET("other_portlet");

	String key;

	PortletTypeEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

}
