package com.waze.bw.c.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class di {

    /* renamed from: a, reason: collision with root package name */
    public static final di f18092a;

    /* renamed from: b, reason: collision with root package name */
    public static final di f18093b;

    /* renamed from: c, reason: collision with root package name */
    public static final di f18094c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ di[] f18095d;

    static {
        di diVar = new di("Regular", 0);
        f18092a = diVar;
        di diVar2 = new di("Light", 1);
        f18093b = diVar2;
        di diVar3 = new di("Heavy", 2);
        f18094c = diVar3;
        di[] diVarArr = {diVar, diVar2, diVar3};
        f18095d = diVarArr;
        h.d.b.a(diVarArr);
    }

    public static di[] values() {
        return (di[]) f18095d.clone();
    }
}
