package com.waze.sharedrive.g;

import com.waze.jni.protos.rtalerts.RtAlertItem;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final RtAlertItem f38684a;

    public b(RtAlertItem rtAlertItem) {
        h.g.b.x.f(rtAlertItem, "routeAlert");
        this.f38684a = rtAlertItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && h.g.b.x.n(this.f38684a, ((b) obj).f38684a);
    }

    public final int hashCode() {
        return this.f38684a.hashCode();
    }

    public final String toString() {
        return "CenterOnRouteAlert(routeAlert=" + this.f38684a + ")";
    }
}
