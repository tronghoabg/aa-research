package com.waze.map.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    private final List f28077a;

    /* renamed from: b, reason: collision with root package name */
    private final List f28078b;

    /* renamed from: c, reason: collision with root package name */
    private final List f28079c;

    /* renamed from: d, reason: collision with root package name */
    private final List f28080d;

    /* renamed from: e, reason: collision with root package name */
    private final List f28081e;

    /* renamed from: f, reason: collision with root package name */
    private final ca f28082f;

    /* renamed from: g, reason: collision with root package name */
    private final dn f28083g;

    /* renamed from: h, reason: collision with root package name */
    private final bh f28084h;

    public /* synthetic */ bi(List list, List list2, List list3, List list4, List list5, ca caVar, dn dnVar, int i2) {
        this((i2 & 1) != 0 ? h.a.i.h() : list, (i2 & 2) != 0 ? h.a.i.h() : list2, (i2 & 4) != 0 ? h.a.i.h() : list3, (i2 & 8) != 0 ? h.a.i.h() : list4, (i2 & 16) != 0 ? h.a.i.h() : list5, (i2 & 32) != 0 ? new ca(false, null, false, null, null, 1023) : caVar, (i2 & 64) != 0 ? new dn((byte[]) null) : dnVar, bh.f28073a);
    }

    public static /* synthetic */ bi i(bi biVar, List list, List list2, List list3, ca caVar, dn dnVar, bh bhVar, int i2) {
        List list4 = (i2 & 1) != 0 ? biVar.f28077a : null;
        if ((i2 & 2) != 0) {
            list = biVar.f28078b;
        }
        List list5 = list;
        if ((i2 & 4) != 0) {
            list2 = biVar.f28079c;
        }
        List list6 = list2;
        List list7 = (i2 & 8) != 0 ? biVar.f28080d : list3;
        List list8 = (i2 & 16) != 0 ? biVar.f28081e : null;
        ca caVar2 = (i2 & 32) != 0 ? biVar.f28082f : caVar;
        dn dnVar2 = (i2 & 64) != 0 ? biVar.f28083g : dnVar;
        bh bhVar2 = (i2 & 128) != 0 ? biVar.f28084h : bhVar;
        h.g.b.x.f(list4, "routes");
        h.g.b.x.f(list5, "eventsOnRoute");
        h.g.b.x.f(list6, "markers");
        h.g.b.x.f(list7, "polylines");
        h.g.b.x.f(list8, "polygons");
        h.g.b.x.f(caVar2, "additionalContent");
        h.g.b.x.f(dnVar2, "navigation");
        h.g.b.x.f(bhVar2, "scheme");
        return new bi(list4, list5, list6, list7, list8, caVar2, dnVar2, bhVar2);
    }

    public final bh a() {
        return this.f28084h;
    }

    public final ca b() {
        return this.f28082f;
    }

    public final dn c() {
        return this.f28083g;
    }

    public final List d() {
        return this.f28078b;
    }

    public final List e() {
        return this.f28079c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi)) {
            return false;
        }
        bi biVar = (bi) obj;
        return h.g.b.x.n(this.f28077a, biVar.f28077a) && h.g.b.x.n(this.f28078b, biVar.f28078b) && h.g.b.x.n(this.f28079c, biVar.f28079c) && h.g.b.x.n(this.f28080d, biVar.f28080d) && h.g.b.x.n(this.f28081e, biVar.f28081e) && h.g.b.x.n(this.f28082f, biVar.f28082f) && h.g.b.x.n(this.f28083g, biVar.f28083g) && this.f28084h == biVar.f28084h;
    }

    public final List f() {
        return this.f28081e;
    }

    public final List g() {
        return this.f28080d;
    }

    public final List h() {
        return this.f28077a;
    }

    public final int hashCode() {
        return (((((((((((((this.f28077a.hashCode() * 31) + this.f28078b.hashCode()) * 31) + this.f28079c.hashCode()) * 31) + this.f28080d.hashCode()) * 31) + this.f28081e.hashCode()) * 31) + this.f28082f.hashCode()) * 31) + this.f28083g.hashCode()) * 31) + this.f28084h.hashCode();
    }

    public final String toString() {
        return "MapContentRequest(routes=" + this.f28077a + ", eventsOnRoute=" + this.f28078b + ", markers=" + this.f28079c + ", polylines=" + this.f28080d + ", polygons=" + this.f28081e + ", additionalContent=" + this.f28082f + ", navigation=" + this.f28083g + ", scheme=" + this.f28084h + ")";
    }

    public bi(List list, List list2, List list3, List list4, List list5, ca caVar, dn dnVar, bh bhVar) {
        h.g.b.x.f(list, "routes");
        h.g.b.x.f(list2, "eventsOnRoute");
        h.g.b.x.f(list3, "markers");
        h.g.b.x.f(list4, "polylines");
        h.g.b.x.f(list5, "polygons");
        h.g.b.x.f(caVar, "additionalContent");
        h.g.b.x.f(dnVar, "navigation");
        h.g.b.x.f(bhVar, "scheme");
        this.f28077a = list;
        this.f28078b = list2;
        this.f28079c = list3;
        this.f28080d = list4;
        this.f28081e = list5;
        this.f28082f = caVar;
        this.f28083g = dnVar;
        this.f28084h = bhVar;
    }

    public bi() {
        this((List) null, (List) null, (List) null, (List) null, (List) null, (ca) null, (dn) null, 255);
    }
}
