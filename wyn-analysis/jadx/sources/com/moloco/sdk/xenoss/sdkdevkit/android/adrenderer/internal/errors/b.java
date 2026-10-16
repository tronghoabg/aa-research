package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f30098a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f30099b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f30100c;

    static {
        b bVar = new b("FULLSCREEN_AD_SHOW_FAILED_NO_SUPPORTED_TYPE", 0);
        f30098a = bVar;
        b bVar2 = new b("FULLSCREEN_AD_COMPOSE_VIEW_NOT_AVAILABLE", 1);
        f30099b = bVar2;
        b[] bVarArr = {bVar, bVar2};
        f30100c = bVarArr;
        ic.d.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f30100c.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
