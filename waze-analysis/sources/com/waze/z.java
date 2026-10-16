package com.waze;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f45553a;

    /* renamed from: b, reason: collision with root package name */
    public static final z f45554b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ z[] f45555c;

    static {
        z zVar = new z("WAZE_MOBILE", 0);
        f45553a = zVar;
        z zVar2 = new z("WAZE_AUTOMOTIVE", 1);
        f45554b = zVar2;
        z[] zVarArr = {zVar, zVar2};
        f45555c = zVarArr;
        h.d.b.a(zVarArr);
    }

    public static z[] values() {
        return (z[]) f45555c.clone();
    }
}
