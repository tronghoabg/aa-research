package com.waze.car_lib.p;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    private final int f20803a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20804b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.r.ac f20805c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.car_lib.r.ab f20806d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.a f20807e;

    public h(com.waze.car_lib.r.ac acVar, com.waze.car_lib.r.ab abVar, h.g.a.a aVar) {
        h.g.b.x.f(acVar, "resultsList");
        h.g.b.x.f(abVar, "selectedFilterType");
        h.g.b.x.f(aVar, "onShowMoreClicked");
        this.f20803a = R.string.SEARCH;
        this.f20804b = null;
        this.f20805c = acVar;
        this.f20806d = abVar;
        this.f20807e = aVar;
    }

    public final int a() {
        com.waze.car_lib.r.ab abVar = this.f20806d;
        if (h.g.b.x.n(abVar, com.waze.car_lib.r.z.f21733a)) {
            return R.string.HOV_PERMITS_ACTIVE_PERMITS_TITLE;
        }
        if (h.g.b.x.n(abVar, com.waze.car_lib.r.aa.f20926a)) {
            return R.string.HOV_PERMITS_ALL_PERMITS_ITEM;
        }
        throw new h.i();
    }

    public final com.waze.car_lib.r.ac b() {
        return this.f20805c;
    }

    public final h.g.a.a c() {
        return this.f20807e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        int i2 = hVar.f20803a;
        String str = hVar.f20804b;
        return h.g.b.x.n(null, null) && h.g.b.x.n(this.f20805c, hVar.f20805c) && h.g.b.x.n(this.f20806d, hVar.f20806d) && h.g.b.x.n(this.f20807e, hVar.f20807e);
    }

    public final int hashCode() {
        return ((((this.f20805c.hashCode() + 45876914) * 31) + this.f20806d.hashCode()) * 31) + this.f20807e.hashCode();
    }

    public final String toString() {
        return "Loaded(searchHintRes=2131888946, searchTerm=null, resultsList=" + this.f20805c + ", selectedFilterType=" + this.f20806d + ", onShowMoreClicked=" + this.f20807e + ")";
    }
}
