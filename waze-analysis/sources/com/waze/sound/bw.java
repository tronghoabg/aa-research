package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bw extends bz {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.v.v f39580a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(com.google.v.v vVar) {
        super(null);
        h.g.b.x.f(vVar, "bytes");
        this.f39580a = vVar;
    }

    public final com.google.v.v a() {
        return this.f39580a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bw) && h.g.b.x.n(this.f39580a, ((bw) obj).f39580a);
    }

    public final int hashCode() {
        return this.f39580a.hashCode();
    }

    public final String toString() {
        return "Custom(bytes=" + this.f39580a + ")";
    }
}
