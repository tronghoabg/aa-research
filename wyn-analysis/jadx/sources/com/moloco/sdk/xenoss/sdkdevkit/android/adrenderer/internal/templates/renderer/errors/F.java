package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class F implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {

    /* renamed from: a, reason: collision with root package name */
    public static final F f30629a;

    /* renamed from: b, reason: collision with root package name */
    public static final F f30630b;

    /* renamed from: c, reason: collision with root package name */
    public static final F f30631c;

    /* renamed from: d, reason: collision with root package name */
    public static final F f30632d;

    /* renamed from: e, reason: collision with root package name */
    public static final F f30633e;

    /* renamed from: f, reason: collision with root package name */
    public static final F f30634f;

    /* renamed from: g, reason: collision with root package name */
    public static final F f30635g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ F[] f30636h;

    static {
        F f10 = new F("UNKNOWN_ERROR", 0);
        f30629a = f10;
        F f11 = new F("WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);
        f30630b = f11;
        F f12 = new F("WEBVIEW_RECEIVED_ERROR", 2);
        f30631c = f12;
        F f13 = new F("WEBVIEW_REQUIRED_CONTENT_HTTP_ERROR", 3);
        f30632d = f13;
        F f14 = new F("WEBVIEW_RENDER_PROCESS_GONE_ERROR", 4);
        f30633e = f14;
        F f15 = new F("WEBVIEW_TIMEOUT_ERROR", 5);
        f30634f = f15;
        F f16 = new F("WEBVIEW_NOT_AVAILABLE_ERROR", 6);
        F f17 = new F("WEBVIEW_FULLSCREEN_ACTIVITY_START_FAILED", 7);
        f30635g = f17;
        F[] fArr = {f10, f11, f12, f13, f14, f15, f16, f17};
        f30636h = fArr;
        ic.d.t(fArr);
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f30636h.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
