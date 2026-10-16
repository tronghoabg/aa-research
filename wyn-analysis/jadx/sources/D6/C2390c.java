package d6;

import J5.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u6.t;

/* renamed from: d6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2390c extends ic.d {

    /* renamed from: b, reason: collision with root package name */
    public final Y4.b f34078b = new Y4.b();

    /* renamed from: c, reason: collision with root package name */
    public final y f34079c = new y(6);

    /* renamed from: d, reason: collision with root package name */
    public t f34080d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ic.d
    public final W5.c r(W5.e eVar, ByteBuffer byteBuffer) {
        int i5;
        W5.b c2393f;
        int i10;
        long j8;
        int i11;
        long j10;
        long j11;
        boolean z2;
        boolean z10;
        boolean z11;
        int iV;
        int iQ;
        int iQ2;
        long jR;
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
        int iQ3;
        char c10;
        long j14;
        boolean z16;
        int i15 = 1;
        t tVar = this.f34080d;
        if (tVar == null || eVar.f15152i != tVar.d()) {
            t tVar2 = new t(eVar.f4919f);
            this.f34080d = tVar2;
            tVar2.a(eVar.f4919f - eVar.f15152i);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        Y4.b bVar = this.f34078b;
        bVar.y(iLimit, bArrArray);
        y yVar = this.f34079c;
        yVar.o(iLimit, bArrArray);
        yVar.t(39);
        long jI = (yVar.i(1) << 32) | yVar.i(32);
        yVar.t(20);
        int i16 = yVar.i(12);
        int i17 = yVar.i(8);
        bVar.B(14);
        if (i17 == 0) {
            i5 = 1;
            c2393f = new C2393f();
        } else if (i17 != 255) {
            long j15 = 1;
            long jR2 = -9223372036854775807L;
            if (i17 == 4) {
                int iQ4 = bVar.q();
                ArrayList arrayList = new ArrayList(iQ4);
                int i18 = 0;
                while (i18 < iQ4) {
                    long jR3 = bVar.r();
                    boolean z17 = (bVar.q() & 128) != 0 ? i15 : 0;
                    ArrayList arrayList2 = new ArrayList();
                    if (z17 == 0) {
                        int iQ5 = bVar.q();
                        int i19 = (iQ5 & 128) != 0 ? i15 : 0;
                        int i20 = (iQ5 & 64) != 0 ? i15 : 0;
                        int i21 = (iQ5 & 32) != 0 ? i15 : 0;
                        long jR4 = i20 != 0 ? bVar.r() : -9223372036854775807L;
                        if (i20 == 0) {
                            int iQ6 = bVar.q();
                            ArrayList arrayList3 = new ArrayList(iQ6);
                            int i22 = 0;
                            while (i22 < iQ6) {
                                arrayList3.add(new C2394g(bVar.q(), bVar.r()));
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
                            long jQ = bVar.q();
                            i12 = (jQ & 128) != 0 ? i10 : 0;
                            jR = ((((jQ & j8) << 32) | bVar.r()) * 1000) / 90;
                        } else {
                            jR = -9223372036854775807L;
                            i12 = 0;
                        }
                        z11 = i12;
                        j11 = jR;
                        iV = bVar.v();
                        z2 = i19;
                        z10 = i20;
                        j10 = jR4;
                        iQ = bVar.q();
                        iQ2 = bVar.q();
                    } else {
                        i10 = i15;
                        j8 = j15;
                        i11 = i18;
                        j10 = -9223372036854775807L;
                        j11 = -9223372036854775807L;
                        z2 = 0;
                        z10 = 0;
                        z11 = 0;
                        iV = 0;
                        iQ = 0;
                        iQ2 = 0;
                    }
                    arrayList.add(new C2395h(jR3, z17, z2, z10, arrayList2, j10, z11, j11, iV, iQ, iQ2));
                    i18 = i11 + 1;
                    j15 = j8;
                    i15 = i10;
                }
                i5 = i15;
                c2393f = new C2396i(arrayList);
            } else if (i17 != 5) {
                if (i17 != 6) {
                    c2393f = null;
                } else {
                    t tVar3 = this.f34080d;
                    long jC = C2397j.c(jI, bVar);
                    c2393f = new C2397j(jC, tVar3.b(jC));
                }
                i5 = 1;
            } else {
                t tVar4 = this.f34080d;
                long jR5 = bVar.r();
                boolean z18 = (bVar.q() & 128) != 0;
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
                    iQ3 = 0;
                } else {
                    int iQ7 = bVar.q();
                    boolean z19 = (iQ7 & 128) != 0;
                    boolean z20 = (iQ7 & 64) != 0;
                    boolean z21 = (iQ7 & 32) != 0;
                    boolean z22 = (iQ7 & 16) != 0;
                    long jC2 = (!z20 || z22) ? -9223372036854775807L : C2397j.c(jI, bVar);
                    if (z20) {
                        c10 = ' ';
                        j14 = 90;
                    } else {
                        int iQ8 = bVar.q();
                        c10 = ' ';
                        ArrayList arrayList4 = new ArrayList(iQ8);
                        j14 = 90;
                        for (int i23 = 0; i23 < iQ8; i23++) {
                            int iQ9 = bVar.q();
                            long jC3 = !z22 ? C2397j.c(jI, bVar) : -9223372036854775807L;
                            arrayList4.add(new C2391d(iQ9, jC3, tVar4.b(jC3)));
                        }
                        list2 = arrayList4;
                    }
                    if (z21) {
                        long jQ2 = bVar.q();
                        z16 = (jQ2 & 128) != 0;
                        jR2 = ((((jQ2 & 1) << c10) | bVar.r()) * 1000) / j14;
                    } else {
                        z16 = false;
                    }
                    int iV2 = bVar.v();
                    int iQ10 = bVar.q();
                    z15 = z16;
                    list = list2;
                    iQ3 = bVar.q();
                    i13 = iV2;
                    i14 = iQ10;
                    z12 = z19;
                    j13 = jR2;
                    j12 = jC2;
                    z14 = z22;
                    z13 = z20;
                }
                i5 = 1;
                c2393f = new C2392e(jR5, z18, z12, z13, z14, j12, tVar4.b(j12), list, z15, j13, i13, i14, iQ3);
            }
        } else {
            i5 = 1;
            long jR6 = bVar.r();
            int i24 = i16 - 4;
            byte[] bArr = new byte[i24];
            bVar.c(0, i24, bArr);
            c2393f = new C2388a(jR6, bArr, jI);
        }
        if (c2393f == null) {
            return new W5.c(new W5.b[0]);
        }
        W5.b[] bVarArr = new W5.b[i5];
        bVarArr[0] = c2393f;
        return new W5.c(bVarArr);
    }
}
