package com.waze.main_screen.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public static final ad f27671a;

    /* renamed from: b, reason: collision with root package name */
    public static final ad f27672b;

    /* renamed from: c, reason: collision with root package name */
    public static final ad f27673c;

    /* renamed from: d, reason: collision with root package name */
    public static final ad f27674d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ ad[] f27675e;

    static {
        ad adVar = new ad("RESUME", 0);
        f27671a = adVar;
        ad adVar2 = new ad("PREDICTION", 1);
        f27672b = adVar2;
        ad adVar3 = new ad("PLANNED_DRIVE", 2);
        f27673c = adVar3;
        ad adVar4 = new ad("CALENDAR", 3);
        f27674d = adVar4;
        ad[] adVarArr = {adVar, adVar2, adVar3, adVar4};
        f27675e = adVarArr;
        h.d.b.a(adVarArr);
    }

    public static ad[] values() {
        return (ad[]) f27675e.clone();
    }
}
