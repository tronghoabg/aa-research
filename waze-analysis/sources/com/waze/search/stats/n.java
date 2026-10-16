package com.waze.search.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f36073a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f36074b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f36075c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f36076d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ n[] f36077e;

    static {
        n nVar = new n("PRICE", 0);
        f36073a = nVar;
        n nVar2 = new n("BRAND", 1);
        f36074b = nVar2;
        n nVar3 = new n("DISTANCE", 2);
        f36075c = nVar3;
        n nVar4 = new n("BEST_MATCH", 3);
        f36076d = nVar4;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        f36077e = nVarArr;
        h.d.b.a(nVarArr);
    }

    public static n[] values() {
        return (n[]) f36077e.clone();
    }
}
