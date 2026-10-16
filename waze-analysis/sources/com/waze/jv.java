package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jv extends ka {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f24985a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f24986b;

    public jv(h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(aVar, "onStopNavigation");
        h.g.b.x.f(aVar2, "onNavigateStopShare");
        this.f24985a = aVar;
        this.f24986b = aVar2;
    }

    public final h.g.a.a a() {
        return this.f24986b;
    }

    public final h.g.a.a b() {
        return this.f24985a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv)) {
            return false;
        }
        jv jvVar = (jv) obj;
        return h.g.b.x.n(this.f24985a, jvVar.f24985a) && h.g.b.x.n(this.f24986b, jvVar.f24986b);
    }

    public final int hashCode() {
        return (this.f24985a.hashCode() * 31) + this.f24986b.hashCode();
    }

    public final String toString() {
        return "ShareDriveDifferentDestinationInterceptionPopup(onStopNavigation=" + this.f24985a + ", onNavigateStopShare=" + this.f24986b + ")";
    }
}
