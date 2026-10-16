package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aw extends com.waze.ads.c.e {

    /* renamed from: a, reason: collision with root package name */
    private final bs f19003a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(bs bsVar) {
        super(null);
        h.g.b.x.f(bsVar, "reason");
        this.f19003a = bsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw) && this.f19003a == ((aw) obj).f19003a;
    }

    public final int hashCode() {
        return this.f19003a.hashCode();
    }

    public final bs i() {
        return this.f19003a;
    }

    public final String toString() {
        return "Cancel(reason=" + this.f19003a + ")";
    }
}
