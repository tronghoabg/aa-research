package com.waze.sharedrive.c.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38081a;

    public o(Object obj) {
        this.f38081a = obj;
    }

    @Override // com.waze.sharedrive.c.a.q
    public final Object b() {
        return this.f38081a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && x.n(this.f38081a, ((o) obj).f38081a);
    }

    public final int hashCode() {
        Object obj = this.f38081a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Ready(value=" + this.f38081a + ")";
    }
}
