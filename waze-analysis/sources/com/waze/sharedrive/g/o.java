package com.waze.sharedrive.g;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o implements s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.z.at f38727a;

    public o(com.waze.ui.z.at atVar) {
        h.g.b.x.f(atVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f38727a = atVar;
    }

    public final com.waze.ui.z.at a() {
        return this.f38727a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f38727a == ((o) obj).f38727a;
    }

    public final int hashCode() {
        return this.f38727a.hashCode();
    }

    public final String toString() {
        return "JoinError(type=" + this.f38727a + ")";
    }
}
