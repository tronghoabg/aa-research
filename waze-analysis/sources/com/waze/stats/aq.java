package com.waze.stats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aq extends com.waze.sharedui.utils.o {

    /* renamed from: a, reason: collision with root package name */
    private final l.b.c f40542a;

    /* JADX WARN: Illegal instructions before constructor call */
    public aq(l.b.c cVar) {
        h.g.b.x.f(cVar, "payload");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f40542a = cVar;
    }

    public final l.b.c Q() {
        return this.f40542a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq) && h.g.b.x.n(this.f40542a, ((aq) obj).f40542a);
    }

    public final int hashCode() {
        return this.f40542a.hashCode();
    }

    public final String toString() {
        return "Metric(payload=" + this.f40542a + ")";
    }
}
