package com.waze.reports_v2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public static final af f34037a;

    /* renamed from: b, reason: collision with root package name */
    public static final af f34038b;

    /* renamed from: c, reason: collision with root package name */
    public static final af f34039c;

    /* renamed from: d, reason: collision with root package name */
    public static final af f34040d;

    /* renamed from: e, reason: collision with root package name */
    public static final af f34041e;

    /* renamed from: f, reason: collision with root package name */
    public static final af f34042f;

    /* renamed from: g, reason: collision with root package name */
    public static final af f34043g;

    /* renamed from: h, reason: collision with root package name */
    public static final af f34044h;

    /* renamed from: i, reason: collision with root package name */
    public static final af f34045i;

    /* renamed from: j, reason: collision with root package name */
    public static final af f34046j;

    /* renamed from: k, reason: collision with root package name */
    public static final af f34047k;

    /* renamed from: l, reason: collision with root package name */
    public static final af f34048l;
    public static final af m;
    public static final af n;
    private static final /* synthetic */ af[] o;
    private static final /* synthetic */ h.d.a p;
    private final at q;
    private final int r;

    static {
        af afVar = new af("INCORRECT_TURN", 0, at.K, 0);
        f34037a = afVar;
        af afVar2 = new af("INCORRECT_ADDRESS", 1, at.L, 1);
        f34038b = afVar2;
        af afVar3 = new af("INCORRECT_ROUTE", 2, at.M, 2);
        f34039c = afVar3;
        af afVar4 = new af("INCORRECT_MISSING_ROUNDABOUT", 3, at.N, 3);
        f34040d = afVar4;
        af afVar5 = new af("INCORRECT_GENERAL_ERROR", 4, at.J, 4);
        f34041e = afVar5;
        af afVar6 = new af("TURN_NOT_ALLOWED", 5, at.P, 5);
        f34042f = afVar6;
        af afVar7 = new af("INCORRECT_JUNCTION", 6, at.Q, 6);
        f34043g = afVar7;
        af afVar8 = new af("MISSING_BRIDGE_OVERPASS", 7, at.R, 7);
        f34044h = afVar8;
        af afVar9 = new af("WRONG_DRIVING_DIRECTIONS", 8, at.S, 8);
        f34045i = afVar9;
        af afVar10 = new af("MISSING_EXIT", 9, at.T, 9);
        f34046j = afVar10;
        af afVar11 = new af("MISSING_ROAD", 10, at.O, 10);
        f34047k = afVar11;
        af afVar12 = new af("MISPLACED_GAS_STATION", 11, at.U, 11);
        f34048l = afVar12;
        af afVar13 = new af("MISSING_LANDMARK", 12, at.V, 12);
        m = afVar13;
        af afVar14 = new af("BLOCKED_ROAD", 13, at.W, 13);
        n = afVar14;
        af[] afVarArr = {afVar, afVar2, afVar3, afVar4, afVar5, afVar6, afVar7, afVar8, afVar9, afVar10, afVar11, afVar12, afVar13, afVar14};
        o = afVarArr;
        p = h.d.b.a(afVarArr);
    }

    private af(String str, int i2, at atVar, int i3) {
        this.q = atVar;
        this.r = i3;
    }

    public static h.d.a c() {
        return p;
    }

    public static af[] values() {
        return (af[]) o.clone();
    }

    public final int a() {
        return this.r;
    }

    public final at b() {
        return this.q;
    }
}
