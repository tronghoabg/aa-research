package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ce extends cf {

    /* renamed from: a, reason: collision with root package name */
    private final cb f34323a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(cb cbVar) {
        super(null);
        h.g.b.x.f(cbVar, "fteVariant");
        this.f34323a = cbVar;
    }

    public final cb a() {
        return this.f34323a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ce) && this.f34323a == ((ce) obj).f34323a;
    }

    public final int hashCode() {
        return this.f34323a.hashCode();
    }

    public final String toString() {
        return "FteReportMenu(fteVariant=" + this.f34323a + ")";
    }
}
