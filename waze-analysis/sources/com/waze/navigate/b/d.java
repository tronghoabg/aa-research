package com.waze.navigate.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f31048a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f31049b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f31050c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ d[] f31051d;

    static {
        d dVar = new d("MODE_UNSPECIFIED", 0);
        f31048a = dVar;
        d dVar2 = new d("MODE_TURNS", 1);
        f31049b = dVar2;
        d dVar3 = new d("MODE_REPORTS", 2);
        f31050c = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        f31051d = dVarArr;
        h.d.b.a(dVarArr);
    }

    public static d[] values() {
        return (d[]) f31051d.clone();
    }
}
