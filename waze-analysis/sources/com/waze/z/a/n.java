package com.waze.z.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f46150a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f46151b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f46152c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f46153d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ n[] f46154e;

    static {
        n nVar = new n("Normal", 0);
        f46150a = nVar;
        n nVar2 = new n("Alarming", 1);
        f46151b = nVar2;
        n nVar3 = new n("Safe", 2);
        f46152c = nVar3;
        n nVar4 = new n("Deal", 3);
        f46153d = nVar4;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        f46154e = nVarArr;
        h.d.b.a(nVarArr);
    }

    public static n[] values() {
        return (n[]) f46154e.clone();
    }
}
