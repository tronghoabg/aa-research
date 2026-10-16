package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class bab implements cdp, cdm {
    public final aap a;
    private final cdp b;
    private final cdm c;

    public bab(cdp cdpVar, Map map, cdm cdmVar) {
        this.b = new cdq(map, new aui(cdpVar, 19));
        this.c = cdmVar;
        aap aapVar = aaq.a;
        this.a = new aap(6);
    }

    @Override // defpackage.cdp
    public final Object a(String str) {
        return this.b.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    @Override // defpackage.cdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map b() {
        /*
            r15 = this;
            aap r0 = r15.a
            java.lang.Object[] r1 = r0.b
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L53
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4e
            int r7 = r4 - r2
            r8 = r3
        L20:
            int r9 = ~r7
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            if (r8 >= r9) goto L4c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r5
            r13 = 128(0x80, double:6.3E-322)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L48
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r1[r9]
            cdm r11 = r15.c
            cdo r11 = (defpackage.cdo) r11
            aan r12 = r11.c
            java.lang.Object r12 = r12.i(r9)
            if (r12 != 0) goto L48
            java.util.Map r11 = r11.a
            r11.remove(r9)
        L48:
            long r5 = r5 >> r10
            int r8 = r8 + 1
            goto L20
        L4c:
            if (r9 != r10) goto L53
        L4e:
            if (r4 == r2) goto L53
            int r4 = r4 + 1
            goto Ld
        L53:
            cdp r15 = r15.b
            java.util.Map r15 = r15.b()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bab.b():java.util.Map");
    }

    @Override // defpackage.cdm
    public final void c(Object obj, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-858296452);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(obj) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(this) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            this.c.c(obj, afegVar, buxVarC, i2 & 126);
            boolean zE = buxVarC.E(this) | buxVarC.E(obj);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new aju(this, obj, 15, null);
                bvvVar.ad(objS);
            }
            bvq.c(obj, (afec) objS, buxVarC);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new alu(this, obj, afegVar, i, 2, null);
        }
    }

    @Override // defpackage.cdp
    public final boolean d(Object obj) {
        return this.b.d(obj);
    }

    @Override // defpackage.cdp
    public final rpp e(String str, afdr afdrVar) {
        return this.b.e(str, afdrVar);
    }
}
