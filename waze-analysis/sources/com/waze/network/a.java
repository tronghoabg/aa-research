package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f31853a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f31854b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(c cVar, h.c.e eVar) {
        super(2, eVar);
        this.f31854b = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new a(this.f31854b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f31853a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f31853a = 1;
            obj = this.f31854b.f32171b.c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        ao aoVar = (ao) obj;
        ao aoVarA = c.a(this.f31854b);
        return new ao(aoVarA.a() - aoVar.a(), aoVarA.b() - aoVar.b());
    }
}
