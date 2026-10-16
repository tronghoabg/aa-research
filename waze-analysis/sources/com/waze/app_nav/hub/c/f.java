package com.waze.app_nav.hub.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f15299a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f15300b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f15301c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ f[] f15302d;

    static {
        f fVar = new f("HIGH", 0);
        f15299a = fVar;
        f fVar2 = new f("NORMAL", 1);
        f15300b = fVar2;
        f fVar3 = new f("LOW", 2);
        f15301c = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        f15302d = fVarArr;
        h.d.b.a(fVarArr);
    }

    public static f[] values() {
        return (f[]) f15302d.clone();
    }
}
