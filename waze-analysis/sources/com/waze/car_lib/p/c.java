package com.waze.car_lib.p;

import android.graphics.Bitmap;
import androidx.autofill.HintConstants;
import java.util.Collection;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends dh {

    /* renamed from: a, reason: collision with root package name */
    private final String f20687a;

    /* renamed from: b, reason: collision with root package name */
    private final Bitmap f20688b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20689c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f20690d;

    /* renamed from: e, reason: collision with root package name */
    private final Collection f20691e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20692f;

    /* renamed from: g, reason: collision with root package name */
    private final String f20693g;

    /* renamed from: h, reason: collision with root package name */
    private final Double f20694h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.bc.a.a f20695i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f20696j;

    /* renamed from: k, reason: collision with root package name */
    private final List f20697k;

    /* renamed from: l, reason: collision with root package name */
    private final String f20698l;
    private final List m;
    private final String n;
    private final List o;
    private final b p;
    private final boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, Bitmap bitmap, String str2, Long l2, Collection collection, String str3, String str4, Double d2, com.waze.bc.a.a aVar, boolean z, List list, String str5, List list2, String str6, List list3, b bVar, boolean z2) {
        super(null);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(collection, "services");
        h.g.b.x.f(list, "gasPrices");
        h.g.b.x.f(list2, "parkingPrices");
        h.g.b.x.f(list3, "buttons");
        this.f20687a = str;
        this.f20688b = bitmap;
        this.f20689c = str2;
        this.f20690d = l2;
        this.f20691e = collection;
        this.f20692f = str3;
        this.f20693g = str4;
        this.f20694h = d2;
        this.f20695i = aVar;
        this.f20696j = z;
        this.f20697k = list;
        this.f20698l = str5;
        this.m = list2;
        this.n = str6;
        this.o = list3;
        this.p = bVar;
        this.q = z2;
    }

    public final b b() {
        return this.p;
    }

    public final com.waze.bc.a.a c() {
        return this.f20695i;
    }

    public final Double d() {
        return this.f20694h;
    }

    public final Long e() {
        return this.f20690d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.g.b.x.n(this.f20687a, cVar.f20687a) && h.g.b.x.n(this.f20688b, cVar.f20688b) && h.g.b.x.n(this.f20689c, cVar.f20689c) && h.g.b.x.n(this.f20690d, cVar.f20690d) && h.g.b.x.n(this.f20691e, cVar.f20691e) && h.g.b.x.n(this.f20692f, cVar.f20692f) && h.g.b.x.n(this.f20693g, cVar.f20693g) && h.g.b.x.n(this.f20694h, cVar.f20694h) && h.g.b.x.n(this.f20695i, cVar.f20695i) && this.f20696j == cVar.f20696j && h.g.b.x.n(this.f20697k, cVar.f20697k) && h.g.b.x.n(this.f20698l, cVar.f20698l) && h.g.b.x.n(this.m, cVar.m) && h.g.b.x.n(this.n, cVar.n) && h.g.b.x.n(this.o, cVar.o) && h.g.b.x.n(this.p, cVar.p) && this.q == cVar.q;
    }

    public final String f() {
        return this.f20693g;
    }

    public final String g() {
        return this.n;
    }

    public final String h() {
        return this.f20689c;
    }

    public final int hashCode() {
        int iHashCode = this.f20687a.hashCode() * 31;
        Bitmap bitmap = this.f20688b;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        String str = this.f20689c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f20690d;
        int iHashCode4 = (((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.f20691e.hashCode()) * 31;
        String str2 = this.f20692f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20693g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d2 = this.f20694h;
        int iHashCode7 = (iHashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        com.waze.bc.a.a aVar = this.f20695i;
        int iHashCode8 = (((((iHashCode7 + (aVar == null ? 0 : aVar.hashCode())) * 31) + a.a.a(this.f20696j)) * 31) + this.f20697k.hashCode()) * 31;
        String str4 = this.f20698l;
        int iHashCode9 = (((iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.m.hashCode()) * 31;
        String str5 = this.n;
        int iHashCode10 = (((iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.o.hashCode()) * 31;
        b bVar = this.p;
        return ((iHashCode10 + (bVar != null ? bVar.hashCode() : 0)) * 31) + a.a.a(this.q);
    }

    public final String i() {
        return this.f20698l;
    }

    public final String j() {
        return this.f20687a;
    }

    public final String k() {
        return this.f20692f;
    }

    public final Collection l() {
        return this.f20691e;
    }

    public final List m() {
        return this.o;
    }

    public final List n() {
        return this.f20697k;
    }

    public final List o() {
        return this.m;
    }

    public final boolean p() {
        return this.f20696j;
    }

    @Override // com.waze.car_lib.p.dh
    public final boolean q() {
        return this.q;
    }

    public final String toString() {
        return "Loaded(name=" + this.f20687a + ", iconBitmap=" + this.f20688b + ", distance=" + this.f20689c + ", etaMinutes=" + this.f20690d + ", services=" + this.f20691e + ", phoneNumber=" + this.f20692f + ", addressDescription=" + this.f20693g + ", rating=" + this.f20694h + ", openStatus=" + this.f20695i + ", showOnsiteParking=" + this.f20696j + ", gasPrices=" + this.f20697k + ", lastUpdatedGasPrice=" + this.f20698l + ", parkingPrices=" + this.m + ", dangerousAreaString=" + this.n + ", buttons=" + this.o + ", evData=" + this.p + ", isInPanMode=" + this.q + ")";
    }
}
