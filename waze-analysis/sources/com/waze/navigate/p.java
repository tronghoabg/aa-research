package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p extends r {

    /* renamed from: a, reason: collision with root package name */
    private final Object f31800a;

    public p(Object obj) {
        super(obj);
        this.f31800a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && h.g.b.x.n(this.f31800a, ((p) obj).f31800a);
    }

    public final int hashCode() {
        Object obj = this.f31800a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Data(loadedData=" + this.f31800a + ")";
    }
}
