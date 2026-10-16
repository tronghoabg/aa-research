package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ay extends bf {

    /* renamed from: a, reason: collision with root package name */
    private final aq f34227a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(aq aqVar) {
        super(null);
        h.g.b.x.f(aqVar, "reason");
        this.f34227a = aqVar;
    }

    public final aq a() {
        return this.f34227a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ay) && this.f34227a == ((ay) obj).f34227a;
    }

    public final int hashCode() {
        return this.f34227a.hashCode();
    }

    public final String toString() {
        return "Cancelled(reason=" + this.f34227a + ")";
    }
}
