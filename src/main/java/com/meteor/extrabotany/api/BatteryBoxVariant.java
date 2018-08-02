package com.meteor.extrabotany.api;

import java.util.Locale;

import net.minecraft.util.IStringSerializable;

public enum BatteryBoxVariant implements IStringSerializable {
	DEFAULT;
	
	@Override
	public String getName() {
		return name().toLowerCase(Locale.ROOT);
	}
}
