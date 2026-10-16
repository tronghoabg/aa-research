package com.waze.app_nav.hub.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15291a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f15292b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f15293c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f15294d;

    static {
        a aVar = new a("PENDING", 0);
        f15291a = aVar;
        a aVar2 = new a("PRESENTED", 1);
        f15292b = aVar2;
        a aVar3 = new a("NOT_PRESENTED", 2);
        f15293c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f15294d = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f15294d.clone();
    }
}
