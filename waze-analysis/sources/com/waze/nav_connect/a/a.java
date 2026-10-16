package com.waze.nav_connect.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f30711a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f30712b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f30713c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f30714d;

    static {
        a aVar = new a("ABSENT", 0);
        f30711a = aVar;
        a aVar2 = new a("VERSION_MISMATCH", 1);
        f30712b = aVar2;
        a aVar3 = new a("EXPIRED", 2);
        f30713c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f30714d = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f30714d.clone();
    }
}
