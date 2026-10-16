package com.waze.ui.w.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q extends com.waze.ui.w.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final be f43707a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(be beVar) {
        super(null);
        h.g.b.x.f(beVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f43707a = beVar;
    }

    public final be d() {
        return this.f43707a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f43707a == ((q) obj).f43707a;
    }

    public final int hashCode() {
        return this.f43707a.hashCode();
    }

    public final String toString() {
        return "TtsError(type=" + this.f43707a + ")";
    }
}
