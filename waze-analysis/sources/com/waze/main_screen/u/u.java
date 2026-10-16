package com.waze.main_screen.u;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class u extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27738a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f27739b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f27740c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(w wVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27740c = i2;
        this.f27739b = wVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f27740c != 0 ? new u(this.f27739b, eVar, 1, null) : new u(this.f27739b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f27740c != 0 ? ((u) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((u) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f27740c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f27738a == 0) {
                e.b.c.b(obj);
                w wVar = this.f27739b;
                this.f27738a = 1;
                if (wVar.f27754k.ah().collect(new t(wVar, 1), this) == aVar) {
                    return aVar;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f27738a == 0) {
            e.b.c.b(obj);
            w wVar2 = this.f27739b;
            this.f27738a = 1;
            if (wVar2.f27753j.b().collect(new t(wVar2, 0), this) == aVar2) {
                return aVar2;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(w wVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27740c = i2;
        this.f27739b = wVar;
    }
}
