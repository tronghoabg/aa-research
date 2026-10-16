package com.waze.c.e;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n extends q {

    /* renamed from: a, reason: collision with root package name */
    private final m f18682a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar) {
        super(null);
        h.g.b.x.f(mVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f18682a = mVar;
    }

    public final m a() {
        return this.f18682a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f18682a == ((n) obj).f18682a;
    }

    public final int hashCode() {
        return this.f18682a.hashCode();
    }

    public final String toString() {
        return "Error(type=" + this.f18682a + ")";
    }
}
