package com.waze.ak;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    public static final am f14093a;

    /* renamed from: b, reason: collision with root package name */
    public static final am f14094b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ am[] f14095c;

    static {
        am amVar = new am("TRAFFIC_LIGHT", 0);
        f14093a = amVar;
        am amVar2 = new am("LANDMARK_NOT_SET", 1);
        f14094b = amVar2;
        f14095c = new am[]{amVar, amVar2};
    }

    public static am[] values() {
        return (am[]) f14095c.clone();
    }
}
