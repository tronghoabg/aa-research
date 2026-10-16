package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dj {
    private Map<String, Object> moa;

    /* renamed from: oa, reason: collision with root package name */
    private JSONObject f24680oa;
    private Context uef;
    private JSONObject yo;

    public void oa(JSONObject jSONObject) {
        this.yo = jSONObject;
    }

    public void uef(Context context) {
        this.uef = context;
    }

    public Map<String, Object> oa() {
        return this.moa;
    }

    public void uef(JSONObject jSONObject) {
        this.f24680oa = jSONObject;
    }

    public JSONObject uef() {
        return this.yo;
    }

    public void uef(Map<String, Object> map) {
        this.moa = map;
    }
}
