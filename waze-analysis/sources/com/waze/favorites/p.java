package com.waze.favorites;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f23816a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f23817b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f23818c;

    /* renamed from: d, reason: collision with root package name */
    public static final p f23819d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ p[] f23820e;

    static {
        p pVar = new p("SET_FAVORITE", 0);
        f23816a = pVar;
        p pVar2 = new p("SET_HOME", 1);
        f23817b = pVar2;
        p pVar3 = new p("SET_WORK", 2);
        f23818c = pVar3;
        p pVar4 = new p("CANCEL", 3);
        f23819d = pVar4;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4};
        f23820e = pVarArr;
        h.d.b.a(pVarArr);
    }

    public static p[] values() {
        return (p[]) f23820e.clone();
    }
}
