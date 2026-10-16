package com.waze.ak;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f14113a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f14114b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f14115c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f14116d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ n[] f14117e;

    static {
        n nVar = new n("HOME_FAVORITE", 0);
        f14113a = nVar;
        n nVar2 = new n("WORK_FAVORITE", 1);
        f14114b = nVar2;
        n nVar3 = new n("CUSTOM_FAVORITE", 2);
        f14115c = nVar3;
        n nVar4 = new n("FAVORITE_NOT_SET", 3);
        f14116d = nVar4;
        f14117e = new n[]{nVar, nVar2, nVar3, nVar4};
    }

    public static n[] values() {
        return (n[]) f14117e.clone();
    }
}
