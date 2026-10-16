package com.waze.car_lib.r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ds {

    /* renamed from: a, reason: collision with root package name */
    public static final ds f21434a;

    /* renamed from: b, reason: collision with root package name */
    public static final ds f21435b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ ds[] f21436c;

    static {
        ds dsVar = new ds("Favorite", 0);
        f21434a = dsVar;
        ds dsVar2 = new ds("Recent", 1);
        f21435b = dsVar2;
        ds[] dsVarArr = {dsVar, dsVar2};
        f21436c = dsVarArr;
        h.d.b.a(dsVarArr);
    }

    public static ds[] values() {
        return (ds[]) f21436c.clone();
    }
}
