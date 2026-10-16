package e.a.e;

import com.waze.sharedui.web.as;
import e.a.k;
import h.ab;
import h.g.a.p;
import h.g.b.o;
import kotlinx.coroutines.af;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f47356a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f47357b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f47358c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f47359d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f47360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(as asVar, k kVar, com.waze.cf.d.c cVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f47360e = i2;
        this.f47358c = asVar;
        this.f47357b = kVar;
        this.f47359d = cVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlinx.coroutines.br] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f47360e == 0) {
            return new c((as) this.f47358c, this.f47357b, (com.waze.cf.d.c) this.f47359d, eVar, 0);
        }
        return new c((br) this.f47359d, (Exception) this.f47358c, this.f47357b, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f47360e != 0 ? ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlinx.coroutines.br] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Exception {
        if (this.f47360e != 0) {
            Object obj2 = h.c.a.a.f48038a;
            if (this.f47356a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ?? r5 = this.f47359d;
                Object obj3 = this.f47358c;
                this.f47356a = 1;
                o.n(r5, (Throwable) obj3);
                Object objM = r5.m(this);
                if (objM != obj2) {
                    objM = ab.f48028a;
                }
                if (objM == obj2) {
                    return obj2;
                }
            }
            this.f47357b.a("Collection of responses completed exceptionally", (Throwable) this.f47358c);
            return ab.f48028a;
        }
        h.c.a.a aVar = h.c.a.a.f48038a;
        try {
            if (this.f47356a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj4 = this.f47358c;
                k kVar = this.f47357b;
                c cVar = this;
                this.f47356a = 1;
                if (((as) obj4).j(kVar) == aVar) {
                    return aVar;
                }
            }
            this.f47357b.b();
            return ab.f48028a;
        } catch (Exception e2) {
            this.f47357b.a("Collection of requests completed exceptionally", e2);
            throw e2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(br brVar, Exception exc, k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f47360e = i2;
        this.f47359d = brVar;
        this.f47358c = exc;
        this.f47357b = kVar;
    }
}
