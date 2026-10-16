package S5;

import A7.B1;
import E5.T;
import J5.p;
import N2.i;
import S3.s;
import U8.v0;
import a.AbstractC1304a;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class b extends i {

    /* renamed from: o, reason: collision with root package name */
    public p f11012o;

    /* renamed from: p, reason: collision with root package name */
    public B1 f11013p;

    @Override // N2.i
    public final long c(Y4.b bVar) {
        byte[] bArr = bVar.f16679a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i5 = (bArr[2] & ForkServer.ERROR) >> 4;
        if (i5 == 6 || i5 == 7) {
            bVar.B(4);
            bVar.w();
        }
        int iD0 = v0.d0(i5, bVar);
        bVar.A(0);
        return iD0;
    }

    @Override // N2.i
    public final boolean e(Y4.b bVar, long j8, s sVar) {
        byte[] bArr = bVar.f16679a;
        p pVar = this.f11012o;
        if (pVar == null) {
            p pVar2 = new p(bArr, 17, 0);
            this.f11012o = pVar2;
            sVar.f11009b = pVar2.d(Arrays.copyOfRange(bArr, 9, bVar.f16681c), null);
            return true;
        }
        byte b5 = bArr[0];
        if ((b5 & 127) != 3) {
            if (b5 != -1) {
                return true;
            }
            B1 b12 = this.f11013p;
            if (b12 != null) {
                b12.f423b = j8;
                sVar.f11010c = b12;
            }
            ((T) sVar.f11009b).getClass();
            return false;
        }
        S3.e eVarH = AbstractC1304a.H(bVar);
        p pVar3 = new p(pVar.f5660b, pVar.f5661c, pVar.f5662d, pVar.f5663e, pVar.f5664f, pVar.f5666h, pVar.f5667i, pVar.k, eVarH, (W5.c) pVar.f5670m);
        this.f11012o = pVar3;
        B1 b13 = new B1(2);
        b13.f425d = pVar3;
        b13.f426e = eVarH;
        b13.f423b = -1L;
        b13.f424c = -1L;
        this.f11013p = b13;
        return true;
    }

    @Override // N2.i
    public final void f(boolean z2) {
        super.f(z2);
        if (z2) {
            this.f11012o = null;
            this.f11013p = null;
        }
    }
}
