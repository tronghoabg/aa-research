package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g1 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f21583a;

    public g1(JSONObject jSONObject) {
        this.f21583a = jSONObject;
    }

    public Integer a() {
        return JsonUtils.getInteger(this.f21583a, "dark_mode_toolbar_color", null);
    }

    public String b() {
        return JsonUtils.getString(this.f21583a, "digital_asset_link_url", null);
    }

    public Boolean c() {
        return JsonUtils.getBoolean(this.f21583a, "instant_apps_enabled", null);
    }

    public String d() {
        return JsonUtils.getString(this.f21583a, "referrer", null);
    }

    public Integer e() {
        return JsonUtils.getInteger(this.f21583a, "session_url_relation", null);
    }

    public Integer f() {
        return JsonUtils.getInteger(this.f21583a, "share_state", null);
    }

    public Boolean g() {
        return JsonUtils.getBoolean(this.f21583a, "should_show_title", null);
    }

    public Integer h() {
        return JsonUtils.getInteger(this.f21583a, "toolbar_color", null);
    }

    public Boolean i() {
        return JsonUtils.getBoolean(this.f21583a, "url_bar_hiding_enabled", null);
    }
}
