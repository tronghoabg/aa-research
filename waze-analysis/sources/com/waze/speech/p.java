package com.waze.speech;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends s {

    /* renamed from: a, reason: collision with root package name */
    private final n f40468a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar) {
        super(null);
        h.g.b.x.f(nVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f40468a = nVar;
    }

    public final n a() {
        return this.f40468a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f40468a == ((p) obj).f40468a;
    }

    public final int hashCode() {
        return this.f40468a.hashCode();
    }

    public final String toString() {
        return "Error(type=" + this.f40468a + ")";
    }
}
