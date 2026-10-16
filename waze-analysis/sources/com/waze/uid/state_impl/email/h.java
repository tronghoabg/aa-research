package com.waze.uid.state_impl.email;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h implements com.waze.sharedui.api.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f44651a;

    h(i iVar) {
        Objects.requireNonNull(iVar);
        this.f44651a = iVar;
    }

    @Override // com.waze.sharedui.api.b
    public final void a(com.waze.sharedui.b bVar) {
        i iVar = this.f44651a;
        iVar.f44485c.w(new com.waze.uid.b.d(bVar));
        iVar.j();
    }

    @Override // com.waze.sharedui.api.b
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f44651a.k();
    }
}
