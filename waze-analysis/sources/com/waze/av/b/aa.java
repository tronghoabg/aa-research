package com.waze.av.b;

import java.io.IOException;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.a.p f15844a;

    /* renamed from: b, reason: collision with root package name */
    private final List f15845b;

    /* renamed from: c, reason: collision with root package name */
    private final List f15846c;

    /* renamed from: d, reason: collision with root package name */
    private final List f15847d;

    public aa(com.waze.av.a.p pVar, List list, List list2, List list3) {
        h.g.b.x.f(pVar, "wazeAddress");
        h.g.b.x.f(list, "favoriteInfo");
        h.g.b.x.f(list2, "historicDrives");
        h.g.b.x.f(list3, "events");
        this.f15844a = pVar;
        this.f15845b = list;
        this.f15846c = list2;
        this.f15847d = list3;
    }

    public static /* synthetic */ aa e(aa aaVar, List list, List list2, List list3, int i2) {
        com.waze.av.a.p pVar = (i2 & 1) != 0 ? aaVar.f15844a : null;
        if ((i2 & 2) != 0) {
            list = aaVar.f15845b;
        }
        if ((i2 & 4) != 0) {
            list2 = aaVar.f15846c;
        }
        if ((i2 & 8) != 0) {
            list3 = aaVar.f15847d;
        }
        h.g.b.x.f(pVar, "wazeAddress");
        h.g.b.x.f(list, "favoriteInfo");
        h.g.b.x.f(list2, "historicDrives");
        h.g.b.x.f(list3, "events");
        return new aa(pVar, list, list2, list3);
    }

    public final com.waze.av.a.p a() {
        return this.f15844a;
    }

    public final List b() {
        return this.f15847d;
    }

    public final List c() {
        return this.f15845b;
    }

    public final List d() {
        return this.f15846c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return h.g.b.x.n(this.f15844a, aaVar.f15844a) && h.g.b.x.n(this.f15845b, aaVar.f15845b) && h.g.b.x.n(this.f15846c, aaVar.f15846c) && h.g.b.x.n(this.f15847d, aaVar.f15847d);
    }

    public final int hashCode() {
        return (((((this.f15844a.hashCode() * 31) + this.f15845b.hashCode()) * 31) + this.f15846c.hashCode()) * 31) + this.f15847d.hashCode();
    }

    public final String toString() throws IOException {
        List list = this.f15846c;
        return "{ id:" + this.f15844a.e() + ", favInfo:" + this.f15845b + ", histInfos:" + list.size() + ", " + h.a.i.aM(list, null, null, null, 0, new com.waze.main_screen.ag.a(13), 31) + ", events:" + this.f15847d.size() + " }";
    }

    public /* synthetic */ aa(com.waze.av.a.p pVar, List list, int i2) {
        this(pVar, (i2 & 2) != 0 ? h.a.i.h() : list, h.a.i.h(), h.a.i.h());
    }
}
