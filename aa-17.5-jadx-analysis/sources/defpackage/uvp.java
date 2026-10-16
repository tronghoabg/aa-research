package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uvp {
    public static final uvp a;
    public static final uvp b;
    public static final uvp c;
    public static final uvp d;
    public static final uvp e;
    public static final uvp f;
    public static final uvp g;
    public static final uvp h;
    public static final uvp i;
    public static final uvp j;
    public static final uvp k;
    public static final uvp l;
    public static final uvp m;
    public static final uvp n;
    public static final uvp o;
    public static final uvp p;
    public static final uvp q;
    private static final /* synthetic */ uvp[] r;

    static {
        uvp uvpVar = new uvp("UNDERLAY_PASS", 0);
        a = uvpVar;
        uvp uvpVar2 = new uvp("STENCIL_PASS", 1);
        b = uvpVar2;
        uvp uvpVar3 = new uvp("BASE_TILE_PASS", 2);
        c = uvpVar3;
        uvp uvpVar4 = new uvp("MAGIC_CARPET_PASS", 3);
        d = uvpVar4;
        uvp uvpVar5 = new uvp("OVERLAY_TILE_PASS", 4);
        e = uvpVar5;
        uvp uvpVar6 = new uvp("INDOOR_PASS", 5);
        f = uvpVar6;
        uvp uvpVar7 = new uvp("TRANSIT_PASS", 6);
        g = uvpVar7;
        uvp uvpVar8 = new uvp("BICYCLING_PASS", 7);
        h = uvpVar8;
        uvp uvpVar9 = new uvp("CLIENT_INJECTED_PASS", 8);
        i = uvpVar9;
        uvp uvpVar10 = new uvp("POLYLINE_PASS", 9);
        j = uvpVar10;
        uvp uvpVar11 = new uvp("BUILDING_PASS", 10);
        k = uvpVar11;
        uvp uvpVar12 = new uvp("INJECTED_OVER_BUILDINGS_PASS", 11);
        l = uvpVar12;
        uvp uvpVar13 = new uvp("OCCLUDED_ROUTES_PASS", 12);
        m = uvpVar13;
        uvp uvpVar14 = new uvp("LABEL_PASS", 13);
        n = uvpVar14;
        uvp uvpVar15 = new uvp("MY_MAPS_PASS", 14);
        o = uvpVar15;
        uvp uvpVar16 = new uvp("NON_PORTED_CLIENT_INJECTED_PASS", 15);
        p = uvpVar16;
        uvp uvpVar17 = new uvp("BENCHMARK_PASS", 16);
        q = uvpVar17;
        r = new uvp[]{uvpVar, uvpVar2, uvpVar3, uvpVar4, uvpVar5, uvpVar6, uvpVar7, uvpVar8, uvpVar9, uvpVar10, uvpVar11, uvpVar12, uvpVar13, uvpVar14, uvpVar15, uvpVar16, uvpVar17};
    }

    public static uvp valueOf(String str) {
        return (uvp) Enum.valueOf(uvp.class, str);
    }

    public static uvp[] values() {
        return (uvp[]) r.clone();
    }
}
