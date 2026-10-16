package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bj extends com.waze.z.a.b.n {

    /* renamed from: a, reason: collision with root package name */
    private final bb f40740a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bb bbVar) {
        super((byte[]) null);
        h.g.b.x.f(bbVar, "function");
        this.f40740a = bbVar;
    }

    public final bb a() {
        return this.f40740a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj) && this.f40740a == ((bj) obj).f40740a;
    }

    public final int hashCode() {
        return this.f40740a.hashCode();
    }

    public final String toString() {
        return "FunctionCall(function=" + this.f40740a + ")";
    }
}
