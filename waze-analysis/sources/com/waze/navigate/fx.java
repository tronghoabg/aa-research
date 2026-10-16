package com.waze.navigate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fx {

    /* renamed from: a, reason: collision with root package name */
    public static final fx f31396a;

    /* renamed from: b, reason: collision with root package name */
    public static final fx f31397b;

    /* renamed from: c, reason: collision with root package name */
    public static final fx f31398c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ fx[] f31399d;

    static {
        fx fxVar = new fx("TRIP_OVERVIEW", 0);
        f31396a = fxVar;
        fx fxVar2 = new fx("ALTERNATE_ROUTES", 1);
        f31397b = fxVar2;
        fx fxVar3 = new fx("ETA_BAR", 2);
        f31398c = fxVar3;
        fx[] fxVarArr = {fxVar, fxVar2, fxVar3};
        f31399d = fxVarArr;
        h.d.b.a(fxVarArr);
    }

    public static fx[] values() {
        return (fx[]) f31399d.clone();
    }
}
