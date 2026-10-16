package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final int f35051a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f35052b;

    public l(int i2, h.g.a.a aVar) {
        h.g.b.x.f(aVar, "onDismissedByUI");
        this.f35051a = i2;
        this.f35052b = aVar;
    }

    public final int a() {
        return this.f35051a;
    }

    public final h.g.a.a b() {
        return this.f35052b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f35051a == lVar.f35051a && h.g.b.x.n(this.f35052b, lVar.f35052b);
    }

    public final int hashCode() {
        return (this.f35051a * 31) + this.f35052b.hashCode();
    }

    public final String toString() {
        return "ConversationalReportingNonFteHintState(loopCount=" + this.f35051a + ", onDismissedByUI=" + this.f35052b + ")";
    }
}
