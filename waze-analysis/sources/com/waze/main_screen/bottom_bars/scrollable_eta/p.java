package com.waze.main_screen.bottom_bars.scrollable_eta;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f26001a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f26002b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ p[] f26003c;

    static {
        p pVar = new p("TOLL", 0);
        f26001a = pVar;
        p pVar2 = new p("HOV", 1);
        f26002b = pVar2;
        p[] pVarArr = {pVar, pVar2};
        f26003c = pVarArr;
        h.d.b.a(pVarArr);
    }

    public static p[] values() {
        return (p[]) f26003c.clone();
    }
}
