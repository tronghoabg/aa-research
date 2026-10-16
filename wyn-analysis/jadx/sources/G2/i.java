package G2;

import J5.y;
import N1.B;
import N1.C;
import Q1.x;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import l8.AbstractC3409K;
import l8.C3406H;
import l8.e0;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class i extends ic.d {

    /* renamed from: c, reason: collision with root package name */
    public static final F5.d f4183c = new F5.d(7);

    /* renamed from: b, reason: collision with root package name */
    public final g f4184b;

    public i(g gVar) {
        this.f4184b = gVar;
    }

    public static a P(Q1.o oVar, int i5, int i10) {
        int iH0;
        String strConcat;
        int iU = oVar.u();
        Charset charsetE0 = e0(iU);
        int i11 = i5 - 1;
        byte[] bArr = new byte[i11];
        oVar.f(0, i11, bArr);
        if (i10 == 2) {
            strConcat = "image/" + A6.h.O(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iH0 = 2;
        } else {
            iH0 = h0(0, bArr);
            String strO = A6.h.O(new String(bArr, 0, iH0, StandardCharsets.ISO_8859_1));
            strConcat = strO.indexOf(47) == -1 ? "image/".concat(strO) : strO;
        }
        int i12 = bArr[iH0 + 1] & ForkServer.ERROR;
        int i13 = iH0 + 2;
        int iG0 = g0(i13, iU, bArr);
        String str = new String(bArr, i13, iG0 - i13, charsetE0);
        int iD0 = d0(iU) + iG0;
        return new a(strConcat, str, i12, i11 <= iD0 ? x.f9729f : Arrays.copyOfRange(bArr, iD0, i11));
    }

    public static c Q(Q1.o oVar, int i5, int i10, boolean z2, int i11, g gVar) throws Throwable {
        int i12 = oVar.f9703b;
        int iH0 = h0(i12, oVar.f9702a);
        String str = new String(oVar.f9702a, i12, iH0 - i12, StandardCharsets.ISO_8859_1);
        oVar.G(iH0 + 1);
        int iH = oVar.h();
        int iH2 = oVar.h();
        long jW = oVar.w();
        if (jW == 4294967295L) {
            jW = -1;
        }
        long jW2 = oVar.w();
        long j8 = jW2 == 4294967295L ? -1L : jW2;
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i5;
        while (oVar.f9703b < i13) {
            j jVarT = T(i10, oVar, z2, i11, gVar);
            if (jVarT != null) {
                arrayList.add(jVarT);
            }
        }
        return new c(str, iH, iH2, jW, j8, (j[]) arrayList.toArray(new j[0]));
    }

    public static d R(Q1.o oVar, int i5, int i10, boolean z2, int i11, g gVar) throws Throwable {
        int i12 = oVar.f9703b;
        int iH0 = h0(i12, oVar.f9702a);
        String str = new String(oVar.f9702a, i12, iH0 - i12, StandardCharsets.ISO_8859_1);
        oVar.G(iH0 + 1);
        int iU = oVar.u();
        boolean z10 = (iU & 2) != 0;
        boolean z11 = (iU & 1) != 0;
        int iU2 = oVar.u();
        String[] strArr = new String[iU2];
        for (int i13 = 0; i13 < iU2; i13++) {
            int i14 = oVar.f9703b;
            int iH02 = h0(i14, oVar.f9702a);
            strArr[i13] = new String(oVar.f9702a, i14, iH02 - i14, StandardCharsets.ISO_8859_1);
            oVar.G(iH02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i5;
        while (oVar.f9703b < i15) {
            j jVarT = T(i10, oVar, z2, i11, gVar);
            if (jVarT != null) {
                arrayList.add(jVarT);
            }
        }
        return new d(str, z10, z11, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e S(int i5, Q1.o oVar) {
        if (i5 < 4) {
            return null;
        }
        int iU = oVar.u();
        Charset charsetE0 = e0(iU);
        byte[] bArr = new byte[3];
        oVar.f(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i10 = i5 - 4;
        byte[] bArr2 = new byte[i10];
        oVar.f(0, i10, bArr2);
        int iG0 = g0(0, iU, bArr2);
        String str2 = new String(bArr2, 0, iG0, charsetE0);
        int iD0 = d0(iU) + iG0;
        return new e(str, str2, X(bArr2, iD0, g0(iD0, iU, bArr2), charsetE0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0225 A[Catch: all -> 0x020a, Exception -> 0x020c, OutOfMemoryError -> 0x020e, TRY_LEAVE, TryCatch #7 {Exception -> 0x020c, OutOfMemoryError -> 0x020e, all -> 0x020a, blocks: (B:173:0x0205, B:186:0x0220, B:187:0x0225), top: B:203:0x01f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0247  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [G2.j] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20, types: [Q1.o] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static G2.j T(int r19, Q1.o r20, boolean r21, int r22, G2.g r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.i.T(int, Q1.o, boolean, int, G2.g):G2.j");
    }

    public static f U(int i5, Q1.o oVar) {
        int iU = oVar.u();
        Charset charsetE0 = e0(iU);
        int i10 = i5 - 1;
        byte[] bArr = new byte[i10];
        oVar.f(0, i10, bArr);
        int iH0 = h0(0, bArr);
        String strM = C.m(new String(bArr, 0, iH0, StandardCharsets.ISO_8859_1));
        int i11 = iH0 + 1;
        int iG0 = g0(i11, iU, bArr);
        String strX = X(bArr, i11, iG0, charsetE0);
        int iD0 = d0(iU) + iG0;
        int iG02 = g0(iD0, iU, bArr);
        String strX2 = X(bArr, iD0, iG02, charsetE0);
        int iD02 = d0(iU) + iG02;
        return new f(strM, strX, strX2, i10 <= iD02 ? x.f9729f : Arrays.copyOfRange(bArr, iD02, i10));
    }

    public static m V(int i5, Q1.o oVar) {
        int iA = oVar.A();
        int iX = oVar.x();
        int iX2 = oVar.x();
        int iU = oVar.u();
        int iU2 = oVar.u();
        y yVar = new y(1);
        yVar.p(oVar);
        int i10 = ((i5 - 10) * 8) / (iU + iU2);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = yVar.i(iU);
            int i13 = yVar.i(iU2);
            iArr[i11] = i12;
            iArr2[i11] = i13;
        }
        return new m(iA, iX, iX2, iArr, iArr2);
    }

    public static n W(int i5, Q1.o oVar) {
        byte[] bArr = new byte[i5];
        oVar.f(0, i5, bArr);
        int iH0 = h0(0, bArr);
        String str = new String(bArr, 0, iH0, StandardCharsets.ISO_8859_1);
        int i10 = iH0 + 1;
        return new n(str, i5 <= i10 ? x.f9729f : Arrays.copyOfRange(bArr, i10, i5));
    }

    public static String X(byte[] bArr, int i5, int i10, Charset charset) {
        return (i10 <= i5 || i10 > bArr.length) ? "" : new String(bArr, i5, i10 - i5, charset);
    }

    public static o Y(int i5, Q1.o oVar, String str) {
        if (i5 < 1) {
            return null;
        }
        int iU = oVar.u();
        int i10 = i5 - 1;
        byte[] bArr = new byte[i10];
        oVar.f(0, i10, bArr);
        return new o(str, null, Z(iU, 0, bArr));
    }

    public static e0 Z(int i5, int i10, byte[] bArr) {
        if (i10 >= bArr.length) {
            return AbstractC3409K.n("");
        }
        C3406H c3406hI = AbstractC3409K.i();
        int iG0 = g0(i10, i5, bArr);
        while (i10 < iG0) {
            c3406hI.a(new String(bArr, i10, iG0 - i10, e0(i5)));
            i10 = d0(i5) + iG0;
            iG0 = g0(i10, i5, bArr);
        }
        e0 e0VarG = c3406hI.g();
        return e0VarG.isEmpty() ? AbstractC3409K.n("") : e0VarG;
    }

    public static o a0(int i5, Q1.o oVar) {
        if (i5 < 1) {
            return null;
        }
        int iU = oVar.u();
        int i10 = i5 - 1;
        byte[] bArr = new byte[i10];
        oVar.f(0, i10, bArr);
        int iG0 = g0(0, iU, bArr);
        return new o("TXXX", new String(bArr, 0, iG0, e0(iU)), Z(iU, d0(iU) + iG0, bArr));
    }

    public static p b0(int i5, Q1.o oVar, String str) {
        byte[] bArr = new byte[i5];
        oVar.f(0, i5, bArr);
        return new p(str, null, new String(bArr, 0, h0(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static p c0(int i5, Q1.o oVar) {
        if (i5 < 1) {
            return null;
        }
        int iU = oVar.u();
        int i10 = i5 - 1;
        byte[] bArr = new byte[i10];
        oVar.f(0, i10, bArr);
        int iG0 = g0(0, iU, bArr);
        String str = new String(bArr, 0, iG0, e0(iU));
        int iD0 = d0(iU) + iG0;
        return new p("WXXX", str, X(bArr, iD0, h0(iD0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int d0(int i5) {
        return (i5 == 0 || i5 == 3) ? 1 : 2;
    }

    public static Charset e0(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String f0(int i5, int i10, int i11, int i12, int i13) {
        return i5 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int g0(int i5, int i10, byte[] bArr) {
        int iH0 = h0(i5, bArr);
        if (i10 == 0 || i10 == 3) {
            return iH0;
        }
        while (iH0 < bArr.length - 1) {
            if ((iH0 - i5) % 2 == 0 && bArr[iH0 + 1] == 0) {
                return iH0;
            }
            iH0 = h0(iH0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int h0(int i5, byte[] bArr) {
        while (i5 < bArr.length) {
            if (bArr[i5] == 0) {
                return i5;
            }
            i5++;
        }
        return bArr.length;
    }

    public static int i0(int i5, Q1.o oVar) {
        byte[] bArr = oVar.f9702a;
        int i10 = oVar.f9703b;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10 + i5) {
                return i5;
            }
            if ((bArr[i11] & ForkServer.ERROR) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i5 - (i11 - i10)) - 2);
                i5--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j0(Q1.o r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f9703b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.h()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.w()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.A()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.x()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.x()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.G(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.G(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.G(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.G(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.H(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.G(r2)
            return r4
        Lb0:
            r1.G(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.i.j0(Q1.o, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final N1.B O(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.i.O(int, byte[]):N1.B");
    }

    @Override // ic.d
    public final B p(B2.a aVar, ByteBuffer byteBuffer) {
        return O(byteBuffer.limit(), byteBuffer.array());
    }
}
