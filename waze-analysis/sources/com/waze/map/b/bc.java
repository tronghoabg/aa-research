package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bc extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28050a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f28051b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f28052c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f28053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(bd bdVar, h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f28053d = i2;
        this.f28051b = bdVar;
        this.f28052c = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.waze.map.canvas.br, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f28053d != 0) {
            return new bc((com.waze.map.canvas.br) this.f28051b, (bd) this.f28052c, eVar, 1);
        }
        return new bc((bd) this.f28051b, (h.g.a.l) this.f28052c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f28053d != 0 ? ((bc) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bc) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.waze.map.canvas.br, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f28053d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f28050a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ?? r6 = this.f28051b;
                this.f28050a = 1;
                if (kotlinx.coroutines.b.ai.q(kotlinx.coroutines.b.ai.D(r6.D()), kotlinx.coroutines.b.ai.D(r6.C()), new az(null)).collect(new ba((bd) this.f28052c), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f28050a == 0) {
            e.b.c.b(obj);
            Object obj2 = this.f28051b;
            ?? r2 = this.f28052c;
            this.f28050a = 1;
            if (((bd) obj2).s.collect(new bb(r2), this) == aVar2) {
                return aVar2;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(com.waze.map.canvas.br brVar, bd bdVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f28053d = i2;
        this.f28051b = brVar;
        this.f28052c = bdVar;
    }
}
