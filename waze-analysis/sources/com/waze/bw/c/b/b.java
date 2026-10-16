package com.waze.bw.c.b;

import com.waze.ag;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final ag f17765a;

    public b(ag agVar) {
        x.f(agVar, "calendarAccessManager");
        this.f17765a = agVar;
    }

    @Override // com.waze.bw.c.b.a
    public final void a() {
        this.f17765a.calendarRequestAccess();
    }
}
