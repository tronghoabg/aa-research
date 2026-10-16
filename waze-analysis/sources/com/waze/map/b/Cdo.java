package com.waze.map.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* renamed from: com.waze.map.b.do, reason: invalid class name */
/* loaded from: classes6.dex */
public final class Cdo {

    /* renamed from: a, reason: collision with root package name */
    public static final Cdo f28213a;

    /* renamed from: b, reason: collision with root package name */
    public static final Cdo f28214b;

    /* renamed from: c, reason: collision with root package name */
    public static final Cdo f28215c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ Cdo[] f28216d;

    static {
        Cdo cdo = new Cdo("Unlocked", 0);
        f28213a = cdo;
        Cdo cdo2 = new Cdo("StrongLock", 1);
        f28214b = cdo2;
        Cdo cdo3 = new Cdo("WeakLockWithAutomaticUnlock", 2);
        f28215c = cdo3;
        Cdo[] cdoArr = {cdo, cdo2, cdo3};
        f28216d = cdoArr;
        h.d.b.a(cdoArr);
    }

    public static Cdo[] values() {
        return (Cdo[]) f28216d.clone();
    }
}
