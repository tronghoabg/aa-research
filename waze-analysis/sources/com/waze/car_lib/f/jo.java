package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jo extends com.waze.car_lib.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.asks.as f19761a;

    /* JADX WARN: Illegal instructions before constructor call */
    public jo(com.waze.asks.as asVar) {
        h.g.b.x.f(asVar, "question");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f19761a = asVar;
    }

    public final com.waze.asks.as e() {
        return this.f19761a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jo) && h.g.b.x.n(this.f19761a, ((jo) obj).f19761a);
    }

    public final int hashCode() {
        return this.f19761a.hashCode();
    }

    public final String toString() {
        return "ShowWazeAsksQuestion(question=" + this.f19761a + ")";
    }
}
