package com.moloco.sdk.acm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f28459a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f28460b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f28461c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o[] f28462d;

    static {
        o oVar = new o("INITIALIZED", 0);
        f28459a = oVar;
        o oVar2 = new o("INITIALIZING", 1);
        f28460b = oVar2;
        o oVar3 = new o("UNINITIALIZED", 2);
        f28461c = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        f28462d = oVarArr;
        ic.d.t(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f28462d.clone();
    }
}
