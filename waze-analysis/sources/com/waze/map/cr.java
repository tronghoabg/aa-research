package com.waze.map;

import java.util.List;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cr {

    /* renamed from: a, reason: collision with root package name */
    private final List f28693a;

    /* renamed from: b, reason: collision with root package name */
    private final List f28694b;

    /* renamed from: c, reason: collision with root package name */
    private final List f28695c;

    /* renamed from: d, reason: collision with root package name */
    private final List f28696d;

    /* renamed from: e, reason: collision with root package name */
    private final List f28697e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.map.b.ca f28698f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.map.b.dn f28699g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.map.b.bh f28700h;

    /* renamed from: i, reason: collision with root package name */
    private final CompletableDeferred f28701i;

    public cr(List list, List list2, List list3, List list4, List list5, com.waze.map.b.ca caVar, com.waze.map.b.dn dnVar, com.waze.map.b.bh bhVar) {
        h.g.b.x.f(list, "polygons");
        h.g.b.x.f(list2, "routes");
        h.g.b.x.f(list3, "eventsOnRoute");
        h.g.b.x.f(list4, "markers");
        h.g.b.x.f(list5, "polylines");
        h.g.b.x.f(caVar, "additionalContent");
        h.g.b.x.f(dnVar, "navigation");
        h.g.b.x.f(bhVar, "colorScheme");
        this.f28693a = list;
        this.f28694b = list2;
        this.f28695c = list3;
        this.f28696d = list4;
        this.f28697e = list5;
        this.f28698f = caVar;
        this.f28699g = dnVar;
        this.f28700h = bhVar;
        this.f28701i = kotlinx.coroutines.bo.j();
    }

    public final com.waze.map.b.bh a() {
        return this.f28700h;
    }

    public final com.waze.map.b.ca b() {
        return this.f28698f;
    }

    public final com.waze.map.b.dn c() {
        return this.f28699g;
    }

    public final List d() {
        return this.f28695c;
    }

    public final List e() {
        return this.f28696d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr)) {
            return false;
        }
        cr crVar = (cr) obj;
        return h.g.b.x.n(this.f28693a, crVar.f28693a) && h.g.b.x.n(this.f28694b, crVar.f28694b) && h.g.b.x.n(this.f28695c, crVar.f28695c) && h.g.b.x.n(this.f28696d, crVar.f28696d) && h.g.b.x.n(this.f28697e, crVar.f28697e) && h.g.b.x.n(this.f28698f, crVar.f28698f) && h.g.b.x.n(this.f28699g, crVar.f28699g) && this.f28700h == crVar.f28700h;
    }

    public final List f() {
        return this.f28693a;
    }

    public final List g() {
        return this.f28697e;
    }

    public final List h() {
        return this.f28694b;
    }

    public final int hashCode() {
        return (((((((((((((this.f28693a.hashCode() * 31) + this.f28694b.hashCode()) * 31) + this.f28695c.hashCode()) * 31) + this.f28696d.hashCode()) * 31) + this.f28697e.hashCode()) * 31) + this.f28698f.hashCode()) * 31) + this.f28699g.hashCode()) * 31) + this.f28700h.hashCode();
    }

    public final CompletableDeferred i() {
        return this.f28701i;
    }

    public final String toString() {
        return "MapContentRequestForPresenter(polygons=" + this.f28693a + ", routes=" + this.f28694b + ", eventsOnRoute=" + this.f28695c + ", markers=" + this.f28696d + ", polylines=" + this.f28697e + ", additionalContent=" + this.f28698f + ", navigation=" + this.f28699g + ", colorScheme=" + this.f28700h + ")";
    }

    public cr() {
        this(h.a.i.h(), h.a.i.h(), h.a.i.h(), h.a.i.h(), h.a.i.h(), new com.waze.map.b.ca(false, null, false, null, null, 1023), new com.waze.map.b.dn((byte[]) null), com.waze.map.b.bh.f28073a);
    }
}
