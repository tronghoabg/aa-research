package com.waze.uid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f44538a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f44539b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f44540c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f44541d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ n[] f44542e;

    static {
        n nVar = new n("NONE", 0);
        f44538a = nVar;
        n nVar2 = new n("NORMAL", 1);
        f44539b = nVar2;
        n nVar3 = new n("ABORTED", 2);
        f44540c = nVar3;
        n nVar4 = new n("PENDING_REGISTRATION_SUGGESTION", 3);
        f44541d = nVar4;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        f44542e = nVarArr;
        h.d.b.a(nVarArr);
    }

    public static n[] values() {
        return (n[]) f44542e.clone();
    }
}
