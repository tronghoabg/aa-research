package vd;

import java.util.List;
import md.AbstractC3537e;
import md.AbstractC3556y;
import md.C3552u;
import md.EnumC3545m;
import md.M;
import md.O;
import od.C3700k1;

/* renamed from: vd.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4341d extends AbstractC4338a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47160a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f47161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f47162c;

    public C4341d(C4342e c4342e) {
        this.f47162c = c4342e;
    }

    @Override // vd.AbstractC4338a, md.AbstractC3556y
    public AbstractC3537e b(Dd.c cVar) {
        switch (this.f47160a) {
            case 1:
                h hVar = (h) this.f47161b;
                r rVar = (r) this.f47162c;
                q qVar = new q(rVar, cVar, hVar);
                List list = (List) cVar.f2642b;
                if (r.g(list) && rVar.f47217f.containsKey(((C3552u) list.get(0)).f40728a.get(0))) {
                    k kVar = (k) rVar.f47217f.get(((C3552u) list.get(0)).f40728a.get(0));
                    kVar.a(qVar);
                    if (kVar.f47191d != null) {
                        qVar.t();
                    }
                }
                return qVar;
            default:
                return super.b(cVar);
        }
    }

    @Override // vd.AbstractC4338a, md.AbstractC3556y
    public final void l(EnumC3545m enumC3545m, M m10) {
        switch (this.f47160a) {
            case 0:
                O o7 = (O) this.f47161b;
                C4342e c4342e = (C4342e) this.f47162c;
                O o10 = c4342e.k;
                EnumC3545m enumC3545m2 = EnumC3545m.f40693b;
                if (o7 != o10) {
                    if (o7 == c4342e.f47167i) {
                        boolean z2 = enumC3545m == enumC3545m2;
                        c4342e.f47171n = z2;
                        if (!z2 && o10 != c4342e.f47164f) {
                            c4342e.h();
                            break;
                        } else {
                            c4342e.f47165g.l(enumC3545m, m10);
                            break;
                        }
                    }
                } else {
                    Fe.e.w("there's pending lb while current lb has been out of READY", c4342e.f47171n);
                    c4342e.f47169l = enumC3545m;
                    c4342e.f47170m = m10;
                    if (enumC3545m == enumC3545m2) {
                        c4342e.h();
                        break;
                    }
                }
                break;
            default:
                ((h) this.f47161b).l(enumC3545m, new C3700k1(m10));
                break;
        }
    }

    @Override // vd.AbstractC4338a
    public final AbstractC3556y m() {
        switch (this.f47160a) {
            case 0:
                return ((C4342e) this.f47162c).f47165g;
            default:
                return (h) this.f47161b;
        }
    }

    public C4341d(r rVar, AbstractC3556y abstractC3556y) {
        this.f47162c = rVar;
        this.f47161b = new h(abstractC3556y, 0);
    }
}
