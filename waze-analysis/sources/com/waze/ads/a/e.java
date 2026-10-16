package com.waze.ads.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f13915a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f13916b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f13917c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f13918d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f13919e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ e[] f13920f;

    static {
        e eVar = new e("Unspecified", 0);
        f13915a = eVar;
        e eVar2 = new e("Open", 1);
        f13916b = eVar2;
        e eVar3 = new e("OpensSoon", 2);
        f13917c = eVar3;
        e eVar4 = new e("Closed", 3);
        f13918d = eVar4;
        e eVar5 = new e("ClosesSoon", 4);
        f13919e = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        f13920f = eVarArr;
        h.d.b.a(eVarArr);
    }

    public static e[] values() {
        return (e[]) f13920f.clone();
    }
}
