package com.waze.car_lib;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ab extends com.waze.beacons.n {

    /* renamed from: a, reason: collision with root package name */
    private final aa f18873a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(aa aaVar) {
        super(null, null);
        h.g.b.x.f(aaVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f18873a = aaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab) && this.f18873a == ((ab) obj).f18873a;
    }

    public final aa g() {
        return this.f18873a;
    }

    public final int hashCode() {
        return this.f18873a.hashCode();
    }

    public final String toString() {
        return "Error(type=" + this.f18873a + ")";
    }
}
