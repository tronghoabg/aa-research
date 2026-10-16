package com.waze.shared_infra.coordinators;

import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class m extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f37818a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f37819b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f37820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(o oVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37820c = i2;
        this.f37819b = oVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f37820c;
        if (i2 == 0) {
            return new m((o) this.f37819b, eVar, 0);
        }
        Object obj2 = this.f37819b;
        return i2 != 1 ? new m((s) obj2, eVar, 2) : new m((o) obj2, eVar, 1, null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f37820c;
        return i2 != 0 ? i2 != 1 ? ((m) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((m) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((m) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f37820c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f37818a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                o oVar = (o) this.f37819b;
                this.f37818a = 1;
                if (s.E(oVar.b(), new l(oVar), this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f37818a == 0) {
                e.b.c.b(obj);
                o oVar2 = (o) this.f37819b;
                this.f37818a = 1;
                if (oVar2.f37832h.a().collect(new j(oVar2), this) == aVar2) {
                    return aVar2;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        try {
            if (this.f37818a == 0) {
                e.b.c.b(obj);
                s sVar = (s) this.f37819b;
                sVar.f37841b.b(sVar);
                this.f37818a = 1;
                if (aj.p(this) == aVar3) {
                    return aVar3;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        } catch (Throwable th) {
            s sVar2 = (s) this.f37819b;
            sVar2.f37841b.c(sVar2);
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(o oVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f37820c = i2;
        this.f37819b = oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(s sVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37820c = i2;
        this.f37819b = sVar;
    }
}
