package com.waze.uid.state_impl.email;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements com.waze.sharedui.api.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f44660a;

    q(r rVar) {
        this.f44660a = rVar;
    }

    @Override // com.waze.sharedui.api.b
    public final void a(com.waze.sharedui.b bVar) {
        r rVar = this.f44660a;
        com.waze.uid.b.m mVar = rVar.f44485c;
        h.g.b.x.c(bVar);
        mVar.w(new com.waze.uid.b.d(bVar));
        rVar.j();
    }

    @Override // com.waze.sharedui.api.b
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        h.g.b.x.f((com.waze.sharedui.api.l) obj, "value");
        this.f44660a.k();
    }
}
