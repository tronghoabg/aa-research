package com.waze.search.h;

import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bu extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f35854a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bx f35855b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f35856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bu(bx bxVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f35856c = i2;
        this.f35855b = bxVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f35856c;
        return i2 != 0 ? i2 != 1 ? new bu(this.f35855b, eVar, 2, (char[]) null) : new bu(this.f35855b, eVar, 1, (byte[]) null) : new bu(this.f35855b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f35856c;
        return i2 != 0 ? i2 != 1 ? ((bu) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bu) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bu) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f35856c;
        if (i2 == 0) {
            Object obj2 = h.c.a.a.f48038a;
            if (this.f35854a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                o oVar = this.f35855b.q;
                this.f35854a = 1;
                Object objD = kotlinx.coroutines.aj.d(new n(oVar, null, 0), this);
                if (objD != obj2) {
                    objD = h.ab.f48028a;
                }
                if (objD == obj2) {
                    return obj2;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f35854a == 0) {
                e.b.c.b(obj);
                bx bxVar = this.f35855b;
                this.f35854a = 1;
                if (bxVar.q.i().collect(new bv(bxVar, 0), this) == aVar) {
                    return aVar;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f35854a == 0) {
            e.b.c.b(obj);
            bx bxVar2 = this.f35855b;
            ch chVar = bxVar2.w;
            bo boVar = new bo(bxVar2, null, 0);
            h.g.b.x.d(chVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
            this.f35854a = 1;
            if (kotlinx.coroutines.b.ai.e(chVar, boVar, this) == aVar2) {
                return aVar2;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new IllegalStateException("SharedFlow never completes, this call should never return.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bu(bx bxVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f35856c = i2;
        this.f35855b = bxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bu(bx bxVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f35856c = i2;
        this.f35855b = bxVar;
    }
}
