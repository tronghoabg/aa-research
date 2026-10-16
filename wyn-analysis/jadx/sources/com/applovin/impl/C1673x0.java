package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.ads.BuildConfig;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1673x0 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f23490a;

    /* renamed from: com.applovin.impl.x0$a */
    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    private C1673x0(JSONObject jSONObject) {
        this.f23490a = jSONObject;
    }

    public static C1673x0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "title", (JSONObject) null), ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, null);
        if ("TOS".equalsIgnoreCase(string) && kVar.x().h() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && kVar.x().f() == null) {
            return null;
        }
        return new C1673x0(jSONObject);
    }

    public String b() {
        return JsonUtils.getString(this.f23490a, "event", null);
    }

    public a c() {
        String string = JsonUtils.getString(this.f23490a, "style", null);
        return BuildConfig.FLAVOR.equalsIgnoreCase(string) ? a.POSITIVE : ("destructive".equalsIgnoreCase(string) || "cancel".equalsIgnoreCase(string)) ? a.NEGATIVE : a.NEUTRAL;
    }

    public String d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f23490a, "title", (JSONObject) null);
        return com.applovin.impl.sdk.k.a(JsonUtils.getString(jSONObject, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, ""), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + d() + ", destinationStateId=" + a() + ", event=" + b() + "}";
    }

    public int a() {
        return JsonUtils.getInt(this.f23490a, "destination_state_id", -1);
    }
}
