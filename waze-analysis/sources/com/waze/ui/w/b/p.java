package com.waze.ui.w.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends com.waze.ui.w.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final bc f43706a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(bc bcVar) {
        super(null);
        h.g.b.x.f(bcVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f43706a = bcVar;
    }

    public final bc d() {
        return this.f43706a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f43706a == ((p) obj).f43706a;
    }

    public final int hashCode() {
        return this.f43706a.hashCode();
    }

    public final String toString() {
        return "SpeechToTextError(type=" + this.f43706a + ")";
    }
}
