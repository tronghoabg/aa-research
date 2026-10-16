package defpackage;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class cdx extends cdw {
    private final cdw l;
    private boolean m;

    public cdx(long j, cej cejVar, afec afecVar, afec afecVar2, cdw cdwVar) {
        super(j, cejVar, afecVar, afecVar2);
        this.l = cdwVar;
        cdwVar.f();
    }

    private final void F() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.l.g();
    }

    @Override // defpackage.cdw
    public final ceg c() {
        cdx cdxVar;
        cdw cdwVar = this.l;
        if (cdwVar.f || cdwVar.j) {
            return new cee(this);
        }
        aap aapVar = this.g;
        long j = this.i;
        Map mapM = aapVar != null ? cek.m(cdwVar.v(), this, cdwVar.x()) : null;
        Object obj = cek.b;
        synchronized (obj) {
            cek.s(this);
            if (aapVar == null || aapVar.d == 0) {
                cdxVar = this;
                cdxVar.y();
            } else {
                cdxVar = this;
                ceg cegVarT = cdxVar.t(cdwVar.v(), aapVar, mapM, cdwVar.x());
                if (!affa.f(cegVarT, cef.a)) {
                    return cegVarT;
                }
                aap aapVarS = cdwVar.s();
                if (aapVarS != null) {
                    aapVarS.f(aapVar);
                } else {
                    cdwVar.u(aapVar);
                    cdxVar.g = null;
                }
            }
            if (affa.c(cdwVar.v(), j) < 0) {
                cdwVar.l();
            }
            cdwVar.A(cdwVar.x().b(j).a(cdxVar.d));
            cdwVar.o(j);
            int i = cdxVar.k;
            cdxVar.k = -1;
            if (i >= 0) {
                int[] iArr = cdwVar.e;
                iArr.getClass();
                int length = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                iArrCopyOf[length] = i;
                iArrCopyOf.getClass();
                cdwVar.e = iArrCopyOf;
            }
            cej cejVar = cdxVar.d;
            synchronized (obj) {
                cdwVar.d = cdwVar.d.c(cejVar);
                cdw cdwVar2 = cdxVar.l;
                int[] iArrCH = cdxVar.e;
                if (iArrCH.length != 0) {
                    int[] iArr2 = cdwVar2.e;
                    if (iArr2.length != 0) {
                        iArrCH = woy.cH(iArr2, iArrCH);
                    }
                    cdwVar2.e = iArrCH;
                }
            }
            cdxVar.f = true;
            cdxVar.F();
            return cef.a;
        }
    }

    @Override // defpackage.cdw, defpackage.cec
    public final void d() {
        if (this.j) {
            return;
        }
        super.d();
        F();
    }
}
