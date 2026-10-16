package com.waze.main_screen.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class u extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27824a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f27825b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f27826c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(z zVar, i iVar, h.c.e eVar) {
        super(2, eVar);
        this.f27825b = zVar;
        this.f27826c = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new u(this.f27825b, this.f27826c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((u) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f27824a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            z zVar = this.f27825b;
            i iVar = this.f27826c;
            this.f27824a = 1;
            if (zVar.f27838a.b(iVar.e(), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
