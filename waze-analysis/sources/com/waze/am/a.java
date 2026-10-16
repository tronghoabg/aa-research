package com.waze.am;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14305a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f14306b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f14307c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f14308d;

    static {
        a aVar = new a("CREATED", 0);
        f14305a = aVar;
        a aVar2 = new a("OFFLINE", 1);
        f14306b = aVar2;
        a aVar3 = new a("ONLINE", 2);
        f14307c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f14308d = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f14308d.clone();
    }
}
