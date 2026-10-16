package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class au extends ax {

    /* renamed from: a, reason: collision with root package name */
    private final ar f34224a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(ar arVar) {
        super(null);
        h.g.b.x.f(arVar, "errorType");
        this.f34224a = arVar;
    }

    public final ar a() {
        return this.f34224a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au) && this.f34224a == ((au) obj).f34224a;
    }

    public final int hashCode() {
        return this.f34224a.hashCode();
    }

    public final String toString() {
        return "Error(errorType=" + this.f34224a + ")";
    }
}
