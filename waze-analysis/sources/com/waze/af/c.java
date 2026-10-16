package com.waze.af;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    public final String f14049a;

    public c(String str) {
        super(null);
        this.f14049a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && x.n(this.f14049a, ((c) obj).f14049a);
    }

    public final int hashCode() {
        String str = this.f14049a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "UnnamedRoad(city=" + this.f14049a + ")";
    }
}
