package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ax extends ba {

    /* renamed from: a, reason: collision with root package name */
    private final int f34834a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f34835b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(int i2, h.g.a.a aVar) {
        super(true, 12);
        h.g.b.x.f(aVar, "onDismissedByUI");
        this.f34834a = i2;
        this.f34835b = aVar;
    }

    @Override // com.waze.reports_v2.presentation.ba
    public final h.g.a.a a() {
        return this.f34835b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax)) {
            return false;
        }
        ax axVar = (ax) obj;
        return this.f34834a == axVar.f34834a && h.g.b.x.n(this.f34835b, axVar.f34835b);
    }

    public final int hashCode() {
        return (this.f34834a * 31) + this.f34835b.hashCode();
    }

    public final String toString() {
        return "ConversationalNonFteHint(loopCount=" + this.f34834a + ", onDismissedByUI=" + this.f34835b + ")";
    }
}
