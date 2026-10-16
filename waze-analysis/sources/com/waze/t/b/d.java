package com.waze.t.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d extends as {

    /* renamed from: a, reason: collision with root package name */
    private final e f40768a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(null, null);
        h.g.b.x.f(eVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f40768a = eVar;
    }

    public final e a() {
        return this.f40768a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f40768a == ((d) obj).f40768a;
    }

    public final int hashCode() {
        return this.f40768a.hashCode();
    }

    public final String toString() {
        return "Error(type=" + this.f40768a + ")";
    }
}
