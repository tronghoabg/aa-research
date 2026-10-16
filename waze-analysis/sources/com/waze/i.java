package com.waze;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final long f24411a;

    /* renamed from: b, reason: collision with root package name */
    private final h f24412b;

    public /* synthetic */ i(long j2, h hVar) {
        h.g.b.x.f(hVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f24411a = j2;
        this.f24412b = hVar;
    }

    public final long a() {
        return this.f24411a;
    }

    public final h b() {
        return this.f24412b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.o.a.A(this.f24411a, iVar.f24411a) && this.f24412b == iVar.f24412b;
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        return (a.a.b(this.f24411a) * 31) + this.f24412b.hashCode();
    }

    public final String toString() {
        return "Timeout(duration=" + h.o.a.y(this.f24411a) + ", type=" + this.f24412b + ")";
    }
}
