package com.waze.ui.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f42052a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f42053b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f42054c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f42055d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ e[] f42056e;

    static {
        e eVar = new e("Collapsed", 0);
        f42052a = eVar;
        e eVar2 = new e("Popped", 1);
        f42053b = eVar2;
        e eVar3 = new e("Expanded", 2);
        f42054c = eVar3;
        e eVar4 = new e("FullScreen", 3);
        f42055d = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        f42056e = eVarArr;
        h.d.b.a(eVarArr);
    }

    public static e[] values() {
        return (e[]) f42056e.clone();
    }
}
