package com.waze.ad.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13878a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f13879b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f13880c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f13881d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f13882e;

    static {
        a aVar = new a("PORTRAIT", 0);
        f13878a = aVar;
        a aVar2 = new a("REVERSE_PORTRAIT", 1);
        f13879b = aVar2;
        a aVar3 = new a("LANDSCAPE_CCW", 2);
        f13880c = aVar3;
        a aVar4 = new a("LANDSCAPE_CW", 3);
        f13881d = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f13882e = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f13882e.clone();
    }
}
