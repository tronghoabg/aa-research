package com.waze.navigate.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final a f30930a;

    public b(a aVar) {
        x.f(aVar, "action");
        this.f30930a = aVar;
    }

    public final a a() {
        return this.f30930a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && x.n(this.f30930a, ((b) obj).f30930a);
    }

    public final int hashCode() {
        return -1685240216;
    }

    public final String toString() {
        return "Execute(action=" + this.f30930a + ")";
    }
}
