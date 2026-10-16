package com.waze.bw.a.c;

import h.g.b.x;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Locale f17665a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17666b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17667c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f17668d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f17669e;

    /* renamed from: f, reason: collision with root package name */
    private final List f17670f;

    /* renamed from: g, reason: collision with root package name */
    private final List f17671g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f17672h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f17673i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f17674j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f17675k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f17676l;

    public r(Locale locale, boolean z, boolean z2, boolean z3, List list, List list2, boolean z4, boolean z5, boolean z6) {
        x.f(locale, "locale");
        x.f(list, "upcomingDrives");
        x.f(list2, "recentDrives");
        this.f17665a = locale;
        this.f17666b = z;
        this.f17667c = z2;
        this.f17668d = z3;
        this.f17669e = false;
        this.f17670f = list;
        this.f17671g = list2;
        this.f17672h = z4;
        this.f17673i = z5;
        this.f17674j = false;
        this.f17675k = false;
        this.f17676l = z6;
    }

    public static /* synthetic */ r j(r rVar, boolean z, boolean z2, boolean z3, List list, List list2, boolean z4, boolean z5, int i2) {
        Locale locale = (i2 & 1) != 0 ? rVar.f17665a : null;
        if ((i2 & 2) != 0) {
            z = rVar.f17666b;
        }
        boolean z6 = z;
        if ((i2 & 4) != 0) {
            z2 = rVar.f17667c;
        }
        boolean z7 = z2;
        boolean z8 = (i2 & 8) != 0 ? rVar.f17668d : z3;
        if ((i2 & 16) != 0) {
            boolean z9 = rVar.f17669e;
        }
        List list3 = (i2 & 32) != 0 ? rVar.f17670f : list;
        List list4 = (i2 & 64) != 0 ? rVar.f17671g : list2;
        boolean z10 = (i2 & 128) != 0 ? rVar.f17672h : z4;
        boolean z11 = (i2 & 256) != 0 ? rVar.f17673i : z5;
        boolean z12 = rVar.f17674j;
        boolean z13 = rVar.f17675k;
        boolean z14 = rVar.f17676l;
        x.f(locale, "locale");
        x.f(list3, "upcomingDrives");
        x.f(list4, "recentDrives");
        return new r(locale, z6, z7, z8, list3, list4, z10, z11, z14);
    }

    public final List a() {
        return this.f17671g;
    }

    public final List b() {
        return this.f17670f;
    }

    public final Locale c() {
        return this.f17665a;
    }

    public final boolean d() {
        return this.f17668d;
    }

    public final boolean e() {
        return this.f17673i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!x.n(this.f17665a, rVar.f17665a) || this.f17666b != rVar.f17666b || this.f17667c != rVar.f17667c || this.f17668d != rVar.f17668d) {
            return false;
        }
        boolean z = rVar.f17669e;
        if (!x.n(this.f17670f, rVar.f17670f) || !x.n(this.f17671g, rVar.f17671g) || this.f17672h != rVar.f17672h || this.f17673i != rVar.f17673i) {
            return false;
        }
        boolean z2 = rVar.f17674j;
        boolean z3 = rVar.f17675k;
        return this.f17676l == rVar.f17676l;
    }

    public final boolean f() {
        return this.f17676l;
    }

    public final boolean g() {
        return this.f17666b;
    }

    public final boolean h() {
        return this.f17672h;
    }

    public final int hashCode() {
        int iHashCode = this.f17665a.hashCode() * 31;
        List list = this.f17670f;
        boolean z = this.f17668d;
        int iA = ((((((((((iHashCode + a.a.a(this.f17666b)) * 31) + a.a.a(this.f17667c)) * 31) + a.a.a(z)) * 31) + a.a.a(false)) * 31) + list.hashCode()) * 31) + this.f17671g.hashCode();
        boolean z2 = this.f17676l;
        return (((((((((iA * 31) + a.a.a(this.f17672h)) * 31) + a.a.a(this.f17673i)) * 31) + a.a.a(false)) * 31) + a.a.a(false)) * 31) + a.a.a(z2);
    }

    public final boolean i() {
        return this.f17667c;
    }

    public final String toString() {
        return "State(locale=" + this.f17665a + ", isHomeSet=" + this.f17666b + ", isWorkSet=" + this.f17667c + ", isCloseToHome=" + this.f17668d + ", isRtlLanguage=false, upcomingDrives=" + this.f17670f + ", recentDrives=" + this.f17671g + ", isRoaming=" + this.f17672h + ", isClosedByUser=" + this.f17673i + ", showNewReportingIcon=false, showReportButtonAsPrimary=false, isCompaninioEnabled=" + this.f17676l + ")";
    }
}
