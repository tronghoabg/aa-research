package com.waze.modules.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i {
    public static final i A;
    public static final i B;
    public static final i C;
    public static final i D;
    public static final i E;
    public static final i F;
    public static final i G;
    public static final i H;
    public static final i I;
    public static final i J;
    public static final i K;
    public static final i L;
    public static final i M;
    public static final i N;
    public static final i O;
    public static final i P;
    public static final i Q;
    public static final i R;
    public static final i S;
    public static final i T;
    private static final /* synthetic */ i[] U;

    /* renamed from: a, reason: collision with root package name */
    public static final i f30159a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f30160b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f30161c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f30162d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f30163e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f30164f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f30165g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f30166h;

    /* renamed from: i, reason: collision with root package name */
    public static final i f30167i;

    /* renamed from: j, reason: collision with root package name */
    public static final i f30168j;

    /* renamed from: k, reason: collision with root package name */
    public static final i f30169k;

    /* renamed from: l, reason: collision with root package name */
    public static final i f30170l;
    public static final i m;
    public static final i n;
    public static final i o;
    public static final i p;
    public static final i q;
    public static final i r;
    public static final i s;
    public static final i t;
    public static final i u;
    public static final i v;
    public static final i w;
    public static final i x;
    public static final i y;
    public static final i z;
    private final int V;

    static {
        i iVar = new i("NO_SUBTYPE", 0, 0);
        f30159a = iVar;
        i iVar2 = new i("POLICE_VISIBLE", 1, 1);
        f30160b = iVar2;
        i iVar3 = new i("POLICE_HIDING", 2, 2);
        f30161c = iVar3;
        i iVar4 = new i("POLICE_WITH_MOBILE_CAMERA", 3, 41);
        f30162d = iVar4;
        i iVar5 = new i("ACCIDENT_MINOR", 4, 3);
        f30163e = iVar5;
        i iVar6 = new i("ACCIDENT_MAJOR", 5, 4);
        f30164f = iVar6;
        i iVar7 = new i("JAM_MODERATE_TRAFFIC", 6, 5);
        f30165g = iVar7;
        i iVar8 = new i("JAM_HEAVY_TRAFFIC", 7, 6);
        f30166h = iVar8;
        i iVar9 = new i("JAM_STAND_STILL_TRAFFIC", 8, 7);
        f30167i = iVar9;
        i iVar10 = new i("JAM_LIGHT_TRAFFIC", 9, 8);
        f30168j = iVar10;
        i iVar11 = new i("HAZARD_ON_ROAD", 10, 9);
        f30169k = iVar11;
        i iVar12 = new i("HAZARD_ON_SHOULDER", 11, 10);
        f30170l = iVar12;
        i iVar13 = new i("HAZARD_WEATHER", 12, 11);
        m = iVar13;
        i iVar14 = new i("HAZARD_ON_ROAD_OBJECT", 13, 12);
        n = iVar14;
        i iVar15 = new i("HAZARD_ON_ROAD_POT_HOLE", 14, 13);
        o = iVar15;
        i iVar16 = new i("HAZARD_ON_ROAD_ROAD_KILL", 15, 14);
        p = iVar16;
        i iVar17 = new i("HAZARD_ON_SHOULDER_CAR_STOPPED", 16, 15);
        q = iVar17;
        i iVar18 = new i("HAZARD_ON_SHOULDER_ANIMALS", 17, 16);
        r = iVar18;
        i iVar19 = new i("HAZARD_ON_SHOULDER_MISSING_SIGN", 18, 17);
        s = iVar19;
        i iVar20 = new i("HAZARD_WEATHER_FOG", 19, 18);
        t = iVar20;
        i iVar21 = new i("HAZARD_WEATHER_HAIL", 20, 19);
        u = iVar21;
        i iVar22 = new i("HAZARD_WEATHER_HEAVY_RAIN", 21, 20);
        v = iVar22;
        i iVar23 = new i("HAZARD_WEATHER_HEAVY_SNOW", 22, 21);
        w = iVar23;
        i iVar24 = new i("HAZARD_WEATHER_FLOOD", 23, 22);
        x = iVar24;
        i iVar25 = new i("HAZARD_WEATHER_MONSOON", 24, 23);
        y = iVar25;
        i iVar26 = new i("HAZARD_WEATHER_TORNADO", 25, 24);
        z = iVar26;
        i iVar27 = new i("HAZARD_WEATHER_HEAT_WAVE", 26, 25);
        A = iVar27;
        i iVar28 = new i("HAZARD_WEATHER_HURRICANE", 27, 26);
        B = iVar28;
        i iVar29 = new i("HAZARD_WEATHER_FREEZING_RAIN", 28, 27);
        C = iVar29;
        i iVar30 = new i("HAZARD_ON_ROAD_LANE_CLOSED", 29, 28);
        D = iVar30;
        i iVar31 = new i("HAZARD_ON_ROAD_OIL", 30, 29);
        E = iVar31;
        i iVar32 = new i("HAZARD_ON_ROAD_ICE", 31, 30);
        F = iVar32;
        i iVar33 = new i("HAZARD_ON_ROAD_CONSTRUCTION", 32, 31);
        G = iVar33;
        i iVar34 = new i("HAZARD_ON_ROAD_CAR_STOPPED", 33, 32);
        H = iVar34;
        i iVar35 = new i("HAZARD_ON_ROAD_TRAFFIC_LIGHT_FAULT", 34, 33);
        I = iVar35;
        i iVar36 = new i("ROAD_CLOSED_HAZARD", 35, 34);
        J = iVar36;
        i iVar37 = new i("ROAD_CLOSED_CONSTRUCTION", 36, 35);
        K = iVar37;
        i iVar38 = new i("ROAD_CLOSED_EVENT", 37, 36);
        L = iVar38;
        i iVar39 = new i("PARKED_ON", 38, 37);
        M = iVar39;
        i iVar40 = new i("PARKED_OFF", 39, 38);
        N = iVar40;
        i iVar41 = new i("SOS_FLAT_TIRE", 40, 1601);
        O = iVar41;
        i iVar42 = new i("SOS_NO_FUEL", 41, 1602);
        P = iVar42;
        i iVar43 = new i("SOS_MEDICAL_HELP", 42, 1603);
        Q = iVar43;
        i iVar44 = new i("SOS_MECHANICAL_PROBLEM", 43, 1604);
        R = iVar44;
        i iVar45 = new i("SOS_OTHER", 44, 1605);
        S = iVar45;
        i iVar46 = new i("SOS_BATTERY_ISSUE", 45, 1606);
        T = iVar46;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, iVar18, iVar19, iVar20, iVar21, iVar22, iVar23, iVar24, iVar25, iVar26, iVar27, iVar28, iVar29, iVar30, iVar31, iVar32, iVar33, iVar34, iVar35, iVar36, iVar37, iVar38, iVar39, iVar40, iVar41, iVar42, iVar43, iVar44, iVar45, iVar46};
        U = iVarArr;
        h.d.b.a(iVarArr);
    }

    private i(String str, int i2, int i3) {
        this.V = i3;
    }

    public static i[] values() {
        return (i[]) U.clone();
    }

    public final int a() {
        return this.V;
    }
}
