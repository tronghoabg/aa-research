package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.z.a.al f18033a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.p f18034b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f18035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cj(com.waze.z.a.al alVar, h.g.a.p pVar, String str, h.c.e eVar) {
        super(2, eVar);
        this.f18033a = alVar;
        this.f18034b = pVar;
        this.f18035c = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new cj(this.f18033a, this.f18034b, this.f18035c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.z.a.al alVar = this.f18033a;
        com.waze.z.a.ae aeVarC = alVar.c();
        com.waze.z.a.ae aeVar = com.waze.z.a.ae.f45620b;
        if (aeVarC != aeVar) {
            this.f18034b.invoke(com.waze.z.a.ae.f45619a, this.f18035c);
        } else if (alVar.b() == com.waze.z.a.ae.f45619a) {
            this.f18034b.invoke(aeVar, this.f18035c);
        }
        return h.ab.f48028a;
    }
}
