package com.waze.design_components.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f23384a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f23385b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ d[] f23386c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23387d;

    static {
        d dVar = new d("SMALL_IMAGE", 0, 64);
        f23384a = dVar;
        d dVar2 = new d("LARGE_IMAGE", 1, 96);
        f23385b = dVar2;
        d[] dVarArr = {dVar, dVar2};
        f23386c = dVarArr;
        h.d.b.a(dVarArr);
    }

    private d(String str, int i2, int i3) {
        this.f23387d = i3;
    }

    public static d[] values() {
        return (d[]) f23386c.clone();
    }

    public final int a() {
        return this.f23387d;
    }
}
