package com.waze.main_screen.p.a.b.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ai extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f26895a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aj f26896b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(aj ajVar, h.c.e eVar) {
        super(2, eVar);
        this.f26896b = ajVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ai(this.f26896b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ai) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f26895a == 0) {
            e.b.c.b(obj);
            aj ajVar = this.f26896b;
            this.f26895a = 1;
            if (ajVar.f26897a.N().collect(new ah(ajVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
