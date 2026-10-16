package com.moloco.sdk.internal.publisher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f29004a;

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f29005b;

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f29006c;

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f29007d;

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f29008e;

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f29009f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c0[] f29010g;

    static {
        c0 c0Var = new c0("BANNER", 0);
        f29004a = c0Var;
        c0 c0Var2 = new c0("BANNER_TABLET", 1);
        f29005b = c0Var2;
        c0 c0Var3 = new c0("MREC", 2);
        f29006c = c0Var3;
        c0 c0Var4 = new c0("NATIVE_AD_MEDIATION", 3);
        f29007d = c0Var4;
        c0 c0Var5 = new c0("NATIVE_BANNER", 4);
        c0 c0Var6 = new c0("INTERSTITIAL", 5);
        f29008e = c0Var6;
        c0 c0Var7 = new c0("REWARDED", 6);
        f29009f = c0Var7;
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6, c0Var7};
        f29010g = c0VarArr;
        ic.d.t(c0VarArr);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f29010g.clone();
    }
}
