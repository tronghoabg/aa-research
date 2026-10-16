package com.waze.search.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f36097a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f36098b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f36099c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f36100d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f36101e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f36102f;

    /* renamed from: g, reason: collision with root package name */
    public static final r f36103g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ r[] f36104h;

    static {
        r rVar = new r("OPENING_SOON", 0);
        f36097a = rVar;
        r rVar2 = new r("OPEN_NOW", 1);
        f36098b = rVar2;
        r rVar3 = new r("OPEN_24_HOURS", 2);
        f36099c = rVar3;
        r rVar4 = new r("CLOSED", 3);
        f36100d = rVar4;
        r rVar5 = new r("CLOSES_SOON", 4);
        f36101e = rVar5;
        r rVar6 = new r("TEMPORARILY_CLOSED", 5);
        f36102f = rVar6;
        r rVar7 = new r("PERMANENTLY_CLOSED", 6);
        f36103g = rVar7;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7};
        f36104h = rVarArr;
        h.d.b.a(rVarArr);
    }

    public static r[] values() {
        return (r[]) f36104h.clone();
    }
}
