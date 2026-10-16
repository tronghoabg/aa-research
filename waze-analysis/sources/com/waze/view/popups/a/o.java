package com.waze.view.popups.a;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.map.gu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o extends u {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f45218a;

    /* renamed from: b, reason: collision with root package name */
    private final gu f45219b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.waze.shared_infra.h.c cVar, gu guVar) {
        super(guVar);
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(guVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f45218a = cVar;
        this.f45219b = guVar;
    }

    @Override // com.waze.view.popups.a.u
    public final gu a() {
        return this.f45219b;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f45218a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return h.g.b.x.n(this.f45218a, oVar.f45218a) && this.f45219b == oVar.f45219b;
    }

    public final int hashCode() {
        return (this.f45218a.hashCode() * 31) + this.f45219b.hashCode();
    }

    public final String toString() {
        return "DetailsPopup(coordinate=" + this.f45218a + ", type=" + this.f45219b + ")";
    }
}
