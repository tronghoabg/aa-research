package kotlinx.b.e;

import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f51248a;

    h(f fVar) {
        this.f51248a = fVar;
    }

    @Override // kotlinx.b.e.g
    public final void a(h.l.c cVar, l lVar) {
        x.f(cVar, "kClass");
        x.f(lVar, "provider");
        this.f51248a.k(cVar, new b(lVar), true);
    }

    @Override // kotlinx.b.e.g
    public final void b(h.l.c cVar, kotlinx.b.b bVar) {
        x.f(cVar, "kClass");
        x.f(bVar, "serializer");
        this.f51248a.k(cVar, new a(bVar), true);
    }

    @Override // kotlinx.b.e.g
    public final void c(h.l.c cVar, h.l.c cVar2, kotlinx.b.b bVar) {
        x.f(cVar, "baseClass");
        x.f(cVar2, "actualClass");
        x.f(bVar, "actualSerializer");
        this.f51248a.j(cVar, cVar2, bVar, true);
    }

    @Override // kotlinx.b.e.g
    public final void d(h.l.c cVar, l lVar) {
        x.f(cVar, "baseClass");
        x.f(lVar, "defaultDeserializerProvider");
        this.f51248a.h(cVar, lVar, true);
    }

    @Override // kotlinx.b.e.g
    public final void e(h.l.c cVar, l lVar) {
        x.f(cVar, "baseClass");
        x.f(lVar, "defaultSerializerProvider");
        this.f51248a.i(cVar, lVar, true);
    }
}
