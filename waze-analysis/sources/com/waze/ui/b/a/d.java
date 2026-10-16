package com.waze.ui.b.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f41957a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f41958b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f41959c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f41960d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f41961e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f41962f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f41963g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f41964h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f41965i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f41966j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f41967k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f41968l;
    public static final d m;
    public static final d n;
    public static final d o;
    public static final d p;
    public static final d q;
    public static final d r;
    private static final /* synthetic */ d[] s;
    private final com.waze.design_components.b.d t;

    static {
        d dVar = new d("POLICE", 0, com.waze.design_components.b.d.bl);
        f41957a = dVar;
        d dVar2 = new d("ACCIDENT", 1, com.waze.design_components.b.d.bD);
        f41958b = dVar2;
        d dVar3 = new d("BLOCKED_LANE", 2, com.waze.design_components.b.d.bE);
        f41959c = dVar3;
        d dVar4 = new d("BLOCKED_LANE_CENTER", 3, com.waze.design_components.b.d.bF);
        f41960d = dVar4;
        d dVar5 = new d("BLOCKED_LANE_LEFT", 4, com.waze.design_components.b.d.bG);
        f41961e = dVar5;
        d dVar6 = new d("BLOCKED_LANE_RIGHT", 5, com.waze.design_components.b.d.bH);
        f41962f = dVar6;
        d dVar7 = new d("CLOSURE", 6, com.waze.design_components.b.d.bI);
        f41963g = dVar7;
        d dVar8 = new d("HAZARD", 7, com.waze.design_components.b.d.bJ);
        f41964h = dVar8;
        d dVar9 = new d("HAZARD_BROKEN_LIGHT", 8, com.waze.design_components.b.d.bK);
        f41965i = dVar9;
        d dVar10 = new d("HAZARD_CONSTRUCTION", 9, com.waze.design_components.b.d.bL);
        f41966j = dVar10;
        d dVar11 = new d("HAZARD_POTHOLE", 10, com.waze.design_components.b.d.bM);
        f41967k = dVar11;
        d dVar12 = new d("HAZARD_WEATHER_FOG", 11, com.waze.design_components.b.d.bN);
        f41968l = dVar12;
        d dVar13 = new d("HAZARD_WEATHER_ICE", 12, com.waze.design_components.b.d.bO);
        m = dVar13;
        d dVar14 = new d("HAZARD_WEATHER_UNPLOWED_ROAD", 13, com.waze.design_components.b.d.bP);
        n = dVar14;
        d dVar15 = new d("WEATHER", 14, com.waze.design_components.b.d.bR);
        o = dVar15;
        d dVar16 = new d("STOP_POINT", 15, com.waze.design_components.b.d.bQ);
        p = dVar16;
        d dVar17 = new d("PERSONAL_SAFETY_VARIANT_A", 16, com.waze.design_components.b.d.cd);
        q = dVar17;
        d dVar18 = new d("PERSONAL_SAFETY_VARIANT_B", 17, com.waze.design_components.b.d.ce);
        r = dVar18;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, dVar18};
        s = dVarArr;
        h.d.b.a(dVarArr);
    }

    private d(String str, int i2, com.waze.design_components.b.d dVar) {
        this.t = dVar;
    }

    public static d[] values() {
        return (d[]) s.clone();
    }

    public final com.waze.design_components.b.d a() {
        return this.t;
    }
}
