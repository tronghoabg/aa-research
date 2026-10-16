package com.waze.navigate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bv {

    /* renamed from: a, reason: collision with root package name */
    public static final bv f31145a;

    /* renamed from: b, reason: collision with root package name */
    public static final bv f31146b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ bv[] f31147c;

    static {
        bv bvVar = new bv("Right", 0);
        f31145a = bvVar;
        bv bvVar2 = new bv("Left", 1);
        f31146b = bvVar2;
        bv[] bvVarArr = {bvVar, bvVar2};
        f31147c = bvVarArr;
        h.d.b.a(bvVarArr);
    }

    public static bv[] values() {
        return (bv[]) f31147c.clone();
    }
}
