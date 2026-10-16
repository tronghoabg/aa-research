package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as extends ax {

    /* renamed from: a, reason: collision with root package name */
    private final aq f34222a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(aq aqVar) {
        super(null);
        h.g.b.x.f(aqVar, "cancelReason");
        this.f34222a = aqVar;
    }

    public final aq a() {
        return this.f34222a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as) && this.f34222a == ((as) obj).f34222a;
    }

    public final int hashCode() {
        return this.f34222a.hashCode();
    }

    public final String toString() {
        return "Cancel(cancelReason=" + this.f34222a + ")";
    }
}
