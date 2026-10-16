package com.waze.authentication;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    public static final ak f15719a;

    /* renamed from: b, reason: collision with root package name */
    public static final ak f15720b;

    /* renamed from: c, reason: collision with root package name */
    public static final ak f15721c;

    /* renamed from: d, reason: collision with root package name */
    public static final ak f15722d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ ak[] f15723e;

    static {
        ak akVar = new ak("AUTO", 0);
        f15719a = akVar;
        ak akVar2 = new ak("OFFLINE", 1);
        f15720b = akVar2;
        ak akVar3 = new ak("LEGACY", 2);
        f15721c = akVar3;
        ak akVar4 = new ak("PLATFORM", 3);
        f15722d = akVar4;
        ak[] akVarArr = {akVar, akVar2, akVar3, akVar4};
        f15723e = akVarArr;
        h.d.b.a(akVarArr);
    }

    public static ak[] values() {
        return (ak[]) f15723e.clone();
    }
}
