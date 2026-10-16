package com.waze.bw.b.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f17745a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f17746b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f17747c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ e[] f17748d;

    static {
        e eVar = new e("DRAWER_COLLAPSED", 0);
        f17745a = eVar;
        e eVar2 = new e("DRAWER_PARTIALLY_OPEN", 1);
        f17746b = eVar2;
        e eVar3 = new e("DRAWER_FULLY_OPEN", 2);
        f17747c = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        f17748d = eVarArr;
        h.d.b.a(eVarArr);
    }

    public static e[] values() {
        return (e[]) f17748d.clone();
    }
}
