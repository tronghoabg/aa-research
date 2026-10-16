package b6;

import J5.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.apache.tika.fork.ForkServer;
import u6.v;

/* loaded from: classes3.dex */
public final class h extends ic.d {

    /* renamed from: c, reason: collision with root package name */
    public static final V1.c f19349c = new V1.c(17);

    /* renamed from: b, reason: collision with root package name */
    public final g f19350b;

    public h(g gVar) {
        this.f19350b = gVar;
    }

    public static C1516a P(Y4.b bVar, int i5, int i10) {
        int iG0;
        String strO;
        int iQ = bVar.q();
        String strD0 = d0(iQ);
        int i11 = i5 - 1;
        byte[] bArr = new byte[i11];
        bVar.c(0, i11, bArr);
        if (i10 == 2) {
            strO = "image/" + A6.h.O(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(strO)) {
                strO = "image/jpeg";
            }
            iG0 = 2;
        } else {
            iG0 = g0(0, bArr);
            strO = A6.h.O(new String(bArr, 0, iG0, "ISO-8859-1"));
            if (strO.indexOf(47) == -1) {
                strO = "image/".concat(strO);
            }
        }
        int i12 = bArr[iG0 + 1] & ForkServer.ERROR;
        int i13 = iG0 + 2;
        int iF0 = f0(i13, iQ, bArr);
        String str = new String(bArr, i13, iF0 - i13, strD0);
        int iC0 = c0(iQ) + iF0;
        return new C1516a(strO, str, i12, i11 <= iC0 ? v.f46726f : Arrays.copyOfRange(bArr, iC0, i11));
    }

    public static c Q(Y4.b bVar, int i5, int i10, boolean z2, int i11, g gVar) throws Throwable {
        int i12 = bVar.f16680b;
        int iG0 = g0(i12, bVar.f16679a);
        String str = new String(bVar.f16679a, i12, iG0 - i12, "ISO-8859-1");
        bVar.A(iG0 + 1);
        int iD = bVar.d();
        int iD2 = bVar.d();
        long jR = bVar.r();
        if (jR == 4294967295L) {
            jR = -1;
        }
        long jR2 = bVar.r();
        long j8 = jR2 == 4294967295L ? -1L : jR2;
        ArrayList arrayList = new ArrayList();
        int i13 = i12 + i5;
        while (bVar.f16680b < i13) {
            i iVarT = T(i10, bVar, z2, i11, gVar);
            if (iVarT != null) {
                arrayList.add(iVarT);
            }
        }
        return new c(str, iD, iD2, jR, j8, (i[]) arrayList.toArray(new i[0]));
    }

    public static d R(Y4.b bVar, int i5, int i10, boolean z2, int i11, g gVar) throws Throwable {
        int i12 = bVar.f16680b;
        int iG0 = g0(i12, bVar.f16679a);
        String str = new String(bVar.f16679a, i12, iG0 - i12, "ISO-8859-1");
        bVar.A(iG0 + 1);
        int iQ = bVar.q();
        boolean z10 = (iQ & 2) != 0;
        boolean z11 = (iQ & 1) != 0;
        int iQ2 = bVar.q();
        String[] strArr = new String[iQ2];
        for (int i13 = 0; i13 < iQ2; i13++) {
            int i14 = bVar.f16680b;
            int iG02 = g0(i14, bVar.f16679a);
            strArr[i13] = new String(bVar.f16679a, i14, iG02 - i14, "ISO-8859-1");
            bVar.A(iG02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i5;
        while (bVar.f16680b < i15) {
            i iVarT = T(i10, bVar, z2, i11, gVar);
            if (iVarT != null) {
                arrayList.add(iVarT);
            }
        }
        return new d(str, z10, z11, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e S(int i5, Y4.b bVar) {
        if (i5 < 4) {
            return null;
        }
        int iQ = bVar.q();
        String strD0 = d0(iQ);
        byte[] bArr = new byte[3];
        bVar.c(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i10 = i5 - 4;
        byte[] bArr2 = new byte[i10];
        bVar.c(0, i10, bArr2);
        int iF0 = f0(0, iQ, bArr2);
        String str2 = new String(bArr2, 0, iF0, strD0);
        int iC0 = c0(iQ) + iF0;
        return new e(str, str2, X(iC0, f0(iC0, iQ, bArr2), strD0, bArr2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0214 A[Catch: all -> 0x01fd, UnsupportedEncodingException -> 0x0245, TryCatch #2 {UnsupportedEncodingException -> 0x0245, blocks: (B:177:0x0226, B:164:0x01f8, B:174:0x020f, B:175:0x0214), top: B:190:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0226 A[Catch: all -> 0x01fd, UnsupportedEncodingException -> 0x0245, TRY_LEAVE, TryCatch #2 {UnsupportedEncodingException -> 0x0245, blocks: (B:177:0x0226, B:164:0x01f8, B:174:0x020f, B:175:0x0214), top: B:190:0x0112 }] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [Y4.b] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [Y4.b] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static b6.i T(int r20, Y4.b r21, boolean r22, int r23, b6.g r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.h.T(int, Y4.b, boolean, int, b6.g):b6.i");
    }

    public static f U(int i5, Y4.b bVar) {
        int iQ = bVar.q();
        String strD0 = d0(iQ);
        int i10 = i5 - 1;
        byte[] bArr = new byte[i10];
        bVar.c(0, i10, bArr);
        int iG0 = g0(0, bArr);
        String str = new String(bArr, 0, iG0, "ISO-8859-1");
        int i11 = iG0 + 1;
        int iF0 = f0(i11, iQ, bArr);
        String strX = X(i11, iF0, strD0, bArr);
        int iC0 = c0(iQ) + iF0;
        int iF02 = f0(iC0, iQ, bArr);
        String strX2 = X(iC0, iF02, strD0, bArr);
        int iC02 = c0(iQ) + iF02;
        return new f(str, strX, strX2, i10 <= iC02 ? v.f46726f : Arrays.copyOfRange(bArr, iC02, i10));
    }

    public static k V(int i5, Y4.b bVar) {
        int iV = bVar.v();
        int iS = bVar.s();
        int iS2 = bVar.s();
        int iQ = bVar.q();
        int iQ2 = bVar.q();
        y yVar = new y(6);
        yVar.o(bVar.f16681c, bVar.f16679a);
        yVar.q(bVar.f16680b * 8);
        int i10 = ((i5 - 10) * 8) / (iQ + iQ2);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = yVar.i(iQ);
            int i13 = yVar.i(iQ2);
            iArr[i11] = i12;
            iArr2[i11] = i13;
        }
        return new k(iV, iS, iS2, iArr, iArr2);
    }

    public static l W(int i5, Y4.b bVar) {
        byte[] bArr = new byte[i5];
        bVar.c(0, i5, bArr);
        int iG0 = g0(0, bArr);
        String str = new String(bArr, 0, iG0, "ISO-8859-1");
        int i10 = iG0 + 1;
        return new l(str, i5 <= i10 ? v.f46726f : Arrays.copyOfRange(bArr, i10, i5));
    }

    public static String X(int i5, int i10, String str, byte[] bArr) {
        return (i10 <= i5 || i10 > bArr.length) ? "" : new String(bArr, i5, i10 - i5, str);
    }

    public static m Y(int i5, Y4.b bVar, String str) {
        if (i5 < 1) {
            return null;
        }
        int iQ = bVar.q();
        String strD0 = d0(iQ);
        int i10 = i5 - 1;
        byte[] bArr = new byte[i10];
        bVar.c(0, i10, bArr);
        return new m(str, null, new String(bArr, 0, f0(0, iQ, bArr), strD0));
    }

    public static m Z(int i5, Y4.b bVar) {
        if (i5 < 1) {
            return null;
        }
        int iQ = bVar.q();
        String strD0 = d0(iQ);
        int i10 = i5 - 1;
        byte[] bArr = new byte[i10];
        bVar.c(0, i10, bArr);
        int iF0 = f0(0, iQ, bArr);
        String str = new String(bArr, 0, iF0, strD0);
        int iC0 = c0(iQ) + iF0;
        return new m("TXXX", str, X(iC0, f0(iC0, iQ, bArr), strD0, bArr));
    }

    public static n a0(int i5, Y4.b bVar, String str) {
        byte[] bArr = new byte[i5];
        bVar.c(0, i5, bArr);
        return new n(str, null, new String(bArr, 0, g0(0, bArr), "ISO-8859-1"));
    }

    public static n b0(int i5, Y4.b bVar) {
        if (i5 < 1) {
            return null;
        }
        int iQ = bVar.q();
        String strD0 = d0(iQ);
        int i10 = i5 - 1;
        byte[] bArr = new byte[i10];
        bVar.c(0, i10, bArr);
        int iF0 = f0(0, iQ, bArr);
        String str = new String(bArr, 0, iF0, strD0);
        int iC0 = c0(iQ) + iF0;
        return new n("WXXX", str, X(iC0, g0(iC0, bArr), "ISO-8859-1", bArr));
    }

    public static int c0(int i5) {
        return (i5 == 0 || i5 == 3) ? 1 : 2;
    }

    public static String d0(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static String e0(int i5, int i10, int i11, int i12, int i13) {
        return i5 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int f0(int i5, int i10, byte[] bArr) {
        int iG0 = g0(i5, bArr);
        if (i10 == 0 || i10 == 3) {
            return iG0;
        }
        while (iG0 < bArr.length - 1) {
            if ((iG0 - i5) % 2 == 0 && bArr[iG0 + 1] == 0) {
                return iG0;
            }
            iG0 = g0(iG0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int g0(int i5, byte[] bArr) {
        while (i5 < bArr.length) {
            if (bArr[i5] == 0) {
                return i5;
            }
            i5++;
        }
        return bArr.length;
    }

    public static int h0(int i5, Y4.b bVar) {
        byte[] bArr = bVar.f16679a;
        int i10 = bVar.f16680b;
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
    public static boolean i0(Y4.b r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f16680b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.d()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.r()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.v()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.s()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.s()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.A(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.A(r2)
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
            r1.A(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.A(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.B(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.A(r2)
            return r4
        Lb0:
            r1.A(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.h.i0(Y4.b, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final W5.c O(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.h.O(int, byte[]):W5.c");
    }

    @Override // ic.d
    public final W5.c r(W5.e eVar, ByteBuffer byteBuffer) {
        return O(byteBuffer.limit(), byteBuffer.array());
    }
}
