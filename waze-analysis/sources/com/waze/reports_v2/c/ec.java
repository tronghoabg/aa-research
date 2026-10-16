package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ec implements ed {

    /* renamed from: a, reason: collision with root package name */
    private final ea f34460a;

    public ec(ea eaVar) {
        h.g.b.x.f(eaVar, "error");
        this.f34460a = eaVar;
    }

    public final ea a() {
        return this.f34460a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ec) && h.g.b.x.n(this.f34460a, ((ec) obj).f34460a);
    }

    public final int hashCode() {
        return this.f34460a.hashCode();
    }

    public final String toString() {
        return "Cant(error=" + this.f34460a + ")";
    }
}
