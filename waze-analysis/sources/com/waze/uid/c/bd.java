package com.waze.uid.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    public static final bd f44257a;

    /* renamed from: b, reason: collision with root package name */
    public static final bd f44258b;

    /* renamed from: c, reason: collision with root package name */
    public static final bd f44259c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ bd[] f44260d;

    /* renamed from: e, reason: collision with root package name */
    private final int f44261e;

    static {
        bd bdVar = new bd("DEFAULT", 0, -1);
        f44257a = bdVar;
        bd bdVar2 = new bd("PORTRAIT", 1, 1);
        f44258b = bdVar2;
        bd bdVar3 = new bd("LANDSCAPE", 2, 6);
        f44259c = bdVar3;
        bd[] bdVarArr = {bdVar, bdVar2, bdVar3};
        f44260d = bdVarArr;
        h.d.b.a(bdVarArr);
    }

    private bd(String str, int i2, int i3) {
        this.f44261e = i3;
    }

    public static bd[] values() {
        return (bd[]) f44260d.clone();
    }

    public final int a() {
        return this.f44261e;
    }
}
