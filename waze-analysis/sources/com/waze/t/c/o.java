package com.waze.t.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f40868a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f40869b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ o[] f40870c;

    static {
        o oVar = new o("GRANTED", 0);
        f40868a = oVar;
        o oVar2 = new o("DENIED", 1);
        f40869b = oVar2;
        o[] oVarArr = {oVar, oVar2};
        f40870c = oVarArr;
        h.d.b.a(oVarArr);
    }

    public static o[] values() {
        return (o[]) f40870c.clone();
    }
}
