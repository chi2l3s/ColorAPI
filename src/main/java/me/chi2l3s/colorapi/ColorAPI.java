package me.chi2l3s.colorapi;

import org.bukkit.plugin.java.JavaPlugin;

public final class ColorAPI extends JavaPlugin {

    private static ColorAPI instance;
    private ColorUtil colorUtil;

    @Override
    public void onEnable() {
        instance = this;
        colorUtil = new ColorUtilImpl();
    }

    public static ColorAPI getInstance() {
        return instance;
    }

    public ColorUtil getColorUtil() {
        return colorUtil;
    }
}
