package com.waze.design_components.button;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f23364a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f23365b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ h[] f23366c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23367d;

    static {
        h hVar = new h("TRANSPARENT", 0, 0);
        f23364a = hVar;
        h hVar2 = new h("CIRCLE", 1, 1);
        f23365b = hVar2;
        h[] hVarArr = {hVar, hVar2};
        f23366c = hVarArr;
        h.d.b.a(hVarArr);
    }

    private h(String str, int i2, int i3) {
        this.f23367d = i3;
    }

    public static h[] values() {
        return (h[]) f23366c.clone();
    }

    public final int a() {
        return this.f23367d;
    }
}
