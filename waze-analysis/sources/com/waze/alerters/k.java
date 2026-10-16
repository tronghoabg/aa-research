package com.waze.alerters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f14291a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f14292b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f14293c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f14294d;

    /* renamed from: e, reason: collision with root package name */
    public static final k f14295e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f14296f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f14297g;

    /* renamed from: h, reason: collision with root package name */
    public static final k f14298h;

    /* renamed from: i, reason: collision with root package name */
    public static final k f14299i;

    /* renamed from: j, reason: collision with root package name */
    public static final k f14300j;

    /* renamed from: k, reason: collision with root package name */
    public static final k f14301k;

    /* renamed from: l, reason: collision with root package name */
    public static final k f14302l;
    public static final k m;
    public static final k n;
    public static final k o;
    public static final k p;
    public static final k q;
    private static final /* synthetic */ k[] r;
    private final long s;

    static {
        k kVar = new k("UNSPECIFIED", 0, -1L);
        f14291a = kVar;
        k kVar2 = new k("SPEED_BUMP", 1, 0L);
        f14292b = kVar2;
        k kVar3 = new k("TOPES", 2, 1L);
        f14293c = kVar3;
        k kVar4 = new k("TOLL_BOOTH", 3, 2L);
        f14294d = kVar4;
        k kVar5 = new k("DANGEROUS_CURVE", 4, 3L);
        f14295e = kVar5;
        k kVar6 = new k("FORK", 5, 4L);
        f14296f = kVar6;
        k kVar7 = new k("LANES_MERGING", 6, 5L);
        f14297g = kVar7;
        k kVar8 = new k("INTERSECTION", 7, 6L);
        f14298h = kVar8;
        k kVar9 = new k("SCHOOL_ZONE", 8, 7L);
        f14299i = kVar9;
        k kVar10 = new k("LEFT_LANE_ENDING", 9, 8L);
        f14300j = kVar10;
        k kVar11 = new k("RIGHT_LANE_ENDING", 10, 9L);
        f14301k = kVar11;
        k kVar12 = new k("RAISED_CROSSWALK", 11, 10L);
        f14302l = kVar12;
        k kVar13 = new k("HIGHWAY_CROSSWALK", 12, 11L);
        m = kVar13;
        k kVar14 = new k("BOTH_SHOULDER_ENDING", 13, 12L);
        n = kVar14;
        k kVar15 = new k("LEFT_SHOULDER_ENDING", 14, 13L);
        o = kVar15;
        k kVar16 = new k("RIGHT_SHOULDER_ENDING", 15, 14L);
        p = kVar16;
        k kVar17 = new k("NARROW_BRIDGE", 16, 15L);
        q = kVar17;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, kVar17};
        r = kVarArr;
        h.d.b.a(kVarArr);
    }

    private k(String str, int i2, long j2) {
        this.s = j2;
    }

    public static k[] values() {
        return (k[]) r.clone();
    }

    public final long a() {
        return this.s;
    }
}
