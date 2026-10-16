package com.waze.h.b;

import com.waze.authentication.ax;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q extends ax {

    /* renamed from: a, reason: collision with root package name */
    private final Float f24334a;

    public q(Float f2) {
        super(null);
        this.f24334a = f2;
    }

    public final Float a() {
        return this.f24334a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && x.n(this.f24334a, ((q) obj).f24334a);
    }

    public final int hashCode() {
        Float f2 = this.f24334a;
        if (f2 == null) {
            return 0;
        }
        return f2.hashCode();
    }

    public final String toString() {
        return "Recording(amplitude=" + this.f24334a + ")";
    }
}
