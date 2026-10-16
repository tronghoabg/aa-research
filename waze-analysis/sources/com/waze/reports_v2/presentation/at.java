package com.waze.reports_v2.presentation;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class at extends av {

    /* renamed from: a, reason: collision with root package name */
    private final ba f34828a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(ba baVar) {
        super(null);
        h.g.b.x.f(baVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f34828a = baVar;
    }

    @Override // com.waze.reports_v2.presentation.av
    public final ba a() {
        return this.f34828a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof at) && h.g.b.x.n(this.f34828a, ((at) obj).f34828a);
    }

    public final int hashCode() {
        return this.f34828a.hashCode();
    }

    public final String toString() {
        return "Started(type=" + this.f34828a + ")";
    }
}
