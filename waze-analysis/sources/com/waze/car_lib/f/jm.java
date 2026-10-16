package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jm extends com.waze.car_lib.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.dh f19759a;

    /* JADX WARN: Illegal instructions before constructor call */
    public jm(com.waze.car_lib.p.dh dhVar) {
        h.g.b.x.f(dhVar, "result");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f19759a = dhVar;
    }

    public final com.waze.car_lib.p.dh e() {
        return this.f19759a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jm) && h.g.b.x.n(this.f19759a, ((jm) obj).f19759a);
    }

    public final int hashCode() {
        return this.f19759a.hashCode();
    }

    public final String toString() {
        return "Close(result=" + this.f19759a + ")";
    }
}
