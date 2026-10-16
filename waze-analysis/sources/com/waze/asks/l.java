package com.waze.asks;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f15613a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f15614b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f15615c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ l[] f15616d;

    static {
        l lVar = new l("CAR_ON_SHOULDER_NEAR_LANE", 0);
        f15613a = lVar;
        l lVar2 = new l("CAR_ON_SHOULDER_CLEARLY_MARKED", 1);
        f15614b = lVar2;
        l lVar3 = new l("CAR_ON_SHOULDER_PEOPLE_AROUND", 2);
        f15615c = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        f15616d = lVarArr;
        h.d.b.a(lVarArr);
    }

    public static l[] values() {
        return (l[]) f15616d.clone();
    }
}
