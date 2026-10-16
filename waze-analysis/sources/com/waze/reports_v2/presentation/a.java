package com.waze.reports_v2.presentation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34608a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f34609b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f34610c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f34611d;

    static {
        a aVar = new a("PRIMARY_CLICKED", 0);
        f34608a = aVar;
        a aVar2 = new a("CANCELLED", 1);
        f34609b = aVar2;
        a aVar3 = new a("DISMISSED", 2);
        f34610c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f34611d = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f34611d.clone();
    }
}
