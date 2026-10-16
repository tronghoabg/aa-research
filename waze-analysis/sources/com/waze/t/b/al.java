package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class al extends am {

    /* renamed from: a, reason: collision with root package name */
    private final cb f40687a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(cb cbVar) {
        super(null);
        h.g.b.x.f(cbVar, "featureActionResult");
        this.f40687a = cbVar;
    }

    public final cb a() {
        return this.f40687a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof al) && h.g.b.x.n(this.f40687a, ((al) obj).f40687a);
    }

    public final int hashCode() {
        return this.f40687a.hashCode();
    }

    public final String toString() {
        return "ReceivedFeatureActionResult(featureActionResult=" + this.f40687a + ")";
    }
}
