package com.google.firebase.crashlytics.a.h;

import com.waze.strings.DisplayStrings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f9764a;

    j(int i2) {
        this.f9764a = i2;
    }

    static d b() {
        return new d(System.currentTimeMillis() + 3600000, new c(8), new b(true, false, false), 10.0d, 1.2d, 60);
    }

    private static c c(JSONObject jSONObject) {
        return new c(jSONObject.optInt("max_custom_exception_events", 8));
    }

    @Override // com.google.firebase.crashlytics.a.h.h
    public final d a(JSONObject jSONObject) throws JSONException {
        if (this.f9764a != 0) {
            return b();
        }
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", DisplayStrings.DS_CONVERSATIONAL_REPORTING_TTS_HAZARD_REPORTED);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        c cVarC = jSONObject.has("session") ? c(jSONObject.getJSONObject("session")) : c(new JSONObject());
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new d(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : System.currentTimeMillis() + (iOptInt * 1000), cVarC, new b(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
    }
}
