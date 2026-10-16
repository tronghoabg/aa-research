package com.waze.location;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bf {

    /* renamed from: a, reason: collision with root package name */
    public static final bf f25343a;

    /* renamed from: b, reason: collision with root package name */
    public static final bf f25344b;

    /* renamed from: c, reason: collision with root package name */
    public static final bf f25345c;

    /* renamed from: d, reason: collision with root package name */
    public static final bf f25346d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ bf[] f25347e;

    static {
        bf bfVar = new bf("NONE", 0);
        f25343a = bfVar;
        bf bfVar2 = new bf("MOCK", 1);
        f25344b = bfVar2;
        bf bfVar3 = new bf("DEVICE", 2);
        f25345c = bfVar3;
        bf bfVar4 = new bf("EXTERNAL_DEVICE", 3);
        f25346d = bfVar4;
        bf[] bfVarArr = {bfVar, bfVar2, bfVar3, bfVar4};
        f25347e = bfVarArr;
        h.d.b.a(bfVarArr);
    }

    public static bf[] values() {
        return (bf[]) f25347e.clone();
    }
}
