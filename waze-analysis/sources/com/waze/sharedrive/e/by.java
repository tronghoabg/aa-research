package com.waze.sharedrive.e;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class by implements cb {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.z.at f38471a;

    public by(com.waze.ui.z.at atVar) {
        h.g.b.x.f(atVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f38471a = atVar;
    }

    public final com.waze.ui.z.at a() {
        return this.f38471a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof by) && this.f38471a == ((by) obj).f38471a;
    }

    public final int hashCode() {
        return this.f38471a.hashCode();
    }

    public final String toString() {
        return "Error(type=" + this.f38471a + ")";
    }
}
