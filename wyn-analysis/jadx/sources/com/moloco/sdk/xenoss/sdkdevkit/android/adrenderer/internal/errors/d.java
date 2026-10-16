package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final d f30101a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f30102b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f30103c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f30104d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f30105e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f30106f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f30107g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f30108h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f30109i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f30110j;
    public static final d k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f30111l;

    /* renamed from: m, reason: collision with root package name */
    public static final d f30112m;

    /* renamed from: n, reason: collision with root package name */
    public static final d f30113n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ d[] f30114o;

    static {
        d dVar = new d("MRAID_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 0);
        f30101a = dVar;
        d dVar2 = new d("MRAID_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 1);
        f30102b = dVar2;
        d dVar3 = new d("MRAID_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 2);
        f30103c = dVar3;
        d dVar4 = new d("MRAID_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 3);
        f30104d = dVar4;
        d dVar5 = new d("MRAID_WEBVIEW_INTERNAL_TIMEOUT_ERROR", 4);
        f30105e = dVar5;
        d dVar6 = new d("MRAID_FULLSCREEN_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 5);
        f30106f = dVar6;
        d dVar7 = new d("MRAID_FULLSCREEN_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 6);
        f30107g = dVar7;
        d dVar8 = new d("MRAID_FULLSCREEN_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 7);
        f30108h = dVar8;
        d dVar9 = new d("MRAID_FULLSCREEN_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 8);
        f30109i = dVar9;
        d dVar10 = new d("MRAID_FULLSCREEN_AD_ACTIVITY_SHOW_FAILED_ERROR", 9);
        f30110j = dVar10;
        d dVar11 = new d("MRAID_BANNER_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 10);
        k = dVar11;
        d dVar12 = new d("MRAID_BANNER_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 11);
        f30111l = dVar12;
        d dVar13 = new d("MRAID_BANNER_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 12);
        f30112m = dVar13;
        d dVar14 = new d("MRAID_BANNER_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 13);
        f30113n = dVar14;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14};
        f30114o = dVarArr;
        ic.d.t(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f30114o.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
