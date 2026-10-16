package com.waze.car_lib.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    public static final bb f20609a;

    /* renamed from: b, reason: collision with root package name */
    public static final bb f20610b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ bb[] f20611c;

    static {
        bb bbVar = new bb("NewDrive", 0);
        f20609a = bbVar;
        bb bbVar2 = new bb("ResumeDrive", 1);
        f20610b = bbVar2;
        bb[] bbVarArr = {bbVar, bbVar2};
        f20611c = bbVarArr;
        h.d.b.a(bbVarArr);
    }

    public static bb[] values() {
        return (bb[]) f20611c.clone();
    }
}
