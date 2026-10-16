package com.waze.map.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aa extends com.waze.install.ah {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f27988a;

    /* renamed from: b, reason: collision with root package name */
    private final cg f27989b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(com.waze.shared_infra.h.c cVar, cg cgVar) {
        super(null);
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(cgVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f27988a = cVar;
        this.f27989b = cgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return h.g.b.x.n(this.f27988a, aaVar.f27988a) && this.f27989b == aaVar.f27989b;
    }

    public final cg f() {
        return this.f27989b;
    }

    public final com.waze.shared_infra.h.c g() {
        return this.f27988a;
    }

    public final int hashCode() {
        return (this.f27988a.hashCode() * 31) + this.f27989b.hashCode();
    }

    public final String toString() {
        return "PoiClick(coordinate=" + this.f27988a + ", type=" + this.f27989b + ")";
    }
}
