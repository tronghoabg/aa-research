package com.waze.ui.r.a.e.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f43359a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f43360b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f43361c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f43362d;

    static {
        a aVar = new a("LOCKED", 0);
        f43359a = aVar;
        a aVar2 = new a("UNLOCKED", 1);
        f43360b = aVar2;
        a aVar3 = new a("NOT_SUPPORTED", 2);
        f43361c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f43362d = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f43362d.clone();
    }
}
