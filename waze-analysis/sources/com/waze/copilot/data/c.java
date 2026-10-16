package com.waze.copilot.data;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final long f23020a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23021b;

    /* renamed from: c, reason: collision with root package name */
    private final ad f23022c;

    /* renamed from: d, reason: collision with root package name */
    private final a f23023d;

    /* renamed from: e, reason: collision with root package name */
    private final b f23024e;

    public c(long j2, String str, ad adVar, a aVar, b bVar) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(aVar, "downloadable");
        h.g.b.x.f(bVar, "preview");
        this.f23020a = j2;
        this.f23021b = str;
        this.f23022c = adVar;
        this.f23023d = aVar;
        this.f23024e = bVar;
    }

    public final long a() {
        return this.f23020a;
    }

    public final a b() {
        return this.f23023d;
    }

    public final b c() {
        return this.f23024e;
    }

    public final ad d() {
        return this.f23022c;
    }

    public final String e() {
        return this.f23021b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f23020a == cVar.f23020a && h.g.b.x.n(this.f23021b, cVar.f23021b) && h.g.b.x.n(this.f23022c, cVar.f23022c) && h.g.b.x.n(this.f23023d, cVar.f23023d) && h.g.b.x.n(this.f23024e, cVar.f23024e);
    }

    public final int hashCode() {
        int iB = (a.a.b(this.f23020a) * 31) + this.f23021b.hashCode();
        ad adVar = this.f23022c;
        return (((((iB * 31) + (adVar == null ? 0 : adVar.hashCode())) * 31) + this.f23023d.hashCode()) * 31) + this.f23024e.hashCode();
    }

    public final String toString() {
        return "CarAsset(id=" + this.f23020a + ", name=" + this.f23021b + ", car3DInfo=" + this.f23022c + ", downloadable=" + this.f23023d + ", preview=" + this.f23024e + ")";
    }
}
