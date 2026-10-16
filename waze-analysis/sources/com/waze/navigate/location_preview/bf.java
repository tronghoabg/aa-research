package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bf {

    /* renamed from: a, reason: collision with root package name */
    private final String f31632a;

    /* renamed from: b, reason: collision with root package name */
    private final be f31633b;

    /* renamed from: c, reason: collision with root package name */
    private final bd f31634c;

    public bf(String str, be beVar, bd bdVar) {
        h.g.b.x.f(beVar, "googleAdInformation");
        h.g.b.x.f(bdVar, "adBannerInformation");
        this.f31632a = str;
        this.f31633b = beVar;
        this.f31634c = bdVar;
    }

    public final bd a() {
        return this.f31634c;
    }

    public final be b() {
        return this.f31633b;
    }

    public final String c() {
        return this.f31632a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf)) {
            return false;
        }
        bf bfVar = (bf) obj;
        return h.g.b.x.n(this.f31632a, bfVar.f31632a) && h.g.b.x.n(this.f31633b, bfVar.f31633b) && h.g.b.x.n(this.f31634c, bfVar.f31634c);
    }

    public final int hashCode() {
        String str = this.f31632a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f31633b.hashCode()) * 31) + this.f31634c.hashCode();
    }

    public final String toString() {
        return "VenueAdData(businessName=" + this.f31632a + ", googleAdInformation=" + this.f31633b + ", adBannerInformation=" + this.f31634c + ")";
    }
}
