package com.waze.av.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f15942a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f15943b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f15944c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f15945d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ d[] f15946e;

    static {
        d dVar = new d("EVENT_PLACE_TYPE_NONE", 0);
        f15942a = dVar;
        d dVar2 = new d("EVENT_PLACE_TYPE_WAZE", 1);
        f15943b = dVar2;
        d dVar3 = new d("EVENT_PLACE_TYPE_CALENDAR", 2);
        f15944c = dVar3;
        d dVar4 = new d("EVENT_PLACE_TYPE_FUTURE_DRIVE", 3);
        f15945d = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        f15946e = dVarArr;
        h.d.b.a(dVarArr);
    }

    public static d[] values() {
        return (d[]) f15946e.clone();
    }
}
