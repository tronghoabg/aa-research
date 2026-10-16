package com.waze.ui.ab;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final k f41746a;

    public l(k kVar) {
        x.f(kVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f41746a = kVar;
    }

    public final k a() {
        return this.f41746a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f41746a == ((l) obj).f41746a;
    }

    public final int hashCode() {
        return this.f41746a.hashCode();
    }

    public final String toString() {
        return "PreferredRouteMessageCardState(type=" + this.f41746a + ")";
    }
}
