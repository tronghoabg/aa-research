package com.waze.reports_v2.presentation.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final au f34720a;

    public f(au auVar) {
        h.g.b.x.f(auVar, "legacyMenu");
        this.f34720a = auVar;
    }

    public final au a() {
        return this.f34720a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && h.g.b.x.n(this.f34720a, ((f) obj).f34720a);
    }

    public final int hashCode() {
        return this.f34720a.hashCode();
    }

    public final String toString() {
        return "Args(legacyMenu=" + this.f34720a + ")";
    }
}
