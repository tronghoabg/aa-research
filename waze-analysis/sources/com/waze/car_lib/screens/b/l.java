package com.waze.car_lib.screens.b;

import h.ab;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class l extends u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f21847a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(Object obj, int i2) {
        super(1, obj, com.waze.car_lib.r.d.e.class, "onPanModeChanged", "onPanModeChanged(Z)V", 0);
        this.f21847a = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.f21847a != 0) {
            ((com.waze.car_lib.r.d.d) this.receiver).h(((Boolean) obj).booleanValue());
            return ab.f48028a;
        }
        ((com.waze.car_lib.r.d.e) this.receiver).f(((Boolean) obj).booleanValue());
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(Object obj, int i2, byte[] bArr) {
        super(1, obj, com.waze.car_lib.r.d.d.class, "onPanModeChanged", "onPanModeChanged(Z)V", 0);
        this.f21847a = i2;
    }
}
