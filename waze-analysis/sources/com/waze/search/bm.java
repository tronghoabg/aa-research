package com.waze.search;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bm {

    /* renamed from: a, reason: collision with root package name */
    private final String f35576a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35577b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35578c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35579d;

    public bm(String str, boolean z, boolean z2, String str2) {
        h.g.b.x.f(str, "searchTerm");
        this.f35576a = str;
        this.f35577b = z;
        this.f35578c = z2;
        this.f35579d = str2;
    }

    public final String a() {
        return this.f35579d;
    }

    public final String b() {
        return this.f35576a;
    }

    public final boolean c() {
        return this.f35577b;
    }

    public final boolean d() {
        return this.f35578c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        return h.g.b.x.n(this.f35576a, bmVar.f35576a) && this.f35577b == bmVar.f35577b && this.f35578c == bmVar.f35578c && h.g.b.x.n(this.f35579d, bmVar.f35579d);
    }

    public final int hashCode() {
        int iHashCode = this.f35576a.hashCode() * 31;
        String str = this.f35579d;
        return ((((iHashCode + a.a.a(this.f35577b)) * 31) + a.a.a(this.f35578c)) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SearchQuery(searchTerm=" + this.f35576a + ", shouldAutoNav=" + this.f35577b + ", isVoiceSearch=" + this.f35578c + ", forcedSearchId=" + this.f35579d + ")";
    }
}
