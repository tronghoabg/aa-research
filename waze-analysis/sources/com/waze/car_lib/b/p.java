package com.waze.car_lib.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f19117a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f19118b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ p[] f19119c;

    static {
        p pVar = new p("PRIMARY", 0);
        f19117a = pVar;
        p pVar2 = new p("DEFAULT", 1);
        f19118b = pVar2;
        p[] pVarArr = {pVar, pVar2};
        f19119c = pVarArr;
        h.d.b.a(pVarArr);
    }

    public static p[] values() {
        return (p[]) f19119c.clone();
    }
}
