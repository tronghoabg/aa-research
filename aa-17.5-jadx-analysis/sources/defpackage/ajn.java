package defpackage;

import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes.dex */
final class ajn extends air implements cwc {
    private cqu i;
    private cpl j;
    private final zo k;
    private final zo l;

    public ajn(afdr afdrVar, asf asfVar) {
        super(asfVar, null, false, true, null, null, afdrVar);
        int i = zp.a;
        this.k = new zo(6);
        this.l = new zo(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void K() {
        /*
            r24 = this;
            r0 = r24
            zo r1 = r0.k
            java.lang.Object[] r2 = r1.c
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            r10 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 0
            r14 = 8
            if (r4 < 0) goto L5c
            r15 = r13
            r16 = 128(0x80, double:6.3E-322)
        L1a:
            r6 = r3[r15]
            r18 = 255(0xff, double:1.26E-321)
            long r8 = ~r6
            long r8 = r8 << r10
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L53
            int r8 = r15 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r13
        L2e:
            if (r9 >= r8) goto L4e
            long r20 = r6 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L46
            int r20 = r15 << 3
            int r20 = r20 + r9
            r20 = r2[r20]
            r21 = r10
            r10 = r20
            aivh r10 = (defpackage.aivh) r10
            r10.s(r5)
            goto L48
        L46:
            r21 = r10
        L48:
            long r6 = r6 >> r14
            int r9 = r9 + 1
            r10 = r21
            goto L2e
        L4e:
            r21 = r10
            if (r8 != r14) goto L62
            goto L55
        L53:
            r21 = r10
        L55:
            if (r15 == r4) goto L62
            int r15 = r15 + 1
            r10 = r21
            goto L1a
        L5c:
            r21 = r10
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L62:
            r1.d()
            zo r0 = r0.l
            java.lang.Object[] r1 = r0.c
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L9f
            r4 = r13
        L71:
            r6 = r2[r4]
            long r8 = ~r6
            long r8 = r8 << r21
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L9a
            int r8 = r4 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r13
        L84:
            if (r9 >= r8) goto L98
            long r22 = r6 & r18
            int r10 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r10 < 0) goto L90
            long r6 = r6 >> r14
            int r9 = r9 + 1
            goto L84
        L90:
            int r0 = r4 << 3
            int r0 = r0 + r9
            r0 = r1[r0]
            afp r0 = (defpackage.afp) r0
            throw r5
        L98:
            if (r8 != r14) goto L9f
        L9a:
            if (r4 == r3) goto L9f
            int r4 = r4 + 1
            goto L71
        L9f:
            r0.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajn.K():void");
    }

    @Override // defpackage.air
    protected final void F(KeyEvent keyEvent) {
        zo zoVar = this.k;
        long jF = rl.f(keyEvent);
        if (zoVar.a(jF) != null) {
            aivh aivhVar = (aivh) zoVar.a(jF);
            boolean z = false;
            if (aivhVar != null) {
                if (aivhVar.t()) {
                    aivhVar.s(null);
                } else {
                    z = true;
                }
            }
            zoVar.c(jF);
            if (z) {
                return;
            }
        }
        u();
    }

    @Override // defpackage.air
    protected final void G(KeyEvent keyEvent) {
        if (((afp) this.l.a(rl.f(keyEvent))) != null) {
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.air, defpackage.cpm
    public final void H(aagd aagdVar, cqm cqmVar) {
        super.H(aagdVar, cqmVar);
        int i = 0;
        if (cqmVar != cqm.b) {
            if (cqmVar != cqm.c || this.j == null) {
                return;
            }
            ?? r9 = aagdVar.c;
            int size = r9.size();
            while (i < size) {
                cpl cplVar = (cpl) r9.get(i);
                if (cplVar.g && !affa.f(cplVar, this.j)) {
                    J(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.j == null) {
            ?? r92 = aagdVar.c;
            int size2 = r92.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (ca.aI((cpl) r92.get(i2))) {
                    cpl cplVar2 = (cpl) r92.get(0);
                    cplVar2.a();
                    this.j = cplVar2;
                    if (this.b) {
                        k(cplVar2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        ?? r93 = aagdVar.c;
        int size3 = r93.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (!afp.u((cpl) r93.get(i3))) {
                float fD = ((dcc) bzi.x(this, dbc.n)).d();
                int size4 = r93.size();
                while (i < size4) {
                    cpl cplVar3 = (cpl) r93.get(i);
                    long j = cplVar3.c;
                    cpl cplVar4 = this.j;
                    cplVar4.getClass();
                    float fAbs = Math.abs(cja.a(aclh.y(j, cplVar4.c)));
                    if (cplVar3.g || fAbs > fD) {
                        J(true);
                        return;
                    }
                    i++;
                }
                return;
            }
        }
        cpl cplVar5 = (cpl) r93.get(0);
        cplVar5.a();
        long j2 = cplVar5.b;
        cpl cplVar6 = this.j;
        cplVar6.getClass();
        if (this.b) {
            j(cplVar6.c, true);
            u();
        }
        this.j = null;
    }

    @Override // defpackage.cpm
    public final void I() {
        J(true);
    }

    public final void J(boolean z) {
        if (z) {
            this.j = null;
        } else {
            this.i = null;
        }
        i(z);
    }

    @Override // defpackage.cfx
    public final void em() {
        K();
    }

    @Override // defpackage.air
    public final void n() {
        K();
    }

    @Override // defpackage.air, defpackage.cys
    public final void o() {
        super.o();
        J(false);
    }

    @Override // defpackage.air, defpackage.cys
    public final void s(cql cqlVar, cqm cqmVar, long j) {
        super.s(cqlVar, cqmVar, j);
        if (cqmVar != cqm.b) {
            if (cqmVar != cqm.c || this.i == null) {
                return;
            }
            List list = cqlVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cqu cquVar = (cqu) list.get(i);
                if (cquVar.c() && !affa.f(cquVar, this.i)) {
                    J(false);
                    return;
                }
            }
            return;
        }
        if (this.i == null) {
            if (aqx.f(cqlVar, true)) {
                cqu cquVar2 = (cqu) cqlVar.a.get(0);
                cquVar2.b();
                this.i = cquVar2;
                if (this.b) {
                    l(cquVar2);
                    return;
                }
                return;
            }
            return;
        }
        ca.aA(cqlVar);
        List list2 = cqlVar.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!tl.l((cqu) list2.get(i2))) {
                long jA = a(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    cqu cquVar3 = (cqu) list2.get(i3);
                    if (cquVar3.c() || tl.n(cquVar3, j, jA)) {
                        J(false);
                        return;
                    }
                }
                return;
            }
        }
        cqu cquVar4 = (cqu) list2.get(0);
        cquVar4.b();
        long j2 = cquVar4.b;
        cqu cquVar5 = this.i;
        cquVar5.getClass();
        if (this.b) {
            j(cquVar5.c, false);
            u();
        }
        this.i = null;
    }

    @Override // defpackage.air
    public final void f(dec decVar) {
    }
}
