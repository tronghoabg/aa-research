package com.waze.copilot.data.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f23012a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f23013b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f23014c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ p[] f23015d;

    static {
        p pVar = new p("CAR", 0);
        f23012a = pVar;
        p pVar2 = new p("MOOD", 1);
        f23013b = pVar2;
        p pVar3 = new p("VOICE", 2);
        f23014c = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
        f23015d = pVarArr;
        h.d.b.a(pVarArr);
    }

    public static p[] values() {
        return (p[]) f23015d.clone();
    }
}
