package com.waze.cg.c;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.cg.a.f f22330a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.waze.cg.a.f fVar) {
        super(null);
        x.f(fVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f22330a = fVar;
    }

    public final com.waze.cg.a.f a() {
        return this.f22330a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f22330a == ((l) obj).f22330a;
    }

    public final int hashCode() {
        return this.f22330a.hashCode();
    }

    public final String toString() {
        return "Lifecycle(type=" + this.f22330a + ")";
    }
}
