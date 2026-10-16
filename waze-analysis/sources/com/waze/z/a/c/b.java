package com.waze.z.a.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final d f45828a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(null);
        x.f(dVar, "dialogCta");
        this.f45828a = dVar;
    }

    public final d a() {
        return this.f45828a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && x.n(this.f45828a, ((b) obj).f45828a);
    }

    public final int hashCode() {
        return this.f45828a.hashCode();
    }

    public final String toString() {
        return "SingleAction(dialogCta=" + this.f45828a + ")";
    }
}
