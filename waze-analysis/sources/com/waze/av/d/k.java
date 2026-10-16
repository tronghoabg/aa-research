package com.waze.av.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.w;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new w(13);
    private final String A;
    private final Double B;
    private final Integer C;
    private final String D;
    private final j E;
    private final r F;
    private final boolean G;
    private final boolean H;
    private final String I;
    private final String J;
    private final String K;
    private Long L;
    private boolean M;
    private a N;
    private final boolean O;

    /* renamed from: a, reason: collision with root package name */
    private final String f16084a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f16085b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.av.a.a f16086c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16087d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16088e;

    /* renamed from: f, reason: collision with root package name */
    private final String f16089f;

    /* renamed from: g, reason: collision with root package name */
    private final String f16090g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16091h;

    /* renamed from: i, reason: collision with root package name */
    private final String f16092i;

    /* renamed from: j, reason: collision with root package name */
    private final String f16093j;

    /* renamed from: k, reason: collision with root package name */
    private final String f16094k;

    /* renamed from: l, reason: collision with root package name */
    private final u f16095l;
    private final u m;
    private final List n;
    private final List o;
    private final q p;
    private final String q;
    private final List r;
    private final String s;
    private final List t;
    private final List u;
    private final boolean v;
    private final String w;
    private final List x;
    private final String y;
    private final Integer z;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k(String str, com.waze.shared_infra.h.c cVar, com.waze.av.a.a aVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, u uVar, u uVar2, List list, List list2, q qVar, String str10, List list3, String str11, List list4, List list5, boolean z, String str12, List list6, String str13, Integer num, String str14, Double d2, Integer num2, String str15, j jVar, r rVar, boolean z2, boolean z3, String str16, String str17, String str18, boolean z4, a aVar2, boolean z5, int i2, int i3) {
        List listH = (i2 & 8192) != 0 ? h.a.i.h() : list;
        List listH2 = (i2 & 16384) != 0 ? h.a.i.h() : list2;
        q qVar2 = (32768 & i2) != 0 ? new q(h.a.r.j()) : qVar;
        String str19 = (65536 & i2) != 0 ? null : str10;
        List listH3 = (131072 & i2) != 0 ? h.a.i.h() : list3;
        String str20 = (262144 & i2) != 0 ? null : str11;
        List listH4 = (524288 & i2) != 0 ? h.a.i.h() : list4;
        List listH5 = (1048576 & i2) != 0 ? h.a.i.h() : list5;
        boolean z6 = ((2097152 & i2) == 0) & z;
        String str21 = (4194304 & i2) != 0 ? null : str12;
        List listH6 = (8388608 & i2) != 0 ? h.a.i.h() : list6;
        String str22 = (16777216 & i2) != 0 ? null : str13;
        Integer num3 = (33554432 & i2) != 0 ? null : num;
        String str23 = (67108864 & i2) != 0 ? null : str14;
        Double d3 = (134217728 & i2) != 0 ? null : d2;
        Integer num4 = (268435456 & i2) != 0 ? null : num2;
        String str24 = (536870912 & i2) != 0 ? null : str15;
        j jVar2 = (1073741824 & i2) != 0 ? j.f16079a : jVar;
        int i4 = i2 & 2048;
        int i5 = i2 & 1024;
        int i6 = i2 & 512;
        int i7 = i2 & 256;
        int i8 = i2 & 128;
        int i9 = i2 & 64;
        int i10 = i2 & 32;
        int i11 = i2 & 16;
        int i12 = i2 & 8;
        u uVar3 = (i2 & 4096) != 0 ? null : uVar2;
        u uVar4 = i4 != 0 ? null : uVar;
        String str25 = i5 != 0 ? null : str9;
        String str26 = i6 != 0 ? null : str8;
        String str27 = i7 != 0 ? null : str7;
        String str28 = i8 != 0 ? null : str6;
        String str29 = i9 != 0 ? null : str5;
        String str30 = i10 != 0 ? null : str4;
        String str31 = i11 != 0 ? null : str3;
        String str32 = i12 != 0 ? null : str2;
        r rVar2 = (i2 & Integer.MIN_VALUE) != 0 ? null : rVar;
        int i13 = ((i3 & 1) ^ 1) & (z2 ? 1 : 0);
        this(str, cVar, aVar, str32, str31, str30, str29, str28, str27, str26, str25, uVar4, uVar3, listH, listH2, qVar2, str19, listH3, str20, listH4, listH5, z6, str21, listH6, str22, num3, str23, d3, num4, str24, jVar2, rVar2, 1 == i13, ((i3 & 2) == 0) & z3, (i3 & 4) != 0 ? null : str16, (i3 & 8) != 0 ? null : str17, (i3 & 16) != 0 ? null : str18, null, ((i3 & 64) == 0) & z4, (i3 & 128) != 0 ? null : aVar2, ((i3 & 256) == 0) & z5);
    }

    public static /* synthetic */ k O(k kVar, Long l2) {
        String str = kVar.f16084a;
        com.waze.shared_infra.h.c cVar = kVar.f16085b;
        com.waze.av.a.a aVar = kVar.f16086c;
        String str2 = kVar.f16087d;
        String str3 = kVar.f16088e;
        String str4 = kVar.f16089f;
        String str5 = kVar.f16090g;
        String str6 = kVar.f16091h;
        String str7 = kVar.f16092i;
        String str8 = kVar.f16093j;
        String str9 = kVar.f16094k;
        u uVar = kVar.f16095l;
        u uVar2 = kVar.m;
        List list = kVar.n;
        List list2 = kVar.o;
        q qVar = kVar.p;
        String str10 = kVar.q;
        List list3 = kVar.r;
        String str11 = kVar.s;
        List list4 = kVar.t;
        List list5 = kVar.u;
        boolean z = kVar.v;
        String str12 = kVar.w;
        List list6 = kVar.x;
        String str13 = kVar.y;
        Integer num = kVar.z;
        String str14 = kVar.A;
        Double d2 = kVar.B;
        Integer num2 = kVar.C;
        String str15 = kVar.D;
        j jVar = kVar.E;
        r rVar = kVar.F;
        boolean z2 = kVar.G;
        boolean z3 = kVar.H;
        String str16 = kVar.I;
        String str17 = kVar.J;
        String str18 = kVar.K;
        boolean z4 = kVar.M;
        a aVar2 = kVar.N;
        boolean z5 = kVar.O;
        x.f(str, "venueId");
        x.f(cVar, "coordinate");
        x.f(aVar, "address");
        x.f(list, "images");
        x.f(list2, "products");
        x.f(qVar, "openingHours");
        x.f(list3, "categories");
        x.f(list4, "services");
        x.f(list5, "evPlugs");
        x.f(list6, "evPaymentMethods");
        x.f(jVar, "openStatus");
        return new k(str, cVar, aVar, str2, str3, str4, str5, str6, str7, str8, str9, uVar, uVar2, list, list2, qVar, str10, list3, str11, list4, list5, z, str12, list6, str13, num, str14, d2, num2, str15, jVar, rVar, z2, z3, str16, str17, str18, l2, z4, aVar2, z5);
    }

    public final String A() {
        return this.f16084a;
    }

    public final String B() {
        return this.f16090g;
    }

    public final String C() {
        return this.f16093j;
    }

    public final List D() {
        return this.r;
    }

    public final List E() {
        return this.x;
    }

    public final List F() {
        return this.u;
    }

    public final List G() {
        return this.n;
    }

    public final List H() {
        return this.o;
    }

    public final List I() {
        return this.t;
    }

    public final boolean J() {
        return this.G;
    }

    public final boolean K() {
        return this.v;
    }

    public final boolean L() {
        return this.M;
    }

    public final boolean M() {
        return this.O;
    }

    public final boolean N() {
        return this.H;
    }

    public final com.waze.av.a.a a() {
        return this.f16086c;
    }

    public final a b() {
        return this.N;
    }

    public final j c() {
        return this.E;
    }

    public final q d() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final r e() {
        return this.F;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return x.n(this.f16084a, kVar.f16084a) && x.n(this.f16085b, kVar.f16085b) && x.n(this.f16086c, kVar.f16086c) && x.n(this.f16087d, kVar.f16087d) && x.n(this.f16088e, kVar.f16088e) && x.n(this.f16089f, kVar.f16089f) && x.n(this.f16090g, kVar.f16090g) && x.n(this.f16091h, kVar.f16091h) && x.n(this.f16092i, kVar.f16092i) && x.n(this.f16093j, kVar.f16093j) && x.n(this.f16094k, kVar.f16094k) && x.n(this.f16095l, kVar.f16095l) && x.n(this.m, kVar.m) && x.n(this.n, kVar.n) && x.n(this.o, kVar.o) && x.n(this.p, kVar.p) && x.n(this.q, kVar.q) && x.n(this.r, kVar.r) && x.n(this.s, kVar.s) && x.n(this.t, kVar.t) && x.n(this.u, kVar.u) && this.v == kVar.v && x.n(this.w, kVar.w) && x.n(this.x, kVar.x) && x.n(this.y, kVar.y) && x.n(this.z, kVar.z) && x.n(this.A, kVar.A) && x.n(this.B, kVar.B) && x.n(this.C, kVar.C) && x.n(this.D, kVar.D) && this.E == kVar.E && x.n(this.F, kVar.F) && this.G == kVar.G && this.H == kVar.H && x.n(this.I, kVar.I) && x.n(this.J, kVar.J) && x.n(this.K, kVar.K) && x.n(this.L, kVar.L) && this.M == kVar.M && x.n(this.N, kVar.N) && this.O == kVar.O;
    }

    public final u f() {
        return this.f16095l;
    }

    public final u g() {
        return this.m;
    }

    public final com.waze.shared_infra.h.c h() {
        return this.f16085b;
    }

    public final int hashCode() {
        int iHashCode = (((this.f16084a.hashCode() * 31) + this.f16085b.hashCode()) * 31) + this.f16086c.hashCode();
        String str = this.f16087d;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16088e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16089f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f16090g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f16091h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f16092i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f16093j;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f16094k;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        u uVar = this.f16095l;
        int iHashCode10 = (iHashCode9 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        u uVar2 = this.m;
        int iHashCode11 = (((((((iHashCode10 + (uVar2 == null ? 0 : uVar2.hashCode())) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31;
        String str9 = this.q;
        int iHashCode12 = (((iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.r.hashCode()) * 31;
        String str10 = this.s;
        int iHashCode13 = (((((((iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31) + a.a.a(this.v)) * 31;
        String str11 = this.w;
        int iHashCode14 = (((iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.x.hashCode()) * 31;
        String str12 = this.y;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num = this.z;
        int iHashCode16 = (iHashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        String str13 = this.A;
        int iHashCode17 = (iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Double d2 = this.B;
        int iHashCode18 = (iHashCode17 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num2 = this.C;
        int iHashCode19 = (iHashCode18 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str14 = this.D;
        int iHashCode20 = (((iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31) + this.E.hashCode()) * 31;
        r rVar = this.F;
        int iHashCode21 = (((((iHashCode20 + (rVar == null ? 0 : rVar.hashCode())) * 31) + a.a.a(this.G)) * 31) + a.a.a(this.H)) * 31;
        String str15 = this.I;
        int iHashCode22 = (iHashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.J;
        int iHashCode23 = (iHashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.K;
        int iHashCode24 = (iHashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Long l2 = this.L;
        int iHashCode25 = (((iHashCode24 + (l2 == null ? 0 : l2.hashCode())) * 31) + a.a.a(this.M)) * 31;
        a aVar = this.N;
        return ((iHashCode25 + (aVar != null ? aVar.hashCode() : 0)) * 31) + a.a.a(this.O);
    }

    public final Double i() {
        return this.B;
    }

    public final Integer j() {
        return this.C;
    }

    public final Integer k() {
        return this.z;
    }

    public final Long l() {
        return this.L;
    }

    public final String m() {
        return this.J;
    }

    public final String n() {
        return this.q;
    }

    public final String o() {
        return this.s;
    }

    public final String p() {
        return this.f16088e;
    }

    public final String q() {
        return this.y;
    }

    public final String r() {
        return this.K;
    }

    public final String s() {
        return this.f16091h;
    }

    public final String t() {
        return this.w;
    }

    public final String toString() {
        Long l2 = this.L;
        boolean z = this.M;
        a aVar = this.N;
        StringBuilder sb = new StringBuilder("VenueExtendedData(venueId=");
        sb.append(this.f16084a);
        sb.append(", coordinate=");
        sb.append(this.f16085b);
        sb.append(", address=");
        sb.append(this.f16086c);
        sb.append(", formattedAddress=");
        sb.append(this.f16087d);
        sb.append(", context=");
        sb.append(this.f16088e);
        sb.append(", routingContext=");
        sb.append(this.f16089f);
        sb.append(", venueName=");
        sb.append(this.f16090g);
        sb.append(", details=");
        sb.append(this.f16091h);
        sb.append(", phoneNumber=");
        sb.append(this.f16092i);
        sb.append(", website=");
        sb.append(this.f16093j);
        sb.append(", websiteDisplayText=");
        sb.append(this.f16094k);
        sb.append(", reporter=");
        sb.append(this.f16095l);
        sb.append(", updater=");
        sb.append(this.m);
        sb.append(", images=");
        sb.append(this.n);
        sb.append(", products=");
        sb.append(this.o);
        sb.append(", openingHours=");
        sb.append(this.p);
        sb.append(", brandId=");
        sb.append(this.q);
        sb.append(", categories=");
        sb.append(this.r);
        sb.append(", categoryGroup=");
        sb.append(this.s);
        boolean z2 = this.O;
        String str = this.K;
        String str2 = this.J;
        String str3 = this.I;
        boolean z3 = this.H;
        boolean z4 = this.G;
        r rVar = this.F;
        j jVar = this.E;
        String str4 = this.D;
        Integer num = this.C;
        Double d2 = this.B;
        String str5 = this.A;
        Integer num2 = this.z;
        String str6 = this.y;
        List list = this.x;
        String str7 = this.w;
        boolean z5 = this.v;
        List list2 = this.u;
        List list3 = this.t;
        sb.append(", services=");
        sb.append(list3);
        sb.append(", evPlugs=");
        sb.append(list2);
        sb.append(", evRestrictedAccess=");
        sb.append(z5);
        sb.append(", evDirections=");
        sb.append(str7);
        sb.append(", evPaymentMethods=");
        sb.append(list);
        sb.append(", currency=");
        sb.append(str6);
        sb.append(", price_level=");
        sb.append(num2);
        sb.append(", priceLevelSymbol=");
        sb.append(str5);
        sb.append(", rating=");
        sb.append(d2);
        sb.append(", numRatings=");
        sb.append(num);
        sb.append(", timeZone=");
        sb.append(str4);
        sb.append(", openStatus=");
        sb.append(jVar);
        sb.append(", parkingData=");
        sb.append(rVar);
        sb.append(", canUpdate=");
        sb.append(z4);
        sb.append(", residential=");
        sb.append(z3);
        sb.append(", icon=");
        sb.append(str3);
        sb.append(", badgeName=");
        sb.append(str2);
        sb.append(", dealText=");
        sb.append(str);
        sb.append(", detourSeconds=");
        sb.append(l2);
        sb.append(", googleResult=");
        sb.append(z);
        sb.append(", parkingBookingOffer=");
        sb.append(aVar);
        sb.append(", hasMoreData=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final String u() {
        return this.f16087d;
    }

    public final String v() {
        return this.I;
    }

    public final String w() {
        return this.f16092i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        parcel.writeString(this.f16084a);
        parcel.writeSerializable(this.f16085b);
        parcel.writeParcelable(this.f16086c, i2);
        parcel.writeString(this.f16087d);
        parcel.writeString(this.f16088e);
        parcel.writeString(this.f16089f);
        parcel.writeString(this.f16090g);
        parcel.writeString(this.f16091h);
        parcel.writeString(this.f16092i);
        parcel.writeString(this.f16093j);
        parcel.writeString(this.f16094k);
        u uVar = this.f16095l;
        if (uVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uVar.writeToParcel(parcel, i2);
        }
        u uVar2 = this.m;
        if (uVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uVar2.writeToParcel(parcel, i2);
        }
        List list = this.n;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((o) it.next()).writeToParcel(parcel, i2);
        }
        List list2 = this.o;
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((s) it2.next()).writeToParcel(parcel, i2);
        }
        this.p.writeToParcel(parcel, i2);
        parcel.writeString(this.q);
        parcel.writeStringList(this.r);
        parcel.writeString(this.s);
        parcel.writeStringList(this.t);
        List list3 = this.u;
        parcel.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            ((f) it3.next()).writeToParcel(parcel, i2);
        }
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeString(this.w);
        parcel.writeStringList(this.x);
        parcel.writeString(this.y);
        Integer num = this.z;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A);
        Double d2 = this.B;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Integer num2 = this.C;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.D);
        this.E.writeToParcel(parcel, i2);
        r rVar = this.F;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rVar.writeToParcel(parcel, i2);
        }
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeString(this.I);
        parcel.writeString(this.J);
        parcel.writeString(this.K);
        Long l2 = this.L;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeInt(this.M ? 1 : 0);
        a aVar = this.N;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i2);
        }
        parcel.writeInt(this.O ? 1 : 0);
    }

    public final String x() {
        return this.A;
    }

    public final String y() {
        return this.f16089f;
    }

    public final String z() {
        return this.D;
    }

    public k(String str, com.waze.shared_infra.h.c cVar, com.waze.av.a.a aVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, u uVar, u uVar2, List list, List list2, q qVar, String str10, List list3, String str11, List list4, List list5, boolean z, String str12, List list6, String str13, Integer num, String str14, Double d2, Integer num2, String str15, j jVar, r rVar, boolean z2, boolean z3, String str16, String str17, String str18, Long l2, boolean z4, a aVar2, boolean z5) {
        x.f(str, "venueId");
        x.f(cVar, "coordinate");
        x.f(aVar, "address");
        x.f(list, "images");
        x.f(list2, "products");
        x.f(qVar, "openingHours");
        x.f(list3, "categories");
        x.f(list4, "services");
        x.f(list5, "evPlugs");
        x.f(list6, "evPaymentMethods");
        x.f(jVar, "openStatus");
        this.f16084a = str;
        this.f16085b = cVar;
        this.f16086c = aVar;
        this.f16087d = str2;
        this.f16088e = str3;
        this.f16089f = str4;
        this.f16090g = str5;
        this.f16091h = str6;
        this.f16092i = str7;
        this.f16093j = str8;
        this.f16094k = str9;
        this.f16095l = uVar;
        this.m = uVar2;
        this.n = list;
        this.o = list2;
        this.p = qVar;
        this.q = str10;
        this.r = list3;
        this.s = str11;
        this.t = list4;
        this.u = list5;
        this.v = z;
        this.w = str12;
        this.x = list6;
        this.y = str13;
        this.z = num;
        this.A = str14;
        this.B = d2;
        this.C = num2;
        this.D = str15;
        this.E = jVar;
        this.F = rVar;
        this.G = z2;
        this.H = z3;
        this.I = str16;
        this.J = str17;
        this.K = str18;
        this.L = l2;
        this.M = z4;
        this.N = aVar2;
        this.O = z5;
    }
}
