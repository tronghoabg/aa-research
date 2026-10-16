package com.waze.map;

/* compiled from: WazeSource */
/* renamed from: com.waze.map.do, reason: invalid class name */
/* loaded from: classes6.dex */
public final class Cdo extends com.waze.an.a.a.bd {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ae.e f28760a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cdo(com.waze.ae.e eVar) {
        super(null);
        h.g.b.x.f(eVar, "context");
        this.f28760a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cdo) && h.g.b.x.n(this.f28760a, ((Cdo) obj).f28760a);
    }

    public final int hashCode() {
        return this.f28760a.hashCode();
    }

    public final com.waze.ae.e k() {
        return this.f28760a;
    }

    public final String toString() {
        return "Ready(context=" + this.f28760a + ")";
    }
}
