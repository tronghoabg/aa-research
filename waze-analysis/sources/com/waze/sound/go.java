package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class go extends gr {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.v.v f40097a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go(com.google.v.v vVar) {
        super(null);
        h.g.b.x.f(vVar, "bytes");
        this.f40097a = vVar;
    }

    public final com.google.v.v a() {
        return this.f40097a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof go) && h.g.b.x.n(this.f40097a, ((go) obj).f40097a);
    }

    public final int hashCode() {
        return this.f40097a.hashCode();
    }

    public final String toString() {
        return "Custom(bytes=" + this.f40097a + ")";
    }
}
