package com.waze.c.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f18237a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f18238b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f18239c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f18240d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ e[] f18241e;

    static {
        e eVar = new e("FETCH_DESTINATION", 0);
        f18237a = eVar;
        e eVar2 = new e("FETCH_CURRENT_LOCATION", 1);
        f18238b = eVar2;
        e eVar3 = new e("FETCH_ROUTES", 2);
        f18239c = eVar3;
        e eVar4 = new e("EMPTY_ROUTES", 3);
        f18240d = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        f18241e = eVarArr;
        h.d.b.a(eVarArr);
    }

    public static e[] values() {
        return (e[]) f18241e.clone();
    }
}
