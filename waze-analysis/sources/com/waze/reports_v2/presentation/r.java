package com.waze.reports_v2.presentation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f35064a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f35065b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ r[] f35066c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f35067d;

    /* renamed from: e, reason: collision with root package name */
    private final String f35068e;

    static {
        r rVar = new r("ON", 0, "ON");
        f35064a = rVar;
        r rVar2 = new r("IDLE", 1, "IDLE");
        f35065b = rVar2;
        r[] rVarArr = {rVar, rVar2};
        f35066c = rVarArr;
        f35067d = h.d.b.a(rVarArr);
    }

    private r(String str, int i2, String str2) {
        this.f35068e = str2;
    }

    public static h.d.a b() {
        return f35067d;
    }

    public static r[] values() {
        return (r[]) f35066c.clone();
    }

    public final String a() {
        return this.f35068e;
    }
}
