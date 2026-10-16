package com.waze.trip_overview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f41463a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f41464b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ g[] f41465c;

    static {
        g gVar = new g("IDLE", 0);
        f41463a = gVar;
        g gVar2 = new g("RUNNING", 1);
        f41464b = gVar2;
        g[] gVarArr = {gVar, gVar2};
        f41465c = gVarArr;
        h.d.b.a(gVarArr);
    }

    public static g[] values() {
        return (g[]) f41465c.clone();
    }
}
