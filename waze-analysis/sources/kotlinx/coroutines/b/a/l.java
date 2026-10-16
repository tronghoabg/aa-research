package kotlinx.coroutines.b.a;

import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f51425a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f51426b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f51427c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f51428d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f51429e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(h.g.a.q qVar, kotlinx.coroutines.b.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f51429e = i2;
        this.f51427c = qVar;
        this.f51426b = lVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [h.g.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.b.l] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlinx.coroutines.b.l] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlinx.coroutines.b.l] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f51429e;
        if (i2 == 0) {
            l lVar = new l((m) this.f51426b, (kotlinx.coroutines.b.l) this.f51427c, eVar, 0);
            lVar.f51428d = obj;
            return lVar;
        }
        if (i2 != 1) {
            l lVar2 = new l((h.g.a.q) this.f51427c, (kotlinx.coroutines.b.l) this.f51426b, eVar, 2);
            lVar2.f51428d = obj;
            return lVar2;
        }
        l lVar3 = new l((kotlinx.coroutines.b.l) this.f51427c, (e) this.f51426b, eVar, 1);
        lVar3.f51428d = obj;
        return lVar3;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f51429e;
        return i2 != 0 ? i2 != 1 ? ((l) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((l) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((l) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlinx.coroutines.b.l] */
    /* JADX WARN: Type inference failed for: r2v5, types: [h.g.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlinx.coroutines.b.l] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f51429e;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f51425a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f51428d;
                aq aqVar = new aq();
                m mVar = (m) this.f51426b;
                k kVar = new k(aqVar, afVar, mVar, this.f51427c);
                l lVar = this;
                this.f51425a = 1;
                if (mVar.f51411d.collect(kVar, lVar) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f51425a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                kotlinx.coroutines.af afVar2 = (kotlinx.coroutines.af) this.f51428d;
                this.f51425a = 1;
                if (kotlinx.coroutines.b.ai.f(this.f51427c, ((e) this.f51426b).d(afVar2), this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f51425a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar3 = (kotlinx.coroutines.af) this.f51428d;
            ?? r2 = this.f51427c;
            Object obj2 = this.f51426b;
            this.f51425a = 1;
            if (r2.invoke(afVar3, obj2, this) == aVar3) {
                return aVar3;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar, kotlinx.coroutines.b.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f51429e = i2;
        this.f51426b = mVar;
        this.f51427c = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(kotlinx.coroutines.b.l lVar, e eVar, h.c.e eVar2, int i2) {
        super(2, eVar2);
        this.f51429e = i2;
        this.f51427c = lVar;
        this.f51426b = eVar;
    }
}
