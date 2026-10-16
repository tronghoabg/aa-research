package vd;

import md.AbstractC3537e;
import md.AbstractC3556y;
import md.EnumC3545m;
import md.M;
import md.N;
import md.O;

/* loaded from: classes5.dex */
public final class h extends AbstractC4338a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47177a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f47178b;

    public /* synthetic */ h(Object obj, int i5) {
        this.f47177a = i5;
        this.f47178b = obj;
    }

    @Override // vd.AbstractC4338a, md.AbstractC3556y
    public AbstractC3537e b(Dd.c cVar) {
        switch (this.f47177a) {
            case 0:
                N n10 = (N) cVar.G();
                AbstractC3537e abstractC3537eB = super.b(cVar);
                if (n10 != null) {
                    return abstractC3537eB.c().f40613a.get(O.f40593d) == null ? new g(abstractC3537eB, n10) : abstractC3537eB;
                }
                return abstractC3537eB;
            default:
                return super.b(cVar);
        }
    }

    @Override // vd.AbstractC4338a, md.AbstractC3556y
    public void l(EnumC3545m enumC3545m, M m10) {
        switch (this.f47177a) {
            case 1:
                i iVar = (i) this.f47178b;
                if (iVar.f47185g.f47228f.containsKey(iVar.f47179a)) {
                    iVar.f47182d = enumC3545m;
                    iVar.f47183e = m10;
                    if (!iVar.f47184f) {
                        v vVar = iVar.f47185g;
                        if (!vVar.f47230h) {
                            if (enumC3545m == EnumC3545m.f40695d) {
                                iVar.f47180b.e();
                            }
                            vVar.j();
                            break;
                        }
                    }
                }
                break;
            default:
                super.l(enumC3545m, m10);
                break;
        }
    }

    @Override // vd.AbstractC4338a
    public final AbstractC3556y m() {
        switch (this.f47177a) {
            case 0:
                return (AbstractC3556y) this.f47178b;
            default:
                return ((i) this.f47178b).f47185g.f47229g;
        }
    }
}
