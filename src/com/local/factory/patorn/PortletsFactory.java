package com.local.factory.patorn;

public class PortletsFactory {

	public PortletsFactory() {
		// TODO Auto-generated constructor stub
	}

	public Portlets createPortlets(String portletType) {

		if (PortletTypeEnum.IMAGE_SLIDERPORTLET.getKey().equalsIgnoreCase(
				portletType)) {
			return new ImageSliderPortlets();
		} else if (PortletTypeEnum.RICH_TEXT_PORTLET.getKey().equalsIgnoreCase(
				portletType)) {
			return new RichTextPortlets();
		} else {
			return new StanderdPortlets();
		}

	}
}
