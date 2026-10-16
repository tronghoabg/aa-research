package com.waze.design_components.button;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f23349a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f23350b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ e[] f23351c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23352d;

    static {
        e eVar = new e("NONE", 0, 0);
        f23349a = eVar;
        e eVar2 = new e("ALARMING", 1, 1);
        f23350b = eVar2;
        e[] eVarArr = {eVar, eVar2};
        f23351c = eVarArr;
        h.d.b.a(eVarArr);
    }

    private e(String str, int i2, int i3) {
        this.f23352d = i3;
    }

    public static e[] values() {
        return (e[]) f23351c.clone();
    }

    public final int a() {
        return this.f23352d;
    }
}
