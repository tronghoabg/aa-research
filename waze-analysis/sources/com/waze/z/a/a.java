package com.waze.z.a;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f45556a;

    /* renamed from: b, reason: collision with root package name */
    private final c f45557b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.ac.n f45558c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.ui.ac.i f45559d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f45560e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.ui.ac.i f45561f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.ui.ac.n f45562g;

    /* renamed from: h, reason: collision with root package name */
    private final v f45563h;

    /* renamed from: i, reason: collision with root package name */
    private final h.g.a.a f45564i;

    public /* synthetic */ a(com.waze.ui.ac.n nVar, c cVar, com.waze.ui.ac.n nVar2, com.waze.ui.ac.i iVar, boolean z, com.waze.ui.ac.i iVar2, com.waze.ui.ac.n nVar3, int i2) {
        h.g.b.x.f(nVar, "text");
        h.g.b.x.f(cVar, "sentiment");
        this.f45556a = nVar;
        this.f45557b = cVar;
        this.f45558c = (i2 & 4) != 0 ? null : nVar2;
        this.f45559d = (i2 & 8) != 0 ? null : iVar;
        this.f45560e = (!((i2 & 16) == 0)) | z;
        this.f45561f = (i2 & 32) != 0 ? null : iVar2;
        this.f45562g = (i2 & 64) != 0 ? null : nVar3;
        this.f45563h = null;
        this.f45564i = null;
    }

    public final c a() {
        return this.f45557b;
    }

    public final com.waze.ui.ac.i b() {
        return this.f45559d;
    }

    public final com.waze.ui.ac.i c() {
        return this.f45561f;
    }

    public final com.waze.ui.ac.n d() {
        return this.f45562g;
    }

    public final com.waze.ui.ac.n e() {
        return this.f45556a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!h.g.b.x.n(this.f45556a, aVar.f45556a) || this.f45557b != aVar.f45557b || !h.g.b.x.n(this.f45558c, aVar.f45558c) || !h.g.b.x.n(this.f45559d, aVar.f45559d) || this.f45560e != aVar.f45560e || !h.g.b.x.n(this.f45561f, aVar.f45561f) || !h.g.b.x.n(this.f45562g, aVar.f45562g)) {
            return false;
        }
        v vVar = aVar.f45563h;
        h.g.a.a aVar2 = aVar.f45564i;
        return h.g.b.x.n(null, null);
    }

    public final com.waze.ui.ac.n f() {
        return this.f45558c;
    }

    public final boolean g() {
        return this.f45560e;
    }

    public final int hashCode() {
        int iHashCode = (this.f45556a.hashCode() * 31) + this.f45557b.hashCode();
        com.waze.ui.ac.n nVar = this.f45558c;
        int iHashCode2 = ((iHashCode * 31) + (nVar == null ? 0 : nVar.hashCode())) * 31;
        com.waze.ui.ac.i iVar = this.f45559d;
        int iHashCode3 = (((iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31) + a.a.a(this.f45560e)) * 31;
        com.waze.ui.ac.i iVar2 = this.f45561f;
        int iHashCode4 = (iHashCode3 + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
        com.waze.ui.ac.n nVar2 = this.f45562g;
        return (iHashCode4 + (nVar2 != null ? nVar2.hashCode() : 0)) * 961;
    }

    public final String toString() {
        return "BadgeDefinition(text=" + this.f45556a + ", sentiment=" + this.f45557b + ", weakText=" + this.f45558c + ", icon=" + this.f45559d + ", iconTinted=" + this.f45560e + ", secondIcon=" + this.f45561f + ", secondText=" + this.f45562g + ", markerColor=null, onClick=null)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, com.waze.ui.ac.i iVar, boolean z, c cVar, int i2) {
        this(new com.waze.ui.ac.m(str), cVar, null, (i2 & 2) != 0 ? null : iVar, (!((i2 & 4) == 0)) | z, null, null, DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_HAZARD_PS);
        h.g.b.x.f(str, "text");
        h.g.b.x.f(cVar, "sentiment");
    }
}
