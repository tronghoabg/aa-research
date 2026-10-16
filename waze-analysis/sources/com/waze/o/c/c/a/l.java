package com.waze.o.c.c.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.a.p f32839a;

    public l(com.waze.av.a.p pVar) {
        x.f(pVar, "wazeAddress");
        this.f32839a = pVar;
    }

    public final com.waze.av.a.p a() {
        return this.f32839a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && x.n(this.f32839a, ((l) obj).f32839a);
    }

    public final int hashCode() {
        return this.f32839a.hashCode();
    }

    public final String toString() {
        return "Success(wazeAddress=" + this.f32839a + ")";
    }
}
