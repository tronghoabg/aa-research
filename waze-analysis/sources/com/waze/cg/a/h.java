package com.waze.cg.a;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    private final f f22269a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar) {
        super(null);
        x.f(fVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f22269a = fVar;
    }

    public final f a() {
        return this.f22269a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f22269a == ((h) obj).f22269a;
    }

    public final int hashCode() {
        return this.f22269a.hashCode();
    }

    public final String toString() {
        return "Lifecycle(type=" + this.f22269a + ")";
    }
}
