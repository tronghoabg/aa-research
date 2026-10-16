package com.waze.reports_v2.b;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class at implements Parcelable {
    public static final at A;
    public static final at B;
    public static final at C;
    public static final Parcelable.Creator<at> CREATOR;
    public static final at D;
    public static final at E;
    public static final at F;
    public static final at G;
    public static final at H;
    public static final at I;
    public static final at J;
    public static final at K;
    public static final at L;
    public static final at M;
    public static final at N;
    public static final at O;
    public static final at P;
    public static final at Q;
    public static final at R;
    public static final at S;
    public static final at T;
    public static final at U;
    public static final at V;
    public static final at W;
    public static final at X;
    public static final at Y;
    public static final at Z;

    /* renamed from: a, reason: collision with root package name */
    public static final at f34073a;
    public static final at aa;
    private static final /* synthetic */ at[] ab;
    private static final /* synthetic */ h.d.a ac;

    /* renamed from: b, reason: collision with root package name */
    public static final at f34074b;

    /* renamed from: c, reason: collision with root package name */
    public static final at f34075c;

    /* renamed from: d, reason: collision with root package name */
    public static final at f34076d;

    /* renamed from: e, reason: collision with root package name */
    public static final at f34077e;

    /* renamed from: f, reason: collision with root package name */
    public static final at f34078f;

    /* renamed from: g, reason: collision with root package name */
    public static final at f34079g;

    /* renamed from: h, reason: collision with root package name */
    public static final at f34080h;

    /* renamed from: i, reason: collision with root package name */
    public static final at f34081i;

    /* renamed from: j, reason: collision with root package name */
    public static final at f34082j;

    /* renamed from: k, reason: collision with root package name */
    public static final at f34083k;

    /* renamed from: l, reason: collision with root package name */
    public static final at f34084l;
    public static final at m;
    public static final at n;
    public static final at o;
    public static final at p;
    public static final at q;
    public static final at r;
    public static final at s;
    public static final at t;
    public static final at u;
    public static final at v;
    public static final at w;
    public static final at x;
    public static final at y;
    public static final at z;

    static {
        at atVar = new at("TRAFFIC_DEFAULT", 0);
        f34073a = atVar;
        at atVar2 = new at("TRAFFIC_STANDSTILL", 1);
        f34074b = atVar2;
        at atVar3 = new at("POLICE_DEFAULT", 2);
        f34075c = atVar3;
        at atVar4 = new at("POLICE_HIDDEN", 3);
        f34076d = atVar4;
        at atVar5 = new at("POLICE_MOBILE_CAMERA", 4);
        f34077e = atVar5;
        at atVar6 = new at("POLICE_OTHER_SIDE", 5);
        f34078f = atVar6;
        at atVar7 = new at("CRASH_DEFAULT", 6);
        f34079g = atVar7;
        at atVar8 = new at("CRASH_PILE_UP", 7);
        f34080h = atVar8;
        at atVar9 = new at("CRASH_OTHER_SIDE", 8);
        f34081i = atVar9;
        at atVar10 = new at("HAZARD_DEFAULT", 9);
        f34082j = atVar10;
        at atVar11 = new at("HAZARD_BROKEN_TRAFFIC_LIGHT", 10);
        f34083k = atVar11;
        at atVar12 = new at("HAZARD_POTHOLE", 11);
        f34084l = atVar12;
        at atVar13 = new at("HAZARD_OBJECT_ON_ROAD", 12);
        m = atVar13;
        at atVar14 = new at("HAZARD_VEHICLE_STOPPED", 13);
        n = atVar14;
        at atVar15 = new at("HAZARD_CONSTRUCTION", 14);
        o = atVar15;
        at atVar16 = new at("WEATHER_DEFAULT", 15);
        p = atVar16;
        at atVar17 = new at("WEATHER_FLOOD", 16);
        q = atVar17;
        at atVar18 = new at("WEATHER_SLIPPERY_ROAD", 17);
        r = atVar18;
        at atVar19 = new at("WEATHER_UNPLOWED_ROAD", 18);
        s = atVar19;
        at atVar20 = new at("WEATHER_ICY_ROAD", 19);
        t = atVar20;
        at atVar21 = new at("WEATHER_FOG", 20);
        u = atVar21;
        at atVar22 = new at("BLOCKED_LANE_DEFAULT", 21);
        v = atVar22;
        at atVar23 = new at("BLOCKED_LANE_LEFT", 22);
        w = atVar23;
        at atVar24 = new at("BLOCKED_LANE_CENTER", 23);
        x = atVar24;
        at atVar25 = new at("BLOCKED_LANE_RIGHT", 24);
        y = atVar25;
        at atVar26 = new at("WEATHER_HAIL", 25);
        z = atVar26;
        at atVar27 = new at("HAZARD_ANIMALS", 26);
        A = atVar27;
        at atVar28 = new at("HAZARD_MISSING_SIGN", 27);
        B = atVar28;
        at atVar29 = new at("HAZARD_ROAD_KILL", 28);
        C = atVar29;
        at atVar30 = new at("HAZARD_SHOULDER_VEHICLE_STOPPED", 29);
        D = atVar30;
        at atVar31 = new at("CRASH_MAJOR", 30);
        E = atVar31;
        at atVar32 = new at("CRASH_MINOR", 31);
        F = atVar32;
        at atVar33 = new at("TRAFFIC_MODERATE", 32);
        G = atVar33;
        at atVar34 = new at("TRAFFIC_HEAVY", 33);
        H = atVar34;
        at atVar35 = new at("CLOSURE_DEFAULT", 34);
        I = atVar35;
        at atVar36 = new at("MAP_ISSUE_GENERAL_MAP_PROBLEM", 35);
        J = atVar36;
        at atVar37 = new at("MAP_ISSUE_INCORRECT_TURN", 36);
        K = atVar37;
        at atVar38 = new at("MAP_ISSUE_INCORRECT_ADDRESS", 37);
        L = atVar38;
        at atVar39 = new at("MAP_ISSUE_INCORRECT_ROUTE", 38);
        M = atVar39;
        at atVar40 = new at("MAP_ISSUE_MISSING_ROUNDABOUT", 39);
        N = atVar40;
        at atVar41 = new at("MAP_ISSUE_MISSING_ROAD", 40);
        O = atVar41;
        at atVar42 = new at("MAP_ISSUE_TURN_NOT_ALLOWED", 41);
        P = atVar42;
        at atVar43 = new at("MAP_ISSUE_INCORRECT_JUNCTION", 42);
        Q = atVar43;
        at atVar44 = new at("MAP_ISSUE_MISSING_BRIDGE_OVERPASS", 43);
        R = atVar44;
        at atVar45 = new at("MAP_ISSUE_WRONG_DRIVING_DIRECTIONS", 44);
        S = atVar45;
        at atVar46 = new at("MAP_ISSUE_MISSING_EXIT", 45);
        T = atVar46;
        at atVar47 = new at("MAP_ISSUE_MISPLACED_GAS_STATION", 46);
        U = atVar47;
        at atVar48 = new at("MAP_ISSUE_MISSING_LANDMARK", 47);
        V = atVar48;
        at atVar49 = new at("MAP_ISSUE_BLOCKED_ROAD", 48);
        W = atVar49;
        at atVar50 = new at("PERSONAL_SAFETY_DEFAULT", 49);
        X = atVar50;
        at atVar51 = new at("ANIMAL_DEFAULT", 50);
        Y = atVar51;
        at atVar52 = new at("ANIMAL_IN_LANE", 51);
        Z = atVar52;
        at atVar53 = new at("ANIMAL_ON_SHOULDER", 52);
        aa = atVar53;
        at[] atVarArr = {atVar, atVar2, atVar3, atVar4, atVar5, atVar6, atVar7, atVar8, atVar9, atVar10, atVar11, atVar12, atVar13, atVar14, atVar15, atVar16, atVar17, atVar18, atVar19, atVar20, atVar21, atVar22, atVar23, atVar24, atVar25, atVar26, atVar27, atVar28, atVar29, atVar30, atVar31, atVar32, atVar33, atVar34, atVar35, atVar36, atVar37, atVar38, atVar39, atVar40, atVar41, atVar42, atVar43, atVar44, atVar45, atVar46, atVar47, atVar48, atVar49, atVar50, atVar51, atVar52, atVar53};
        ab = atVarArr;
        ac = h.d.b.a(atVarArr);
        CREATOR = new com.google.android.gms.common.api.n(8);
    }

    public static at a(String str) {
        return (at) Enum.valueOf(at.class, str);
    }

    public static h.d.a b() {
        return ac;
    }

    public static at[] values() {
        return (at[]) ab.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        parcel.writeString(name());
    }
}
