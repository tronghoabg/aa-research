package com.waze.map.isolated;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final a f29226a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f29227b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29228c;

    /* renamed from: d, reason: collision with root package name */
    private final String f29229d;

    public e(a aVar, com.waze.shared_infra.h.c cVar, String str, String str2) {
        h.g.b.x.f(aVar, "pinType");
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(str, "venueId");
        this.f29226a = aVar;
        this.f29227b = cVar;
        this.f29228c = str;
        this.f29229d = str2;
    }

    public final a a() {
        return this.f29226a;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f29227b;
    }

    public final String c() {
        return this.f29229d;
    }

    public final String d() {
        return this.f29228c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f29226a == eVar.f29226a && h.g.b.x.n(this.f29227b, eVar.f29227b) && h.g.b.x.n(this.f29228c, eVar.f29228c) && h.g.b.x.n(this.f29229d, eVar.f29229d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f29226a.hashCode() * 31) + this.f29227b.hashCode()) * 31) + this.f29228c.hashCode();
        String str = this.f29229d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MapAd(pinType=" + this.f29226a + ", coordinate=" + this.f29227b + ", venueId=" + this.f29228c + ", venueContext=" + this.f29229d + ")";
    }
}
