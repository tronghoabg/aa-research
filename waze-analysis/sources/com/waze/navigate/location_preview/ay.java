package com.waze.navigate.location_preview;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import com.waze.jni.protos.navigate.DriveTo;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ay {
    private final List A;
    private final Integer B;
    private final String C;
    private final List D;
    private final String E;
    private final a F;
    private final a G;
    private final boolean H;
    private final boolean I;
    private final Double J;
    private final Integer K;
    private final Integer L;
    private final String M;
    private final com.waze.av.d.j N;
    private final String O;
    private final boolean P;
    private com.waze.av.d.a Q;
    private com.waze.ui.m.b R;
    private final boolean S;
    private final com.waze.modules.navigation.ah T;
    private final com.waze.realtime_report_feedback.c U;

    /* renamed from: a, reason: collision with root package name */
    private final AddressItem f31582a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f31583b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31584c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31585d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31586e;

    /* renamed from: f, reason: collision with root package name */
    private final List f31587f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f31588g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31589h;

    /* renamed from: i, reason: collision with root package name */
    private final String f31590i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f31591j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f31592k;

    /* renamed from: l, reason: collision with root package name */
    private final String f31593l;
    private final String m;
    private final boolean n;
    private final String o;
    private final com.waze.av.a.a p;
    private final String q;
    private final String r;
    private final Long s;
    private final h.o.a t;
    private final bo u;
    private final com.waze.ui.m.t v;
    private final c w;
    private final com.waze.av.d.q x;
    private final f y;
    private final DriveTo.DangerZoneType z;

    public /* synthetic */ ay(AddressItem addressItem, com.waze.shared_infra.h.c cVar, int i2, int i3, String str, List list, boolean z, String str2, String str3, boolean z2, boolean z3, String str4, String str5, boolean z4, String str6, com.waze.av.a.a aVar, String str7, String str8, bo boVar, c cVar2, com.waze.av.d.q qVar, f fVar, DriveTo.DangerZoneType dangerZoneType, List list2, String str9, com.waze.realtime_report_feedback.c cVar3, List list3, String str10, a aVar2, a aVar3, boolean z5, Double d2, Integer num, Integer num2, String str11, com.waze.av.d.j jVar, String str12, boolean z6, com.waze.av.d.a aVar4, com.waze.ui.m.b bVar, boolean z7, com.waze.modules.navigation.ah ahVar, int i4, int i5) {
        this(addressItem, cVar, i2, i3, (i4 & 16) != 0 ? null : str, (i4 & 32) != 0 ? h.a.i.h() : list, z, (i4 & 128) != 0 ? "" : str2, (i4 & 256) != 0 ? "" : str3, ((i4 & 512) == 0) & z2, ((i4 & 1024) == 0) & z3, (i4 & 2048) != 0 ? null : str4, str5, z4, str6, aVar, (65536 & i4) != 0 ? null : str7, str8, (h.o.a) null, (1048576 & i4) != 0 ? null : boVar, (com.waze.ui.m.t) null, (4194304 & i4) != 0 ? null : cVar2, qVar, (16777216 & i4) != 0 ? null : fVar, dangerZoneType, list2, (268435456 & i4) != 0 ? null : str9, cVar3, list3, str10, 1 == (i5 & 1) ? null : aVar2, (i5 & 2) != 0 ? null : aVar3, ((i5 & 4) == 0) & z5, (i5 & 16) != 0 ? null : d2, (i5 & 32) != 0 ? null : num, (i5 & 64) != 0 ? null : num2, (i5 & 128) != 0 ? null : str11, (i5 & 256) != 0 ? com.waze.av.d.j.f16079a : jVar, (i5 & 512) != 0 ? null : str12, ((i5 & 1024) == 0) & z6, (i5 & 2048) != 0 ? null : aVar4, (i5 & 4096) != 0 ? null : bVar, z7, (i5 & 16384) != 0 ? null : ahVar);
    }

    public static /* synthetic */ ay U(ay ayVar, int i2, h.o.a aVar, com.waze.ui.m.t tVar, DriveTo.DangerZoneType dangerZoneType, com.waze.realtime_report_feedback.c cVar, int i3) {
        int i4;
        f fVar;
        int i5;
        List list;
        String str;
        AddressItem addressItem = (i3 & 1) != 0 ? ayVar.f31582a : null;
        com.waze.shared_infra.h.c cVar2 = (i3 & 2) != 0 ? ayVar.f31583b : null;
        int i6 = (i3 & 4) != 0 ? ayVar.f31584c : i2;
        int i7 = (i3 & 8) != 0 ? ayVar.f31585d : 0;
        String str2 = (i3 & 16) != 0 ? ayVar.f31586e : null;
        List list2 = (i3 & 32) != 0 ? ayVar.f31587f : null;
        boolean z = (i3 & 64) != 0 ? ayVar.f31588g : false;
        String str3 = (i3 & 128) != 0 ? ayVar.f31589h : null;
        String str4 = (i3 & 256) != 0 ? ayVar.f31590i : null;
        boolean z2 = (i3 & 512) != 0 ? ayVar.f31591j : false;
        boolean z3 = (i3 & 1024) != 0 ? ayVar.f31592k : false;
        String str5 = (i3 & 2048) != 0 ? ayVar.f31593l : null;
        String str6 = (i3 & 4096) != 0 ? ayVar.m : null;
        boolean z4 = (i3 & 8192) != 0 ? ayVar.n : false;
        String str7 = (i3 & 16384) != 0 ? ayVar.o : null;
        com.waze.av.a.a aVar2 = (32768 & i3) != 0 ? ayVar.p : null;
        String str8 = (i3 & 65536) != 0 ? ayVar.q : null;
        String str9 = (i3 & 131072) != 0 ? ayVar.r : null;
        if ((i3 & 262144) != 0) {
            Long l2 = ayVar.s;
        }
        h.o.a aVar3 = (i3 & 524288) != 0 ? ayVar.t : aVar;
        bo boVar = (i3 & 1048576) != 0 ? ayVar.u : null;
        com.waze.ui.m.t tVar2 = (i3 & 2097152) != 0 ? ayVar.v : tVar;
        c cVar3 = (i3 & 4194304) != 0 ? ayVar.w : null;
        com.waze.av.d.q qVar = (i3 & 8388608) != 0 ? ayVar.x : null;
        if ((i3 & 16777216) != 0) {
            i4 = i6;
            fVar = ayVar.y;
        } else {
            i4 = i6;
            fVar = null;
        }
        DriveTo.DangerZoneType dangerZoneType2 = (i3 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ayVar.z : dangerZoneType;
        if ((i3 & 67108864) != 0) {
            i5 = i7;
            list = ayVar.A;
        } else {
            i5 = i7;
            list = null;
        }
        if ((i3 & 134217728) != 0) {
            str = str2;
            Integer num = ayVar.B;
        } else {
            str = str2;
        }
        String str10 = (i3 & 268435456) != 0 ? ayVar.C : null;
        com.waze.realtime_report_feedback.c cVar4 = (i3 & 536870912) != 0 ? ayVar.U : cVar;
        boolean z5 = z;
        List list3 = ayVar.D;
        boolean z6 = z2;
        String str11 = ayVar.E;
        a aVar4 = ayVar.F;
        a aVar5 = ayVar.G;
        boolean z7 = ayVar.H;
        boolean z8 = ayVar.I;
        Double d2 = ayVar.J;
        Integer num2 = ayVar.K;
        Integer num3 = ayVar.L;
        String str12 = ayVar.M;
        com.waze.av.d.j jVar = ayVar.N;
        boolean z9 = z3;
        String str13 = ayVar.O;
        boolean z10 = ayVar.P;
        com.waze.av.d.a aVar6 = ayVar.Q;
        com.waze.ui.m.b bVar = ayVar.R;
        boolean z11 = ayVar.S;
        com.waze.modules.navigation.ah ahVar = ayVar.T;
        h.g.b.x.f(addressItem, "ai_for_apis");
        h.g.b.x.f(cVar2, "location");
        h.g.b.x.f(list2, "categoryIds");
        h.g.b.x.f(str3, HintConstants.AUTOFILL_HINT_PHONE_NUMBER);
        h.g.b.x.f(str4, "website");
        h.g.b.x.f(str6, "venueId");
        h.g.b.x.f(str7, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(aVar2, "address");
        h.g.b.x.f(qVar, "openTimes");
        h.g.b.x.f(dangerZoneType2, DriveToNativeManager.EXTRA_DANGER_ZONE_TYPE);
        h.g.b.x.f(list, "images");
        h.g.b.x.f(cVar4, "parkingSuggestion");
        h.g.b.x.f(list3, "serviceIds");
        h.g.b.x.f(jVar, "openStatus");
        return new ay(addressItem, cVar2, i4, i5, str, list2, z5, str3, str4, z6, z9, str5, str6, z4, str7, aVar2, str8, str9, aVar3, boVar, tVar2, cVar3, qVar, fVar, dangerZoneType2, list, str10, cVar4, list3, str11, aVar4, aVar5, z7, d2, num2, num3, str12, jVar, str13, z10, aVar6, bVar, z11, ahVar);
    }

    public final String A() {
        return this.f31589h;
    }

    public final String B() {
        return this.C;
    }

    public final String C() {
        return this.M;
    }

    public final String D() {
        return this.O;
    }

    public final String E() {
        return this.m;
    }

    public final String F() {
        return this.f31590i;
    }

    public final List G() {
        return this.f31587f;
    }

    public final List H() {
        return this.A;
    }

    public final List I() {
        return this.D;
    }

    public final h.o.a J() {
        return this.t;
    }

    public final boolean K() {
        return this.P;
    }

    public final boolean L() {
        return this.H;
    }

    public final boolean M() {
        return this.n;
    }

    public final boolean N() {
        return this.f31584c == 1;
    }

    public final boolean O() {
        return this.f31588g;
    }

    public final boolean P() {
        return this.f31592k;
    }

    public final boolean Q() {
        return this.S;
    }

    public final boolean R() {
        return this.f31591j;
    }

    public final boolean S() {
        return this.f31584c == 3;
    }

    public final com.waze.realtime_report_feedback.c T() {
        return this.U;
    }

    public final int a() {
        return this.f31585d;
    }

    public final int b() {
        return this.f31584c;
    }

    public final DriveTo.DangerZoneType c() {
        return this.z;
    }

    public final com.waze.av.a.a d() {
        return this.p;
    }

    public final com.waze.av.d.a e() {
        return this.Q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay)) {
            return false;
        }
        ay ayVar = (ay) obj;
        if (!h.g.b.x.n(this.f31582a, ayVar.f31582a) || !h.g.b.x.n(this.f31583b, ayVar.f31583b) || this.f31584c != ayVar.f31584c || this.f31585d != ayVar.f31585d || !h.g.b.x.n(this.f31586e, ayVar.f31586e) || !h.g.b.x.n(this.f31587f, ayVar.f31587f) || this.f31588g != ayVar.f31588g || !h.g.b.x.n(this.f31589h, ayVar.f31589h) || !h.g.b.x.n(this.f31590i, ayVar.f31590i) || this.f31591j != ayVar.f31591j || this.f31592k != ayVar.f31592k || !h.g.b.x.n(this.f31593l, ayVar.f31593l) || !h.g.b.x.n(this.m, ayVar.m) || this.n != ayVar.n || !h.g.b.x.n(this.o, ayVar.o) || !h.g.b.x.n(this.p, ayVar.p) || !h.g.b.x.n(this.q, ayVar.q) || !h.g.b.x.n(this.r, ayVar.r)) {
            return false;
        }
        Long l2 = ayVar.s;
        if (!h.g.b.x.n(null, null) || !h.g.b.x.n(this.t, ayVar.t) || !h.g.b.x.n(this.u, ayVar.u) || !h.g.b.x.n(this.v, ayVar.v) || !h.g.b.x.n(this.w, ayVar.w) || !h.g.b.x.n(this.x, ayVar.x) || !h.g.b.x.n(this.y, ayVar.y) || this.z != ayVar.z || !h.g.b.x.n(this.A, ayVar.A)) {
            return false;
        }
        Integer num = ayVar.B;
        if (!h.g.b.x.n(null, null) || !h.g.b.x.n(this.C, ayVar.C) || !h.g.b.x.n(this.U, ayVar.U) || !h.g.b.x.n(this.D, ayVar.D) || !h.g.b.x.n(this.E, ayVar.E) || !h.g.b.x.n(this.F, ayVar.F) || !h.g.b.x.n(this.G, ayVar.G) || this.H != ayVar.H) {
            return false;
        }
        boolean z = ayVar.I;
        return h.g.b.x.n(this.J, ayVar.J) && h.g.b.x.n(this.K, ayVar.K) && h.g.b.x.n(this.L, ayVar.L) && h.g.b.x.n(this.M, ayVar.M) && this.N == ayVar.N && h.g.b.x.n(this.O, ayVar.O) && this.P == ayVar.P && h.g.b.x.n(this.Q, ayVar.Q) && h.g.b.x.n(this.R, ayVar.R) && this.S == ayVar.S && this.T == ayVar.T;
    }

    public final com.waze.av.d.j f() {
        return this.N;
    }

    public final com.waze.av.d.q g() {
        return this.x;
    }

    public final com.waze.modules.navigation.ah h() {
        return this.T;
    }

    public final int hashCode() {
        int iHashCode = (this.f31582a.hashCode() * 31) + this.f31583b.hashCode();
        String str = this.f31586e;
        int iHashCode2 = ((((((((((((((((((iHashCode * 31) + this.f31584c) * 31) + this.f31585d) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.f31587f.hashCode()) * 31) + a.a.a(this.f31588g)) * 31) + this.f31589h.hashCode()) * 31) + this.f31590i.hashCode()) * 31) + a.a.a(this.f31591j)) * 31) + a.a.a(this.f31592k)) * 31;
        String str2 = this.f31593l;
        int iHashCode3 = (((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.m.hashCode()) * 31) + a.a.a(this.n)) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31;
        String str3 = this.q;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.r;
        int iHashCode5 = iHashCode4 + (str4 == null ? 0 : str4.hashCode());
        h.o.a aVar = this.t;
        int iB = ((iHashCode5 * 961) + (aVar == null ? 0 : a.a.b(aVar.w()))) * 31;
        bo boVar = this.u;
        int iHashCode6 = (iB + (boVar == null ? 0 : boVar.hashCode())) * 31;
        com.waze.ui.m.t tVar = this.v;
        int iHashCode7 = (iHashCode6 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        c cVar = this.w;
        int iHashCode8 = (((iHashCode7 + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.x.hashCode()) * 31;
        f fVar = this.y;
        int iHashCode9 = (((((iHashCode8 + (fVar == null ? 0 : fVar.hashCode())) * 31) + this.z.hashCode()) * 31) + this.A.hashCode()) * 961;
        String str5 = this.C;
        int iHashCode10 = (((((iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.U.hashCode()) * 31) + this.D.hashCode()) * 31;
        String str6 = this.E;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        a aVar2 = this.F;
        int iHashCode12 = (iHashCode11 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.G;
        int iHashCode13 = (((((iHashCode12 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31) + a.a.a(this.H)) * 31) + a.a.a(false)) * 31;
        Double d2 = this.J;
        int iHashCode14 = (iHashCode13 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.K;
        int iHashCode15 = (iHashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.L;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.M;
        int iHashCode17 = (((iHashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.N.hashCode()) * 31;
        String str8 = this.O;
        int iHashCode18 = (((iHashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31) + a.a.a(this.P)) * 31;
        com.waze.av.d.a aVar4 = this.Q;
        int iHashCode19 = (iHashCode18 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        com.waze.ui.m.b bVar = this.R;
        int iHashCode20 = (((iHashCode19 + (bVar == null ? 0 : bVar.hashCode())) * 31) + a.a.a(this.S)) * 31;
        com.waze.modules.navigation.ah ahVar = this.T;
        return iHashCode20 + (ahVar != null ? ahVar.hashCode() : 0);
    }

    public final AddressItem i() {
        return this.f31582a;
    }

    public final a j() {
        return this.F;
    }

    public final a k() {
        return this.G;
    }

    public final c l() {
        return this.w;
    }

    public final f m() {
        return this.y;
    }

    public final bo n() {
        return this.u;
    }

    public final com.waze.shared_infra.h.c o() {
        return this.f31583b;
    }

    public final com.waze.ui.m.b p() {
        return this.R;
    }

    public final com.waze.ui.m.t q() {
        return this.v;
    }

    public final Double r() {
        return this.J;
    }

    public final Integer s() {
        return this.K;
    }

    public final Integer t() {
        return this.L;
    }

    public final String toString() {
        com.waze.av.d.a aVar = this.Q;
        com.waze.ui.m.b bVar = this.R;
        StringBuilder sb = new StringBuilder("LocationPreviewModel(ai_for_apis=");
        sb.append(this.f31582a);
        sb.append(", location=");
        sb.append(this.f31583b);
        sb.append(", type=");
        sb.append(this.f31584c);
        sb.append(", category=");
        sb.append(this.f31585d);
        sb.append(", categoryGroupId=");
        sb.append(this.f31586e);
        sb.append(", categoryIds=");
        sb.append(this.f31587f);
        sb.append(", isNavigable=");
        sb.append(this.f31588g);
        sb.append(", phoneNumber=");
        sb.append(this.f31589h);
        sb.append(", website=");
        sb.append(this.f31590i);
        sb.append(", isUpdateable=");
        sb.append(this.f31591j);
        sb.append(", isResidence=");
        sb.append(this.f31592k);
        sb.append(", meetingId=");
        sb.append(this.f31593l);
        sb.append(", venueId=");
        sb.append(this.m);
        sb.append(", venueLoading=");
        sb.append(this.n);
        sb.append(", name=");
        sb.append(this.o);
        sb.append(", address=");
        sb.append(this.p);
        sb.append(", formattedAddress=");
        sb.append(this.q);
        sb.append(", distance=");
        sb.append(this.r);
        com.waze.modules.navigation.ah ahVar = this.T;
        boolean z = this.S;
        boolean z2 = this.P;
        String str = this.O;
        com.waze.av.d.j jVar = this.N;
        String str2 = this.M;
        Integer num = this.L;
        Integer num2 = this.K;
        Double d2 = this.J;
        boolean z3 = this.H;
        a aVar2 = this.G;
        a aVar3 = this.F;
        String str3 = this.E;
        List list = this.D;
        com.waze.realtime_report_feedback.c cVar = this.U;
        String str4 = this.C;
        List list2 = this.A;
        DriveTo.DangerZoneType dangerZoneType = this.z;
        f fVar = this.y;
        com.waze.av.d.q qVar = this.x;
        c cVar2 = this.w;
        com.waze.ui.m.t tVar = this.v;
        bo boVar = this.u;
        h.o.a aVar4 = this.t;
        sb.append(", etaMinutes=null, detourDuration=");
        sb.append(aVar4);
        sb.append(", parkingData=");
        sb.append(boVar);
        sb.append(", gasPrices=");
        sb.append(tVar);
        sb.append(", evChargingVenue=");
        sb.append(cVar2);
        sb.append(", openTimes=");
        sb.append(qVar);
        sb.append(", eventData=");
        sb.append(fVar);
        sb.append(", dangerZoneType=");
        sb.append(dangerZoneType);
        sb.append(", images=");
        sb.append(list2);
        sb.append(", zoomedImage=null, previewIconResource=");
        sb.append(str4);
        sb.append(", parkingSuggestion=");
        sb.append(cVar);
        sb.append(", serviceIds=");
        sb.append(list);
        sb.append(", about=");
        sb.append(str3);
        sb.append(", creator=");
        sb.append(aVar3);
        sb.append(", updater=");
        sb.append(aVar2);
        sb.append(", openSetLocation=");
        sb.append(z3);
        sb.append(", didLoadVenue=false, rating=");
        sb.append(d2);
        sb.append(", numRatings=");
        sb.append(num2);
        sb.append(", price_level=");
        sb.append(num);
        sb.append(", priceLevelSymbol=");
        sb.append(str2);
        sb.append(", openStatus=");
        sb.append(jVar);
        sb.append(", timeZone=");
        sb.append(str);
        sb.append(", googleResult=");
        sb.append(z2);
        sb.append(", parkingBookingOffer=");
        sb.append(aVar);
        sb.append(", adData=");
        sb.append(bVar);
        sb.append(", isSingleSearchResult=");
        sb.append(z);
        sb.append(", caller=");
        sb.append(ahVar);
        sb.append(")");
        return sb.toString();
    }

    public final String u() {
        return this.E;
    }

    public final String v() {
        return this.f31586e;
    }

    public final String w() {
        return this.r;
    }

    public final String x() {
        return this.q;
    }

    public final String y() {
        return this.f31593l;
    }

    public final String z() {
        return this.o;
    }

    public /* synthetic */ ay(AddressItem addressItem, com.waze.shared_infra.h.c cVar, int i2, int i3, String str, List list, boolean z, String str2, String str3, boolean z2, boolean z3, String str4, String str5, boolean z4, String str6, com.waze.av.a.a aVar, String str7, String str8, h.o.a aVar2, bo boVar, com.waze.ui.m.t tVar, c cVar2, com.waze.av.d.q qVar, f fVar, DriveTo.DangerZoneType dangerZoneType, List list2, String str9, com.waze.realtime_report_feedback.c cVar3, List list3, String str10, a aVar3, a aVar4, boolean z5, Double d2, Integer num, Integer num2, String str11, com.waze.av.d.j jVar, String str12, boolean z6, com.waze.av.d.a aVar5, com.waze.ui.m.b bVar, boolean z7, com.waze.modules.navigation.ah ahVar) {
        h.g.b.x.f(addressItem, "ai_for_apis");
        h.g.b.x.f(cVar, "location");
        h.g.b.x.f(list, "categoryIds");
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_PHONE_NUMBER);
        h.g.b.x.f(str3, "website");
        h.g.b.x.f(str5, "venueId");
        h.g.b.x.f(str6, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(aVar, "address");
        h.g.b.x.f(qVar, "openTimes");
        h.g.b.x.f(dangerZoneType, DriveToNativeManager.EXTRA_DANGER_ZONE_TYPE);
        h.g.b.x.f(list2, "images");
        h.g.b.x.f(cVar3, "parkingSuggestion");
        h.g.b.x.f(list3, "serviceIds");
        h.g.b.x.f(jVar, "openStatus");
        this.f31582a = addressItem;
        this.f31583b = cVar;
        this.f31584c = i2;
        this.f31585d = i3;
        this.f31586e = str;
        this.f31587f = list;
        this.f31588g = z;
        this.f31589h = str2;
        this.f31590i = str3;
        this.f31591j = z2;
        this.f31592k = z3;
        this.f31593l = str4;
        this.m = str5;
        this.n = z4;
        this.o = str6;
        this.p = aVar;
        this.q = str7;
        this.r = str8;
        this.s = null;
        this.t = aVar2;
        this.u = boVar;
        this.v = tVar;
        this.w = cVar2;
        this.x = qVar;
        this.y = fVar;
        this.z = dangerZoneType;
        this.A = list2;
        this.B = null;
        this.C = str9;
        this.U = cVar3;
        this.D = list3;
        this.E = str10;
        this.F = aVar3;
        this.G = aVar4;
        this.H = z5;
        this.I = false;
        this.J = d2;
        this.K = num;
        this.L = num2;
        this.M = str11;
        this.N = jVar;
        this.O = str12;
        this.P = z6;
        this.Q = aVar5;
        this.R = bVar;
        this.S = z7;
        this.T = ahVar;
    }
}
