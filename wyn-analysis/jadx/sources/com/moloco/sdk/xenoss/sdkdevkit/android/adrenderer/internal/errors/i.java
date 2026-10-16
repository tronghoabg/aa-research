package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final i f30129a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f30130b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f30131c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f30132d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i[] f30133e;

    static {
        i iVar = new i("STATIC_BANNER_AD_UNKNOWN_ERROR", 0);
        f30129a = iVar;
        i iVar2 = new i("STATIC_BANNER_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);
        f30130b = iVar2;
        i iVar3 = new i("STATIC_BANNER_AD_WEBVIEW_RECEIVED_ERROR", 2);
        f30131c = iVar3;
        i iVar4 = new i("STATIC_BANNER_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);
        f30132d = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        f30133e = iVarArr;
        ic.d.t(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f30133e.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
