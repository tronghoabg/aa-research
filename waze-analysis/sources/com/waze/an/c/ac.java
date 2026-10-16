package com.waze.an.c;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f14738a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14739b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14740c;

    /* renamed from: d, reason: collision with root package name */
    private final ab f14741d;

    /* renamed from: e, reason: collision with root package name */
    private final List f14742e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14743f;

    /* renamed from: g, reason: collision with root package name */
    private final h.g.a.a f14744g;

    /* renamed from: h, reason: collision with root package name */
    private final h.g.a.a f14745h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ac(Integer num, String str, List list, h.g.a.a aVar, h.g.a.a aVar2, int i2) {
        List listH = (i2 & 16) != 0 ? h.a.i.h() : list;
        boolean z = (i2 & 32) != 0;
        h.g.a.a zVar = (i2 & 64) != 0 ? new com.waze.ab.z(2) : aVar;
        h.g.a.a zVar2 = (i2 & 128) != 0 ? new com.waze.ab.z(3) : aVar2;
        int i3 = i2 & 1;
        this(1 == i3 ? null : num, (i2 & 2) != 0 ? null : str, null, null, listH, z, zVar, zVar2);
    }

    public final ab a() {
        return this.f14741d;
    }

    public final Integer b() {
        return this.f14738a;
    }

    public final String c() {
        return this.f14740c;
    }

    public final String d() {
        return this.f14739b;
    }

    public final List e() {
        return this.f14742e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return h.g.b.x.n(this.f14738a, acVar.f14738a) && h.g.b.x.n(this.f14739b, acVar.f14739b) && h.g.b.x.n(this.f14740c, acVar.f14740c) && h.g.b.x.n(this.f14741d, acVar.f14741d) && h.g.b.x.n(this.f14742e, acVar.f14742e) && this.f14743f == acVar.f14743f && h.g.b.x.n(this.f14744g, acVar.f14744g) && h.g.b.x.n(this.f14745h, acVar.f14745h);
    }

    public final h.g.a.a f() {
        return this.f14745h;
    }

    public final h.g.a.a g() {
        return this.f14744g;
    }

    public final boolean h() {
        return this.f14743f;
    }

    public final int hashCode() {
        Integer num = this.f14738a;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.f14739b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i2 = iHashCode * 31;
        String str2 = this.f14740c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31;
        ab abVar = this.f14741d;
        return ((((((((iHashCode3 + (abVar != null ? abVar.hashCode() : 0)) * 31) + this.f14742e.hashCode()) * 31) + a.a.a(this.f14743f)) * 31) + this.f14744g.hashCode()) * 31) + this.f14745h.hashCode();
    }

    public final String toString() {
        return "Spec(iconResId=" + this.f14738a + ", title=" + this.f14739b + ", description=" + this.f14740c + ", closeData=" + this.f14741d + ", actionData=" + this.f14742e + ", canBeCovered=" + this.f14743f + ", onMapTap=" + this.f14744g + ", onBackPress=" + this.f14745h + ")";
    }

    public ac(Integer num, String str, String str2, ab abVar, List list, boolean z, h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(list, "actionData");
        h.g.b.x.f(aVar, "onMapTap");
        h.g.b.x.f(aVar2, "onBackPress");
        this.f14738a = num;
        this.f14739b = str;
        this.f14740c = str2;
        this.f14741d = abVar;
        this.f14742e = list;
        this.f14743f = z;
        this.f14744g = aVar;
        this.f14745h = aVar2;
    }

    public ac() {
        this(null, null, null, null, null, 255);
    }
}
