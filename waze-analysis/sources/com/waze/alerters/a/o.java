package com.waze.alerters.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f14174a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f14175b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f14176c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f14177d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ o[] f14178e;

    static {
        o oVar = new o("IDLE", 0);
        f14174a = oVar;
        o oVar2 = new o("STARTED", 1);
        f14175b = oVar2;
        o oVar3 = new o("TIMER", 2);
        f14176c = oVar3;
        o oVar4 = new o("ENDED", 3);
        f14177d = oVar4;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4};
        f14178e = oVarArr;
        h.d.b.a(oVarArr);
    }

    public static o[] values() {
        return (o[]) f14178e.clone();
    }
}
