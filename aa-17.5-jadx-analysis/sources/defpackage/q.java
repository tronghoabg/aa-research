package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q extends u {
    int ag;
    int ah;
    private t am;
    protected final m af = new m();
    private int an = 0;
    private int ao = 0;
    private p[] ap = new p[4];
    private p[] aq = new p[4];
    private p[] ar = new p[4];
    public int ai = 2;
    private final boolean[] as = new boolean[3];
    private final p[] at = new p[4];
    public boolean aj = false;
    public boolean ak = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014b  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int G(defpackage.m r23, defpackage.p[] r24, defpackage.p r25, int r26, boolean[] r27) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q.G(m, p[], p, int, boolean[]):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04c6 A[PHI: r4
  0x04c6: PHI (r4v9 p) = (r4v8 p), (r4v20 p) binds: [B:256:0x04b8, B:259:0x04c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H(defpackage.m r37) {
        /*
            Method dump skipped, instructions count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q.H(m):void");
    }

    final void A(p pVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                o oVar = pVar.i;
                o oVar2 = oVar.b;
                if (oVar2 == null) {
                    break;
                }
                p pVar2 = oVar2.a;
                o oVar3 = pVar2.k.b;
                if (oVar3 == null || oVar3 != oVar || pVar2 == pVar) {
                    break;
                } else {
                    pVar = pVar2;
                }
            }
            while (true) {
                int i3 = this.an;
                p[] pVarArr = this.ar;
                if (i2 >= i3) {
                    int i4 = i3 + 1;
                    int length = pVarArr.length;
                    if (i4 >= length) {
                        pVarArr = (p[]) Arrays.copyOf(pVarArr, length + length);
                        this.ar = pVarArr;
                    }
                    int i5 = this.an;
                    pVarArr[i5] = pVar;
                    this.an = i5 + 1;
                    return;
                }
                if (pVarArr[i2] == pVar) {
                    return;
                } else {
                    i2++;
                }
            }
        } else {
            while (true) {
                o oVar4 = pVar.j;
                o oVar5 = oVar4.b;
                if (oVar5 == null) {
                    break;
                }
                p pVar3 = oVar5.a;
                o oVar6 = pVar3.l.b;
                if (oVar6 == null || oVar6 != oVar4 || pVar3 == pVar) {
                    break;
                } else {
                    pVar = pVar3;
                }
            }
            while (true) {
                int i6 = this.ao;
                p[] pVarArr2 = this.aq;
                if (i2 >= i6) {
                    int i7 = i6 + 1;
                    int length2 = pVarArr2.length;
                    if (i7 >= length2) {
                        pVarArr2 = (p[]) Arrays.copyOf(pVarArr2, length2 + length2);
                        this.aq = pVarArr2;
                    }
                    int i8 = this.ao;
                    pVarArr2[i8] = pVar;
                    this.ao = i8 + 1;
                    return;
                }
                if (pVarArr2[i2] == pVar) {
                    return;
                } else {
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0145 A[PHI: r0
  0x0145: PHI (r0v3 int) = (r0v2 int), (r0v2 int), (r0v4 int), (r0v4 int) binds: [B:91:0x00fd, B:93:0x0103, B:110:0x0130, B:115:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.p r11, boolean[] r12) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q.B(p, boolean[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(defpackage.p r12, boolean[] r13) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q.C(p, boolean[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05ad A[LOOP:16: B:274:0x05ab->B:275:0x05ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0256  */
    /* JADX WARN: Type inference failed for: r0v12, types: [p] */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r2v4, types: [p] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [int] */
    /* JADX WARN: Type inference failed for: r4v29, types: [int] */
    @Override // defpackage.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 1467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q.D():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0b6c  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0b85  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0bbe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0b79 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [q] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v26, types: [p] */
    /* JADX WARN: Type inference failed for: r2v4, types: [p[]] */
    /* JADX WARN: Type inference failed for: r3v1, types: [p] */
    /* JADX WARN: Type inference failed for: r6v44, types: [p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(defpackage.m r39) {
        /*
            Method dump skipped, instructions count: 3017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q.E(m):boolean");
    }

    @Override // defpackage.u, defpackage.p
    public final void i() {
        this.af.j();
        super.i();
    }
}
