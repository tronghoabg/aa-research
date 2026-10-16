package com.waze.h.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g extends com.waze.i.a {

    /* renamed from: a, reason: collision with root package name */
    private final Float f24313a;

    public g(Float f2) {
        super(null);
        this.f24313a = f2;
    }

    public final Float a() {
        return this.f24313a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && x.n(this.f24313a, ((g) obj).f24313a);
    }

    public final int hashCode() {
        Float f2 = this.f24313a;
        if (f2 == null) {
            return 0;
        }
        return f2.hashCode();
    }

    public final String toString() {
        return "Playing(amplitude=" + this.f24313a + ")";
    }
}
