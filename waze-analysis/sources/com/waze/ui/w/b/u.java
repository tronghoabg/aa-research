package com.waze.ui.w.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u extends com.waze.ui.d.s {

    /* renamed from: a, reason: collision with root package name */
    private final ab f43711a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ab abVar) {
        super(null);
        h.g.b.x.f(abVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f43711a = abVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.f43711a == ((u) obj).f43711a;
    }

    public final int hashCode() {
        return this.f43711a.hashCode();
    }

    public final ab l() {
        return this.f43711a;
    }

    public final String toString() {
        return "Error(type=" + this.f43711a + ")";
    }
}
