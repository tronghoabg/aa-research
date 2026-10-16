package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bs extends com.waze.car_lib.r.bq {

    /* renamed from: a, reason: collision with root package name */
    private final String f20656a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(String str) {
        super(null);
        h.g.b.x.f(str, "text");
        this.f20656a = str;
    }

    public final String a() {
        return this.f20656a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs) && h.g.b.x.n(this.f20656a, ((bs) obj).f20656a);
    }

    public final int hashCode() {
        return this.f20656a.hashCode();
    }

    public final String toString() {
        return "NoMatchingPlugsData(text=" + this.f20656a + ")";
    }
}
