package com.waze.c.d;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o extends s {

    /* renamed from: a, reason: collision with root package name */
    private final n f18381a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar) {
        super(null);
        h.g.b.x.f(nVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f18381a = nVar;
    }

    public final n a() {
        return this.f18381a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f18381a == ((o) obj).f18381a;
    }

    public final int hashCode() {
        return this.f18381a.hashCode();
    }

    public final String toString() {
        return "Error(type=" + this.f18381a + ")";
    }
}
