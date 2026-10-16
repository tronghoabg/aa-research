package com.waze.trip_overview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cx {

    /* renamed from: a, reason: collision with root package name */
    public static final cx f41309a;

    /* renamed from: b, reason: collision with root package name */
    public static final cx f41310b;

    /* renamed from: c, reason: collision with root package name */
    public static final cx f41311c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cx[] f41312d;

    static {
        cx cxVar = new cx("FIRST_TIME", 0);
        f41309a = cxVar;
        cx cxVar2 = new cx("RECALCULATE_FOR_NOW", 1);
        f41310b = cxVar2;
        cx cxVar3 = new cx("RECALCULATE_FOR_ROUTE_SETTINGS", 2);
        f41311c = cxVar3;
        cx[] cxVarArr = {cxVar, cxVar2, cxVar3};
        f41312d = cxVarArr;
        h.d.b.a(cxVarArr);
    }

    public static cx[] values() {
        return (cx[]) f41312d.clone();
    }
}
