package com.waze.br.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f17416a;

    /* renamed from: b, reason: collision with root package name */
    public static final x f17417b;

    /* renamed from: c, reason: collision with root package name */
    public static final x f17418c;

    /* renamed from: d, reason: collision with root package name */
    public static final x f17419d;

    /* renamed from: e, reason: collision with root package name */
    public static final x f17420e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ x[] f17421f;

    /* renamed from: g, reason: collision with root package name */
    private final float f17422g;

    /* renamed from: h, reason: collision with root package name */
    private final float f17423h;

    /* renamed from: i, reason: collision with root package name */
    private final float f17424i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private final float f17425j;

    /* renamed from: k, reason: collision with root package name */
    private final float f17426k;

    static {
        x xVar = new x("Idle", 0, 0.03f, 0.04f, 0.8f, 0.7f);
        f17416a = xVar;
        x xVar2 = new x("Initializing", 1, 0.03f, 0.04f, 1.0f, 0.8f);
        f17417b = xVar2;
        float f2 = 0.1f;
        x xVar3 = new x("Recording", 2, 0.2f, f2, 0.9f, 0.8f);
        f17418c = xVar3;
        x xVar4 = new x("Thinking", 3, f2, 0.03f, 1.2f, 0.8f);
        f17419d = xVar4;
        x xVar5 = new x("Speaking", 4, 0.2f, 0.1f, 0.9f, 1.0f);
        f17420e = xVar5;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4, xVar5};
        f17421f = xVarArr;
        h.d.b.a(xVarArr);
    }

    /* synthetic */ x(String str, int i2, float f2, float f3, float f4, float f5) {
        this.f17422g = f2;
        this.f17423h = f3;
        this.f17425j = f4;
        this.f17426k = f5;
    }

    public static x[] values() {
        return (x[]) f17421f.clone();
    }

    public final float a() {
        return this.f17423h;
    }

    public final float b() {
        return this.f17426k;
    }

    public final float c() {
        return this.f17422g;
    }

    public final float d() {
        return this.f17424i;
    }

    public final float e() {
        return this.f17425j;
    }
}
