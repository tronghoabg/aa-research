package com.waze.nav_connect.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f30753a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f30754b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f30755c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f30756d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f30757e;

    static {
        a aVar = new a("Allow", 0);
        f30753a = aVar;
        a aVar2 = new a("Disallow", 1);
        f30754b = aVar2;
        a aVar3 = new a("BackOrClose", 2);
        f30755c = aVar3;
        a aVar4 = new a("SessionEnd", 3);
        f30756d = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f30757e = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f30757e.clone();
    }
}
