package org.a.d.i;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final h.l.c f56408a;

    /* renamed from: b, reason: collision with root package name */
    private final String f56409b;

    public c(h.l.c cVar) {
        x.f(cVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f56408a = cVar;
        this.f56409b = org.a.e.a.a(cVar);
    }

    @Override // org.a.d.i.a
    public final String a() {
        return this.f56409b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && x.n(this.f56409b, ((c) obj).f56409b);
    }

    public final int hashCode() {
        return this.f56409b.hashCode();
    }

    public final String toString() {
        return "q:'" + this.f56409b + "'";
    }
}
