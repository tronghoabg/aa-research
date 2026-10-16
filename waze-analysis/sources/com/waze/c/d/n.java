package com.waze.c.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f18376a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f18377b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f18378c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f18379d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ n[] f18380e;

    static {
        n nVar = new n("NoLocation", 0);
        f18376a = nVar;
        n nVar2 = new n("NoDestination", 1);
        f18377b = nVar2;
        n nVar3 = new n("NoAlternatives", 2);
        f18378c = nVar3;
        n nVar4 = new n("FailedToFetchRoutes", 3);
        f18379d = nVar4;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        f18380e = nVarArr;
        h.d.b.a(nVarArr);
    }

    public static n[] values() {
        return (n[]) f18380e.clone();
    }
}
