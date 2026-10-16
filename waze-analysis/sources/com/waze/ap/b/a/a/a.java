package com.waze.ap.b.a.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15010a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f15011b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f15012c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f15013d;

    static {
        a aVar = new a("HAZARD_ON_ROAD_CONFIGURATION", 0);
        f15010a = aVar;
        a aVar2 = new a("WEATHER_CONFIGURATION", 1);
        f15011b = aVar2;
        a aVar3 = new a("ALERTTYPECONFIGURATION_NOT_SET", 2);
        f15012c = aVar3;
        f15013d = new a[]{aVar, aVar2, aVar3};
    }

    public static a[] values() {
        return (a[]) f15013d.clone();
    }
}
