package com.waze.car_lib.login;

import com.waze.install.w;
import h.ab;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class l extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20311a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f20312b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f20313c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20313c = i2;
        this.f20312b = mVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f20313c != 0) {
            l lVar = new l(this.f20312b, eVar, 1, null);
            lVar.f20311a = obj;
            return lVar;
        }
        l lVar2 = new l(this.f20312b, eVar, 0);
        lVar2.f20311a = obj;
        return lVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f20313c != 0 ? ((l) create((w) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((l) create((Boolean) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f20313c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            if (x.n((Boolean) this.f20311a, true)) {
                m mVar = this.f20312b;
                mVar.k(mVar.f20319f, "consent.required", new com.waze.alerters.h(10));
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        w wVar = (w) this.f20311a;
        if (wVar != null && (wVar instanceof com.waze.install.o)) {
            com.waze.install.o oVar = (com.waze.install.o) wVar;
            this.f20312b.f(oVar.b(), oVar.a());
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f20313c = i2;
        this.f20312b = mVar;
    }
}
