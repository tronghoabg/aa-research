package com.waze.ui.w.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends com.waze.ui.w.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final bf f43708a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(bf bfVar) {
        super(null);
        h.g.b.x.f(bfVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f43708a = bfVar;
    }

    public final bf d() {
        return this.f43708a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f43708a == ((r) obj).f43708a;
    }

    public final int hashCode() {
        return this.f43708a.hashCode();
    }

    public final String toString() {
        return "TtsFinished(type=" + this.f43708a + ")";
    }
}
