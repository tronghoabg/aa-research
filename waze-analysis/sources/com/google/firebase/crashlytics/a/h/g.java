package com.google.firebase.crashlytics.a.h;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {
    public static final d a(JSONObject jSONObject) throws JSONException {
        j jVar;
        int i2 = jSONObject.getInt("settings_version");
        if (i2 != 3) {
            com.google.firebase.crashlytics.a.i.a().d("Could not determine SettingsJsonTransform for settings version " + i2 + ". Using default settings values.");
            jVar = new j(1);
        } else {
            jVar = new j(0);
        }
        return jVar.a(jSONObject);
    }

    public static int b(int i2) {
        return i2 - 1;
    }
}
