package e.a.f;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import e.a.cm;
import e.a.d.kg;
import e.a.ee;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r implements e.a.d.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f47718a;

    r(t tVar) {
        Objects.requireNonNull(tVar);
        this.f47718a = tVar;
    }

    @Override // e.a.d.a
    public final void a(ee eeVar) {
        int i2 = e.b.b.f47862a;
        t tVar = this.f47718a;
        synchronized (tVar.f47736f.f47721c) {
            tVar.f47736f.L(eeVar, true, null);
        }
    }

    @Override // e.a.d.a
    public final void b(kg kgVar, boolean z, boolean z2, int i2) {
        k.h hVarE;
        int i3 = e.b.b.f47862a;
        if (kgVar == null) {
            hVarE = t.f47731a;
        } else {
            hVarE = ((ak) kgVar).e();
            int iQ = (int) hVarE.q();
            if (iQ > 0) {
                this.f47718a.y(iQ);
            }
        }
        t tVar = this.f47718a;
        synchronized (tVar.f47736f.f47721c) {
            s.F(tVar.f47736f, hVarE, z, z2);
            tVar.r().e(i2);
        }
    }

    @Override // e.a.d.a
    public final void c(cm cmVar) {
        int i2 = e.b.b.f47862a;
        t tVar = this.f47718a;
        String str = DomExceptionUtils.SEPARATOR + tVar.f47732b.f();
        synchronized (tVar.f47736f.f47721c) {
            s.G(tVar.f47736f, cmVar, str);
        }
    }
}
