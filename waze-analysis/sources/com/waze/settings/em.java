package com.waze.settings;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.waze.ConfigManager;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class em implements com.waze.settings.tree.c.h {
    @Override // com.waze.settings.tree.c.h
    public final /* synthetic */ LiveData a() {
        return com.waze.settings.tree.a.d.d(this);
    }

    @Override // com.waze.settings.tree.c.h
    public final String b() {
        String configValueString = ConfigManager.getInstance().getConfigValueString(ConfigValues.CONFIG_VALUE_NAVIGATION_GUIDANCE_MODE);
        h.g.b.x.e(configValueString, "getConfigValueString(...)");
        return configValueString;
    }

    @Override // com.waze.settings.tree.c.h
    public final void c(View view, String str, String str2) {
        ConfigManager.getInstance().setConfigValueString(ConfigValues.CONFIG_VALUE_NAVIGATION_GUIDANCE_MODE, str);
    }
}
