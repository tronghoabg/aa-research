package com.waze.reports_v2.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cs {

    /* renamed from: a, reason: collision with root package name */
    public static final cs f34360a;

    /* renamed from: b, reason: collision with root package name */
    public static final cs f34361b;

    /* renamed from: c, reason: collision with root package name */
    public static final cs f34362c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cs[] f34363d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f34364e;

    static {
        cs csVar = new cs("NONE", 0, false);
        f34360a = csVar;
        cs csVar2 = new cs("START_NAVIGATION", 1, true);
        f34361b = csVar2;
        cs csVar3 = new cs("ZERO_SPEED", 2, true);
        f34362c = csVar3;
        cs[] csVarArr = {csVar, csVar2, csVar3};
        f34363d = csVarArr;
        h.d.b.a(csVarArr);
    }

    private cs(String str, int i2, boolean z) {
        this.f34364e = z;
    }

    public static cs[] values() {
        return (cs[]) f34363d.clone();
    }

    public final boolean a() {
        return this.f34364e;
    }
}
