package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class be extends com.waze.z.a.b.n {

    /* renamed from: a, reason: collision with root package name */
    private final bb f40735a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bb bbVar) {
        super((byte[]) null);
        h.g.b.x.f(bbVar, "function");
        this.f40735a = bbVar;
    }

    public final bb a() {
        return this.f40735a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be) && this.f40735a == ((be) obj).f40735a;
    }

    public final int hashCode() {
        return this.f40735a.hashCode();
    }

    public final String toString() {
        return "FunctionCallResult(function=" + this.f40735a + ")";
    }
}
