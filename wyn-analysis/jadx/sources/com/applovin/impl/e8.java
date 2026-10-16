package com.applovin.impl;

import A7.AbstractC0279p0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e8 {

    /* renamed from: a, reason: collision with root package name */
    private final int f21522a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21523b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21524c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21525d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21526e;

    /* renamed from: f, reason: collision with root package name */
    private final int f21527f;

    /* renamed from: g, reason: collision with root package name */
    private final int f21528g;

    /* renamed from: h, reason: collision with root package name */
    private final int f21529h;

    /* renamed from: i, reason: collision with root package name */
    private final float f21530i;

    /* renamed from: j, reason: collision with root package name */
    private final float f21531j;

    public e8(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f21522a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f21523b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f21524c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f21525d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f21526e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f21527f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f21528g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f21529h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f21530i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f21531j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    public float a() {
        return this.f21530i;
    }

    public long b() {
        return this.f21528g;
    }

    public float c() {
        return this.f21531j;
    }

    public long d() {
        return this.f21529h;
    }

    public int e() {
        return this.f21525d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e8 e8Var = (e8) obj;
            if (this.f21522a == e8Var.f21522a && this.f21523b == e8Var.f21523b && this.f21524c == e8Var.f21524c && this.f21525d == e8Var.f21525d && this.f21526e == e8Var.f21526e && this.f21527f == e8Var.f21527f && this.f21528g == e8Var.f21528g && this.f21529h == e8Var.f21529h && Float.compare(e8Var.f21530i, this.f21530i) == 0 && Float.compare(e8Var.f21531j, this.f21531j) == 0) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f21523b;
    }

    public int g() {
        return this.f21524c;
    }

    public long h() {
        return this.f21527f;
    }

    public int hashCode() {
        int i5 = ((((((((((((((this.f21522a * 31) + this.f21523b) * 31) + this.f21524c) * 31) + this.f21525d) * 31) + (this.f21526e ? 1 : 0)) * 31) + this.f21527f) * 31) + this.f21528g) * 31) + this.f21529h) * 31;
        float f10 = this.f21530i;
        int iFloatToIntBits = (i5 + (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f21531j;
        return iFloatToIntBits + (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f11) : 0);
    }

    public int i() {
        return this.f21522a;
    }

    public boolean j() {
        return this.f21526e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VideoButtonProperties{widthPercentOfScreen=");
        sb2.append(this.f21522a);
        sb2.append(", heightPercentOfScreen=");
        sb2.append(this.f21523b);
        sb2.append(", margin=");
        sb2.append(this.f21524c);
        sb2.append(", gravity=");
        sb2.append(this.f21525d);
        sb2.append(", tapToFade=");
        sb2.append(this.f21526e);
        sb2.append(", tapToFadeDurationMillis=");
        sb2.append(this.f21527f);
        sb2.append(", fadeInDurationMillis=");
        sb2.append(this.f21528g);
        sb2.append(", fadeOutDurationMillis=");
        sb2.append(this.f21529h);
        sb2.append(", fadeInDelay=");
        sb2.append(this.f21530i);
        sb2.append(", fadeOutDelay=");
        return AbstractC0279p0.m(sb2, this.f21531j, '}');
    }
}
