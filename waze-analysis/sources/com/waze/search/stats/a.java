package com.waze.search.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36003a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f36004b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f36005c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f36006d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f36007e;

    static {
        a aVar = new a("DISTANCE_SOURCE_UNSPECIFIED", 0);
        f36003a = aVar;
        a aVar2 = new a("CLIENT", 1);
        f36004b = aVar2;
        a aVar3 = new a("AERIAL", 2);
        f36005c = aVar3;
        a aVar4 = new a("HUBCAPS", 3);
        f36006d = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f36007e = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f36007e.clone();
    }
}
