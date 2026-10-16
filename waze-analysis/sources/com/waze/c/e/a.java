package com.waze.c.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18407a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f18408b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f18409c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f18410d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f18411e;

    static {
        a aVar = new a("NoLocation", 0);
        f18407a = aVar;
        a aVar2 = new a("NoDestination", 1);
        f18408b = aVar2;
        a aVar3 = new a("NoAlternatives", 2);
        f18409c = aVar3;
        a aVar4 = new a("FailedToFetchRoutes", 3);
        f18410d = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f18411e = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f18411e.clone();
    }
}
