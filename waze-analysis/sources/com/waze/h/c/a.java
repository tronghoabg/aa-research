package com.waze.h.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final a f24336a = new a(b.f24340a, d.f24349a, c.f24346a);

    /* renamed from: b, reason: collision with root package name */
    private final b f24337b;

    /* renamed from: c, reason: collision with root package name */
    private final d f24338c;

    /* renamed from: d, reason: collision with root package name */
    private final c f24339d;

    public a(b bVar, d dVar, c cVar) {
        x.f(bVar, "format");
        x.f(dVar, "sampleRate");
        x.f(cVar, "channels");
        this.f24337b = bVar;
        this.f24338c = dVar;
        this.f24339d = cVar;
    }

    public static /* synthetic */ a e(a aVar, b bVar) {
        d dVar = aVar.f24338c;
        c cVar = aVar.f24339d;
        x.f(bVar, "format");
        x.f(dVar, "sampleRate");
        x.f(cVar, "channels");
        return new a(bVar, dVar, cVar);
    }

    public final b b() {
        return this.f24337b;
    }

    public final c c() {
        return this.f24339d;
    }

    public final d d() {
        return this.f24338c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f24337b == aVar.f24337b && this.f24338c == aVar.f24338c && this.f24339d == aVar.f24339d;
    }

    public final int hashCode() {
        return (((this.f24337b.hashCode() * 31) + this.f24338c.hashCode()) * 31) + this.f24339d.hashCode();
    }

    public final String toString() {
        return "AudioConfig(format=" + this.f24337b + ", sampleRate=" + this.f24338c + ", channels=" + this.f24339d + ")";
    }
}
