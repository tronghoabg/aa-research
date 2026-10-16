package com.waze.uid.state_impl.username_login;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements com.waze.sharedui.api.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f44702a;

    b(c cVar) {
        this.f44702a = cVar;
    }

    @Override // com.waze.sharedui.api.b
    public final void a(com.waze.sharedui.b bVar) {
        c cVar = this.f44702a;
        com.waze.uid.b.m mVar = cVar.f44485c;
        x.c(bVar);
        mVar.w(new com.waze.uid.b.d(bVar));
        cVar.j();
    }

    @Override // com.waze.sharedui.api.b
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        x.f((com.waze.sharedui.api.l) obj, "value");
        this.f44702a.k();
    }
}
