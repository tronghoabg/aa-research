package com.waze.ak;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f14118a;

    /* renamed from: b, reason: collision with root package name */
    public static final v f14119b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f14120c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f14121d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ v[] f14122e;

    static {
        v vVar = new v("SKIP_INITIAL_ANNOUNCEMENT", 0);
        f14118a = vVar;
        v vVar2 = new v("DEFAULT_INITIAL_ANNOUNCEMENT", 1);
        f14119b = vVar2;
        v vVar3 = new v("ROUTE_INITIAL_ANNOUNCEMENT", 2);
        f14120c = vVar3;
        v vVar4 = new v("ANNOUNCEMENT_NOT_SET", 3);
        f14121d = vVar4;
        f14122e = new v[]{vVar, vVar2, vVar3, vVar4};
    }

    public static v[] values() {
        return (v[]) f14122e.clone();
    }
}
