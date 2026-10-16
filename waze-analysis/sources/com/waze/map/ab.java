package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ab extends com.waze.ae.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f27925a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(String str) {
        super(null);
        h.g.b.x.f(str, "canvasId");
        this.f27925a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab) && h.g.b.x.n(this.f27925a, ((ab) obj).f27925a);
    }

    public final int hashCode() {
        return this.f27925a.hashCode();
    }

    public final String i() {
        return this.f27925a;
    }

    public final String toString() {
        return "NativeCanvas(canvasId=" + this.f27925a + ")";
    }
}
