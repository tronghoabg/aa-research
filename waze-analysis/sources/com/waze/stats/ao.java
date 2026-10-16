package com.waze.stats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ao extends com.waze.sharedui.utils.o {

    /* renamed from: a, reason: collision with root package name */
    private final l.a.s f40540a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ao(l.a.s sVar) {
        h.g.b.x.f(sVar, "payload");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f40540a = sVar;
    }

    public final l.a.s Q() {
        return this.f40540a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ao) && h.g.b.x.n(this.f40540a, ((ao) obj).f40540a);
    }

    public final int hashCode() {
        return this.f40540a.hashCode();
    }

    public final String toString() {
        return "AdEventAuthenticated(payload=" + this.f40540a + ")";
    }
}
