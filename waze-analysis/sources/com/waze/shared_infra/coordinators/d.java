package com.waze.shared_infra.coordinators;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends com.waze.settings.tree.a.d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37804a;

    public d(Object obj) {
        super(null);
        this.f37804a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && x.n(this.f37804a, ((d) obj).f37804a);
    }

    public final Object f() {
        return this.f37804a;
    }

    public final int hashCode() {
        Object obj = this.f37804a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Custom(data=" + this.f37804a + ")";
    }
}
