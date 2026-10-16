package com.waze.view.popups.a;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.map.gu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t extends u {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f45225a;

    /* renamed from: b, reason: collision with root package name */
    private final gu f45226b;

    /* renamed from: c, reason: collision with root package name */
    private final int f45227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.waze.shared_infra.h.c cVar, gu guVar, int i2) {
        super(guVar);
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(guVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f45225a = cVar;
        this.f45226b = guVar;
        this.f45227c = i2;
    }

    @Override // com.waze.view.popups.a.u
    public final gu a() {
        return this.f45226b;
    }

    public final int b() {
        return this.f45227c;
    }

    public final com.waze.shared_infra.h.c c() {
        return this.f45225a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return h.g.b.x.n(this.f45225a, tVar.f45225a) && this.f45226b == tVar.f45226b && this.f45227c == tVar.f45227c;
    }

    public final int hashCode() {
        return (((this.f45225a.hashCode() * 31) + this.f45226b.hashCode()) * 31) + this.f45227c;
    }

    public final String toString() {
        return "WazerPopup(coordinate=" + this.f45225a + ", type=" + this.f45226b + ", wazerID=" + this.f45227c + ")";
    }
}
