package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bvr extends defpackage.cfd implements defpackage.bys {
    public final defpackage.afer a;
    public final defpackage.byo b;
    public defpackage.bvq c = new defpackage.bvq(defpackage.cer.b().v());

    public bvr(defpackage.afer aferVar, defpackage.byo byoVar) {
        this.a = aferVar;
        this.b = byoVar;
    }

    @Override // defpackage.bys
    public final java.lang.Object a() {
        defpackage.affc affcVarI = defpackage.cer.b().i();
        if (affcVarI != null) {
            affcVarI.invoke(this);
        }
        defpackage.cej cejVarB = defpackage.cer.b();
        return b((defpackage.bvq) defpackage.cer.d(this.c, cejVarB), cejVarB, true, this.a).e;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x008a A[EDGE_INSN: B:134:0x008a->B:28:0x008a BREAK  A[LOOP:1: B:14:0x0042->B:27:0x0087], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0087 A[Catch: all -> 0x009d, LOOP:1: B:14:0x0042->B:27:0x0087, LOOP_END, TryCatch #7 {all -> 0x009d, blocks: (B:8:0x0020, B:10:0x002c, B:11:0x0034, B:14:0x0042, B:16:0x0052, B:17:0x0055, B:19:0x005e, B:21:0x0068, B:23:0x007c, B:24:0x007f, B:27:0x0087, B:28:0x008a), top: B:131:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:63:0x013e A[Catch: all -> 0x01f2, TryCatch #1 {all -> 0x01f2, blocks: (B:45:0x00e3, B:47:0x00fb, B:49:0x010c, B:56:0x012a, B:57:0x0130, B:54:0x0124, B:71:0x015f, B:59:0x0133, B:62:0x0138, B:70:0x015b, B:113:0x01ee, B:114:0x01f1, B:63:0x013e, B:65:0x0144, B:66:0x0147, B:52:0x0114, B:53:0x011c, B:67:0x014e, B:69:0x0156, B:110:0x01e7, B:111:0x01ec), top: B:122:0x00e3, inners: #4, #6 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0144 A[Catch: all -> 0x01f2, TryCatch #1 {all -> 0x01f2, blocks: (B:45:0x00e3, B:47:0x00fb, B:49:0x010c, B:56:0x012a, B:57:0x0130, B:54:0x0124, B:71:0x015f, B:59:0x0133, B:62:0x0138, B:70:0x015b, B:113:0x01ee, B:114:0x01f1, B:63:0x013e, B:65:0x0144, B:66:0x0147, B:52:0x0114, B:53:0x011c, B:67:0x014e, B:69:0x0156, B:110:0x01e7, B:111:0x01ec), top: B:122:0x00e3, inners: #4, #6 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final defpackage.bvq b(defpackage.bvq bvqVar, defpackage.cej cejVar, boolean z, defpackage.afer aferVar) {
        defpackage.cej cfhVar;
        defpackage.cej cejVarW;
        java.lang.Object objInvoke;
        defpackage.bvq bvqVar2;
        defpackage.byo byoVar;
        int i;
        java.lang.Object[] objArr = 0;
        if (bvqVar.d(cejVar)) {
            if (z) {
                defpackage.bzc bzcVarA = defpackage.byp.a();
                java.lang.Object[] objArr2 = bzcVarA.a;
                int i2 = bzcVarA.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((defpackage.bvs) objArr2[i3]).b();
                }
                try {
                    defpackage.aal aalVar = bvqVar.d;
                    defpackage.lam lamVar = defpackage.byp.a;
                    defpackage.cda cdaVar = (defpackage.cda) lamVar.j();
                    if (cdaVar == null) {
                        cdaVar = new defpackage.cda(null);
                        lamVar.k(cdaVar);
                    }
                    int i4 = cdaVar.a;
                    java.lang.Object[] objArr3 = aalVar.b;
                    int[] iArr = aalVar.c;
                    long[] jArr = aalVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = i5 - length;
                                int i7 = 0;
                                while (true) {
                                    i = 8 - ((~i6) >>> 31);
                                    if (i7 >= i) {
                                        break;
                                    }
                                    if ((j & 255) < 128) {
                                        int i8 = (i5 << 3) + i7;
                                        defpackage.cfc cfcVar = (defpackage.cfc) objArr3[i8];
                                        cdaVar.a = iArr[i8] + i4;
                                        defpackage.affc affcVarI = cejVar.i();
                                        if (affcVarI != null) {
                                            affcVarI.invoke(cfcVar);
                                        }
                                    }
                                    j >>= 8;
                                    i7++;
                                }
                                if (i != 8) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    cdaVar.a = i4;
                } finally {
                    java.lang.Object[] objArr4 = bzcVarA.a;
                    int i9 = bzcVarA.b;
                    for (int i10 = 0; i10 < i9; i10++) {
                        ((defpackage.bvs) objArr4[i10]).a();
                    }
                }
            }
            return bvqVar;
        }
        defpackage.aal aalVar2 = new defpackage.aal(6);
        defpackage.lam lamVar2 = defpackage.byp.a;
        defpackage.cda cdaVar2 = (defpackage.cda) lamVar2.j();
        if (cdaVar2 == null) {
            cdaVar2 = new defpackage.cda(null);
            lamVar2.k(cdaVar2);
        }
        defpackage.cda cdaVar3 = cdaVar2;
        int i11 = cdaVar3.a;
        defpackage.bzc bzcVarA2 = defpackage.byp.a();
        java.lang.Object[] objArr5 = bzcVarA2.a;
        int i12 = bzcVarA2.b;
        for (int i13 = 0; i13 < i12; i13++) {
            ((defpackage.bvs) objArr5[i13]).b();
        }
        try {
            cdaVar3.a = i11 + 1;
            defpackage.affc beaVar = new defpackage.bea(this, cdaVar3, aalVar2, i11, 2);
            defpackage.cej cejVar2 = (defpackage.cej) defpackage.cer.i.j();
            if (cejVar2 instanceof defpackage.cfh) {
                defpackage.cfh cfhVar2 = (defpackage.cfh) cejVar2;
                if (cfhVar2.n == java.lang.Thread.currentThread().getId()) {
                    defpackage.affc affcVar = cfhVar2.l;
                    defpackage.affc affcVar2 = cfhVar2.m;
                    if (affcVar != null && beaVar != affcVar) {
                        try {
                            beaVar = new defpackage.beh(beaVar, affcVar, 13, objArr == true ? 1 : 0);
                        } catch (java.lang.Throwable th) {
                            defpackage.cfh cfhVar3 = (defpackage.cfh) cejVar2;
                            cfhVar3.l = affcVar;
                            cfhVar3.m = affcVar2;
                            throw th;
                        }
                    }
                    cfhVar2.l = beaVar;
                    cfhVar2.m = affcVar2;
                    objInvoke = aferVar.invoke();
                    cfhVar2.l = affcVar;
                    cfhVar2.m = affcVar2;
                } else {
                    cfhVar = (cejVar2 != null || (cejVar2 instanceof defpackage.ced)) ? new defpackage.cfh(cejVar2 instanceof defpackage.ced ? (defpackage.ced) cejVar2 : null, beaVar, null, true, false) : cejVar2.b(beaVar);
                    try {
                        cejVarW = cfhVar.w();
                        try {
                            java.lang.Object objInvoke2 = aferVar.invoke();
                            defpackage.cer.i.k(cejVarW);
                            cfhVar.d();
                            objInvoke = objInvoke2;
                        } catch (java.lang.Throwable th2) {
                            defpackage.cer.i.k(cejVarW);
                            throw th2;
                        }
                    } catch (java.lang.Throwable th3) {
                        cfhVar.d();
                        throw th3;
                    }
                }
            } else {
                if (cejVar2 != null) {
                }
                cejVarW = cfhVar.w();
                java.lang.Object objInvoke3 = aferVar.invoke();
                defpackage.cer.i.k(cejVarW);
                cfhVar.d();
                objInvoke = objInvoke3;
            }
            cdaVar3.a = i11;
            java.lang.Object[] objArr6 = bzcVarA2.a;
            int i14 = bzcVarA2.b;
            for (int i15 = 0; i15 < i14; i15++) {
                ((defpackage.bvs) objArr6[i15]).a();
            }
            java.lang.Object obj = defpackage.cer.b;
            synchronized (obj) {
                defpackage.cej cejVarB = defpackage.cer.b();
                java.lang.Object obj2 = bvqVar.e;
                if (obj2 == defpackage.bvq.a || (byoVar = this.b) == null || !byoVar.a(objInvoke, obj2)) {
                    defpackage.bvq bvqVar3 = this.c;
                    synchronized (obj) {
                        defpackage.cfe cfeVarF = defpackage.cer.f(bvqVar3, this);
                        cfeVarF.b(bvqVar3);
                        cfeVarF.g = cejVarB.v();
                        bvqVar2 = (defpackage.bvq) cfeVarF;
                        bvqVar2.d = aalVar2;
                        bvqVar2.f = bvqVar2.c(cejVarB);
                        bvqVar2.e = objInvoke;
                    }
                } else {
                    bvqVar.d = aalVar2;
                    bvqVar.f = bvqVar.c(cejVarB);
                    bvqVar2 = bvqVar;
                }
            }
            defpackage.cda cdaVar4 = (defpackage.cda) defpackage.byp.a.j();
            if (cdaVar4 == null || cdaVar4.a != 0) {
                return bvqVar2;
            }
            defpackage.cer.b().e();
            synchronized (defpackage.cer.b) {
                defpackage.cej cejVarB2 = defpackage.cer.b();
                bvqVar2.b = cejVarB2.v();
                bvqVar2.c = cejVarB2.h();
            }
            return bvqVar2;
        } catch (java.lang.Throwable th4) {
            java.lang.Object[] objArr7 = bzcVarA2.a;
            int i16 = bzcVarA2.b;
            for (int i17 = 0; i17 < i16; i17++) {
                ((defpackage.bvs) objArr7[i17]).a();
            }
            throw th4;
        }
    }

    @Override // defpackage.cfc
    /* JADX INFO: renamed from: c */
    public final defpackage.cfe getA() {
        return this.c;
    }

    @Override // defpackage.cfc
    public final void d(defpackage.cfe cfeVar) {
        cfeVar.getClass();
        this.c = (defpackage.bvq) cfeVar;
    }

    public final defpackage.bvq e() {
        defpackage.cej cejVarB = defpackage.cer.b();
        return b((defpackage.bvq) defpackage.cer.d(this.c, cejVarB), cejVarB, false, this.a);
    }

    public final java.lang.String toString() {
        defpackage.bvq bvqVar = (defpackage.bvq) defpackage.cer.e(this.c, this);
        return "DerivedState(value=" + (bvqVar.d(defpackage.cer.b()) ? java.lang.String.valueOf(bvqVar.e) : "<Not calculated>") + ")@" + hashCode();
    }
}
