package com.waze.car_lib.r.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f21278a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f21279b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f21280c;

    /* renamed from: d, reason: collision with root package name */
    public static final h f21281d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f21282e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f21283f;

    /* renamed from: g, reason: collision with root package name */
    public static final h f21284g;

    /* renamed from: h, reason: collision with root package name */
    public static final h f21285h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ h[] f21286i;

    /* renamed from: j, reason: collision with root package name */
    private final String f21287j;

    static {
        h hVar = new h("RISK_AREA", 0, "risk_area");
        f21278a = hVar;
        h hVar2 = new h("CARBON_EMISSIONS", 1, "carbon_emissions");
        f21279b = hVar2;
        h hVar3 = new h("TOLL", 2, "toll");
        f21280c = hVar3;
        h hVar4 = new h("USUAL_ROUTE", 3, "usual_route");
        f21281d = hVar4;
        h hVar5 = new h("TRAFFIC_STATUS", 4, "traffic_status");
        f21282e = hVar5;
        h hVar6 = new h("BADGES", 5, "badges");
        f21283f = hVar6;
        h hVar7 = new h("REPORTS", 6, "reports");
        f21284g = hVar7;
        h hVar8 = new h("VIA", 7, "via");
        f21285h = hVar8;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8};
        f21286i = hVarArr;
        h.d.b.a(hVarArr);
    }

    private h(String str, int i2, String str2) {
        this.f21287j = str2;
    }

    public static h[] values() {
        return (h[]) f21286i.clone();
    }

    public final String a() {
        return this.f21287j;
    }
}
