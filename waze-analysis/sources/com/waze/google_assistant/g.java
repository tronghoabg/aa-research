package com.waze.google_assistant;

import l.a.boa;
import l.a.bob;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f24178a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f24179b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f24180c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f24181d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f24182e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f24183f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f24184g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f24185h;

    /* renamed from: i, reason: collision with root package name */
    public static final g f24186i;

    /* renamed from: j, reason: collision with root package name */
    public static final g f24187j;

    /* renamed from: k, reason: collision with root package name */
    public static final g f24188k;

    /* renamed from: l, reason: collision with root package name */
    public static final g f24189l;
    public static final g m;
    public static final g n;
    public static final g o;
    public static final g p;
    public static final g q;
    public static final g r;
    public static final g s;
    public static final g t;
    public static final g u;
    public static final g v;
    public static final g w;
    public static final g x;
    public static final g y;
    private static final /* synthetic */ g[] z;
    private final bob A;
    private final boa B;

    static {
        g gVar = new g("CRASH_DEFAULT", 0, bob.CRASH, boa.CRASH_DEFAULT);
        f24178a = gVar;
        g gVar2 = new g("CRASH_MAJOR", 1, bob.CRASH, boa.CRASH_MAJOR);
        f24179b = gVar2;
        g gVar3 = new g("CRASH_MINOR", 2, bob.CRASH, boa.CRASH_MINOR);
        f24180c = gVar3;
        g gVar4 = new g("CRASH_OTHER_SIDE", 3, bob.CRASH, boa.CRASH_OTHER_SIDE);
        f24181d = gVar4;
        g gVar5 = new g("POLICE_DEFAULT", 4, bob.POLICE, boa.POLICE_DEFAULT);
        f24182e = gVar5;
        g gVar6 = new g("POLICE_OTHER_SIDE", 5, bob.POLICE, boa.POLICE_OTHER_SIDE);
        f24183f = gVar6;
        g gVar7 = new g("TRAFFIC_DEFAULT", 6, bob.TRAFFIC, boa.TRAFFIC_DEFAULT);
        f24184g = gVar7;
        g gVar8 = new g("TRAFFIC_MODERATE", 7, bob.TRAFFIC, boa.TRAFFIC_MODERATE);
        f24185h = gVar8;
        g gVar9 = new g("TRAFFIC_HEAVY", 8, bob.TRAFFIC, boa.TRAFFIC_HEAVY);
        f24186i = gVar9;
        g gVar10 = new g("TRAFFIC_STANDSTILL", 9, bob.TRAFFIC, boa.TRAFFIC_STANDSTILL);
        f24187j = gVar10;
        g gVar11 = new g("HAZARD_DEFAULT", 10, bob.HAZARD, boa.HAZARD_DEFAULT);
        f24188k = gVar11;
        g gVar12 = new g("HAZARD_ANIMALS", 11, bob.HAZARD, boa.HAZARD_ANIMALS);
        f24189l = gVar12;
        g gVar13 = new g("HAZARD_MISSING_SIGN", 12, bob.HAZARD, boa.HAZARD_MISSING_SIGN);
        m = gVar13;
        g gVar14 = new g("HAZARD_FLOOD", 13, bob.HAZARD, boa.WEATHER_FLOOD);
        n = gVar14;
        g gVar15 = new g("HAZARD_FOG", 14, bob.HAZARD, boa.WEATHER_FOG);
        o = gVar15;
        g gVar16 = new g("HAZARD_HAIL", 15, bob.HAZARD, boa.WEATHER_HAIL);
        p = gVar16;
        g gVar17 = new g("HAZARD_ICY_ROAD", 16, bob.HAZARD, boa.WEATHER_ICY_ROAD);
        q = gVar17;
        g gVar18 = new g("HAZARD_UNPLOWED_ROAD", 17, bob.HAZARD, boa.WEATHER_UNPLOWED_ROAD);
        r = gVar18;
        g gVar19 = new g("HAZARD_POTHOLE", 18, bob.HAZARD, boa.HAZARD_POTHOLE);
        s = gVar19;
        g gVar20 = new g("HAZARD_ROAD_KILL", 19, bob.HAZARD, boa.HAZARD_ROAD_KILL);
        t = gVar20;
        g gVar21 = new g("HAZARD_ON_ROAD_VEHICLE_STOPPED", 20, bob.HAZARD, boa.HAZARD_VEHICLE_STOPPED);
        u = gVar21;
        g gVar22 = new g("HAZARD_SHOULDER_VEHICLE_STOPPED", 21, bob.HAZARD, boa.HAZARD_SHOULDER_VEHICLE_STOPPED);
        v = gVar22;
        g gVar23 = new g("HAZARD_CONSTRUCTION", 22, bob.HAZARD, boa.HAZARD_CONSTRUCTION);
        w = gVar23;
        g gVar24 = new g("HAZARD_OBJECT_ON_ROAD", 23, bob.HAZARD, boa.HAZARD_OBJECT_ON_ROAD);
        x = gVar24;
        g gVar25 = new g("HAZARD_BROKEN_TRAFFIC_LIGHT", 24, bob.HAZARD, boa.HAZARD_BROKEN_TRAFFIC_LIGHT);
        y = gVar25;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13, gVar14, gVar15, gVar16, gVar17, gVar18, gVar19, gVar20, gVar21, gVar22, gVar23, gVar24, gVar25};
        z = gVarArr;
        h.d.b.a(gVarArr);
    }

    private g(String str, int i2, bob bobVar, boa boaVar) {
        this.A = bobVar;
        this.B = boaVar;
    }

    public static g[] values() {
        return (g[]) z.clone();
    }

    public final boa a() {
        return this.B;
    }

    public final bob b() {
        return this.A;
    }
}
