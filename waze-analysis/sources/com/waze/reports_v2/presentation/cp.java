package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cp extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34969a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f34970b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cz f34971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cp(cz czVar, h.c.e eVar) {
        super(2, eVar);
        this.f34971c = czVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        cp cpVar = new cp(this.f34971c, eVar);
        cpVar.f34970b = ((Boolean) obj).booleanValue();
        return cpVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((cp) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34969a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            if (this.f34970b) {
                cz czVar = this.f34971c;
                this.f34969a = 1;
                if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.y(new cs(kotlinx.coroutines.b.ai.K(czVar.q.g(), new cm(czVar, null)), 1)), new cn(czVar, null), this) == aVar) {
                    return aVar;
                }
            }
        }
        return h.ab.f48028a;
    }
}
