package com.waze.copilot.a;

import android.net.Uri;
import com.waze.ConfigManager;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    private final ConfigManager f22694a;

    public am(ConfigManager configManager) {
        h.g.b.x.f(configManager, "configManager");
        this.f22694a = configManager;
    }

    public final Uri a() {
        Uri uri;
        String str;
        String configValueString = this.f22694a.getConfigValueString(ConfigValues.CONFIG_VALUE_COPILOT_MARKETPLACE_URL);
        h.g.b.x.e(configValueString, "getConfigValueString(...)");
        if (configValueString.length() == 0) {
            uri = Uri.EMPTY;
            str = "EMPTY";
        } else {
            uri = Uri.parse(configValueString);
            str = "parse(...)";
        }
        h.g.b.x.e(uri, str);
        return uri;
    }
}
