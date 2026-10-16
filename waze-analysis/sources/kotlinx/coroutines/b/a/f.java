package kotlinx.coroutines.b.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f51407a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f51408b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f51409c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f51410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(e eVar, h.c.e eVar2, int i2) {
        super(2, eVar2);
        this.f51410d = i2;
        this.f51409c = eVar;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlinx.coroutines.b.l] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f51410d;
        if (i2 == 0) {
            f fVar = new f((g) this.f51409c, eVar, 0);
            fVar.f51408b = obj;
            return fVar;
        }
        if (i2 != 1) {
            f fVar2 = new f((kotlinx.coroutines.b.l) this.f51409c, eVar, 2);
            fVar2.f51408b = obj;
            return fVar2;
        }
        f fVar3 = new f((e) this.f51409c, eVar, 1);
        fVar3.f51408b = obj;
        return fVar3;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f51410d;
        return i2 != 0 ? i2 != 1 ? ((f) create(obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((f) create((kotlinx.coroutines.a.ad) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((f) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlinx.coroutines.b.l] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f51410d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f51407a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                kotlinx.coroutines.b.l lVar = (kotlinx.coroutines.b.l) this.f51408b;
                Object obj2 = this.f51409c;
                this.f51407a = 1;
                if (((g) obj2).f(lVar, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f51407a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj3 = this.f51408b;
                this.f51407a = 1;
                if (this.f51409c.emit(obj3, this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f51407a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.a.ad adVar = (kotlinx.coroutines.a.ad) this.f51408b;
            Object obj4 = this.f51409c;
            this.f51407a = 1;
            if (((e) obj4).a(adVar, this) == aVar3) {
                return aVar3;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f51410d = i2;
        this.f51409c = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(kotlinx.coroutines.b.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f51410d = i2;
        this.f51409c = lVar;
    }
}
