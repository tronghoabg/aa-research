package com.waze.an.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f14602a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f14603b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ o[] f14604c;

    static {
        o oVar = new o("Approaching", 0);
        f14602a = oVar;
        o oVar2 = new o("Within", 1);
        f14603b = oVar2;
        o[] oVarArr = {oVar, oVar2};
        f14604c = oVarArr;
        h.d.b.a(oVarArr);
    }

    public static o[] values() {
        return (o[]) f14604c.clone();
    }
}
