package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final j f30134a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f30135b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f30136c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f30137d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j[] f30138e;

    static {
        j jVar = new j("STATIC_FULLSCREEN_AD_UNKNOWN_ERROR", 0);
        f30134a = jVar;
        j jVar2 = new j("STATIC_FULLSCREEN_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);
        f30135b = jVar2;
        j jVar3 = new j("STATIC_FULLSCREEN_AD_WEBVIEW_RECEIVED_ERROR", 2);
        f30136c = jVar3;
        j jVar4 = new j("STATIC_FULLSCREEN_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);
        f30137d = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        f30138e = jVarArr;
        ic.d.t(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f30138e.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
