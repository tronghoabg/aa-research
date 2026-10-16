package com.waze.modules.c;

import i.b.l.sl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    private final sl f29873a;

    /* renamed from: b, reason: collision with root package name */
    private final ar f29874b;

    /* renamed from: c, reason: collision with root package name */
    private final long f29875c;

    /* renamed from: d, reason: collision with root package name */
    private final String f29876d;

    /* renamed from: e, reason: collision with root package name */
    private final List f29877e;

    /* renamed from: f, reason: collision with root package name */
    private final dm f29878f;

    /* renamed from: g, reason: collision with root package name */
    private final long f29879g;

    /* renamed from: h, reason: collision with root package name */
    private final String f29880h;

    /* renamed from: i, reason: collision with root package name */
    private final long f29881i;

    /* renamed from: j, reason: collision with root package name */
    private final String f29882j;

    /* renamed from: k, reason: collision with root package name */
    private final List f29883k;

    /* renamed from: l, reason: collision with root package name */
    private final List f29884l;
    private final List m;
    private final Long n;
    private final List o;
    private final List p;
    private final Set q;
    private final di r;
    private final List s;
    private final h.f t;
    private final h.f u;
    private final h.f v;
    private final h.f w;
    private final h.f x;
    private final com.waze.gas.a y;
    private final com.waze.aj.b z;

    private ar(sl slVar, ar arVar, long j2, String str, List list, dm dmVar, long j3, String str2, com.waze.aj.b bVar, long j4, com.waze.gas.a aVar, String str3, List list2, List list3, List list4, Long l2, List list5, List list6, Set set, di diVar, List list7) {
        h.g.b.x.f(slVar, "proto");
        h.g.b.x.f(str, "alternativeRouteUuid");
        h.g.b.x.f(list, "geometry");
        h.g.b.x.f(list2, "requiredPermitList");
        h.g.b.x.f(list3, "areasList");
        h.g.b.x.f(list4, "eventOnRouteList");
        h.g.b.x.f(list5, "routeAttributes");
        h.g.b.x.f(list6, "routeWaypoints");
        h.g.b.x.f(set, "routeTypes");
        h.g.b.x.f(list7, "segments");
        this.f29873a = slVar;
        this.f29874b = arVar;
        this.f29875c = j2;
        this.f29876d = str;
        this.f29877e = list;
        this.f29878f = dmVar;
        this.f29879g = j3;
        this.f29880h = str2;
        this.z = bVar;
        this.f29881i = j4;
        this.y = aVar;
        this.f29882j = str3;
        this.f29883k = list2;
        this.f29884l = list3;
        this.m = list4;
        this.n = l2;
        this.o = list5;
        this.p = list6;
        this.q = set;
        this.r = diVar;
        this.s = list7;
        final int i2 = 1;
        this.t = h.g.a(new h.g.a.a(this) { // from class: com.waze.modules.c.aq

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ar f29871a;

            {
                this.f29871a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i3 = i2;
                if (i3 == 0) {
                    return Boolean.valueOf(ar.C(this.f29871a));
                }
                if (i3 == 1) {
                    return ar.f(this.f29871a);
                }
                if (i3 == 2) {
                    return Boolean.valueOf(ar.y(this.f29871a));
                }
                ar arVar2 = this.f29871a;
                return i3 != 3 ? Boolean.valueOf(ar.A(arVar2)) : Boolean.valueOf(ar.w(arVar2));
            }
        });
        final int i3 = 0;
        this.u = h.g.a(new h.g.a.a(this) { // from class: com.waze.modules.c.aq

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ar f29871a;

            {
                this.f29871a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i32 = i3;
                if (i32 == 0) {
                    return Boolean.valueOf(ar.C(this.f29871a));
                }
                if (i32 == 1) {
                    return ar.f(this.f29871a);
                }
                if (i32 == 2) {
                    return Boolean.valueOf(ar.y(this.f29871a));
                }
                ar arVar2 = this.f29871a;
                return i32 != 3 ? Boolean.valueOf(ar.A(arVar2)) : Boolean.valueOf(ar.w(arVar2));
            }
        });
        final int i4 = 2;
        this.v = h.g.a(new h.g.a.a(this) { // from class: com.waze.modules.c.aq

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ar f29871a;

            {
                this.f29871a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i32 = i4;
                if (i32 == 0) {
                    return Boolean.valueOf(ar.C(this.f29871a));
                }
                if (i32 == 1) {
                    return ar.f(this.f29871a);
                }
                if (i32 == 2) {
                    return Boolean.valueOf(ar.y(this.f29871a));
                }
                ar arVar2 = this.f29871a;
                return i32 != 3 ? Boolean.valueOf(ar.A(arVar2)) : Boolean.valueOf(ar.w(arVar2));
            }
        });
        final int i5 = 3;
        this.w = h.g.a(new h.g.a.a(this) { // from class: com.waze.modules.c.aq

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ar f29871a;

            {
                this.f29871a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i32 = i5;
                if (i32 == 0) {
                    return Boolean.valueOf(ar.C(this.f29871a));
                }
                if (i32 == 1) {
                    return ar.f(this.f29871a);
                }
                if (i32 == 2) {
                    return Boolean.valueOf(ar.y(this.f29871a));
                }
                ar arVar2 = this.f29871a;
                return i32 != 3 ? Boolean.valueOf(ar.A(arVar2)) : Boolean.valueOf(ar.w(arVar2));
            }
        });
        final int i6 = 4;
        this.x = h.g.a(new h.g.a.a(this) { // from class: com.waze.modules.c.aq

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ar f29871a;

            {
                this.f29871a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i32 = i6;
                if (i32 == 0) {
                    return Boolean.valueOf(ar.C(this.f29871a));
                }
                if (i32 == 1) {
                    return ar.f(this.f29871a);
                }
                if (i32 == 2) {
                    return Boolean.valueOf(ar.y(this.f29871a));
                }
                ar arVar2 = this.f29871a;
                return i32 != 3 ? Boolean.valueOf(ar.A(arVar2)) : Boolean.valueOf(ar.w(arVar2));
            }
        });
    }

    static final boolean A(ar arVar) {
        List list = arVar.o;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((eb) it.next()) instanceof az) {
                return true;
            }
        }
        return false;
    }

    static final boolean C(ar arVar) {
        List list = arVar.o;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((eb) it.next()) instanceof bj) {
                return true;
            }
        }
        return false;
    }

    static final bf f(ar arVar) {
        List list = arVar.o;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof bf) {
                arrayList.add(obj);
            }
        }
        return (bf) h.a.i.R(arrayList);
    }

    static final boolean w(ar arVar) {
        List list = arVar.o;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((eb) it.next()) instanceof bg) {
                return true;
            }
        }
        return false;
    }

    static final boolean y(ar arVar) {
        List list = arVar.o;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((eb) it.next()) instanceof be) {
                return true;
            }
        }
        return false;
    }

    public final boolean B() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    public final boolean D() {
        return this.q.contains(ct.f30004b);
    }

    public final boolean E() {
        return this.q.contains(ct.f30007e);
    }

    public final boolean F() {
        return this.q.contains(ct.f30006d);
    }

    public final com.waze.gas.a G() {
        return this.y;
    }

    public final com.waze.aj.b H() {
        return this.z;
    }

    public final long a() {
        return this.f29875c;
    }

    public final long b() {
        return this.f29879g;
    }

    public final long c() {
        return this.f29881i;
    }

    public final ar d() {
        return this.f29874b;
    }

    public final bf e() {
        return (bf) this.t.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        return h.g.b.x.n(this.f29873a, arVar.f29873a) && h.g.b.x.n(this.f29874b, arVar.f29874b) && this.f29875c == arVar.f29875c && h.g.b.x.n(this.f29876d, arVar.f29876d) && h.g.b.x.n(this.f29877e, arVar.f29877e) && h.g.b.x.n(this.f29878f, arVar.f29878f) && h.o.a.A(this.f29879g, arVar.f29879g) && h.g.b.x.n(this.f29880h, arVar.f29880h) && h.g.b.x.n(this.z, arVar.z) && this.f29881i == arVar.f29881i && h.g.b.x.n(this.y, arVar.y) && h.g.b.x.n(this.f29882j, arVar.f29882j) && h.g.b.x.n(this.f29883k, arVar.f29883k) && h.g.b.x.n(this.f29884l, arVar.f29884l) && h.g.b.x.n(this.m, arVar.m) && h.g.b.x.n(this.n, arVar.n) && h.g.b.x.n(this.o, arVar.o) && h.g.b.x.n(this.p, arVar.p) && h.g.b.x.n(this.q, arVar.q) && h.g.b.x.n(this.r, arVar.r) && h.g.b.x.n(this.s, arVar.s);
    }

    public final di g() {
        return this.r;
    }

    public final dm h() {
        return this.f29878f;
    }

    public final int hashCode() {
        int iHashCode = this.f29873a.hashCode() * 31;
        ar arVar = this.f29874b;
        int iHashCode2 = (((((((iHashCode + (arVar == null ? 0 : arVar.hashCode())) * 31) + a.a.b(this.f29875c)) * 31) + this.f29876d.hashCode()) * 31) + this.f29877e.hashCode()) * 31;
        dm dmVar = this.f29878f;
        int iHashCode3 = (iHashCode2 + (dmVar == null ? 0 : dmVar.hashCode())) * 31;
        long j2 = this.f29879g;
        h.o.c cVar = h.o.a.f48264a;
        int iB = (iHashCode3 + a.a.b(j2)) * 31;
        String str = this.f29880h;
        int iHashCode4 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        com.waze.aj.b bVar = this.z;
        int iHashCode5 = (((iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31) + a.a.b(this.f29881i)) * 31;
        com.waze.gas.a aVar = this.y;
        int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f29882j;
        int iHashCode7 = (((((((((((((((iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f29883k.hashCode()) * 31) + this.f29884l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31;
        di diVar = this.r;
        return ((iHashCode7 + (diVar != null ? diVar.hashCode() : 0)) * 31) + this.s.hashCode();
    }

    public final Long i() {
        return this.n;
    }

    public final String j() {
        return this.f29876d;
    }

    public final String k() {
        return this.f29882j;
    }

    public final String l() {
        return this.f29880h;
    }

    public final List m() {
        return this.f29884l;
    }

    public final List n() {
        return this.m;
    }

    public final List o() {
        return this.f29877e;
    }

    public final List p() {
        return this.f29883k;
    }

    public final List q() {
        return this.o;
    }

    public final List r() {
        return this.p;
    }

    public final List s() {
        return this.s;
    }

    public final Set t() {
        return this.q;
    }

    public final String toString() {
        return "Route(altId=" + this.f29875c + ", alternativeRouteUuid='" + this.f29876d + "', tollInfo=" + this.f29878f + ", totalDuration=" + h.o.a.y(this.f29879g) + ", extraInfoRouteTypeServerString=" + this.f29880h + ", trafficStatus=" + this.z + " , totalLengthMeters=" + this.f29881i + ", mapViewLabel=" + this.y + ", description=" + this.f29882j + ", requiredPermitList=" + this.f29883k + ", areasList=" + this.f29884l + ", carbonEmissionsGrams=" + this.n + ", routeAttributes=" + this.o + ", routeWaypoints=" + this.p + ", routeTypes=" + this.q + ", hovAttribute=" + e() + ", isPublicTransportLane=" + B() + ", isFerry=" + x() + ", hasLicensePlateRestriction=" + v() + ", isInternational=" + z() + ")";
    }

    public final sl u() {
        return this.f29873a;
    }

    public final boolean v() {
        return ((Boolean) this.w.getValue()).booleanValue();
    }

    public final boolean x() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    public final boolean z() {
        return ((Boolean) this.x.getValue()).booleanValue();
    }

    public /* synthetic */ ar(sl slVar, long j2, String str, List list, long j3, long j4, String str2, List list2, List list3, List list4, Long l2, List list5, List list6, Set set, di diVar, List list7) {
        this(slVar, null, j2, str, list, null, j3, null, null, j4, null, str2, list2, list3, list4, l2, list5, list6, set, diVar, list7);
    }

    public /* synthetic */ ar(sl slVar, ar arVar, long j2, String str, List list, dm dmVar, long j3, String str2, com.waze.aj.b bVar, long j4, com.waze.gas.a aVar, String str3, List list2, List list3, List list4, Long l2, List list5, List list6, Set set) {
        this(slVar, arVar, j2, str, list, dmVar, j3, str2, bVar, j4, aVar, str3, list2, list3, list4, l2, list5, list6, set, null, h.a.i.h());
    }
}
