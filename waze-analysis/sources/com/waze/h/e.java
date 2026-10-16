package com.waze.h;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends g {

    /* renamed from: a, reason: collision with root package name */
    private final Float f24353a;

    public e(Float f2) {
        super(null);
        this.f24353a = f2;
    }

    public final Float H() {
        return this.f24353a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && x.n(this.f24353a, ((e) obj).f24353a);
    }

    public final int hashCode() {
        Float f2 = this.f24353a;
        if (f2 == null) {
            return 0;
        }
        return f2.hashCode();
    }

    public final String toString() {
        return "Playing(amplitude=" + this.f24353a + ")";
    }
}
