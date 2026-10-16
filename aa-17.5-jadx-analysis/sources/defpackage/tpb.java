package defpackage;

import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class tpb implements tpa {
    static final long a;
    private static final yob b = yob.c("com/google/android/libraries/geo/mapcore/api/model/TileTypeSettingProviderImpl");
    private static final ygr c;
    private static final ygr d;
    private static final ygr e;
    private static final ygr f;
    private static final ygr g;
    private final aezk h;
    private final tsn i;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a = 60000L;
        ygr ygrVarT = ygr.t(abgl.UNKNOWN, abgl.GMM_SATELLITE, abgl.GMM_TERRAIN, abgl.GMM_TERRAIN_DARK, abgl.GMM_ROAD_GRAPH, abgl.GMM_API_TILE_OVERLAY, new abgl[0]);
        c = ygrVarT;
        d = ygr.p(abgl.GMM_TRAFFIC_CAR, abgl.GMM_VECTOR_TRAFFIC_V2);
        e = ygr.r(abgl.GMM_SATELLITE, abgl.GMM_TERRAIN, abgl.GMM_TERRAIN_DARK, abgl.GMM_AIR_QUALITY_HEATMAP);
        ygr.t(abgl.GMM_VECTOR_BASE, abgl.GMM_SATELLITE, abgl.GMM_TERRAIN, abgl.GMM_TERRAIN_DARK, abgl.GMM_LABELS_ONLY, abgl.GMM_BUILDING_3D, abgl.GMM_LOCAL_RECOMMENDATIONS, abgl.GMM_TRANSIT, abgl.GMM_SPOTLIT, abgl.GMM_VECTOR_TRAFFIC_V2, abgl.GMM_TRAFFIC_CAR, abgl.GMM_TRAFFIC_CAR_JAPAN);
        f = ygr.t(abgl.DESTINATIONS, abgl.EVCS, abgl.UNKNOWN, abgl.GMM_VECTOR_TRAFFIC_V2, abgl.GMM_TRAFFIC_CAR, abgl.GMM_ROAD_GRAPH, abgl.GMM_API_TILE_OVERLAY, abgl.GMM_BUSYNESS, abgl.GMM_AIR_QUALITY, abgl.GMM_CRISIS_WILDFIRES, abgl.GMM_CRISIS_OVERLAY, abgl.GMM_AREA_BUSYNESS, abgl.GMM_BASEMAP_PHOTOS, abgl.MAPS_DIRECTIONS, abgl.RASTER_UNDERLAYS);
        ygp ygpVar = new ygp();
        ygpVar.k(ygrVarT);
        ygpVar.c(abgl.GMM_MY_MAPS);
        g = ygpVar.g();
    }

    public tpb(aezk aezkVar, tsn tsnVar) {
        this.h = aezkVar;
        this.i = tsnVar;
    }

    public static final boolean w(abgl abglVar) {
        return d.contains(abglVar);
    }

    private final tre x() {
        return ((zwm) this.h.a()).b();
    }

    private final List y() {
        abgn abgnVar = this.i.a().c;
        if (abgnVar == null) {
            abgnVar = abgn.a;
        }
        return abgnVar.c;
    }

    @Override // defpackage.tpa
    public final int a(abgl abglVar) {
        return k(abglVar) ? 384 : 256;
    }

    @Override // defpackage.tpa
    public final long b(abgl abglVar, tmb tmbVar) {
        if (l(abglVar)) {
            long jT = t(abglVar);
            if (jT != -1) {
                return tmbVar.f().toEpochMilli() + jT;
            }
        }
        return -1L;
    }

    @Override // defpackage.tpa
    public final abgk c(abgl abglVar) {
        for (abgk abgkVar : y()) {
            abgl abglVarB = abgl.b(abgkVar.c);
            if (abglVarB == null) {
                abglVarB = abgl.UNKNOWN;
            }
            if (abglVarB.equals(abglVar)) {
                return abgkVar;
            }
        }
        abnp abnpVarN = abgk.a.n();
        abnpVarN.t();
        abgk abgkVar2 = (abgk) abnpVarN.b;
        abgkVar2.c = abglVar.am;
        abgkVar2.b |= 1;
        return (abgk) abnpVarN.q();
    }

    @Override // defpackage.tpa
    public final abgk d(String str) {
        for (abgk abgkVar : y()) {
            if (abgkVar.k.equals(str)) {
                return abgkVar;
            }
        }
        ((ynz) b.a(uys.a).ai(9098)).y("PaintRequestTemplate does not exist for %s", str);
        abnp abnpVarN = abgk.a.n();
        abnpVarN.t();
        abgk abgkVar2 = (abgk) abnpVarN.b;
        str.getClass();
        abgkVar2.b |= 64;
        abgkVar2.k = str;
        return (abgk) abnpVarN.q();
    }

    @Override // defpackage.tpa
    public final boolean e(abgl abglVar) {
        return ygr.r(abgl.GMM_TERRAIN, abgl.GMM_TERRAIN_DARK, abgl.GMM_SATELLITE, abgl.GMM_AIR_QUALITY_HEATMAP).contains(abglVar);
    }

    @Override // defpackage.tpa
    public final boolean f(abgl abglVar) {
        return ygr.t(abgl.GMM_TRANSIT, abgl.GMM_VECTOR_BICYCLING_OVERLAY, abgl.GMM_SPOTLIGHT_HIGHLIGHTING, abgl.GMM_SPOTLIT, abgl.GMM_MAJOR_EVENT, abgl.GMM_COVID19, abgl.GMM_CRISIS_OVERLAY, abgl.GMM_CRISIS_WILDFIRES, abgl.GMM_AIR_QUALITY_HEATMAP).contains(abglVar);
    }

    @Override // defpackage.tpa
    public final boolean g(abgl abglVar) {
        return !ygr.t(abgl.GMM_TERRAIN, abgl.GMM_TERRAIN_DARK, abgl.GMM_SATELLITE, abgl.GMM_API_TILE_OVERLAY, abgl.GMM_TRANSIT, abgl.GMM_VECTOR_BICYCLING_OVERLAY, abgl.GMM_AIR_QUALITY_HEATMAP).contains(abglVar);
    }

    @Override // defpackage.tpa
    public final boolean h(abgl abglVar) {
        return ygr.t(abgl.GMM_SATELLITE, abgl.GMM_API_TILE_OVERLAY, abgl.GMM_SPOTLIGHT_HIGHLIGHTING, abgl.GMM_SPOTLIT, abgl.GMM_MAJOR_EVENT, abgl.GMM_COVID19, abgl.GMM_CRISIS_OVERLAY, abgl.GMM_CRISIS_WILDFIRES, abgl.GMM_AIR_QUALITY_HEATMAP).contains(abglVar);
    }

    @Override // defpackage.tpa
    public final boolean i(abgl abglVar) {
        return !f.contains(abglVar);
    }

    @Override // defpackage.tpa
    public final boolean j(abgl abglVar) {
        Iterator it = y().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            abgk abgkVar = (abgk) it.next();
            abgl abglVarB = abgl.b(abgkVar.c);
            if (abglVarB == null) {
                abglVarB = abgl.UNKNOWN;
            }
            if (abglVarB == abglVar) {
                if ((abgkVar.b & 32) != 0) {
                    abga abgaVar = abgkVar.j;
                    if (abgaVar == null) {
                        abgaVar = abga.a;
                    }
                    if (abgaVar.b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.tpa
    public final boolean k(abgl abglVar) {
        return e.contains(abglVar);
    }

    @Override // defpackage.tpa
    public final boolean l(abgl abglVar) {
        return !c.contains(abglVar);
    }

    @Override // defpackage.tpa
    public final boolean m(abgl abglVar) {
        return k(abglVar);
    }

    @Override // defpackage.tpa
    public final void n(abgl abglVar) {
        if (Objects.equals(abglVar, abgl.GMM_BUILDING_3D)) {
        }
    }

    protected final long o(abgl abglVar) {
        Iterator it = y().iterator();
        while (true) {
            if (it.hasNext()) {
                abgk abgkVar = (abgk) it.next();
                if ((abgkVar.b & 8) != 0) {
                    abgl abglVarB = abgl.b(abgkVar.c);
                    if (abglVarB == null) {
                        abglVarB = abgl.UNKNOWN;
                    }
                    if (abglVarB == abglVar) {
                        if (abgkVar.h != -1) {
                            return TimeUnit.SECONDS.toMillis(abgkVar.h);
                        }
                    }
                }
            } else {
                acgk acgkVar = x().b;
                if (!new abof(acgkVar.d, acgk.a).contains(abglVar)) {
                    Iterator<E> it2 = acgkVar.e.iterator();
                    while (it2.hasNext()) {
                        if (new abof(((acca) it2.next()).d, acca.a).contains(abglVar)) {
                            return TimeUnit.SECONDS.toMillis(r1.c);
                        }
                    }
                    return TimeUnit.SECONDS.toMillis(acgkVar.c);
                }
            }
        }
        return -1L;
    }

    public final long p(abgl abglVar) {
        long jO = o(abglVar);
        return w(abglVar) ? jO + a : jO;
    }

    @Override // defpackage.tpd
    public final long q(abgl abglVar, tmb tmbVar) {
        long epochMilli = tmbVar.f().toEpochMilli();
        long jP = p(abglVar);
        if (jP == -1) {
            return -1L;
        }
        return ((van) tmbVar).a + ((epochMilli + jP) - tmbVar.f().toEpochMilli());
    }

    @Override // defpackage.tpd
    public final long r(abgl abglVar, tmb tmbVar) {
        long jP = p(abglVar);
        if (jP == -1) {
            return -1L;
        }
        return tmbVar.f().toEpochMilli() + jP;
    }

    @Override // defpackage.tpd
    public final long s(abgl abglVar, tmb tmbVar) {
        long epochMilli = tmbVar.f().toEpochMilli();
        if (l(abglVar)) {
            long jT = t(abglVar);
            if (jT != -1) {
                return ((van) tmbVar).a + ((epochMilli + jT) - tmbVar.f().toEpochMilli());
            }
        }
        return -1L;
    }

    public final long t(abgl abglVar) {
        Iterator it = y().iterator();
        while (true) {
            if (it.hasNext()) {
                abgk abgkVar = (abgk) it.next();
                if ((abgkVar.b & 16) != 0) {
                    abgl abglVarB = abgl.b(abgkVar.c);
                    if (abglVarB == null) {
                        abglVarB = abgl.UNKNOWN;
                    }
                    if (abglVarB == abglVar) {
                        if (abgkVar.i != -1) {
                            return TimeUnit.SECONDS.toMillis(abgkVar.i);
                        }
                    }
                }
            } else if (l(abglVar)) {
                return w(abglVar) ? o(abglVar) : TimeUnit.MINUTES.toMillis(x().c);
            }
        }
        return -1L;
    }

    @Override // defpackage.tpd
    public final String u(abgl abglVar) {
        String str = c(abglVar).k;
        if (!woy.am(str)) {
            return str;
        }
        if (abglVar == abgl.GMM_VECTOR_BASE) {
            return "m";
        }
        String strAr = woy.ar(abglVar.name());
        return strAr.startsWith("gmm_") ? strAr.replaceFirst("gmm_", "") : strAr;
    }

    @Override // defpackage.tpd
    public final boolean v(abgl abglVar) {
        return !g.contains(abglVar);
    }
}
