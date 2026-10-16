package e.a.i;

import e.a.br;
import e.a.w;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends b {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f47826b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar) {
        super(gVar);
        Objects.requireNonNull(gVar);
        this.f47826b = gVar;
    }

    @Override // e.a.i.b, e.a.i.a, e.a.bl
    public final void f(w wVar, br brVar) {
        super.f(wVar, brVar);
        g gVar = this.f47826b;
        if (gVar.f47827b.f47821f || wVar != w.f47854d) {
            return;
        }
        gVar.e().c();
    }
}
