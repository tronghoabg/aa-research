package defpackage;

import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class ulx {
    public static final ulx A;
    public static final ulx B;
    public static final ulx C;
    public static final ulx D;
    public static final ulx E;
    public static final ulx F;
    private static final /* synthetic */ ulx[] G;
    public static final ulx a;
    public static final ulx b;
    public static final ulx c;
    public static final ulx d;
    public static final ulx e;
    public static final ulx f;
    public static final ulx g;
    public static final ulx h;
    public static final ulx i;
    public static final ulx j;
    public static final ulx k;
    public static final ulx l;
    public static final ulx m;
    public static final ulx n;
    public static final ulx o;
    public static final ulx p;
    public static final ulx q;
    public static final ulx r;
    public static final ulx s;
    public static final ulx t;
    public static final ulx u;
    public static final ulx v;
    public static final ulx w;
    public static final ulx x;
    public static final ulx y;
    public static final ulx z;
    private final uly H;
    private final uly I;

    static {
        uxb uxbVar = uxb.b;
        ujk ujkVar = ujk.a;
        ulx ulxVar = new ulx("NO_MAP", 0, 1, uxbVar, ujkVar, ujkVar);
        a = ulxVar;
        ulx ulxVar2 = new ulx("ROADMAP", 1, 2, uxb.a, ujk.a, ujk.b);
        b = ulxVar2;
        uxb uxbVar2 = uxb.a;
        ujk ujkVar2 = ujk.d;
        ulx ulxVar3 = new ulx("NAVIGATION", 2, 2, uxbVar2, ujkVar2, ujkVar2);
        c = ulxVar3;
        uxb uxbVar3 = uxb.a;
        ujk ujkVar3 = ujk.e;
        ulx ulxVar4 = new ulx("NAVIGATION_EGMM", 3, 2, uxbVar3, ujkVar3, ujkVar3);
        d = ulxVar4;
        uxb uxbVar4 = uxb.a;
        ujk ujkVar4 = ujk.u;
        ulx ulxVar5 = new ulx("NAVIGATION_SATELLITE", 4, 2, uxbVar4, ujkVar4, ujkVar4);
        e = ulxVar5;
        uxb uxbVar5 = uxb.a;
        ujk ujkVar5 = ujk.v;
        ulx ulxVar6 = new ulx("NAVIGATION_EGMM_SATELLITE", 5, 2, uxbVar5, ujkVar5, ujkVar5);
        f = ulxVar6;
        uxb uxbVar6 = uxb.a;
        ujk ujkVar6 = ujk.j;
        ulx ulxVar7 = new ulx("NAVIGATION_EMBEDDED_AUTO", 6, 2, uxbVar6, ujkVar6, ujkVar6);
        g = ulxVar7;
        uxb uxbVar7 = uxb.a;
        ujk ujkVar7 = ujk.f;
        ulx ulxVar8 = new ulx("NAVIGATION_AMBIENT", 7, 2, uxbVar7, ujkVar7, ujkVar7);
        h = ulxVar8;
        uxb uxbVar8 = uxb.a;
        ujk ujkVar8 = ujk.h;
        ulx ulxVar9 = new ulx("NAVIGATION_AMBIENT_TUNNEL", 8, 2, uxbVar8, ujkVar8, ujkVar8);
        i = ulxVar9;
        uxb uxbVar9 = uxb.a;
        ujk ujkVar9 = ujk.k;
        ulx ulxVar10 = new ulx("NAVIGATION_HIGH_DETAIL", 9, 2, uxbVar9, ujkVar9, ujkVar9);
        j = ulxVar10;
        uxb uxbVar10 = uxb.a;
        ujk ujkVar10 = ujk.m;
        ulx ulxVar11 = new ulx("NAVIGATION_GLASSES", 10, 2, uxbVar10, ujkVar10, ujkVar10);
        k = ulxVar11;
        uxb uxbVar11 = uxb.a;
        ujk ujkVar11 = ujk.n;
        ulx ulxVar12 = new ulx("NAVIGATION_LOW_LIGHT", 11, 2, uxbVar11, ujkVar11, ujkVar11);
        l = ulxVar12;
        uxb uxbVar12 = uxb.a;
        ujk ujkVar12 = ujk.o;
        ulx ulxVar13 = new ulx("NAVIGATION_EGMM_LOW_LIGHT", 12, 2, uxbVar12, ujkVar12, ujkVar12);
        m = ulxVar13;
        uxb uxbVar13 = uxb.a;
        ujk ujkVar13 = ujk.l;
        ulx ulxVar14 = new ulx("NAVIGATION_EMBEDDED_AUTO_LOW_LIGHT", 13, 2, uxbVar13, ujkVar13, ujkVar13);
        n = ulxVar14;
        uxb uxbVar14 = uxb.a;
        ujk ujkVar14 = ujk.g;
        ulx ulxVar15 = new ulx("NAVIGATION_AMBIENT_DARK", 14, 2, uxbVar14, ujkVar14, ujkVar14);
        o = ulxVar15;
        uxb uxbVar15 = uxb.a;
        ujk ujkVar15 = ujk.i;
        ulx ulxVar16 = new ulx("NAVIGATION_AMBIENT_DARK_TUNNEL", 15, 2, uxbVar15, ujkVar15, ujkVar15);
        p = ulxVar16;
        uxb uxbVar16 = uxb.a;
        ujk ujkVar16 = ujk.w;
        ulx ulxVar17 = new ulx("NAVIGATION_EMBEDDED_AUTO_SATELLITE", 16, 2, uxbVar16, ujkVar16, ujkVar16);
        q = ulxVar17;
        uxb uxbVar17 = uxb.a;
        ujk ujkVar17 = ujk.p;
        ulx ulxVar18 = new ulx("NAVIGATION_HIGH_DETAIL_LOW_LIGHT", 17, 2, uxbVar17, ujkVar17, ujkVar17);
        r = ulxVar18;
        uxb uxbVar18 = uxb.a;
        ujk ujkVar18 = ujk.q;
        ulx ulxVar19 = new ulx("NAVIGATION_MIN_MODE", 18, 2, uxbVar18, ujkVar18, ujkVar18);
        s = ulxVar19;
        uxb uxbVar19 = uxb.a;
        ujk ujkVar19 = ujk.r;
        ulx ulxVar20 = new ulx("NAVIGATION_MIN_MODE_AUTO", 19, 2, uxbVar19, ujkVar19, ujkVar19);
        t = ulxVar20;
        uxb uxbVar20 = uxb.a;
        ujk ujkVar20 = ujk.s;
        ulx ulxVar21 = new ulx("NAVIGATION_TUNNEL", 20, 2, uxbVar20, ujkVar20, ujkVar20);
        u = ulxVar21;
        uxb uxbVar21 = uxb.a;
        ujk ujkVar21 = ujk.t;
        ulx ulxVar22 = new ulx("NAVIGATION_TUNNEL_LOW_LIGHT", 21, 2, uxbVar21, ujkVar21, ujkVar21);
        v = ulxVar22;
        uxb uxbVar22 = uxb.a;
        ujk ujkVar22 = ujk.b;
        ulx ulxVar23 = new ulx("NAVIGATION_WALKING_LOW_LIGHT", 22, 2, uxbVar22, ujkVar22, ujkVar22);
        w = ulxVar23;
        uxb uxbVar23 = uxb.a;
        ujk ujkVar23 = ujk.z;
        ulx ulxVar24 = new ulx("SATELLITE_HYBRID", 23, 4, uxbVar23, ujkVar23, ujkVar23);
        x = ulxVar24;
        uxb uxbVarA = uxb.a(6);
        ujk ujkVar24 = ujk.z;
        ulx ulxVar25 = new ulx("SATELLITE_NO_BASEMAP", 24, 3, uxbVarA, ujkVar24, ujkVar24);
        y = ulxVar25;
        ulx ulxVar26 = new ulx("TERRAIN_VECTOR_CLIENT_LEGEND", 25, 5, uxb.a, ujk.E, ujk.F);
        z = ulxVar26;
        ulx ulxVar27 = new ulx("TRANSIT_FOCUSED", 26, 2, uxb.a, ujk.G, ujk.H);
        A = ulxVar27;
        uxb uxbVar24 = uxb.a;
        ujk ujkVar25 = ujk.c;
        ulx ulxVar28 = new ulx("SATELLITE_BASEMAP_EDITING", 27, 4, uxbVar24, ujkVar25, ujkVar25);
        B = ulxVar28;
        ulx ulxVar29 = new ulx("ROUTE_OVERVIEW", 28, 2, uxb.a, ujk.A, ujk.B);
        C = ulxVar29;
        uxb uxbVar25 = uxb.a;
        ujk ujkVar26 = ujk.x;
        ulx ulxVar30 = new ulx("ROADMAP_AMBIACTIVE", 29, 2, uxbVar25, ujkVar26, ujkVar26);
        D = ulxVar30;
        uxb uxbVar26 = uxb.a;
        ujk ujkVar27 = ujk.y;
        ulx ulxVar31 = new ulx("ROADMAP_AMBIACTIVE_LOW_BIT", 30, 2, uxbVar26, ujkVar27, ujkVar27);
        E = ulxVar31;
        ulx ulxVar32 = new ulx("AIR_QUALITY_HEATMAP", 31, 2, uxb.a, ujk.I, ujk.J);
        F = ulxVar32;
        G = new ulx[]{ulxVar, ulxVar2, ulxVar3, ulxVar4, ulxVar5, ulxVar6, ulxVar7, ulxVar8, ulxVar9, ulxVar10, ulxVar11, ulxVar12, ulxVar13, ulxVar14, ulxVar15, ulxVar16, ulxVar17, ulxVar18, ulxVar19, ulxVar20, ulxVar21, ulxVar22, ulxVar23, ulxVar24, ulxVar25, ulxVar26, ulxVar27, ulxVar28, ulxVar29, ulxVar30, ulxVar31, ulxVar32};
        EnumMap enumMap = new EnumMap(ujk.class);
        for (ulx ulxVar33 : values()) {
            enumMap.put((EnumMap) ulxVar33.a(true).b, (ujk) ulxVar33);
            enumMap.put((EnumMap) ulxVar33.a(false).b, (ujk) ulxVar33);
        }
        enumMap.put((EnumMap) ujk.a, (ujk) b);
        enumMap.put((EnumMap) ujk.z, (ujk) x);
        yrm.F(enumMap);
    }

    private ulx(String str, int i2, int i3, uxb uxbVar, ujk ujkVar, ujk ujkVar2) {
        this.H = new uly(i3, uxbVar, ujkVar, false, this);
        this.I = new uly(i3, uxbVar, ujkVar2, true, this);
    }

    public static ulx valueOf(String str) {
        return (ulx) Enum.valueOf(ulx.class, str);
    }

    public static ulx[] values() {
        return (ulx[]) G.clone();
    }

    public final uly a(boolean z2) {
        return z2 ? this.I : this.H;
    }
}
