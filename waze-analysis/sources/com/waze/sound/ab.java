package com.waze.sound;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final aa f39401a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.h.b.a f39402b;

    public ab(aa aaVar, com.waze.h.b.a aVar) {
        h.g.b.x.f(aaVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(aVar, "factory");
        this.f39401a = aaVar;
        this.f39402b = aVar;
    }

    public final com.waze.h.b.a a() {
        return this.f39402b;
    }

    public final aa b() {
        return this.f39401a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return this.f39401a == abVar.f39401a && h.g.b.x.n(this.f39402b, abVar.f39402b);
    }

    public final int hashCode() {
        return (this.f39401a.hashCode() * 31) + this.f39402b.hashCode();
    }

    public final String toString() {
        return "RecordingSource(type=" + this.f39401a + ", factory=" + this.f39402b + ")";
    }
}
