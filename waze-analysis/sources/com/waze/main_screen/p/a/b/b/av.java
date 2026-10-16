package com.waze.main_screen.p.a.b.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class av extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f26930a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ az f26931b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    av(az azVar, h.c.e eVar) {
        super(2, eVar);
        this.f26931b = azVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new av(this.f26931b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((av) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f26930a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            az azVar = this.f26931b;
            this.f26930a = 1;
            if (new n(kotlinx.coroutines.b.ai.D(azVar.f26937a.M()), 5).collect(new at(azVar), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
