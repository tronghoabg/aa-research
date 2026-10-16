package com.waze.z.a.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public static final ad f45733a;

    /* renamed from: b, reason: collision with root package name */
    public static final ad f45734b;

    /* renamed from: c, reason: collision with root package name */
    public static final ad f45735c;

    /* renamed from: d, reason: collision with root package name */
    public static final ad f45736d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ ad[] f45737e;

    static {
        ad adVar = new ad("Hidden", 0);
        f45733a = adVar;
        ad adVar2 = new ad("Collapsed", 1);
        f45734b = adVar2;
        ad adVar3 = new ad("PartiallyExpanded", 2);
        f45735c = adVar3;
        ad adVar4 = new ad("Expanded", 3);
        f45736d = adVar4;
        ad[] adVarArr = {adVar, adVar2, adVar3, adVar4};
        f45737e = adVarArr;
        h.d.b.a(adVarArr);
    }

    public static ad[] values() {
        return (ad[]) f45737e.clone();
    }
}
