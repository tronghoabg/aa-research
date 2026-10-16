package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jw extends ka {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f24987a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f24988b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f24989c;

    public jw(h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3) {
        h.g.b.x.f(aVar, "onStopNavigation");
        h.g.b.x.f(aVar2, "onNavigate");
        h.g.b.x.f(aVar3, "onNavigateStopShare");
        this.f24987a = aVar;
        this.f24988b = aVar2;
        this.f24989c = aVar3;
    }

    public final h.g.a.a a() {
        return this.f24988b;
    }

    public final h.g.a.a b() {
        return this.f24989c;
    }

    public final h.g.a.a c() {
        return this.f24987a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw)) {
            return false;
        }
        jw jwVar = (jw) obj;
        return h.g.b.x.n(this.f24987a, jwVar.f24987a) && h.g.b.x.n(this.f24988b, jwVar.f24988b) && h.g.b.x.n(this.f24989c, jwVar.f24989c);
    }

    public final int hashCode() {
        return (((this.f24987a.hashCode() * 31) + this.f24988b.hashCode()) * 31) + this.f24989c.hashCode();
    }

    public final String toString() {
        return "ShareDriveViewerSameDestinationInterceptionPopup(onStopNavigation=" + this.f24987a + ", onNavigate=" + this.f24988b + ", onNavigateStopShare=" + this.f24989c + ")";
    }
}
