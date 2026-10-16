package com.waze.trip_overview;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    private final long f41019a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41020b;

    /* renamed from: c, reason: collision with root package name */
    private final String f41021c;

    /* renamed from: d, reason: collision with root package name */
    private final String f41022d;

    /* renamed from: e, reason: collision with root package name */
    private final ar f41023e;

    /* renamed from: f, reason: collision with root package name */
    private final an f41024f;

    /* renamed from: g, reason: collision with root package name */
    private final String f41025g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.modules.c.dm f41026h;

    /* renamed from: i, reason: collision with root package name */
    private final au f41027i;

    /* renamed from: j, reason: collision with root package name */
    private final List f41028j;

    /* renamed from: k, reason: collision with root package name */
    private final String f41029k;

    /* renamed from: l, reason: collision with root package name */
    private final int f41030l;
    private final boolean m;

    public at(long j2, String str, String str2, String str3, ar arVar, an anVar, String str4, com.waze.modules.c.dm dmVar, au auVar, List list, String str5, int i2, boolean z) {
        h.g.b.x.f(str, "routeDurationText");
        h.g.b.x.f(str2, "routeDistanceText");
        h.g.b.x.f(arVar, "routeEvents");
        h.g.b.x.f(auVar, "routeProperties");
        h.g.b.x.f(list, "alerts");
        this.f41019a = j2;
        this.f41020b = str;
        this.f41021c = str2;
        this.f41022d = str3;
        this.f41023e = arVar;
        this.f41024f = anVar;
        this.f41025g = str4;
        this.f41026h = dmVar;
        this.f41027i = auVar;
        this.f41028j = list;
        this.f41029k = str5;
        this.f41030l = i2;
        this.m = z;
    }

    public final int a() {
        return this.f41030l;
    }

    public final long b() {
        return this.f41019a;
    }

    public final com.waze.modules.c.dm c() {
        return this.f41026h;
    }

    public final an d() {
        return this.f41024f;
    }

    public final ar e() {
        return this.f41023e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at)) {
            return false;
        }
        at atVar = (at) obj;
        return this.f41019a == atVar.f41019a && h.g.b.x.n(this.f41020b, atVar.f41020b) && h.g.b.x.n(this.f41021c, atVar.f41021c) && h.g.b.x.n(this.f41022d, atVar.f41022d) && h.g.b.x.n(this.f41023e, atVar.f41023e) && h.g.b.x.n(this.f41024f, atVar.f41024f) && h.g.b.x.n(this.f41025g, atVar.f41025g) && h.g.b.x.n(this.f41026h, atVar.f41026h) && h.g.b.x.n(this.f41027i, atVar.f41027i) && h.g.b.x.n(this.f41028j, atVar.f41028j) && h.g.b.x.n(this.f41029k, atVar.f41029k) && this.f41030l == atVar.f41030l && this.m == atVar.m;
    }

    public final au f() {
        return this.f41027i;
    }

    public final String g() {
        return this.f41029k;
    }

    public final String h() {
        return this.f41022d;
    }

    public final int hashCode() {
        int iB = (((a.a.b(this.f41019a) * 31) + this.f41020b.hashCode()) * 31) + this.f41021c.hashCode();
        String str = this.f41022d;
        int iHashCode = ((((iB * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.f41023e.hashCode()) * 31;
        an anVar = this.f41024f;
        int iHashCode2 = (iHashCode + (anVar == null ? 0 : anVar.hashCode())) * 31;
        String str2 = this.f41025g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.waze.modules.c.dm dmVar = this.f41026h;
        int iHashCode4 = (((((iHashCode3 + (dmVar == null ? 0 : dmVar.hashCode())) * 31) + this.f41027i.hashCode()) * 31) + this.f41028j.hashCode()) * 31;
        String str3 = this.f41029k;
        return ((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f41030l) * 31) + a.a.a(this.m);
    }

    public final String i() {
        return this.f41021c;
    }

    public final String j() {
        return this.f41020b;
    }

    public final String k() {
        return this.f41025g;
    }

    public final List l() {
        return this.f41028j;
    }

    public final boolean m() {
        return this.m;
    }

    public final String toString() {
        return "RoutePresent(id=" + this.f41019a + ", routeDurationText=" + this.f41020b + ", routeDistanceText=" + this.f41021c + ", description=" + this.f41022d + ", routeEvents=" + this.f41023e + ", hovRoute=" + this.f41024f + ", trafficText=" + this.f41025g + ", tollInfo=" + this.f41026h + ", routeProperties=" + this.f41027i + ", alerts=" + this.f41028j + ", carbonEmission=" + this.f41029k + ", routeDistanceMeters=" + this.f41030l + ", preferred=" + this.m + ")";
    }
}
