package com.waze.alerters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f14279a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f14280b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f14281c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f14282d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f14283e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f14284f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f14285g;

    /* renamed from: h, reason: collision with root package name */
    public static final j f14286h;

    /* renamed from: i, reason: collision with root package name */
    public static final j f14287i;

    /* renamed from: j, reason: collision with root package name */
    public static final j f14288j;

    /* renamed from: k, reason: collision with root package name */
    public static final j f14289k;

    /* renamed from: l, reason: collision with root package name */
    public static final j f14290l;
    public static final j m;
    public static final j n;
    private static final /* synthetic */ j[] o;
    private final long p;

    static {
        j jVar = new j("UNSPECIFIED", 0, -1L);
        f14279a = jVar;
        j jVar2 = new j("SPEED", 1, 0L);
        f14280b = jVar2;
        j jVar3 = new j("REDLIGHT", 2, 1L);
        f14281c = jVar3;
        j jVar4 = new j("DUMMY", 3, 2L);
        f14282d = jVar4;
        j jVar5 = new j("RAILROAD", 4, 3L);
        f14283e = jVar5;
        j jVar6 = new j("HOV_LANE", 5, 4L);
        f14284f = jVar6;
        j jVar7 = new j("HOV_LANE_BUS", 6, 5L);
        f14285g = jVar7;
        j jVar8 = new j("HOV_LANE_CARPOOL", 7, 6L);
        f14286h = jVar8;
        j jVar9 = new j("REDLIGHT_AND_SPEED", 8, 7L);
        f14287i = jVar9;
        j jVar10 = new j("ROAD_SAFETY_PHONE", 9, 8L);
        f14288j = jVar10;
        j jVar11 = new j("ROAD_SAFETY_SEAT_BELT", 10, 9L);
        f14289k = jVar11;
        j jVar12 = new j("ROAD_SAFETY_DISTANCE_BETWEEN_VEHICLES", 11, 10L);
        f14290l = jVar12;
        j jVar13 = new j("ROAD_SAFETY_STOP_SIGN", 12, 11L);
        m = jVar13;
        j jVar14 = new j("ROAD_SAFETY_NOISE", 13, 12L);
        n = jVar14;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14};
        o = jVarArr;
        h.d.b.a(jVarArr);
    }

    private j(String str, int i2, long j2) {
        this.p = j2;
    }

    public static j[] values() {
        return (j[]) o.clone();
    }

    public final long a() {
        return this.p;
    }
}
