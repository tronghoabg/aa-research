package com.waze.map.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f28903a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f28904b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f28905c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ e[] f28906d;

    static {
        e eVar = new e("EXPANDED", 0);
        f28903a = eVar;
        e eVar2 = new e("ZOOM_IN", 1);
        f28904b = eVar2;
        e eVar3 = new e("ZOOM_OUT", 2);
        f28905c = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        f28906d = eVarArr;
        h.d.b.a(eVarArr);
    }

    public static e[] values() {
        return (e[]) f28906d.clone();
    }
}
