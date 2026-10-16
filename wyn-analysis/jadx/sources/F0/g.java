package f0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class g extends G9.e {

    /* renamed from: e, reason: collision with root package name */
    public final n f34763e;

    /* renamed from: f, reason: collision with root package name */
    public final n f34764f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f34765g;

    public g(n nVar, n nVar2) {
        float[] fArrI;
        super(nVar, nVar2, (Object) null, 25);
        this.f34763e = nVar;
        this.f34764f = nVar2;
        p pVar = nVar.f34782d;
        p pVar2 = nVar2.f34782d;
        boolean zE = h.e(pVar, pVar2);
        float[] fArrI2 = nVar.f34787i;
        float[] fArrH = nVar2.f34788j;
        if (zE) {
            fArrI = h.i(fArrH, fArrI2);
        } else {
            p pVar3 = nVar.f34782d;
            float[] fArrA = pVar3.a();
            float[] fArrA2 = pVar2.a();
            p pVar4 = h.f34767b;
            boolean zE2 = h.e(pVar3, pVar4);
            float[] fArr = h.f34770e;
            float[] fArr2 = C2545a.f34731b.f34732a;
            if (!zE2) {
                float[] fArrCopyOf = Arrays.copyOf(fArr, 3);
                AbstractC3340k.d(fArrCopyOf, "copyOf(this, size)");
                fArrI2 = h.i(h.c(fArr2, fArrA, fArrCopyOf), fArrI2);
            }
            if (!h.e(pVar2, pVar4)) {
                float[] fArrCopyOf2 = Arrays.copyOf(fArr, 3);
                AbstractC3340k.d(fArrCopyOf2, "copyOf(this, size)");
                fArrH = h.h(h.i(h.c(fArr2, fArrA2, fArrCopyOf2), nVar2.f34787i));
            }
            fArrI = h.i(fArrH, fArrI2);
        }
        this.f34765g = fArrI;
    }

    @Override // G9.e
    public final void G(float[] fArr) {
        n nVar = this.f34763e;
        fArr[0] = (float) ((Number) nVar.f34791n.invoke(Double.valueOf(fArr[0]))).doubleValue();
        Double dValueOf = Double.valueOf(fArr[1]);
        m mVar = nVar.f34791n;
        fArr[1] = (float) ((Number) mVar.invoke(dValueOf)).doubleValue();
        fArr[2] = (float) ((Number) mVar.invoke(Double.valueOf(fArr[2]))).doubleValue();
        h.j(this.f34765g, fArr);
        n nVar2 = this.f34764f;
        Double dValueOf2 = Double.valueOf(fArr[0]);
        m mVar2 = nVar2.f34789l;
        fArr[0] = (float) ((Number) mVar2.invoke(dValueOf2)).doubleValue();
        fArr[1] = (float) ((Number) mVar2.invoke(Double.valueOf(fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) mVar2.invoke(Double.valueOf(fArr[2]))).doubleValue();
    }
}
