package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public class gsd {
    private final int moa;

    /* renamed from: oa, reason: collision with root package name */
    private final int f25678oa;
    private final int uef;
    private final int yo;

    public gsd(JSONObject jSONObject) {
        this.uef = jSONObject.optInt("max_time", 0);
        this.f25678oa = jSONObject.optInt("auto_skip_time", -1);
        this.yo = jSONObject.optInt("show_after_inactivity", 10);
        this.moa = jSONObject.optInt("user_wait_time", 10);
    }

    public int oa() {
        return this.yo;
    }

    public int uef() {
        return this.uef;
    }

    public int yo() {
        return this.moa;
    }
}
