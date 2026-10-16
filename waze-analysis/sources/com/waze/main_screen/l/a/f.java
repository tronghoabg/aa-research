package com.waze.main_screen.l.a;

import com.waze.jni.protos.rtalerts.RtAlertItem;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final RtAlertItem f26595a;

    public f(RtAlertItem rtAlertItem) {
        x.f(rtAlertItem, "rtAlertItemProto");
        this.f26595a = rtAlertItem;
    }

    public final RtAlertItem a() {
        return this.f26595a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && x.n(this.f26595a, ((f) obj).f26595a);
    }

    public final int hashCode() {
        return this.f26595a.hashCode();
    }

    public final String toString() {
        return "RouteAlert(rtAlertItemProto=" + this.f26595a + ")";
    }
}
