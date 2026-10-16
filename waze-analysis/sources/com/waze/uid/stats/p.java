package com.waze.uid.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f44779a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f44780b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f44781c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ p[] f44782d;

    static {
        p pVar = new p("WAZE_ONBOARDING", 0);
        f44779a = pVar;
        p pVar2 = new p("LOGIN_CONTEXT", 1);
        f44780b = pVar2;
        p pVar3 = new p("SETTINGS", 2);
        f44781c = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
        f44782d = pVarArr;
        h.d.b.a(pVarArr);
    }

    public static p[] values() {
        return (p[]) f44782d.clone();
    }
}
