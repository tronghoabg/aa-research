package com.waze.sound;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bv {

    /* renamed from: a, reason: collision with root package name */
    public static final bv f39577a;

    /* renamed from: b, reason: collision with root package name */
    public static final bv f39578b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ bv[] f39579c;

    static {
        bv bvVar = new bv("OFFLINE", 0);
        f39577a = bvVar;
        bv bvVar2 = new bv("ONLINE", 1);
        f39578b = bvVar2;
        bv[] bvVarArr = {bvVar, bvVar2};
        f39579c = bvVarArr;
        h.d.b.a(bvVarArr);
    }

    public static bv[] values() {
        return (bv[]) f39579c.clone();
    }
}
