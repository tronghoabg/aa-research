package com.applovin.impl;

import com.amazon.device.ads.DTBAdSize;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1672x {

    /* renamed from: a, reason: collision with root package name */
    private final String f23484a;

    /* renamed from: b, reason: collision with root package name */
    private final DTBAdSize f23485b;

    /* renamed from: com.applovin.impl.x$a */
    public enum a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public C1672x(String str, JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.f23484a = str;
        this.f23485b = a(JsonUtils.getInt(jSONObject, "type", a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    public DTBAdSize a() {
        return this.f23485b;
    }

    private a a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? a.DISPLAY : a.INTERSTITIAL;
    }

    private DTBAdSize a(int i5, MaxAdFormat maxAdFormat, String str) {
        try {
            if (a.VIDEO.ordinal() == i5) {
                return new DTBAdSize.DTBVideo(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 480, str);
            }
            if (a.DISPLAY.ordinal() == i5) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (a.INTERSTITIAL.ordinal() == i5) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
