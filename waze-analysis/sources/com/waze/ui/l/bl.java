package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bl implements bn {

    /* renamed from: a, reason: collision with root package name */
    private final ad f42581a;

    public bl(ad adVar) {
        h.g.b.x.f(adVar, "state");
        this.f42581a = adVar;
    }

    public final ad a() {
        return this.f42581a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bl) && h.g.b.x.n(this.f42581a, ((bl) obj).f42581a);
    }

    public final int hashCode() {
        return this.f42581a.hashCode();
    }

    public final String toString() {
        return "Single(state=" + this.f42581a + ")";
    }
}
