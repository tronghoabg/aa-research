package com.waze.sharedrive.g;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m implements s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.z.at f38725a;

    public m(com.waze.ui.z.at atVar) {
        h.g.b.x.f(atVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f38725a = atVar;
    }

    public final com.waze.ui.z.at a() {
        return this.f38725a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f38725a == ((m) obj).f38725a;
    }

    public final int hashCode() {
        return this.f38725a.hashCode();
    }

    public final String toString() {
        return "FetchError(type=" + this.f38725a + ")";
    }
}
