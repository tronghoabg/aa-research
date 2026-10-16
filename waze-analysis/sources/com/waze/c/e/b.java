package com.waze.c.e;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final a f18558a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(null);
        h.g.b.x.f(aVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f18558a = aVar;
    }

    public final a a() {
        return this.f18558a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f18558a == ((b) obj).f18558a;
    }

    public final int hashCode() {
        return this.f18558a.hashCode();
    }

    public final String toString() {
        return "Error(type=" + this.f18558a + ")";
    }
}
