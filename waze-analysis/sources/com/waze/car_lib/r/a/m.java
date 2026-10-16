package com.waze.car_lib.r.a;

import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class m extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20904a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f20905b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f20906c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(p pVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20906c = i2;
        this.f20905b = pVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f20906c != 0 ? new m(this.f20905b, eVar, 1, null) : new m(this.f20905b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f20906c != 0 ? ((m) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((m) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f20906c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f20904a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f20904a = 1;
                if (p.d(this.f20905b, this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f20904a == 0) {
            e.b.c.b(obj);
            p pVar = this.f20905b;
            bn bnVar = pVar.f20923i;
            this.f20904a = 1;
            if (ai.e(bnVar, new k(pVar, null), this) == aVar2) {
                return aVar2;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new IllegalStateException("SharedFlow never completes, this call should never return.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(p pVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f20906c = i2;
        this.f20905b = pVar;
    }
}
