package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class cdw extends cec {
    private static final int[] l = new int[0];
    public final afec a;
    public final afec b;
    public int c;
    public cej d;
    public int[] e;
    public boolean f;
    public aap g;
    private List m;
    private int n;

    public cdw(long j, cej cejVar, afec afecVar, afec afecVar2) {
        super(j, cejVar);
        this.a = afecVar;
        this.b = afecVar2;
        this.d = cej.a;
        this.e = l;
        this.n = 1;
    }

    private final void F() {
        if (!this.f || this.k >= 0) {
            return;
        }
        bxc.b("Unsupported operation on a disposed or applied snapshot");
    }

    public cdw a(afec afecVar, afec afecVar2) {
        cdx cdxVar;
        C();
        F();
        o(v());
        synchronized (cek.b) {
            long j = cek.d;
            cek.d = j + 1;
            cek.c = cek.c.d(j);
            cej cejVarX = x();
            A(cejVarX.d(j));
            cdxVar = new cdx(j, cek.c(cejVarX, v() + 1, j), cek.n(afecVar, i(), true), cek.o(afecVar2, k()), this);
        }
        if (this.f || this.j) {
            return cdxVar;
        }
        long jV = v();
        synchronized (cek.b) {
            long j2 = cek.d;
            cek.d = j2 + 1;
            B(j2);
            cek.c = cek.c.d(v());
        }
        A(cek.c(x(), jV + 1, v()));
        return cdxVar;
    }

    @Override // defpackage.cec
    public cec b(afec afecVar) {
        cdy cdyVar;
        C();
        F();
        long jV = v();
        o(v());
        synchronized (cek.b) {
            long j = cek.d;
            cek.d = j + 1;
            cek.c = cek.c.d(j);
            cdyVar = new cdy(j, cek.c(x(), jV + 1, j), cek.n(afecVar, i(), true), this);
        }
        if (this.f || this.j) {
            return cdyVar;
        }
        long jV2 = v();
        synchronized (cek.b) {
            long j2 = cek.d;
            cek.d = j2 + 1;
            B(j2);
            cek.c = cek.c.d(v());
        }
        A(cek.c(x(), jV2 + 1, v()));
        return cdyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ceg c() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdw.c():ceg");
    }

    @Override // defpackage.cec
    public void d() {
        if (this.j) {
            return;
        }
        super.d();
        g();
    }

    @Override // defpackage.cec
    public void e() {
        if (this.f || this.j) {
            return;
        }
        l();
    }

    @Override // defpackage.cec
    public void f() {
        this.n++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    @Override // defpackage.cec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.n
            if (r1 > 0) goto Lb
            java.lang.String r1 = "no pending nested snapshots"
            defpackage.bxc.a(r1)
        Lb:
            int r1 = r0.n
            int r1 = r1 + (-1)
            r0.n = r1
            if (r1 != 0) goto L93
            boolean r1 = r0.f
            if (r1 != 0) goto L93
            aap r1 = r0.s()
            if (r1 == 0) goto L90
            boolean r2 = r0.f
            if (r2 == 0) goto L26
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            defpackage.bxc.b(r2)
        L26:
            r2 = 0
            r0.u(r2)
            long r2 = r0.v()
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L90
            r7 = 0
        L38:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8b
            int r10 = r7 - r5
            int r10 = ~r10
            r11 = 0
        L4c:
            int r12 = r10 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L89
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L85
            int r12 = r7 << 3
            int r12 = r12 + r11
            r12 = r4[r12]
            cev r12 = (defpackage.cev) r12
            cex r12 = r12.getA()
        L68:
            if (r12 == 0) goto L85
            long r14 = r12.g
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7c
            cej r6 = r0.d
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = defpackage.woy.cn(r6, r14)
            if (r6 == 0) goto L82
        L7c:
            afec r6 = defpackage.cek.a
            r14 = 0
            r12.g = r14
        L82:
            cex r12 = r12.h
            goto L68
        L85:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L4c
        L89:
            if (r12 != r13) goto L90
        L8b:
            if (r7 == r5) goto L90
            int r7 = r7 + 1
            goto L38
        L90:
            r0.y()
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdw.g():void");
    }

    @Override // defpackage.cec
    public int h() {
        return this.c;
    }

    @Override // defpackage.cec
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public afec i() {
        return this.a;
    }

    @Override // defpackage.cec
    public afec k() {
        return this.b;
    }

    public final void l() {
        o(v());
        if (this.f || this.j) {
            return;
        }
        long jV = v();
        synchronized (cek.b) {
            long j = cek.d;
            cek.d = j + 1;
            B(j);
            cek.c = cek.c.d(v());
        }
        A(cek.c(x(), jV + 1, v()));
    }

    @Override // defpackage.cec
    public final void m() {
        cek.c = cek.c.b(v()).a(this.d);
    }

    @Override // defpackage.cec
    public void n(cev cevVar) {
        aap aapVarS = s();
        if (aapVarS == null) {
            aap aapVar = aaq.a;
            aapVarS = new aap(6);
            u(aapVarS);
        }
        aapVarS.j(cevVar);
    }

    public final void o(long j) {
        synchronized (cek.b) {
            this.d = this.d.d(j);
        }
    }

    @Override // defpackage.cec
    public final void p() {
        int length = this.e.length;
        for (int i = 0; i < length; i++) {
            cek.e.b(this.e[i]);
        }
        z();
    }

    @Override // defpackage.cec
    public void q(int i) {
        this.c = i;
    }

    @Override // defpackage.cec
    public boolean r() {
        return false;
    }

    public aap s() {
        return this.g;
    }

    public final ceg t(long j, aap aapVar, Map map, cej cejVar) {
        List listBY;
        cej cejVar2;
        Object[] objArr;
        long[] jArr;
        cej cejVar3;
        long[] jArr2;
        int i;
        ArrayList arrayList;
        long j2;
        int i2;
        cex cexVarG;
        cej cejVarC = x().d(v()).c(this.d);
        Object[] objArr2 = aapVar.b;
        long[] jArr3 = aapVar.a;
        int length = jArr3.length - 2;
        ArrayList arrayList2 = null;
        if (length >= 0) {
            listBY = null;
            int i3 = 0;
            while (true) {
                long j3 = jArr3[i3];
                ArrayList arrayList3 = arrayList2;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    objArr = objArr2;
                    arrayList2 = arrayList3;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            cejVar2 = cejVarC;
                            jArr = jArr3;
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((j3 & 255) < 128) {
                                cev cevVar = (cev) objArr[(i3 << 3) + i5];
                                jArr2 = jArr3;
                                cex a = cevVar.getA();
                                i = i4;
                                arrayList = arrayList2;
                                cex cexVarI = cek.i(a, j, cejVar);
                                if (cexVarI != null) {
                                    j2 = j3;
                                    cex cexVarI2 = cek.i(a, v(), cejVarC);
                                    if (cexVarI2 == null) {
                                        cejVar3 = cejVarC;
                                    } else {
                                        i2 = i5;
                                        if (cexVarI2.g == 1 || affa.f(cexVarI, cexVarI2)) {
                                            cejVar3 = cejVarC;
                                        } else {
                                            cejVar3 = cejVarC;
                                            cex cexVarI3 = cek.i(a, v(), x());
                                            if (cexVarI3 == null) {
                                                throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                                            }
                                            if (map == null || (cexVarG = (cex) map.get(cexVarI)) == null) {
                                                cexVarG = cevVar.g(cexVarI2, cexVarI, cexVarI3);
                                            }
                                            if (cexVarG == null) {
                                                return new cee(this);
                                            }
                                            if (!affa.f(cexVarG, cexVarI3)) {
                                                if (affa.f(cexVarG, cexVarI)) {
                                                    ArrayList arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                                    arrayList4.add(new aezu(cevVar, cexVarI.a(v())));
                                                    if (listBY == null) {
                                                        listBY = new ArrayList();
                                                    }
                                                    listBY.add(cevVar);
                                                    arrayList2 = arrayList4;
                                                } else {
                                                    arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                                                    arrayList2.add(!affa.f(cexVarG, cexVarI2) ? new aezu(cevVar, cexVarG) : new aezu(cevVar, cexVarI2.a(v())));
                                                }
                                            }
                                            j3 = j2 >> 8;
                                            i5 = i2 + 1;
                                            jArr3 = jArr2;
                                            i4 = i;
                                            cejVarC = cejVar3;
                                        }
                                    }
                                } else {
                                    cejVar3 = cejVarC;
                                    j2 = j3;
                                }
                                i2 = i5;
                            } else {
                                cejVar3 = cejVarC;
                                jArr2 = jArr3;
                                i = i4;
                                arrayList = arrayList2;
                                j2 = j3;
                                i2 = i5;
                            }
                            arrayList2 = arrayList;
                            j3 = j2 >> 8;
                            i5 = i2 + 1;
                            jArr3 = jArr2;
                            i4 = i;
                            cejVarC = cejVar3;
                        }
                    }
                } else {
                    cejVar2 = cejVarC;
                    objArr = objArr2;
                    jArr = jArr3;
                    arrayList2 = arrayList3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                objArr2 = objArr;
                jArr3 = jArr;
                cejVarC = cejVar2;
            }
        } else {
            listBY = null;
        }
        if (arrayList2 != null) {
            l();
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                aezu aezuVar = (aezu) arrayList2.get(i7);
                cev cevVar2 = (cev) aezuVar.a;
                cex cexVar = (cex) aezuVar.b;
                cexVar.g = j;
                synchronized (cek.b) {
                    cexVar.h = cevVar2.getA();
                    cevVar2.d(cexVar);
                }
            }
        }
        if (listBY != null) {
            int size2 = listBY.size();
            for (int i8 = 0; i8 < size2; i8++) {
                aapVar.l((cev) listBY.get(i8));
            }
            List list = this.m;
            if (list != null) {
                listBY = woy.bY(list, listBY);
            }
            this.m = listBY;
        }
        return cef.a;
    }

    public void u(aap aapVar) {
        this.g = aapVar;
    }
}
