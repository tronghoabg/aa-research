package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class dma extends ebx {
    final /* synthetic */ dme a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dma(dme dmeVar) {
        super(1);
        this.a = dmeVar;
    }

    @Override // defpackage.ebx
    public final ecy b(ecy ecyVar, List list) {
        return this.a.k(ecyVar);
    }

    @Override // defpackage.ebx
    public final ebw c(lds ldsVar, ebw ebwVar) {
        cyc cycVarP = this.a.v.p();
        if (cycVarP.t()) {
            long jS = dlf.s(cycVarP.j(0L));
            int iA = dlo.a(jS);
            if (iA < 0) {
                iA = 0;
            }
            int iB = dlo.b(jS);
            if (iB < 0) {
                iB = 0;
            }
            long jH = crt.j(cycVarP).h();
            long j = jH >> 32;
            long j2 = jH & 4294967295L;
            long j3 = cycVarP.c;
            long jS2 = dlf.s(cycVarP.j((4294967295L & Float.floatToRawIntBits((int) (j3 & 4294967295L))) | (Float.floatToRawIntBits((int) (j3 >> 32)) << 32)));
            int iA2 = ((int) j) - dlo.a(jS2);
            if (iA2 < 0) {
                iA2 = 0;
            }
            int iB2 = ((int) j2) - dlo.b(jS2);
            int i = iB2 >= 0 ? iB2 : 0;
            if (iA != 0 || iB != 0 || iA2 != 0 || i != 0) {
                return new ebw(dme.m(ebwVar.a, iA, iB, iA2, i), dme.m(ebwVar.b, iA, iB, iA2, i));
            }
        }
        return ebwVar;
    }
}
