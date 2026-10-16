package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f3555a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f3556b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f3557c;

    /* renamed from: d, reason: collision with root package name */
    public static final p f3558d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ p[] f3559e;

    static {
        p pVar = new p("IMMEDIATE", 0);
        f3555a = pVar;
        p pVar2 = new p("HIGH", 1);
        f3556b = pVar2;
        p pVar3 = new p("NORMAL", 2);
        f3557c = pVar3;
        p pVar4 = new p("LOW", 3);
        f3558d = pVar4;
        f3559e = new p[]{pVar, pVar2, pVar3, pVar4};
    }

    public static p[] values() {
        return (p[]) f3559e.clone();
    }
}
