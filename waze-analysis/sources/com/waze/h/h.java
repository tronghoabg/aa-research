package com.waze.h;

import com.waze.c.e.cl;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends cl {

    /* renamed from: a, reason: collision with root package name */
    private final Float f24355a;

    public h(Float f2) {
        super(null);
        this.f24355a = f2;
    }

    public final Float H() {
        return this.f24355a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && x.n(this.f24355a, ((h) obj).f24355a);
    }

    public final int hashCode() {
        Float f2 = this.f24355a;
        if (f2 == null) {
            return 0;
        }
        return f2.hashCode();
    }

    public final String toString() {
        return "Recording(amplitude=" + this.f24355a + ")";
    }
}
