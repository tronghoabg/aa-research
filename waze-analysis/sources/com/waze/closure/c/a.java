package com.waze.closure.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22452a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f22453b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f22454c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f22455d;

    static {
        a aVar = new a("LOADING", 0);
        f22452a = aVar;
        a aVar2 = new a("EMPTY_STATE", 1);
        f22453b = aVar2;
        a aVar3 = new a("CLOSURE_SELECTION", 2);
        f22454c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f22455d = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f22455d.clone();
    }
}
