package com.waze.native_managers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f30679a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f30680b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f30681c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f30682d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f30683e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f30684f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ d[] f30685g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f30686h;

    /* renamed from: i, reason: collision with root package name */
    private final int f30687i;

    static {
        d dVar = new d("EMPTY", 0, 0);
        f30679a = dVar;
        d dVar2 = new d("LOW_MEMORY", 1, 1);
        f30680b = dVar2;
        d dVar3 = new d("NATIVE", 2, 2);
        f30681c = dVar3;
        d dVar4 = new d("PRIORITY_NATIVE", 3, 3);
        f30682d = dVar4;
        d dVar5 = new d("GENERIC_RUNNABLE", 4, 4);
        f30683e = dVar5;
        d dVar6 = new d("GENERIC_CANCELABLE_RUNNABLE", 5, 5);
        f30684f = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        f30685g = dVarArr;
        f30686h = h.d.b.a(dVarArr);
    }

    private d(String str, int i2, int i3) {
        this.f30687i = i3;
    }

    public static h.d.a b() {
        return f30686h;
    }

    public static d[] values() {
        return (d[]) f30685g.clone();
    }

    public final int a() {
        return this.f30687i;
    }
}
