package com.waze.t.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q extends u {

    /* renamed from: a, reason: collision with root package name */
    private final Object f40639a;

    public q(Object obj) {
        super(null);
        this.f40639a = obj;
    }

    public final Object a() {
        return this.f40639a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && x.n(this.f40639a, ((q) obj).f40639a);
    }

    public final int hashCode() {
        return this.f40639a.hashCode();
    }

    public final String toString() {
        return "FeatureData(data=" + this.f40639a + ")";
    }
}
