package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public class wk {

    /* renamed from: oa, reason: collision with root package name */
    private final int f25713oa;
    private final int uef;

    public wk(JSONObject jSONObject) {
        this.uef = jSONObject.optInt("auto_click", 0);
        this.f25713oa = jSONObject.optInt("hidden_bar", 0);
    }

    public boolean oa() {
        return this.f25713oa == 1;
    }

    public int uef() {
        return this.uef;
    }

    public static boolean uef(gzw gzwVar) {
        if (gzwVar == null || !gzwVar.ebe() || gzwVar.vk() == null) {
            return false;
        }
        return gzwVar.vk().oa();
    }
}
