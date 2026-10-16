package com.waze.uid.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f44769a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f44770b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f44771c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f44772d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ n[] f44773e;

    static {
        n nVar = new n("SET_HOME", 0);
        f44769a = nVar;
        n nVar2 = new n("SET_WORK", 1);
        f44770b = nVar2;
        n nVar3 = new n("SKIP", 2);
        f44771c = nVar3;
        n nVar4 = new n("DONE", 3);
        f44772d = nVar4;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        f44773e = nVarArr;
        h.d.b.a(nVarArr);
    }

    public static n[] values() {
        return (n[]) f44773e.clone();
    }
}
