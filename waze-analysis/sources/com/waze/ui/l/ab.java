package com.waze.ui.l;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab implements ad, y, m {

    /* renamed from: a, reason: collision with root package name */
    private final String f42470a;

    /* renamed from: b, reason: collision with root package name */
    private final w f42471b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42472c;

    /* renamed from: d, reason: collision with root package name */
    private final q f42473d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f42474e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.a f42475f;

    /* renamed from: g, reason: collision with root package name */
    private final h.g.a.a f42476g;

    public ab(String str, w wVar, String str2, q qVar, boolean z, h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(aVar, "onMapTap");
        h.g.b.x.f(aVar2, "onBackPressed");
        this.f42470a = str;
        this.f42471b = wVar;
        this.f42472c = str2;
        this.f42473d = qVar;
        this.f42474e = z;
        this.f42475f = aVar;
        this.f42476g = aVar2;
    }

    @Override // com.waze.ui.l.m
    public final h.g.a.a a() {
        return this.f42476g;
    }

    public final q b() {
        return this.f42473d;
    }

    public final w c() {
        return this.f42471b;
    }

    @Override // com.waze.ui.l.y
    public final h.g.a.a d() {
        return this.f42475f;
    }

    @Override // com.waze.ui.l.ad
    public final boolean e() {
        return this.f42474e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return h.g.b.x.n(this.f42470a, abVar.f42470a) && h.g.b.x.n(this.f42471b, abVar.f42471b) && h.g.b.x.n(this.f42472c, abVar.f42472c) && h.g.b.x.n(this.f42473d, abVar.f42473d) && this.f42474e == abVar.f42474e && h.g.b.x.n(this.f42475f, abVar.f42475f) && h.g.b.x.n(this.f42476g, abVar.f42476g);
    }

    public final String f() {
        return this.f42472c;
    }

    public final String g() {
        return this.f42470a;
    }

    public final int hashCode() {
        int iHashCode = this.f42470a.hashCode() * 31;
        w wVar = this.f42471b;
        int iHashCode2 = (iHashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        String str = this.f42472c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        q qVar = this.f42473d;
        return ((((((iHashCode3 + (qVar != null ? qVar.hashCode() : 0)) * 31) + a.a.a(this.f42474e)) * 31) + this.f42475f.hashCode()) * 31) + this.f42476g.hashCode();
    }

    public final String toString() {
        return "Regular(title=" + this.f42470a + ", icon=" + this.f42471b + ", description=" + this.f42472c + ", closeBehavior=" + this.f42473d + ", visible=" + this.f42474e + ", onMapTap=" + this.f42475f + ", onBackPressed=" + this.f42476g + ")";
    }
}
