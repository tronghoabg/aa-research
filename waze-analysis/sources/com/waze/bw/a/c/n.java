package com.waze.bw.a.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f17657a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f17658b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f17659c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ n[] f17660d;

    static {
        n nVar = new n("Regular", 0);
        f17657a = nVar;
        n nVar2 = new n("Light", 1);
        f17658b = nVar2;
        n nVar3 = new n("Heavy", 2);
        f17659c = nVar3;
        n[] nVarArr = {nVar, nVar2, nVar3};
        f17660d = nVarArr;
        h.d.b.a(nVarArr);
    }

    public static n[] values() {
        return (n[]) f17660d.clone();
    }
}
