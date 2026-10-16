package com.waze.br.a;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    private final f f17289a;

    public g(f fVar) {
        h.g.b.x.f(fVar, TypedValues.AttributesType.S_TARGET);
        this.f17289a = fVar;
    }

    public final f a() {
        return this.f17289a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && h.g.b.x.n(this.f17289a, ((g) obj).f17289a);
    }

    public final int hashCode() {
        return this.f17289a.hashCode();
    }

    public final String toString() {
        return "RoutesSelection(target=" + this.f17289a + ")";
    }
}
