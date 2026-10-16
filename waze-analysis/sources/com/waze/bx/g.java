package com.waze.bx;

import androidx.media3.common.C;
import com.waze.an.a.ae;
import com.waze.an.a.k;
import com.waze.an.a.u;
import com.waze.an.c.q;
import com.waze.web.r;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f18186a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f18187b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f18188c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f18189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(com.waze.an.d.b bVar, k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18189d = i2;
        this.f18188c = bVar;
        this.f18187b = kVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.waze.an.d.b, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f18189d != 0) {
            return new g((com.waze.an.d.b) this.f18188c, (k) this.f18187b, eVar, 1);
        }
        return new g((i) this.f18187b, (com.waze.cg.c.p) this.f18188c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f18189d != 0 ? ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.waze.an.d.b, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f18189d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f18186a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f18186a = 1;
                if (aj.q(5000L, this) == aVar) {
                    return aVar;
                }
            }
            q.b(this.f18188c, new u("techcode-test", ae.f14546b), (k) this.f18187b, null, null, 28);
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f18186a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f18186a = 1;
            if (aj.q(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, this) == aVar2) {
                return aVar2;
            }
        }
        com.waze.cg.c.q qVar = (com.waze.cg.c.q) r.n(com.waze.cg.c.q.class);
        if (qVar != null) {
            i iVar = (i) this.f18187b;
            u uVar = new u(String.valueOf(iVar.f18199g), ae.f14554j);
            Object obj2 = this.f18188c;
            int i2 = iVar.f18199g;
            iVar.f18199g = i2 + 1;
            boolean z = i2 % 2 == 0;
            h.o.c cVar = h.o.a.f48264a;
            qVar.g(uVar, (com.waze.cg.c.p) obj2, z, h.o.c.i(7, h.o.d.f48273d), true, new com.waze.bw.c.d.a(4));
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(i iVar, com.waze.cg.c.p pVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18189d = i2;
        this.f18187b = iVar;
        this.f18188c = pVar;
    }
}
