package com.waze.car_lib.c;

import com.waze.c.d.av;
import com.waze.c.d.ax;
import com.waze.settings.eb;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final eb f19223a;

    /* renamed from: b, reason: collision with root package name */
    private final ax f19224b;

    public d(eb ebVar, ax axVar) {
        x.f(ebVar, "settingsStatsSender");
        x.f(axVar, "alternativeRoutesStatsSender");
        this.f19223a = ebVar;
        this.f19224b = axVar;
    }

    public final void a() {
        this.f19224b.a(av.f18327a);
    }

    public final void b() {
        this.f19223a.j();
    }
}
