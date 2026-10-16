package R5;

import E5.o0;
import android.util.Pair;
import k8.AbstractC3198g;
import u6.v;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f10260a;

    static {
        int i5 = v.f46721a;
        f10260a = "OpusHead".getBytes(AbstractC3198g.f39301c);
    }

    public static M2.b a(int i5, Y4.b bVar) {
        bVar.A(i5 + 12);
        bVar.B(1);
        b(bVar);
        bVar.B(2);
        int iQ = bVar.q();
        if ((iQ & 128) != 0) {
            bVar.B(2);
        }
        if ((iQ & 64) != 0) {
            bVar.B(bVar.q());
        }
        if ((iQ & 32) != 0) {
            bVar.B(2);
        }
        bVar.B(1);
        b(bVar);
        String strC = u6.k.c(bVar.q());
        if ("audio/mpeg".equals(strC) || "audio/vnd.dts".equals(strC) || "audio/vnd.dts.hd".equals(strC)) {
            return new M2.b(strC, null, -1L, -1L);
        }
        bVar.B(4);
        long jR = bVar.r();
        long jR2 = bVar.r();
        bVar.B(1);
        int iB = b(bVar);
        long j8 = jR2;
        byte[] bArr = new byte[iB];
        bVar.c(0, iB, bArr);
        if (j8 <= 0) {
            j8 = -1;
        }
        return new M2.b(strC, bArr, j8, jR > 0 ? jR : -1L);
    }

    public static int b(Y4.b bVar) {
        int iQ = bVar.q();
        int i5 = iQ & 127;
        while ((iQ & 128) == 128) {
            iQ = bVar.q();
            i5 = (i5 << 7) | (iQ & 127);
        }
        return i5;
    }

    public static Pair c(Y4.b bVar, int i5, int i10) throws o0 {
        Integer num;
        o oVar;
        Pair pairCreate;
        int i11;
        int i12;
        Integer num2;
        boolean z2;
        int i13 = bVar.f16680b;
        while (i13 - i5 < i10) {
            bVar.A(i13);
            int iD = bVar.d();
            S3.f.k("childAtomSize must be positive", iD > 0);
            if (bVar.d() == 1936289382) {
                int i14 = i13 + 8;
                int i15 = 0;
                int i16 = -1;
                Integer numValueOf = null;
                String strO = null;
                while (i14 - i13 < iD) {
                    bVar.A(i14);
                    int iD2 = bVar.d();
                    int iD3 = bVar.d();
                    if (iD3 == 1718775137) {
                        numValueOf = Integer.valueOf(bVar.d());
                    } else if (iD3 == 1935894637) {
                        bVar.B(4);
                        strO = bVar.o(4, AbstractC3198g.f39301c);
                    } else if (iD3 == 1935894633) {
                        i16 = i14;
                        i15 = iD2;
                    }
                    i14 += iD2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strO) || "cbc1".equals(strO) || "cens".equals(strO) || "cbcs".equals(strO)) {
                    S3.f.k("frma atom is mandatory", numValueOf != null);
                    S3.f.k("schi atom is mandatory", i16 != -1);
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            num = numValueOf;
                            oVar = null;
                            break;
                        }
                        bVar.A(i17);
                        int iD4 = bVar.d();
                        if (bVar.d() == 1952804451) {
                            int iN = H5.a.n(bVar.d());
                            bVar.B(1);
                            if (iN == 0) {
                                bVar.B(1);
                                i12 = 0;
                                i11 = 0;
                            } else {
                                int iQ = bVar.q();
                                i11 = iQ & 15;
                                i12 = (iQ & 240) >> 4;
                            }
                            if (bVar.q() == 1) {
                                num2 = numValueOf;
                                z2 = true;
                            } else {
                                num2 = numValueOf;
                                z2 = false;
                            }
                            int iQ2 = bVar.q();
                            byte[] bArr2 = new byte[16];
                            bVar.c(0, 16, bArr2);
                            if (z2 && iQ2 == 0) {
                                int iQ3 = bVar.q();
                                byte[] bArr3 = new byte[iQ3];
                                bVar.c(0, iQ3, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            oVar = new o(z2, strO, iQ2, bArr2, i12, i11, bArr);
                        } else {
                            i17 += iD4;
                        }
                    }
                    S3.f.k("tenc atom is mandatory", oVar != null);
                    int i18 = v.f46721a;
                    pairCreate = Pair.create(num, oVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i13 += iD;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static R5.p d(R5.n r38, R5.a r39, J5.q r40) throws E5.o0 {
        /*
            Method dump skipped, instructions count: 1346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R5.d.d(R5.n, R5.a, J5.q):R5.p");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
    
        r28 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0cbd  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0d88  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0d8c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList e(R5.a r71, J5.q r72, long r73, I5.c r75, boolean r76, boolean r77, k8.InterfaceC3199h r78) throws E5.o0 {
        /*
            Method dump skipped, instructions count: 3564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R5.d.e(R5.a, J5.q, long, I5.c, boolean, boolean, k8.h):java.util.ArrayList");
    }
}
