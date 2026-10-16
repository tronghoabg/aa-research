package kd;

import android.webkit.JavascriptInterface;

/* renamed from: kd.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3323t {

    /* renamed from: a, reason: collision with root package name */
    public final String f39694a;

    /* renamed from: b, reason: collision with root package name */
    public final C3313i f39695b;

    public C3323t(String str, C3313i c3313i) {
        this.f39694a = str;
        this.f39695b = c3313i;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        C3313i c3313i = this.f39695b;
        c3313i.f39663a.x(new com.applovin.impl.sdk.nativeAd.e(27, this, str));
    }
}
