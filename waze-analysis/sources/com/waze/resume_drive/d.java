package com.waze.resume_drive;

import com.waze.av.a.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    private final o f35104a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar) {
        super(null);
        x.f(oVar, "venue");
        this.f35104a = oVar;
    }

    public final o a() {
        return this.f35104a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && x.n(this.f35104a, ((d) obj).f35104a);
    }

    public final int hashCode() {
        return this.f35104a.hashCode();
    }

    public final String toString() {
        return "Venue(venue=" + this.f35104a + ")";
    }
}
