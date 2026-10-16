package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cif {
    public boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    private final java.lang.Object e;

    public cif(defpackage.cxl cxlVar) {
        this.e = cxlVar;
        this.d = new defpackage.cqn(cxlVar.p());
        this.c = new defpackage.kwv((short[]) null);
        this.b = new defpackage.cwy();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cyu, java.lang.Object] */
    public final void a() {
        if (this.a) {
            return;
        }
        this.e.C(new defpackage.bgp((java.lang.Object) this, 2, (char[]) null));
        this.a = true;
    }

    public final void b() {
        ((defpackage.cqn) this.d).a();
    }

    public final void c() {
        if (this.a) {
            return;
        }
        ((defpackage.zz) ((defpackage.kwv) this.c).a).f();
        ((defpackage.cqn) this.d).b();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x010b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    public final int d(defpackage.to toVar, defpackage.crm crmVar, boolean z) {
        boolean z2;
        int i;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        java.lang.Object obj;
        boolean z4;
        int i6;
        int i7;
        long[] jArr;
        long[] jArr2;
        java.lang.Object[] objArr;
        int i8;
        boolean z5;
        int i9;
        defpackage.cqt cqtVar;
        java.lang.Object obj2;
        boolean z6;
        long j;
        long jM;
        boolean z7;
        defpackage.cif cifVar = this;
        if (cifVar.a) {
            return 0;
        }
        boolean z8 = true;
        try {
            cifVar.a = true;
            java.lang.Object obj3 = cifVar.c;
            ?? r7 = toVar.b;
            defpackage.zz zzVar = new defpackage.zz(r7.size());
            int size = r7.size();
            int i10 = 0;
            ?? r8 = r7;
            while (i10 < size) {
                defpackage.crf crfVar = (defpackage.crf) r8.get(i10);
                java.lang.Object obj4 = ((defpackage.kwv) obj3).a;
                long j2 = crfVar.a;
                defpackage.cre creVar = (defpackage.cre) ((defpackage.zz) obj4).d(j2);
                if (creVar == null) {
                    z6 = z8;
                    j = crfVar.b;
                    jM = crfVar.d;
                    z7 = false;
                } else {
                    z6 = z8;
                    j = creVar.a;
                    jM = crmVar.m(creVar.b);
                    z7 = z6;
                }
                long j3 = jM;
                long j4 = j;
                long j5 = crfVar.b;
                long j6 = crfVar.d;
                boolean z9 = crfVar.e;
                zzVar.g(j2, new defpackage.crd(j2, j5, j6, z9, crfVar.f, j4, j3, z7, crfVar.g, crfVar.i, crfVar.j, crfVar.k, crfVar.l, crfVar.m));
                if (z9) {
                    ((defpackage.zz) obj4).g(j2, new defpackage.cre(j5, crfVar.c));
                } else {
                    ((defpackage.zz) obj4).h(j2);
                }
                i10++;
                r8 = r8;
                size = size;
                obj3 = obj3;
                z8 = z6;
            }
            boolean z10 = z8;
            defpackage.xh xhVar = new defpackage.xh(zzVar, toVar);
            java.lang.Object obj5 = xhVar.b;
            int iB = ((defpackage.zz) obj5).b();
            while (true) {
                if (i >= iB) {
                    z3 = z10;
                    break;
                }
                defpackage.crd crdVar = (defpackage.crd) ((defpackage.zz) obj5).e(i);
                i = (crdVar.d || crdVar.h) ? 0 : i + 1;
                z3 = false;
                break;
            }
            boolean z11 = z3 | (!(xhVar.c() == 5 ? false : z10));
            int iB2 = ((defpackage.zz) obj5).b();
            int i11 = 0;
            while (i11 < iB2) {
                try {
                    defpackage.crd crdVar2 = (defpackage.crd) ((defpackage.zz) obj5).e(i11);
                    if (z11 || defpackage.tq.j(crdVar2)) {
                        java.lang.Object obj6 = cifVar.e;
                        long j7 = crdVar2.c;
                        ?? r10 = cifVar.b;
                        ((defpackage.cxl) obj6).E(j7, (defpackage.cwy) r10, crdVar2.i, true);
                        if (r10.isEmpty()) {
                            obj = obj5;
                            z4 = z11;
                            i6 = iB2;
                            i7 = i11;
                        } else {
                            java.lang.Object obj7 = cifVar.d;
                            long j8 = crdVar2.a;
                            boolean zJ = defpackage.tq.j(crdVar2);
                            defpackage.cqt cqtVar2 = ((defpackage.cqn) obj7).f;
                            int iA = ((defpackage.cwy) r10).a();
                            defpackage.cqt cqtVar3 = cqtVar2;
                            boolean z12 = z10;
                            int i12 = 0;
                            while (i12 < iA) {
                                defpackage.cge cgeVar = ((defpackage.cwy) r10).get(i12);
                                java.lang.Object obj8 = obj5;
                                if (cgeVar.A) {
                                    z5 = z11;
                                    cgeVar.z = new defpackage.bso(obj7, cgeVar, 5);
                                    if (z12) {
                                        cqtVar = cqtVar3;
                                        defpackage.bzc bzcVar = cqtVar.d;
                                        i9 = iB2;
                                        java.lang.Object[] objArr2 = bzcVar.a;
                                        int i13 = bzcVar.b;
                                        int i14 = 0;
                                        while (true) {
                                            if (i14 >= i13) {
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = objArr2[i14];
                                            int i15 = i13;
                                            if (defpackage.afga.f(((defpackage.cqs) obj2).a, cgeVar)) {
                                                break;
                                            }
                                            i14++;
                                            i13 = i15;
                                        }
                                        defpackage.cqs cqsVar = (defpackage.cqs) obj2;
                                        if (cqsVar != null) {
                                            cqsVar.b = z10;
                                            cqsVar.c.r(j8);
                                            if (zJ) {
                                                defpackage.zv zvVar = ((defpackage.cqn) obj7).h;
                                                java.lang.Object objA = zvVar.a(j8);
                                                if (objA == null) {
                                                    objA = new defpackage.aan(16);
                                                    zvVar.e(j8, objA);
                                                }
                                                ((defpackage.aan) objA).p(cqsVar);
                                            }
                                            cqtVar3 = cqsVar;
                                            i11 = i11;
                                            z12 = true;
                                        }
                                    } else {
                                        i9 = iB2;
                                        cqtVar = cqtVar3;
                                    }
                                    defpackage.cqs cqsVar2 = new defpackage.cqs(cgeVar);
                                    cqsVar2.c.r(j8);
                                    if (zJ) {
                                        defpackage.zv zvVar2 = ((defpackage.cqn) obj7).h;
                                        java.lang.Object objA2 = zvVar2.a(j8);
                                        if (objA2 == null) {
                                            objA2 = new defpackage.aan(16);
                                            zvVar2.e(j8, objA2);
                                        }
                                        ((defpackage.aan) objA2).p(cqsVar2);
                                    } else {
                                        i11 = i11;
                                    }
                                    cqtVar.d.n(cqsVar2);
                                    cqtVar3 = cqsVar2;
                                    z12 = false;
                                } else {
                                    z5 = z11;
                                    i9 = iB2;
                                    i11 = i11;
                                }
                                i12++;
                                z11 = z5;
                                obj5 = obj8;
                                iB2 = i9;
                                i11 = i11;
                                z10 = true;
                            }
                            obj = obj5;
                            z4 = z11;
                            i6 = iB2;
                            i7 = i11;
                            if (zJ) {
                                defpackage.zv zvVar3 = ((defpackage.cqn) obj7).h;
                                long[] jArr3 = zvVar3.b;
                                java.lang.Object[] objArr3 = zvVar3.c;
                                long[] jArr4 = zvVar3.a;
                                int length = jArr4.length - 2;
                                if (length >= 0) {
                                    int i16 = 0;
                                    while (true) {
                                        long j9 = jArr4[i16];
                                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i17 = i16 - length;
                                            int i18 = 0;
                                            while (true) {
                                                jArr = jArr4;
                                                i8 = 8 - ((~i17) >>> 31);
                                                if (i18 >= i8) {
                                                    break;
                                                }
                                                if ((j9 & 255) < 128) {
                                                    int i19 = (i16 << 3) + i18;
                                                    long j10 = jArr3[i19];
                                                    defpackage.aan aanVar = (defpackage.aan) objArr3[i19];
                                                    defpackage.bzc bzcVar2 = cqtVar2.d;
                                                    java.lang.Object[] objArr4 = bzcVar2.a;
                                                    int i20 = 0;
                                                    for (int i21 = bzcVar2.b; i20 < i21; i21 = i21) {
                                                        ((defpackage.cqs) objArr4[i20]).b(j10, aanVar);
                                                        i20++;
                                                    }
                                                }
                                                j9 >>= 8;
                                                i18++;
                                                jArr4 = jArr;
                                                jArr3 = jArr3;
                                                objArr3 = objArr3;
                                            }
                                            jArr2 = jArr3;
                                            objArr = objArr3;
                                            if (i8 != 8) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr4;
                                            jArr2 = jArr3;
                                            objArr = objArr3;
                                        }
                                        if (i16 == length) {
                                            break;
                                        }
                                        i16++;
                                        jArr4 = jArr;
                                        jArr3 = jArr2;
                                        objArr3 = objArr;
                                    }
                                }
                            }
                            ((defpackage.cqn) obj7).h.d();
                            ((defpackage.cwy) r10).clear();
                        }
                    } else {
                        obj = obj5;
                        z4 = z11;
                        i6 = iB2;
                        i7 = i11;
                    }
                    i11 = i7 + 1;
                    z10 = true;
                    cifVar = this;
                    z11 = z4;
                    obj5 = obj;
                    iB2 = i6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    z2 = false;
                    cifVar = this;
                    cifVar.a = z2;
                    throw th;
                }
            }
            java.lang.Object obj9 = obj5;
            java.lang.Object obj10 = cifVar.d;
            defpackage.cqt cqtVar4 = ((defpackage.cqn) obj10).f;
            if (cqtVar4.c((defpackage.zz) obj9, ((defpackage.cqn) obj10).a, xhVar, z)) {
                i2 = 1;
                ((defpackage.cqn) obj10).b = true;
                defpackage.bzc bzcVar3 = cqtVar4.d;
                java.lang.Object[] objArr5 = bzcVar3.a;
                int i22 = bzcVar3.b;
                boolean z13 = false;
                for (int i23 = 0; i23 < i22; i23++) {
                    z13 = ((defpackage.cqs) objArr5[i23]).e(xhVar, z) || z13;
                }
                java.lang.Object[] objArr6 = bzcVar3.a;
                int i24 = bzcVar3.b;
                boolean z14 = false;
                for (int i25 = 0; i25 < i24; i25++) {
                    z14 = ((defpackage.cqs) objArr6[i25]).d(xhVar) || z14;
                }
                cqtVar4.f();
                i3 = (z14 || z13) ? 1 : 0;
                ((defpackage.cqn) obj10).b = false;
                if (((defpackage.cqn) obj10).e) {
                    ((defpackage.cqn) obj10).e = false;
                    defpackage.aan aanVar2 = ((defpackage.cqn) obj10).g;
                    int i26 = aanVar2.b;
                    for (int i27 = 0; i27 < i26; i27++) {
                        ((defpackage.cqn) obj10).c((defpackage.cge) aanVar2.c(i27));
                    }
                    aanVar2.k();
                }
                if (((defpackage.cqn) obj10).c) {
                    ((defpackage.cqn) obj10).c = false;
                    ((defpackage.cqn) obj10).b();
                }
                if (((defpackage.cqn) obj10).d) {
                    ((defpackage.cqn) obj10).d = false;
                    ((defpackage.cqn) obj10).a();
                }
            } else {
                i3 = 0;
                i2 = 1;
            }
            if (xhVar.a) {
                i4 = 0;
                break;
            }
            int iB3 = ((defpackage.zz) obj9).b();
            int i28 = 0;
            while (true) {
                if (i28 >= iB3) {
                    i4 = 0;
                    break;
                }
                defpackage.crd crdVar3 = (defpackage.crd) ((defpackage.zz) obj9).e(i28);
                if (defpackage.tq.n(crdVar3) && crdVar3.c()) {
                    i4 = i2;
                    break;
                }
                i28++;
            }
            int iB4 = ((defpackage.zz) obj9).b();
            for (int i29 = 0; i29 < iB4; i29++) {
                if (((defpackage.crd) ((defpackage.zz) obj9).e(i29)).c()) {
                    i5 = i2;
                    cifVar.a = false;
                    return (i4 + i4) | i3 | (i5 << 2);
                }
            }
            i5 = 0;
            cifVar.a = false;
            return (i4 + i4) | i3 | (i5 << 2);
        } catch (java.lang.Throwable th2) {
            th = th2;
            z2 = false;
        }
    }

    public cif(defpackage.cik cikVar, defpackage.cyu cyuVar) {
        this.b = cikVar;
        this.e = cyuVar;
        defpackage.aaw aawVar = defpackage.aax.a;
        this.c = new defpackage.aaw(6);
        this.d = new defpackage.aaw(6);
    }
}
