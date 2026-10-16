package com.waze.nav_connect.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ac extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f30768a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f30769b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f30770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(af afVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f30770c = i2;
        this.f30769b = afVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f30770c;
        if (i2 == 0) {
            return new ac((af) this.f30769b, eVar, 0);
        }
        Object obj2 = this.f30769b;
        return i2 != 1 ? new ac((af) obj2, eVar, 2, null) : new ac((w) obj2, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f30770c;
        return i2 != 0 ? i2 != 1 ? ((ac) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ac) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ac) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f30770c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f30768a == 0) {
                e.b.c.b(obj);
                af afVar = (af) this.f30769b;
                this.f30768a = 1;
                if (afVar.f30775a.b().collect(new ad(afVar, 1), this) == aVar) {
                    return aVar;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f30768a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f30768a = 1;
                if (((w) this.f30769b).f30840f.emit(i.f30802a, this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f30768a == 0) {
            e.b.c.b(obj);
            af afVar2 = (af) this.f30769b;
            this.f30768a = 1;
            if (afVar2.f30782h.collect(new ad(afVar2, 0), this) == aVar3) {
                return aVar3;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(af afVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f30770c = i2;
        this.f30769b = afVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(w wVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f30770c = i2;
        this.f30769b = wVar;
    }
}
