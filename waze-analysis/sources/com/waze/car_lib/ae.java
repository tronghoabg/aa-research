package com.waze.car_lib;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ae extends com.waze.beacons.n {

    /* renamed from: a, reason: collision with root package name */
    private final String f18875a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(String str) {
        super(null, null);
        h.g.b.x.f(str, "term");
        this.f18875a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae) && h.g.b.x.n(this.f18875a, ((ae) obj).f18875a);
    }

    public final String g() {
        return this.f18875a;
    }

    public final int hashCode() {
        return this.f18875a.hashCode();
    }

    public final String toString() {
        return "TermRecognized(term=" + this.f18875a + ")";
    }
}
