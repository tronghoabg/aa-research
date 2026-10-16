package com.waze.map.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dd implements cz {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28184a;

    /* renamed from: b, reason: collision with root package name */
    private final cg f28185b;

    public dd(com.waze.shared_infra.h.c cVar, cg cgVar) {
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(cgVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f28184a = cVar;
        this.f28185b = cgVar;
    }

    public final cg a() {
        return this.f28185b;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f28184a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd)) {
            return false;
        }
        dd ddVar = (dd) obj;
        return h.g.b.x.n(this.f28184a, ddVar.f28184a) && this.f28185b == ddVar.f28185b;
    }

    public final int hashCode() {
        return (this.f28184a.hashCode() * 31) + this.f28185b.hashCode();
    }

    public final String toString() {
        return "PoiClicked(coordinate=" + this.f28184a + ", type=" + this.f28185b + ")";
    }
}
