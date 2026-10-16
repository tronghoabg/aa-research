package com.waze.j;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final int f24918a;

    /* renamed from: b, reason: collision with root package name */
    private final o f24919b;

    public n(int i2, o oVar) {
        x.f(oVar, "source");
        this.f24918a = i2;
        this.f24919b = oVar;
    }

    public final int a() {
        return this.f24918a;
    }

    public final o b() {
        return this.f24919b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f24918a == nVar.f24918a && this.f24919b == nVar.f24919b;
    }

    public final int hashCode() {
        return (this.f24918a * 31) + this.f24919b.hashCode();
    }

    public final String toString() {
        return "ServerProvidedDistance(distance=" + this.f24918a + ", source=" + this.f24919b + ")";
    }
}
