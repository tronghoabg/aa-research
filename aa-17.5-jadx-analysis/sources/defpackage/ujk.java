package defpackage;

import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class ujk {
    public static final ujk A;
    public static final ujk B;
    public static final ujk C;
    public static final ujk D;
    public static final ujk E;
    public static final ujk F;
    public static final ujk G;
    public static final ujk H;
    public static final ujk I;
    public static final ujk J;
    private static final yfy O;
    private static final /* synthetic */ ujk[] P;
    public static final ujk a;
    public static final ujk b;
    public static final ujk c;
    public static final ujk d;
    public static final ujk e;
    public static final ujk f;
    public static final ujk g;
    public static final ujk h;
    public static final ujk i;
    public static final ujk j;
    public static final ujk k;
    public static final ujk l;
    public static final ujk m;
    public static final ujk n;
    public static final ujk o;
    public static final ujk p;
    public static final ujk q;
    public static final ujk r;
    public static final ujk s;
    public static final ujk t;
    public static final ujk u;
    public static final ujk v;
    public static final ujk w;
    public static final ujk x;
    public static final ujk y;
    public static final ujk z;
    public final int K;
    public final abgx L;
    public final boolean M;
    public final boolean N;

    static {
        ujk ujkVar = new ujk("ROADMAP", 0, -987675, abgx.ROADMAP, true, false);
        a = ujkVar;
        ujk ujkVar2 = new ujk("ROADMAP_DARK", 1, -15592942, abgx.ROADMAP_DARK, false, true);
        b = ujkVar2;
        ujk ujkVar3 = new ujk("BASEMAP_EDITING_SATELLITE", 2, -15525081, abgx.BASEMAP_EDITING_SATELLITE, false, false);
        c = ujkVar3;
        ujk ujkVar4 = new ujk("NAVIGATION", 3, -1973791, abgx.NAVIGATION, false, false);
        d = ujkVar4;
        ujk ujkVar5 = new ujk("NAVIGATION_EGMM", 4, ujkVar4.K, abgx.NAVIGATION_EGMM, false, false);
        e = ujkVar5;
        ujk ujkVar6 = new ujk("NAVIGATION_AMBIENT", 5, -4341306, abgx.NAVIGATION_AMBIENT, false, false);
        f = ujkVar6;
        ujk ujkVar7 = new ujk("NAVIGATION_AMBIENT_DARK", 6, -14803167, abgx.NAVIGATION_AMBIENT_DARK, false, true);
        g = ujkVar7;
        ujk ujkVar8 = new ujk("NAVIGATION_AMBIENT_TUNNEL", 7, ujkVar6.K, abgx.NAVIGATION_AMBIENT_TUNNEL, false, false);
        h = ujkVar8;
        ujk ujkVar9 = new ujk("NAVIGATION_AMBIENT_DARK_TUNNEL", 8, ujkVar7.K, abgx.NAVIGATION_AMBIENT_DARK_TUNNEL, false, true);
        i = ujkVar9;
        ujk ujkVar10 = new ujk("NAVIGATION_EMBEDDED_AUTO", 9, -4341306, abgx.NAVIGATION_EMBEDDED_AUTO, false, false);
        j = ujkVar10;
        ujk ujkVar11 = new ujk("NAVIGATION_HIGH_DETAIL", 10, ujkVar4.K, abgx.NAVIGATION_HIGH_DETAIL, false, false);
        k = ujkVar11;
        ujk ujkVar12 = new ujk("NAVIGATION_EMBEDDED_AUTO_LOW_LIGHT", 11, -14803167, abgx.NAVIGATION_EMBEDDED_AUTO_LOW_LIGHT, false, true);
        l = ujkVar12;
        ujk ujkVar13 = new ujk("NAVIGATION_GLASSES", 12, -16777216, abgx.NAVIGATION_GLASSES, false, true);
        m = ujkVar13;
        ujk ujkVar14 = new ujk("NAVIGATION_LOW_LIGHT", 13, -15525081, abgx.NAVIGATION_LOW_LIGHT, false, true);
        n = ujkVar14;
        ujk ujkVar15 = new ujk("NAVIGATION_EGMM_LOW_LIGHT", 14, ujkVar14.K, abgx.NAVIGATION_EGMM_LOW_LIGHT, false, true);
        o = ujkVar15;
        ujk ujkVar16 = new ujk("NAVIGATION_HIGH_DETAIL_LOW_LIGHT", 15, ujkVar14.K, abgx.NAVIGATION_HIGH_DETAIL_LOW_LIGHT, false, true);
        p = ujkVar16;
        ujk ujkVar17 = new ujk("NAVIGATION_MIN_MODE", 16, 0, abgx.NAVIGATION_MIN_MODE, false, false);
        q = ujkVar17;
        ujk ujkVar18 = new ujk("NAVIGATION_MIN_MODE_AUTO", 17, -16777216, abgx.NAVIGATION_MIN_MODE_AUTO, false, false);
        r = ujkVar18;
        ujk ujkVar19 = new ujk("NAVIGATION_TUNNEL", 18, ujkVar4.K, abgx.NAVIGATION_TUNNEL, false, false);
        s = ujkVar19;
        ujk ujkVar20 = new ujk("NAVIGATION_TUNNEL_LOW_LIGHT", 19, ujkVar14.K, abgx.NAVIGATION_TUNNEL_LOW_LIGHT, false, true);
        t = ujkVar20;
        ujk ujkVar21 = new ujk("NAVIGATION_SATELLITE", 20, ujkVar14.K, abgx.NAVIGATION_SATELLITE, false, false);
        u = ujkVar21;
        ujk ujkVar22 = new ujk("NAVIGATION_EGMM_SATELLITE", 21, ujkVar21.K, abgx.NAVIGATION_EGMM_SATELLITE, false, false);
        v = ujkVar22;
        ujk ujkVar23 = new ujk("NAVIGATION_EMBEDDED_AUTO_SATELLITE", 22, ujkVar14.K, abgx.NAVIGATION_EMBEDDED_AUTO_SATELLITE, false, false);
        w = ujkVar23;
        ujk ujkVar24 = new ujk("ROADMAP_AMBIACTIVE", 23, ujkVar.K, abgx.ROADMAP_AMBIACTIVE, false, false);
        x = ujkVar24;
        ujk ujkVar25 = new ujk("ROADMAP_AMBIACTIVE_LOW_BIT", 24, 0, abgx.ROADMAP_AMBIACTIVE_LOW_BIT, false, false);
        y = ujkVar25;
        ujk ujkVar26 = new ujk("ROADMAP_SATELLITE", 25, ujkVar14.K, abgx.ROADMAP_SATELLITE, false, false);
        z = ujkVar26;
        ujk ujkVar27 = new ujk("ROUTE_OVERVIEW", 26, ujkVar.K, abgx.ROUTE_OVERVIEW, false, false);
        A = ujkVar27;
        ujk ujkVar28 = new ujk("ROUTE_OVERVIEW_DARK", 27, ujkVar2.K, abgx.ROUTE_OVERVIEW_DARK, false, true);
        B = ujkVar28;
        ujk ujkVar29 = new ujk("SAFETY", 28, ujkVar.K, abgx.SAFETY, false, false);
        C = ujkVar29;
        ujk ujkVar30 = new ujk("SAFETY_DARK", 29, ujkVar2.K, abgx.SAFETY_DARK, false, true);
        D = ujkVar30;
        ujk ujkVar31 = new ujk("TERRAIN_VECTOR_CLIENT", 30, ujkVar.K, abgx.TERRAIN_VECTOR_CLIENT, false, false);
        E = ujkVar31;
        ujk ujkVar32 = new ujk("TERRAIN_VECTOR_CLIENT_DARK", 31, ujkVar.K, abgx.TERRAIN_VECTOR_CLIENT_DARK, false, true);
        F = ujkVar32;
        ujk ujkVar33 = new ujk("TRANSIT_FOCUSED", 32, ujkVar.K, abgx.TRANSIT_FOCUSED, false, false);
        G = ujkVar33;
        ujk ujkVar34 = new ujk("TRANSIT_FOCUSED_DARK", 33, ujkVar2.K, abgx.TRANSIT_FOCUSED_DARK, false, true);
        H = ujkVar34;
        ujk ujkVar35 = new ujk("AIR_QUALITY_HEATMAP", 34, ujkVar.K, abgx.AIR_QUALITY_HEATMAP, false, false);
        I = ujkVar35;
        ujk ujkVar36 = new ujk("AIR_QUALITY_HEATMAP_DARK", 35, ujkVar2.K, abgx.AIR_QUALITY_HEATMAP_DARK, false, true);
        J = ujkVar36;
        P = new ujk[]{ujkVar, ujkVar2, ujkVar3, ujkVar4, ujkVar5, ujkVar6, ujkVar7, ujkVar8, ujkVar9, ujkVar10, ujkVar11, ujkVar12, ujkVar13, ujkVar14, ujkVar15, ujkVar16, ujkVar17, ujkVar18, ujkVar19, ujkVar20, ujkVar21, ujkVar22, ujkVar23, ujkVar24, ujkVar25, ujkVar26, ujkVar27, ujkVar28, ujkVar29, ujkVar30, ujkVar31, ujkVar32, ujkVar33, ujkVar34, ujkVar35, ujkVar36};
        EnumMap enumMap = new EnumMap(abgx.class);
        for (ujk ujkVar37 : values()) {
            enumMap.put((EnumMap) ujkVar37.L, (abgx) ujkVar37);
        }
        O = yrm.F(enumMap);
        int length = values().length;
    }

    private ujk(String str, int i2, int i3, abgx abgxVar, boolean z2, boolean z3) {
        this.K = i3;
        this.L = abgxVar;
        this.M = z2;
        this.N = z3;
    }

    public static ujk a(abgx abgxVar) {
        ujk ujkVar = (ujk) O.get(abgxVar);
        if (ujkVar != null) {
            return ujkVar;
        }
        throw new UnsupportedOperationException("Can not convert VersatileMapStyle: ".concat(String.valueOf(String.valueOf(abgxVar))));
    }

    public static ujk valueOf(String str) {
        return (ujk) Enum.valueOf(ujk.class, str);
    }

    public static ujk[] values() {
        return (ujk[]) P.clone();
    }
}
