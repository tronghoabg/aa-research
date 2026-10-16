package com.waze.car_lib.p;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    private final m f20798a;

    public e(m mVar) {
        h.g.b.x.f(mVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f20798a = mVar;
    }

    public final m a() {
        return this.f20798a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && h.g.b.x.n(this.f20798a, ((e) obj).f20798a);
    }

    public final int hashCode() {
        return this.f20798a.hashCode();
    }

    public final String toString() {
        return "Header(type=" + this.f20798a + ")";
    }
}
