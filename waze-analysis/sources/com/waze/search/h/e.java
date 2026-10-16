package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f35909a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f35910b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.w.i f35911c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f35912d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f35913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(o oVar, com.waze.w.i iVar, String str, int i2, h.c.e eVar) {
        super(2, eVar);
        this.f35910b = oVar;
        this.f35911c = iVar;
        this.f35912d = str;
        this.f35913e = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f35910b, this.f35911c, this.f35912d, this.f35913e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f35909a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f35909a = 1;
            if (o.f(this.f35910b, this.f35911c, this.f35912d, this.f35913e, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
