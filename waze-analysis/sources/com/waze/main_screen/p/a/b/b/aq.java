package com.waze.main_screen.p.a.b.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aq extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f26921a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ az f26922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aq(az azVar, h.c.e eVar) {
        super(2, eVar);
        this.f26922b = azVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new aq(this.f26922b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aq) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f26921a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            az azVar = this.f26922b;
            this.f26921a = 1;
            if (azVar.f26938b.L().collect(new ap(azVar), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
