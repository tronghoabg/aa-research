package I2;

import J5.y;
import N1.A;
import N1.B;
import Q1.o;
import Q1.u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends ic.d {

    /* renamed from: b, reason: collision with root package name */
    public final o f5285b = new o();

    /* renamed from: c, reason: collision with root package name */
    public final y f5286c = new y(1);

    /* renamed from: d, reason: collision with root package name */
    public u f5287d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ic.d
    public final B p(B2.a aVar, ByteBuffer byteBuffer) {
        int i5;
        A gVar;
        int i10;
        long j8;
        int i11;
        long j10;
        long j11;
        boolean z2;
        boolean z10;
        boolean z11;
        int iA;
        int iU;
        int iU2;
        long jW;
        int i12;
        List list;
        long j12;
        long j13;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i13;
        int i14;
        int iU3;
        char c10;
        long j14;
        boolean z16;
        int i15 = 1;
        u uVar = this.f5287d;
        if (uVar == null || aVar.f1573j != uVar.e()) {
            u uVar2 = new u(aVar.f11360g);
            this.f5287d = uVar2;
            uVar2.a(aVar.f11360g - aVar.f1573j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        o oVar = this.f5285b;
        oVar.E(iLimit, bArrArray);
        y yVar = this.f5286c;
        yVar.o(iLimit, bArrArray);
        yVar.t(39);
        long jI = (yVar.i(1) << 32) | yVar.i(32);
        yVar.t(20);
        int i16 = yVar.i(12);
        int i17 = yVar.i(8);
        oVar.H(14);
        if (i17 == 0) {
            i5 = 1;
            gVar = new g();
        } else if (i17 != 255) {
            long j15 = 1;
            long jW2 = -9223372036854775807L;
            if (i17 == 4) {
                int iU4 = oVar.u();
                ArrayList arrayList = new ArrayList(iU4);
                int i18 = 0;
                while (i18 < iU4) {
                    long jW3 = oVar.w();
                    boolean z17 = (oVar.u() & 128) != 0 ? i15 : 0;
                    ArrayList arrayList2 = new ArrayList();
                    if (z17 == 0) {
                        int iU5 = oVar.u();
                        int i19 = (iU5 & 128) != 0 ? i15 : 0;
                        int i20 = (iU5 & 64) != 0 ? i15 : 0;
                        int i21 = (iU5 & 32) != 0 ? i15 : 0;
                        long jW4 = i20 != 0 ? oVar.w() : -9223372036854775807L;
                        if (i20 == 0) {
                            int iU6 = oVar.u();
                            ArrayList arrayList3 = new ArrayList(iU6);
                            int i22 = 0;
                            while (i22 < iU6) {
                                arrayList3.add(new h(oVar.u(), oVar.w()));
                                i22++;
                                i18 = i18;
                                j15 = j15;
                                i15 = i15;
                            }
                            arrayList2 = arrayList3;
                        }
                        i10 = i15;
                        j8 = j15;
                        i11 = i18;
                        if (i21 != 0) {
                            long jU = oVar.u();
                            i12 = (jU & 128) != 0 ? i10 : 0;
                            jW = ((((jU & j8) << 32) | oVar.w()) * 1000) / 90;
                        } else {
                            jW = -9223372036854775807L;
                            i12 = 0;
                        }
                        z11 = i12;
                        j11 = jW;
                        iA = oVar.A();
                        z2 = i19;
                        z10 = i20;
                        j10 = jW4;
                        iU = oVar.u();
                        iU2 = oVar.u();
                    } else {
                        i10 = i15;
                        j8 = j15;
                        i11 = i18;
                        j10 = -9223372036854775807L;
                        j11 = -9223372036854775807L;
                        z2 = 0;
                        z10 = 0;
                        z11 = 0;
                        iA = 0;
                        iU = 0;
                        iU2 = 0;
                    }
                    arrayList.add(new i(jW3, z17, z2, z10, arrayList2, j10, z11, j11, iA, iU, iU2));
                    i18 = i11 + 1;
                    j15 = j8;
                    i15 = i10;
                }
                i5 = i15;
                gVar = new j(arrayList);
            } else if (i17 != 5) {
                if (i17 != 6) {
                    gVar = null;
                } else {
                    u uVar3 = this.f5287d;
                    long jC = k.c(jI, oVar);
                    gVar = new k(jC, uVar3.b(jC));
                }
                i5 = 1;
            } else {
                u uVar4 = this.f5287d;
                long jW5 = oVar.w();
                boolean z18 = (oVar.u() & 128) != 0;
                List list2 = Collections.EMPTY_LIST;
                if (z18) {
                    list = list2;
                    j12 = -9223372036854775807L;
                    j13 = -9223372036854775807L;
                    z12 = false;
                    z13 = false;
                    z14 = false;
                    z15 = false;
                    i13 = 0;
                    i14 = 0;
                    iU3 = 0;
                } else {
                    int iU7 = oVar.u();
                    boolean z19 = (iU7 & 128) != 0;
                    boolean z20 = (iU7 & 64) != 0;
                    boolean z21 = (iU7 & 32) != 0;
                    boolean z22 = (iU7 & 16) != 0;
                    long jC2 = (!z20 || z22) ? -9223372036854775807L : k.c(jI, oVar);
                    if (z20) {
                        c10 = ' ';
                        j14 = 90;
                    } else {
                        int iU8 = oVar.u();
                        c10 = ' ';
                        ArrayList arrayList4 = new ArrayList(iU8);
                        j14 = 90;
                        for (int i23 = 0; i23 < iU8; i23++) {
                            int iU9 = oVar.u();
                            long jC3 = !z22 ? k.c(jI, oVar) : -9223372036854775807L;
                            arrayList4.add(new e(iU9, jC3, uVar4.b(jC3)));
                        }
                        list2 = arrayList4;
                    }
                    if (z21) {
                        long jU2 = oVar.u();
                        z16 = (jU2 & 128) != 0;
                        jW2 = ((((jU2 & 1) << c10) | oVar.w()) * 1000) / j14;
                    } else {
                        z16 = false;
                    }
                    int iA2 = oVar.A();
                    int iU10 = oVar.u();
                    z15 = z16;
                    list = list2;
                    iU3 = oVar.u();
                    i13 = iA2;
                    i14 = iU10;
                    z12 = z19;
                    j13 = jW2;
                    j12 = jC2;
                    z14 = z22;
                    z13 = z20;
                }
                i5 = 1;
                gVar = new f(jW5, z18, z12, z13, z14, j12, uVar4.b(j12), list, z15, j13, i13, i14, iU3);
            }
        } else {
            i5 = 1;
            long jW6 = oVar.w();
            int i24 = i16 - 4;
            byte[] bArr = new byte[i24];
            oVar.f(0, i24, bArr);
            gVar = new a(jW6, bArr, jI);
        }
        if (gVar == null) {
            return new B(new A[0]);
        }
        A[] aArr = new A[i5];
        aArr[0] = gVar;
        return new B(aArr);
    }
}
