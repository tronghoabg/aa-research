package com.waze.o.c.b;

import com.waze.t.b.bz;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends bz {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.bl.b.c.b f32791a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.waze.bl.b.c.b bVar) {
        super(null);
        h.g.b.x.f(bVar, "action");
        this.f32791a = bVar;
    }

    public final com.waze.bl.b.c.b a() {
        return this.f32791a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && h.g.b.x.n(this.f32791a, ((c) obj).f32791a);
    }

    public final int hashCode() {
        return this.f32791a.hashCode();
    }

    public final String toString() {
        return "Report(action=" + this.f32791a + ")";
    }
}
