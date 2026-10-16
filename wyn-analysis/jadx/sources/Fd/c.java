package Fd;

import Ef.H;
import Ef.I0;
import Jd.B;
import Jd.n;
import Jd.r;
import Jd.s;
import ff.o;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c implements r {

    /* renamed from: a, reason: collision with root package name */
    public final B f4045a = new B();

    /* renamed from: b, reason: collision with root package name */
    public s f4046b = s.f6065b;

    /* renamed from: c, reason: collision with root package name */
    public final n f4047c = new n(8);

    /* renamed from: d, reason: collision with root package name */
    public Object f4048d = Hd.b.f5006a;

    /* renamed from: e, reason: collision with root package name */
    public I0 f4049e = H.f();

    /* renamed from: f, reason: collision with root package name */
    public final Nd.d f4050f = new Nd.d();

    @Override // Jd.r
    public final n a() {
        return this.f4047c;
    }

    public final void b(Sd.a aVar) {
        Nd.d dVar = this.f4050f;
        if (aVar != null) {
            dVar.e(h.f4077a, aVar);
            return;
        }
        Nd.a key = h.f4077a;
        dVar.getClass();
        AbstractC3340k.e(key, "key");
        dVar.c().remove(key);
    }

    public final void c(s sVar) {
        AbstractC3340k.e(sVar, "<set-?>");
        this.f4046b = sVar;
    }

    public final void d(c builder) {
        AbstractC3340k.e(builder, "builder");
        this.f4046b = builder.f4046b;
        this.f4048d = builder.f4048d;
        Nd.a aVar = h.f4077a;
        Nd.d dVar = builder.f4050f;
        b((Sd.a) dVar.d(aVar));
        B b5 = this.f4045a;
        xg.g.U(b5, builder.f4045a);
        List list = b5.f6014h;
        AbstractC3340k.e(list, "<set-?>");
        b5.f6014h = list;
        xg.g.l(this.f4047c, builder.f4047c);
        Nd.d dVar2 = this.f4050f;
        AbstractC3340k.e(dVar2, "<this>");
        for (Nd.a aVar2 : o.S0(dVar.c().keySet())) {
            AbstractC3340k.c(aVar2, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            dVar2.e(aVar2, dVar.b(aVar2));
        }
    }
}
