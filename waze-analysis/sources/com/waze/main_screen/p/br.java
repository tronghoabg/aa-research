package com.waze.main_screen.p;

import com.waze.jni.protos.rtalerts.RtAlertItem;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class br implements com.waze.main_screen.l.b.h, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bs f27223a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f27224b;

    br(bs bsVar, int i2) {
        this.f27224b = i2;
        this.f27223a = bsVar;
    }

    @Override // com.waze.main_screen.l.b.h
    public final void a(RtAlertItem rtAlertItem) {
        if (this.f27224b != 0) {
            h.g.b.x.f(rtAlertItem, "p0");
            bs.y(this.f27223a, rtAlertItem);
        } else {
            h.g.b.x.f(rtAlertItem, "p0");
            bs.y(this.f27223a, rtAlertItem);
        }
    }

    public final boolean equals(Object obj) {
        if (this.f27224b != 0) {
            if ((obj instanceof com.waze.main_screen.l.b.h) && (obj instanceof h.g.b.r)) {
                return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
            }
            return false;
        }
        if ((obj instanceof com.waze.main_screen.l.b.h) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c getFunctionDelegate() {
        int i2 = this.f27224b;
        bs bsVar = this.f27223a;
        return i2 != 0 ? new h.g.b.u(1, bsVar, bs.class, "handleRouteEventClicked", "handleRouteEventClicked(Lcom/waze/jni/protos/rtalerts/RtAlertItem;)V", 0) : new h.g.b.u(1, bsVar, bs.class, "handleRouteEventClicked", "handleRouteEventClicked(Lcom/waze/jni/protos/rtalerts/RtAlertItem;)V", 0);
    }

    public final int hashCode() {
        return this.f27224b != 0 ? getFunctionDelegate().hashCode() : getFunctionDelegate().hashCode();
    }
}
