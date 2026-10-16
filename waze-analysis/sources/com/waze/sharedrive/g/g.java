package com.waze.sharedrive.g;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.z.at f38709a;

    public g(com.waze.ui.z.at atVar) {
        h.g.b.x.f(atVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f38709a = atVar;
    }

    public final com.waze.ui.z.at a() {
        return this.f38709a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f38709a == ((g) obj).f38709a;
    }

    public final int hashCode() {
        return this.f38709a.hashCode();
    }

    public final String toString() {
        return "Error(type=" + this.f38709a + ")";
    }
}
