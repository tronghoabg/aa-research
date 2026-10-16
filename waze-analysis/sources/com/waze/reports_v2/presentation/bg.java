package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bg {

    /* renamed from: a, reason: collision with root package name */
    private final av f34857a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34858b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34859c;

    public bg(av avVar, boolean z, boolean z2) {
        this.f34857a = avVar;
        this.f34858b = z;
        this.f34859c = z2;
    }

    public final av a() {
        return this.f34857a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return h.g.b.x.n(this.f34857a, bgVar.f34857a) && this.f34858b == bgVar.f34858b && this.f34859c == bgVar.f34859c;
    }

    public final int hashCode() {
        av avVar = this.f34857a;
        return ((((avVar == null ? 0 : avVar.hashCode()) * 31) + a.a.a(this.f34858b)) * 31) + a.a.a(this.f34859c);
    }

    public final String toString() {
        return "State(educationState=" + this.f34857a + ", yellowReportButton=" + this.f34858b + ", conversationalInReportMenuEnabled=" + this.f34859c + ")";
    }
}
