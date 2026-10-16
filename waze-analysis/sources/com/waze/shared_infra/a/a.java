package com.waze.shared_infra.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37761a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f37762b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f37763c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f37764d;

    static {
        a aVar = new a("STARTING", 0);
        f37761a = aVar;
        a aVar2 = new a("STARTED", 1);
        f37762b = aVar2;
        a aVar3 = new a("STOPPING", 2);
        f37763c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f37764d = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f37764d.clone();
    }
}
