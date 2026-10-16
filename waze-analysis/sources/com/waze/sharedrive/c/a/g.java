package com.waze.sharedrive.c.a;

import h.g.b.x;
import j$.time.Instant;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    private final Instant f38066a;

    public g(Instant instant) {
        x.f(instant, "eta");
        this.f38066a = instant;
    }

    @Override // com.waze.sharedrive.c.a.h
    public final Instant a() {
        return this.f38066a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && x.n(this.f38066a, ((g) obj).f38066a);
    }

    public final int hashCode() {
        return this.f38066a.hashCode();
    }

    public final String toString() {
        return "Preview(eta=" + this.f38066a + ")";
    }
}
