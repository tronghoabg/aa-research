package com.waze.config;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final Object f22653a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f22654b;

    public n(Object obj, boolean z) {
        this.f22653a = obj;
        this.f22654b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return h.g.b.x.n(this.f22653a, nVar.f22653a) && this.f22654b == nVar.f22654b;
    }

    public final int hashCode() {
        Object obj = this.f22653a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + a.a.a(this.f22654b);
    }

    public final String toString() {
        return "ConfigUpdate(value=" + this.f22653a + ", fromServer=" + this.f22654b + ")";
    }
}
