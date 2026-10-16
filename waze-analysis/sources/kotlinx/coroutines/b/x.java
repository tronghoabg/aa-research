package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f51730a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f51731b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f51732c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f51733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f51733d = i2;
        this.f51731b = kVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f51733d != 0) {
            x xVar = new x(this.f51731b, eVar, 1, null);
            xVar.f51732c = obj;
            return xVar;
        }
        x xVar2 = new x(this.f51731b, eVar, 0);
        xVar2.f51732c = obj;
        return xVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f51733d != 0 ? ((x) create((kotlinx.coroutines.a.ad) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((x) create((kotlinx.coroutines.a.ad) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f51733d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f51730a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                kotlinx.coroutines.a.ad adVar = (kotlinx.coroutines.a.ad) this.f51732c;
                this.f51730a = 1;
                if (this.f51731b.collect(new w(adVar, 1), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f51730a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.a.ad adVar2 = (kotlinx.coroutines.a.ad) this.f51732c;
            this.f51730a = 1;
            if (this.f51731b.collect(new w(adVar2, 0), this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(k kVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f51733d = i2;
        this.f51731b = kVar;
    }
}
