package com.waze.bw.b.a;

import com.waze.bw.c.d.v;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends v {

    /* renamed from: a, reason: collision with root package name */
    private final long f17694a;

    public g(long j2) {
        super(null);
        this.f17694a = j2;
    }

    public final long a() {
        return this.f17694a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f17694a == ((g) obj).f17694a;
    }

    public final int hashCode() {
        return a.a.b(this.f17694a);
    }

    public final String toString() {
        return "ArriveBy(epochSec=" + this.f17694a + ")";
    }
}
