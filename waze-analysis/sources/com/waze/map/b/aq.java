package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aq extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28017a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bd f28018b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aq(bd bdVar, h.c.e eVar) {
        super(2, eVar);
        this.f28018b = bdVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new aq(this.f28018b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aq) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f28017a == 0) {
            e.b.c.b(obj);
            bd bdVar = this.f28018b;
            kotlinx.coroutines.b.bn bnVar = bdVar.w;
            this.f28017a = 1;
            if (kotlinx.coroutines.b.ai.e(bnVar, new ap(bdVar, null), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new IllegalStateException("SharedFlow never completes, this call should never return.");
    }
}
