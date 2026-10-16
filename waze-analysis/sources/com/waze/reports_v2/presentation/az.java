package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class az extends ba {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f34836a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f34837b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(h.g.a.a aVar, h.g.a.a aVar2) {
        super(false, 14);
        h.g.b.x.f(aVar, "onShown");
        h.g.b.x.f(aVar2, "onDismissedByUI");
        this.f34836a = aVar;
        this.f34837b = aVar2;
    }

    @Override // com.waze.reports_v2.presentation.ba
    public final h.g.a.a a() {
        return this.f34837b;
    }

    @Override // com.waze.reports_v2.presentation.ba
    public final h.g.a.a b() {
        return this.f34836a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        return h.g.b.x.n(this.f34836a, azVar.f34836a) && h.g.b.x.n(this.f34837b, azVar.f34837b);
    }

    public final int hashCode() {
        return (this.f34836a.hashCode() * 31) + this.f34837b.hashCode();
    }

    public final String toString() {
        return "TapToReportEducation(onShown=" + this.f34836a + ", onDismissedByUI=" + this.f34837b + ")";
    }
}
