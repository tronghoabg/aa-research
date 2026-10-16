package com.waze.an.c.a;

import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f14709a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f14710b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f14711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(p pVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f14711c = i2;
        this.f14710b = pVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f14711c != 0 ? new n(this.f14710b, eVar, 1, null) : new n(this.f14710b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f14711c != 0 ? ((n) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((n) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f14711c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f14709a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f14709a = 1;
                if (aj.r(this.f14710b.f14726k.f(), this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f14709a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            p pVar = this.f14710b;
            pVar.f14719d.e(true);
            this.f14709a = 1;
            if (aj.r(pVar.f14726k.e(), this) == aVar2) {
                return aVar2;
            }
        }
        this.f14710b.q();
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(p pVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f14711c = i2;
        this.f14710b = pVar;
    }
}
