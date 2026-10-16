package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final g f30123a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f30124b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f30125c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f30126d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g[] f30127e;

    static {
        g gVar = new g("STATIC_AD_UNKNOWN_ERROR", 0);
        f30123a = gVar;
        g gVar2 = new g("STATIC_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);
        f30124b = gVar2;
        g gVar3 = new g("STATIC_AD_WEBVIEW_RECEIVED_ERROR", 2);
        f30125c = gVar3;
        g gVar4 = new g("STATIC_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);
        f30126d = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
        f30127e = gVarArr;
        ic.d.t(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f30127e.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
