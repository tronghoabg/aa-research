package N2;

import A7.B1;
import J5.p;
import N1.C0765n;
import Q1.o;
import Y2.B;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
import s2.AbstractC3991a;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: o, reason: collision with root package name */
    public p f8344o;

    /* renamed from: p, reason: collision with root package name */
    public B1 f8345p;

    @Override // N2.i
    public final long b(o oVar) {
        byte[] bArr = oVar.f9702a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i5 = (bArr[2] & ForkServer.ERROR) >> 4;
        if (i5 == 6 || i5 == 7) {
            oVar.H(4);
            oVar.B();
        }
        int iV = AbstractC3991a.v(i5, oVar);
        oVar.G(0);
        return iV;
    }

    @Override // N2.i
    public final boolean d(o oVar, long j8, S3.c cVar) {
        byte[] bArr = oVar.f9702a;
        p pVar = this.f8344o;
        if (pVar == null) {
            p pVar2 = new p(bArr, 17, 1);
            this.f8344o = pVar2;
            cVar.f10936b = pVar2.e(Arrays.copyOfRange(bArr, 9, oVar.f9704c), null);
            return true;
        }
        byte b5 = bArr[0];
        if ((b5 & 127) != 3) {
            if (b5 != -1) {
                return true;
            }
            B1 b12 = this.f8345p;
            if (b12 != null) {
                b12.f423b = j8;
                cVar.f10937c = b12;
            }
            ((C0765n) cVar.f10936b).getClass();
            return false;
        }
        B bW = AbstractC3991a.w(oVar);
        p pVar3 = new p(pVar.f5660b, pVar.f5661c, pVar.f5662d, pVar.f5663e, pVar.f5664f, pVar.f5666h, pVar.f5667i, pVar.k, bW, (N1.B) pVar.f5670m);
        this.f8344o = pVar3;
        B1 b13 = new B1(1);
        b13.f425d = pVar3;
        b13.f426e = bW;
        b13.f423b = -1L;
        b13.f424c = -1L;
        this.f8345p = b13;
        return true;
    }

    @Override // N2.i
    public final void f(boolean z2) {
        super.f(z2);
        if (z2) {
            this.f8344o = null;
            this.f8345p = null;
        }
    }
}
