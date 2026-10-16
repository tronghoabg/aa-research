package com.waze.gw;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;

/* loaded from: classes10.dex */
public final class AmbientTheme {
    public static final int CHISADIN_PINK = -53874;
    public static final int MINT = -10690106;
    public static final int MODE_AMBER = 2;
    public static final int MODE_CHISADIN = 1;
    public static final int MODE_CUSTOM = 4;
    public static final int MODE_MINT = 3;
    public static final int MODE_WAZE = 0;
    public static final String PREF_CUSTOM = "ambient_custom_color";
    public static final String PREF_MODE = "ambient_color_mode";
    public static final int SUNLIGHT_AMBER = -15043;
    public static final int WAZE_BLUE = -13382401;

    private AmbientTheme() {
    }

    public static int color(Context context) {
        if (context == null) {
            return WAZE_BLUE;
        }
        try {
            return color(context.getSharedPreferences("waze_hud_gw", 0));
        } catch (Throwable th) {
            return WAZE_BLUE;
        }
    }

    public static int color(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return WAZE_BLUE;
        }
        switch (sharedPreferences.getInt(PREF_MODE, 0)) {
        }
        return WAZE_BLUE;
    }

    public static int presetColor(int i2, int i3) {
        switch (i2) {
            case 1:
                return CHISADIN_PINK;
            case 2:
                return SUNLIGHT_AMBER;
            case 3:
                return MINT;
            case 4:
                return opaque(i3);
            default:
                return WAZE_BLUE;
        }
    }

    public static int opaque(int i2) {
        return i2 | (-16777216);
    }

    public static int withAlpha(int i2, int i3) {
        return Color.argb(Math.max(0, Math.min(255, i3)), Color.red(i2), Color.green(i2), Color.blue(i2));
    }
}
