package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l8 {

    /* renamed from: a, reason: collision with root package name */
    private final String f21876a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21877b;

    /* renamed from: c, reason: collision with root package name */
    private final List f21878c;

    public l8(JSONObject jSONObject) {
        this.f21876a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f21877b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.f21878c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.f21876a;
    }

    public String b() {
        return this.f21877b;
    }

    public List c() {
        return this.f21878c;
    }
}
