package com.waze.t.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f40634a;

    public c(Object obj) {
        super(null);
        this.f40634a = obj;
    }

    public final Object a() {
        return this.f40634a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && x.n(this.f40634a, ((c) obj).f40634a);
    }

    public final int hashCode() {
        Object obj = this.f40634a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "FeatureActionResult(result=" + this.f40634a + ")";
    }
}
