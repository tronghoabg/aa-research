package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f30088a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f30089b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f30090c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f30091d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f30092e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f30093f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f30094g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f30095h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f30096i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a[] f30097j;

    static {
        a aVar = new a("STATIC_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 0);
        a aVar2 = new a("VAST_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 1);
        f30088a = aVar2;
        a aVar3 = new a("MRAID_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 2);
        f30089b = aVar3;
        a aVar4 = new a("NATIVE_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 3);
        f30090c = aVar4;
        a aVar5 = new a("VAST_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 4);
        f30091d = aVar5;
        a aVar6 = new a("MRAID_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 5);
        f30092e = aVar6;
        a aVar7 = new a("STATIC_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 6);
        f30093f = aVar7;
        a aVar8 = new a("VAST_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 7);
        f30094g = aVar8;
        a aVar9 = new a("MRAID_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 8);
        f30095h = aVar9;
        a aVar10 = new a("STATIC_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 9);
        f30096i = aVar10;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
        f30097j = aVarArr;
        ic.d.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f30097j.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
