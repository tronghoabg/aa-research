package com.waze.sound;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gi extends gj {

    /* renamed from: a, reason: collision with root package name */
    private final String f40088a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40089b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f40090c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f40091d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.a f40092e;

    public gi(String str, String str2, h.g.a.a aVar) {
        h.g.b.x.f(str, "url");
        h.g.b.x.f(str2, "cacheKey");
        h.g.b.x.f(aVar, "completionCallback");
        this.f40088a = str;
        this.f40089b = str2;
        this.f40090c = false;
        this.f40091d = false;
        this.f40092e = aVar;
    }

    public final String a() {
        return this.f40089b;
    }

    @Override // com.waze.sound.gj
    public final h.g.a.a b() {
        return this.f40092e;
    }

    @Override // com.waze.sound.gj
    public final boolean c() {
        return false;
    }

    @Override // com.waze.sound.gj
    public final boolean d() {
        return false;
    }

    public final String e() {
        return this.f40088a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi)) {
            return false;
        }
        gi giVar = (gi) obj;
        if (!h.g.b.x.n(this.f40088a, giVar.f40088a) || !h.g.b.x.n(this.f40089b, giVar.f40089b)) {
            return false;
        }
        boolean z = giVar.f40090c;
        boolean z2 = giVar.f40091d;
        return h.g.b.x.n(this.f40092e, giVar.f40092e);
    }

    public final int hashCode() {
        return (((((((this.f40088a.hashCode() * 31) + this.f40089b.hashCode()) * 31) + DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER) * 31) + DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER) * 31) + this.f40092e.hashCode();
    }

    public final String toString() {
        return "Url(url=" + this.f40088a + ", cacheKey=" + this.f40089b + ", ignoreMute=false, ignoreHardMute=false, completionCallback=" + this.f40092e + ")";
    }
}
