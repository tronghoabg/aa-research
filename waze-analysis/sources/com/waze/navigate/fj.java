package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fj {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f31367a;

    /* renamed from: b, reason: collision with root package name */
    private final fi f31368b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31369c;

    public fj(com.waze.shared_infra.h.c cVar, fi fiVar, boolean z) {
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(fiVar, "reason");
        this.f31367a = cVar;
        this.f31368b = fiVar;
        this.f31369c = z;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f31367a;
    }

    public final boolean b() {
        return this.f31369c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj)) {
            return false;
        }
        fj fjVar = (fj) obj;
        return h.g.b.x.n(this.f31367a, fjVar.f31367a) && this.f31368b == fjVar.f31368b && this.f31369c == fjVar.f31369c;
    }

    public final int hashCode() {
        return (((this.f31367a.hashCode() * 31) + this.f31368b.hashCode()) * 31) + a.a.a(this.f31369c);
    }

    public final String toString() {
        return "ParkedState(coordinate=" + this.f31367a + ", reason=" + this.f31368b + ", showPopup=" + this.f31369c + ")";
    }
}
