package com.waze.ui.ae;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f41787a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f41788b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f41789c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f41790d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f41791e;

    static {
        a aVar = new a("KILOMETER", 0);
        f41787a = aVar;
        a aVar2 = new a("METER", 1);
        f41788b = aVar2;
        a aVar3 = new a("MILE", 2);
        f41789c = aVar3;
        a aVar4 = new a("FOOT", 3);
        f41790d = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f41791e = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f41791e.clone();
    }
}
