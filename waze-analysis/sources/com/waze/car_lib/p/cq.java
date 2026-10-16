package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cq extends com.waze.car_lib.r.co {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.i f20743a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(com.waze.ui.ac.i iVar) {
        super(null);
        h.g.b.x.f(iVar, "imageSource");
        this.f20743a = iVar;
    }

    public final com.waze.ui.ac.i c() {
        return this.f20743a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cq) && h.g.b.x.n(this.f20743a, ((cq) obj).f20743a);
    }

    public final int hashCode() {
        return this.f20743a.hashCode();
    }

    public final String toString() {
        return "Source(imageSource=" + this.f20743a + ")";
    }
}
