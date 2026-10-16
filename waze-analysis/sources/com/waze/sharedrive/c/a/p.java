package com.waze.sharedrive.c.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38082a;

    public p(Object obj) {
        this.f38082a = obj;
    }

    @Override // com.waze.sharedrive.c.a.q
    public final Object b() {
        return this.f38082a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && x.n(this.f38082a, ((p) obj).f38082a);
    }

    public final int hashCode() {
        Object obj = this.f38082a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Updating(value=" + this.f38082a + ")";
    }
}
