package com.waze.perf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f33079a;

    /* renamed from: b, reason: collision with root package name */
    public static final x f33080b;

    /* renamed from: c, reason: collision with root package name */
    public static final x f33081c;

    /* renamed from: d, reason: collision with root package name */
    public static final x f33082d;

    /* renamed from: e, reason: collision with root package name */
    public static final x f33083e;

    /* renamed from: f, reason: collision with root package name */
    public static final x f33084f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ x[] f33085g;

    /* renamed from: h, reason: collision with root package name */
    private final String f33086h;

    static {
        x xVar = new x("BootPerformance", 0, "BOOT_PERFORMANCE");
        f33079a = xVar;
        x xVar2 = new x("WazeInitializer", 1, "WAZE_INITIALIZER");
        f33080b = xVar2;
        x xVar3 = new x("ServerRequestResult", 2, "SERVER_REQUEST_RESULT");
        f33081c = xVar3;
        x xVar4 = new x("NetworkQueue", 3, "NETWORK_QUEUE");
        f33082d = xVar4;
        x xVar5 = new x("AlternateRoutesUpdatingMapState", 4, "AlternateRoutesUpdatingMapState");
        f33083e = xVar5;
        x xVar6 = new x("StartStateLocationProvider", 5, "START_STATE_LOCATION_PROVIDER");
        f33084f = xVar6;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4, xVar5, xVar6};
        f33085g = xVarArr;
        h.d.b.a(xVarArr);
    }

    private x(String str, int i2, String str2) {
        this.f33086h = str2;
    }

    public static x[] values() {
        return (x[]) f33085g.clone();
    }

    public final String a() {
        return this.f33086h;
    }
}
