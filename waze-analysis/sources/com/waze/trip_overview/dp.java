package com.waze.trip_overview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dp {

    /* renamed from: a, reason: collision with root package name */
    public static final dp f41412a;

    /* renamed from: b, reason: collision with root package name */
    public static final dp f41413b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ dp[] f41414c;

    static {
        dp dpVar = new dp("START_NAVIGATION", 0);
        f41412a = dpVar;
        dp dpVar2 = new dp("TRIP_OVERVIEW_LAUNCH", 1);
        f41413b = dpVar2;
        dp[] dpVarArr = {dpVar, dpVar2};
        f41414c = dpVarArr;
        h.d.b.a(dpVarArr);
    }

    public static dp[] values() {
        return (dp[]) f41414c.clone();
    }
}
