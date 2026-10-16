package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final j f10964a;

    /* renamed from: b, reason: collision with root package name */
    private final j f10965b;

    /* renamed from: c, reason: collision with root package name */
    private final double f10966c;

    public k(j jVar, j jVar2, double d2) {
        h.g.b.x.f(jVar, "performance");
        h.g.b.x.f(jVar2, "crashlytics");
        this.f10964a = jVar;
        this.f10965b = jVar2;
        this.f10966c = d2;
    }

    public final double a() {
        return this.f10966c;
    }

    public final j b() {
        return this.f10965b;
    }

    public final j c() {
        return this.f10964a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f10964a == kVar.f10964a && this.f10965b == kVar.f10965b && Double.compare(this.f10966c, kVar.f10966c) == 0;
    }

    public final int hashCode() {
        return (((this.f10964a.hashCode() * 31) + this.f10965b.hashCode()) * 31) + a.a.e(this.f10966c);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f10964a + ", crashlytics=" + this.f10965b + ", sessionSamplingRate=" + this.f10966c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k() {
        j jVar = j.f10957b;
        this(jVar, jVar, 1.0d);
    }
}
