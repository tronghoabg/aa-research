package com.waze.ui.ab;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final n f41753a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41754b;

    public o(n nVar, String str) {
        x.f(nVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(str, "text");
        this.f41753a = nVar;
        this.f41754b = str;
    }

    public final n a() {
        return this.f41753a;
    }

    public final String b() {
        return this.f41754b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f41753a == oVar.f41753a && x.n(this.f41754b, oVar.f41754b);
    }

    public final int hashCode() {
        return (this.f41753a.hashCode() * 31) + this.f41754b.hashCode();
    }

    public final String toString() {
        return "RoutingMessageCardState(type=" + this.f41753a + ", text=" + this.f41754b + ")";
    }
}
