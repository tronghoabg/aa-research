package com.waze.reports_v2.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dm {

    /* renamed from: a, reason: collision with root package name */
    public static final dm f34427a;

    /* renamed from: b, reason: collision with root package name */
    public static final dm f34428b;

    /* renamed from: c, reason: collision with root package name */
    public static final dm f34429c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ dm[] f34430d;

    static {
        dm dmVar = new dm("HALF_EXPANDED", 0);
        f34427a = dmVar;
        dm dmVar2 = new dm("EXPANDED", 1);
        f34428b = dmVar2;
        dm dmVar3 = new dm("COLLAPSED", 2);
        f34429c = dmVar3;
        dm[] dmVarArr = {dmVar, dmVar2, dmVar3};
        f34430d = dmVarArr;
        h.d.b.a(dmVarArr);
    }

    public static dm[] values() {
        return (dm[]) f34430d.clone();
    }
}
