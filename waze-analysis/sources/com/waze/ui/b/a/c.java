package com.waze.ui.b.a;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final float f41955a;

    /* renamed from: b, reason: collision with root package name */
    private final d f41956b;

    public c(float f2, d dVar) {
        x.f(dVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f41955a = f2;
        this.f41956b = dVar;
    }

    public final float a() {
        return this.f41955a;
    }

    public final d b() {
        return this.f41956b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f41955a, cVar.f41955a) == 0 && this.f41956b == cVar.f41956b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f41955a) * 31) + this.f41956b.hashCode();
    }

    public final String toString() {
        return "RouteEvent(ratioOnRoadStart=" + this.f41955a + ", type=" + this.f41956b + ")";
    }
}
