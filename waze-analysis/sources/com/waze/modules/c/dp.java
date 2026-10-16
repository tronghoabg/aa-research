package com.waze.modules.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dp {

    /* renamed from: a, reason: collision with root package name */
    public static final dp f30104a;

    /* renamed from: b, reason: collision with root package name */
    public static final dp f30105b;

    /* renamed from: c, reason: collision with root package name */
    public static final dp f30106c;

    /* renamed from: d, reason: collision with root package name */
    public static final dp f30107d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ dp[] f30108e;

    static {
        dp dpVar = new dp("HEAVIER_TRAFFIC_THAN_USUAL", 0);
        f30104a = dpVar;
        dp dpVar2 = new dp("HEAVIER_TRAFFIC_ON_BEST_ROUTE", 1);
        f30105b = dpVar2;
        dp dpVar3 = new dp("LIGHTER_TRAFFIC_THAN_USUAL", 2);
        f30106c = dpVar3;
        dp dpVar4 = new dp("USUAL_TRAFFIC", 3);
        f30107d = dpVar4;
        dp[] dpVarArr = {dpVar, dpVar2, dpVar3, dpVar4};
        f30108e = dpVarArr;
        h.d.b.a(dpVarArr);
    }

    public static dp[] values() {
        return (dp[]) f30108e.clone();
    }
}
