package com.waze.navigate.location_preview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bv {

    /* renamed from: a, reason: collision with root package name */
    public static final bv f31693a;

    /* renamed from: b, reason: collision with root package name */
    public static final bv f31694b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ bv[] f31695c;

    static {
        bv bvVar = new bv("Popular", 0);
        f31693a = bvVar;
        bv bvVar2 = new bv("Nearest", 1);
        f31694b = bvVar2;
        bv[] bvVarArr = {bvVar, bvVar2};
        f31695c = bvVarArr;
        h.d.b.a(bvVarArr);
    }

    public static bv[] values() {
        return (bv[]) f31695c.clone();
    }
}
