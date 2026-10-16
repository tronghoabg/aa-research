package com.waze.sharedrive.c.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38079a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedrive.q f38080b;

    public n(Object obj, com.waze.sharedrive.q qVar) {
        x.f(qVar, "error");
        this.f38079a = obj;
        this.f38080b = qVar;
    }

    public final com.waze.sharedrive.q a() {
        return this.f38080b;
    }

    @Override // com.waze.sharedrive.c.a.q
    public final Object b() {
        return this.f38079a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return x.n(this.f38079a, nVar.f38079a) && x.n(this.f38080b, nVar.f38080b);
    }

    public final int hashCode() {
        Object obj = this.f38079a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f38080b.hashCode();
    }

    public final String toString() {
        return "Error(value=" + this.f38079a + ", error=" + this.f38080b + ")";
    }
}
