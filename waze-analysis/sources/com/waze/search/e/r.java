package com.waze.search.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f35647a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f35648b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f35649c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ r[] f35650d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35651e;

    /* renamed from: f, reason: collision with root package name */
    private final int f35652f;

    static {
        r rVar = new r("NORMAL", 0, 24, 24);
        f35647a = rVar;
        r rVar2 = new r("T2_NORMAL", 1, 24, 24);
        f35648b = rVar2;
        r rVar3 = new r("VENUE_IMAGE", 2, 40, 30);
        f35649c = rVar3;
        r[] rVarArr = {rVar, rVar2, rVar3};
        f35650d = rVarArr;
        h.d.b.a(rVarArr);
    }

    private r(String str, int i2, int i3, int i4) {
        this.f35651e = i3;
        this.f35652f = i4;
    }

    public static r[] values() {
        return (r[]) f35650d.clone();
    }

    public final int a() {
        return this.f35652f;
    }

    public final int b() {
        return this.f35651e;
    }
}
