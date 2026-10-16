package com.waze.design_components.button;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f23353a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f23354b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f23355c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ f[] f23356d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23357e;

    static {
        f fVar = new f("NORMAL", 0, 0);
        f23353a = fVar;
        f fVar2 = new f("SMALL", 1, 1);
        f23354b = fVar2;
        f fVar3 = new f("LARGE", 2, 2);
        f23355c = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        f23356d = fVarArr;
        h.d.b.a(fVarArr);
    }

    private f(String str, int i2, int i3) {
        this.f23357e = i3;
    }

    public static f[] values() {
        return (f[]) f23356d.clone();
    }

    public final int a() {
        return this.f23357e;
    }
}
