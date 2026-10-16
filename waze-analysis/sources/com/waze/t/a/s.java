package com.waze.t.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s extends u {

    /* renamed from: a, reason: collision with root package name */
    private final Object f40641a;

    public s(Object obj) {
        super(null);
        this.f40641a = obj;
    }

    public final Object a() {
        return this.f40641a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && x.n(this.f40641a, ((s) obj).f40641a);
    }

    public final int hashCode() {
        return this.f40641a.hashCode();
    }

    public final String toString() {
        return "PerformFeatureAction(action=" + this.f40641a + ")";
    }
}
