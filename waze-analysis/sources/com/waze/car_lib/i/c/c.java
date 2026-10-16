package com.waze.car_lib.i.c;

import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends dh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.utils.c f20089a;

    public c(com.waze.sharedui.utils.c cVar) {
        super(null);
        this.f20089a = cVar;
    }

    public final com.waze.sharedui.utils.c a() {
        return this.f20089a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && h.g.b.x.n(this.f20089a, ((c) obj).f20089a);
    }

    public final int hashCode() {
        com.waze.sharedui.utils.c cVar = this.f20089a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "AvgSpeedCam(distance=" + this.f20089a + ")";
    }
}
