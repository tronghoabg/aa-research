package com.waze.uid.state_impl.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements com.waze.sharedui.api.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f44622a;

    b(c cVar) {
        Objects.requireNonNull(cVar);
        this.f44622a = cVar;
    }

    @Override // com.waze.sharedui.api.b
    public final void a(com.waze.sharedui.b bVar) {
        c cVar = this.f44622a;
        cVar.f44485c.w(new com.waze.uid.b.d(bVar));
        cVar.j();
    }

    @Override // com.waze.sharedui.api.b
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f44622a.k();
    }
}
