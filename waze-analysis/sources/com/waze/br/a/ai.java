package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ai extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f17274a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f17275b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aj f17276c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f17277d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f17278e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(aj ajVar, h.c.e eVar, int i2) {
        super(3, eVar);
        this.f17278e = i2;
        this.f17276c = ajVar;
    }

    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f17278e != 0) {
            ai aiVar = new ai(this.f17276c, (h.c.e) obj3, 1, null);
            aiVar.f17277d = (kotlinx.coroutines.b.l) obj;
            aiVar.f17275b = (Throwable) obj2;
            return aiVar.invokeSuspend(h.ab.f48028a);
        }
        ai aiVar2 = new ai(this.f17276c, (h.c.e) obj3, 0);
        aiVar2.f17277d = (kotlinx.coroutines.b.l) obj;
        aiVar2.f17275b = (Throwable) obj2;
        return aiVar2.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f17278e != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f17274a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                kotlinx.coroutines.b.l lVar = (kotlinx.coroutines.b.l) this.f17277d;
                this.f17276c.f17283e.h("error while requesting chat", (Throwable) this.f17275b);
                this.f17277d = null;
                this.f17274a = 1;
                if (lVar.emit(y.f17313a, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f17274a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.b.l lVar2 = (kotlinx.coroutines.b.l) this.f17277d;
            this.f17276c.f17283e.h("error executing start chat", (Throwable) this.f17275b);
            this.f17277d = null;
            this.f17274a = 1;
            if (lVar2.emit(y.f17313a, this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(aj ajVar, h.c.e eVar, int i2, byte[] bArr) {
        super(3, eVar);
        this.f17278e = i2;
        this.f17276c = ajVar;
    }
}
