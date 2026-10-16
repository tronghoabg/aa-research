package com.waze.main_screen.l.a;

import com.waze.jni.protos.rtalerts.RtAlertItem;
import h.g.a.l;
import h.g.b.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class d extends u implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final d f26592a = new d();

    d() {
        super(1, RtAlertItem.class, "getDistance", "getDistance()I", 0);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        RtAlertItem rtAlertItem = (RtAlertItem) obj;
        x.f(rtAlertItem, "p0");
        return Integer.valueOf(rtAlertItem.getDistance());
    }
}
