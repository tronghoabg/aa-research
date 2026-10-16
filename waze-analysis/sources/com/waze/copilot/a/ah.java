package com.waze.copilot.a;

import android.net.Uri;
import com.waze.ConfigManager;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private final ConfigManager f22682a;

    public ah(ConfigManager configManager) {
        h.g.b.x.f(configManager, "configManager");
        this.f22682a = configManager;
    }

    public final Uri a(String str) {
        h.g.b.x.f(str, "campaignId");
        String configValueString = this.f22682a.getConfigValueString(ConfigValues.CONFIG_VALUE_COPILOT_MARKETPLACE_CAR_CAMPAIGN_URL);
        h.g.b.x.e(configValueString, "getConfigValueString(...)");
        if (configValueString.length() == 0) {
            Uri uri = Uri.EMPTY;
            h.g.b.x.e(uri, "EMPTY");
            return uri;
        }
        Uri uriBuild = Uri.parse(configValueString).buildUpon().appendEncodedPath(str).build();
        h.g.b.x.e(uriBuild, "build(...)");
        return uriBuild;
    }
}
