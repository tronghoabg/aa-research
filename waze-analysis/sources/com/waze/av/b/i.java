package com.waze.av.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f15955a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f15956b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f15957c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f15958d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ i[] f15959e;

    static {
        i iVar = new i("DEFAULT", 0);
        f15955a = iVar;
        i iVar2 = new i("HOME", 1);
        f15956b = iVar2;
        i iVar3 = new i("WORK", 2);
        f15957c = iVar3;
        i iVar4 = new i("OTHER", 3);
        f15958d = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        f15959e = iVarArr;
        h.d.b.a(iVarArr);
    }

    public static i[] values() {
        return (i[]) f15959e.clone();
    }
}
