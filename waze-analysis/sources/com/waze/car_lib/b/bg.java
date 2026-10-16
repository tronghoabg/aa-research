package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bg extends com.waze.alerters.a.k {

    /* renamed from: a, reason: collision with root package name */
    private final bt f19028a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bt btVar) {
        super(null);
        h.g.b.x.f(btVar, "errorType");
        this.f19028a = btVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bg) && this.f19028a == ((bg) obj).f19028a;
    }

    public final bt f() {
        return this.f19028a;
    }

    public final int hashCode() {
        return this.f19028a.hashCode();
    }

    public final String toString() {
        return "Error(errorType=" + this.f19028a + ")";
    }
}
