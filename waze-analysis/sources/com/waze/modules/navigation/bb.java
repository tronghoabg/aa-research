package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bb extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    int f30366a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bk f30367b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bb(bk bkVar, h.c.e eVar) {
        super(1, eVar);
        this.f30367b = bkVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(h.c.e<?> eVar) {
        return new bb(this.f30367b, eVar);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((bb) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f30366a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f30366a = 1;
            if (bk.j(this.f30367b, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
