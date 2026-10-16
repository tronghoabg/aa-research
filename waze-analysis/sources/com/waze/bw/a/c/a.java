package com.waze.bw.a.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17627a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f17628b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f17629c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f17630d;

    static {
        a aVar = new a("HOME", 0);
        f17627a = aVar;
        a aVar2 = new a("WORK", 1);
        f17628b = aVar2;
        a aVar3 = new a("NONE", 2);
        f17629c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f17630d = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f17630d.clone();
    }
}
