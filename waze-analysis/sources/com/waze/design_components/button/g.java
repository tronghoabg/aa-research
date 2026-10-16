package com.waze.design_components.button;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f23358a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f23359b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f23360c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ g[] f23361d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f23362e;

    /* renamed from: f, reason: collision with root package name */
    private final int f23363f;

    static {
        g gVar = new g("PRIMARY", 0, 0);
        f23358a = gVar;
        g gVar2 = new g("SECONDARY", 1, 1);
        f23359b = gVar2;
        g gVar3 = new g("TERTIARY", 2, 2);
        f23360c = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        f23361d = gVarArr;
        f23362e = h.d.b.a(gVarArr);
    }

    private g(String str, int i2, int i3) {
        this.f23363f = i3;
    }

    public static h.d.a b() {
        return f23362e;
    }

    public static g[] values() {
        return (g[]) f23361d.clone();
    }

    public final int a() {
        return this.f23363f;
    }
}
