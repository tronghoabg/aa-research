package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bf extends com.waze.alerters.a.k {

    /* renamed from: a, reason: collision with root package name */
    private final bs f19027a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bs bsVar) {
        super(null);
        h.g.b.x.f(bsVar, "reason");
        this.f19027a = bsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf) && this.f19027a == ((bf) obj).f19027a;
    }

    public final int hashCode() {
        return this.f19027a.hashCode();
    }

    public final String toString() {
        return "Cancelled(reason=" + this.f19027a + ")";
    }
}
