package com.waze.trip_overview;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dw extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final a f41421a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw(a aVar) {
        super(null);
        h.g.b.x.f(aVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f41421a = aVar;
    }

    public final a a() {
        return this.f41421a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dw) && this.f41421a == ((dw) obj).f41421a;
    }

    public final int hashCode() {
        return this.f41421a.hashCode();
    }

    public final String toString() {
        return "BackClicked(type=" + this.f41421a + ")";
    }
}
