package com.waze.bo.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17176a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f17177b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f17178c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f17179d;

    static {
        a aVar = new a("TRUE", 0);
        f17176a = aVar;
        a aVar2 = new a("FALSE", 1);
        f17177b = aVar2;
        a aVar3 = new a("SAME", 2);
        f17178c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f17179d = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f17179d.clone();
    }
}
