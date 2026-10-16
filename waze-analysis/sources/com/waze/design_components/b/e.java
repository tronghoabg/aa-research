package com.waze.design_components.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f23312a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f23313b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f23314c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ e[] f23315d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23316e;

    static {
        e eVar = new e("OUTLINE", 0, 0);
        f23312a = eVar;
        e eVar2 = new e("FILL", 1, 1);
        f23313b = eVar2;
        e eVar3 = new e("T2", 2, 2);
        f23314c = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        f23315d = eVarArr;
        h.d.b.a(eVarArr);
    }

    private e(String str, int i2, int i3) {
        this.f23316e = i3;
    }

    public static e[] values() {
        return (e[]) f23315d.clone();
    }

    public final int a() {
        return this.f23316e;
    }
}
