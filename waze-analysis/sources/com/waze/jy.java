package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jy extends ka {

    /* renamed from: a, reason: collision with root package name */
    private final String f24993a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24994b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f24995c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f24996d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.a f24997e;

    public jy(String str, String str2, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3) {
        h.g.b.x.f(str, "venueName");
        h.g.b.x.f(aVar, "onPrimaryAction");
        h.g.b.x.f(aVar2, "onSecondaryAction");
        h.g.b.x.f(aVar3, "onPostDismiss");
        this.f24993a = str;
        this.f24994b = str2;
        this.f24995c = aVar;
        this.f24996d = aVar2;
        this.f24997e = aVar3;
    }

    public final String b() {
        return this.f24994b;
    }

    public final String c() {
        return this.f24993a;
    }

    public final h.g.a.a d() {
        return this.f24997e;
    }

    public final h.g.a.a e() {
        return this.f24995c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy)) {
            return false;
        }
        jy jyVar = (jy) obj;
        return h.g.b.x.n(this.f24993a, jyVar.f24993a) && h.g.b.x.n(this.f24994b, jyVar.f24994b) && h.g.b.x.n(this.f24995c, jyVar.f24995c) && h.g.b.x.n(this.f24996d, jyVar.f24996d) && h.g.b.x.n(this.f24997e, jyVar.f24997e);
    }

    public final h.g.a.a f() {
        return this.f24996d;
    }

    public final int hashCode() {
        int iHashCode = this.f24993a.hashCode() * 31;
        String str = this.f24994b;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f24995c.hashCode()) * 31) + this.f24996d.hashCode()) * 31) + this.f24997e.hashCode();
    }

    public final String toString() {
        return "UpdateVenueLocationPopup(venueName=" + this.f24993a + ", venueAddressString=" + this.f24994b + ", onPrimaryAction=" + this.f24995c + ", onSecondaryAction=" + this.f24996d + ", onPostDismiss=" + this.f24997e + ")";
    }
}
