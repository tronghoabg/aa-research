package com.waze.network.e;

import com.waze.network.b.ay;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import okhttp3.al;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    long f32236a;

    /* renamed from: b, reason: collision with root package name */
    int f32237b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ al f32238c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ m f32239d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(m mVar, al alVar, h.c.e eVar) {
        super(2, eVar);
        this.f32239d = mVar;
        this.f32238c = alVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f32239d, this.f32238c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        long j2;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f32237b != 0) {
            j2 = this.f32236a;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            m mVar = this.f32239d;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f32236a = jCurrentTimeMillis;
            this.f32237b = 1;
            obj = aj.J(m.e(mVar).a(), new k(mVar, null, 1, null), this);
            if (obj == aVar) {
                return aVar;
            }
            j2 = jCurrentTimeMillis;
        }
        com.waze.main_screen.p.a.a.a aVar2 = (com.waze.main_screen.p.a.a.a) obj;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j2;
        if (aVar2 instanceof com.waze.aq.m) {
            return ay.h(this.f32238c, "token_unavailable.".concat(((com.waze.aq.m) aVar2).a().b()), jCurrentTimeMillis2);
        }
        if (aVar2 instanceof com.waze.aq.n) {
            return ay.h(this.f32238c, ((com.waze.aq.n) aVar2).a(), jCurrentTimeMillis2);
        }
        if (aVar2 != null) {
            throw new h.i();
        }
        m mVar2 = this.f32239d;
        mVar2.f32257a.b("token generation timed out after ".concat(h.o.a.y(m.e(mVar2).a())));
        return ay.h(this.f32238c, "token_unavailable.".concat(com.waze.aq.f.f15464a.b()), jCurrentTimeMillis2);
    }
}
