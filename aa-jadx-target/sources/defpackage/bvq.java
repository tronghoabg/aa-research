package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bvq extends defpackage.cfe {
    public static final java.lang.Object a = new java.lang.Object();
    public long b;
    public int c;
    public defpackage.aal d;
    public java.lang.Object e;
    public int f;

    public bvq(long j) {
        super(j);
        defpackage.aal aalVar = defpackage.aam.a;
        aalVar.getClass();
        this.d = aalVar;
        this.e = a;
    }

    @Override // defpackage.cfe
    public final defpackage.cfe a(long j) {
        return new defpackage.bvq(j);
    }

    @Override // defpackage.cfe
    public final void b(defpackage.cfe cfeVar) {
        cfeVar.getClass();
        defpackage.bvq bvqVar = (defpackage.bvq) cfeVar;
        this.d = bvqVar.d;
        this.e = bvqVar.e;
        this.f = bvqVar.f;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d1 A[Catch: all -> 0x0144, LOOP:3: B:30:0x0093->B:44:0x00d1, LOOP_END, TryCatch #0 {all -> 0x0144, blocks: (B:12:0x0027, B:15:0x0034, B:17:0x0043, B:18:0x0048, B:20:0x0053, B:22:0x005d, B:25:0x006d, B:27:0x0071, B:30:0x0093, B:32:0x00a2, B:34:0x00ac, B:36:0x00b2, B:37:0x00c2, B:48:0x00eb, B:44:0x00d1, B:47:0x00dd), top: B:74:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x00da A[EDGE_INSN: B:84:0x00da->B:46:0x00da BREAK  A[LOOP:3: B:30:0x0093->B:44:0x00d1], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    public final int c(defpackage.cej cejVar) {
        defpackage.aal aalVar;
        long[] jArr;
        int i;
        java.lang.Object[] objArr;
        int i2;
        long j;
        defpackage.cfe cfeVarD;
        synchronized (defpackage.cer.b) {
            aalVar = this.d;
        }
        int i3 = 7;
        if (!aalVar.c()) {
            return 7;
        }
        defpackage.bzc bzcVarA = defpackage.byp.a();
        java.lang.Object[] objArr2 = bzcVarA.a;
        int i4 = bzcVarA.b;
        boolean z = false;
        for (int i5 = 0; i5 < i4; i5++) {
            ((defpackage.bvs) objArr2[i5]).b();
        }
        try {
            java.lang.Object[] objArr3 = aalVar.b;
            int[] iArr = aalVar.c;
            long[] jArr2 = aalVar.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i6 = 7;
                int i7 = 0;
                while (true) {
                    long j2 = jArr2[i7];
                    long j3 = -9187201950435737472L;
                    if ((((~j2) << i3) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = i7 - length;
                        i = i3;
                        ?? r13 = z;
                        while (true) {
                            long j4 = j3;
                            i2 = 8 - ((~i8) >>> 31);
                            if (r13 >= i2) {
                                break;
                            }
                            if ((j2 & 255) < 128) {
                                ?? r3 = (i7 << 3) + r13;
                                defpackage.cfc cfcVar = (defpackage.cfc) objArr3[r3];
                                int i9 = 8;
                                if (iArr[r3] != 1) {
                                    jArr2 = jArr2;
                                    objArr3 = objArr3;
                                    j = j2;
                                } else {
                                    if (cfcVar instanceof defpackage.bvr) {
                                        defpackage.bvr bvrVar = (defpackage.bvr) cfcVar;
                                        defpackage.bvq bvqVarB = bvrVar.b((defpackage.bvq) defpackage.cer.d(bvrVar.c, cejVar), cejVar, z, bvrVar.a);
                                        defpackage.aal aalVar2 = bvqVarB.d;
                                        java.lang.Object[] objArr4 = aalVar2.b;
                                        long[] jArr3 = aalVar2.a;
                                        int length2 = jArr3.length - 2;
                                        if (length2 >= 0) {
                                            int i10 = 0;
                                            while (true) {
                                                long j5 = jArr3[i10];
                                                j = j2;
                                                int iIdentityHashCode = i6;
                                                if ((((~j5) << i) & j5 & j4) == j4) {
                                                    i6 = iIdentityHashCode;
                                                    if (i10 != length2) {
                                                        break;
                                                        break;
                                                    }
                                                    i10++;
                                                    j2 = j;
                                                    i9 = 8;
                                                } else {
                                                    int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                    for (int i12 = 0; i12 < i11; i12++) {
                                                        if ((j5 & 255) < 128) {
                                                            iIdentityHashCode = (iIdentityHashCode * 31) + java.lang.System.identityHashCode((defpackage.cfc) objArr4[(i10 << 3) + i12]);
                                                        }
                                                        j5 >>= i9;
                                                    }
                                                    if (i11 != i9) {
                                                        i6 = iIdentityHashCode;
                                                        break;
                                                    }
                                                    i6 = iIdentityHashCode;
                                                    if (i10 != length2) {
                                                        break;
                                                    }
                                                    i10++;
                                                    j2 = j;
                                                    i9 = 8;
                                                }
                                            }
                                        } else {
                                            j = j2;
                                        }
                                        cfeVarD = bvqVarB;
                                    } else {
                                        j = j2;
                                        cfeVarD = defpackage.cer.d(cfcVar.getA(), cejVar);
                                    }
                                    int iIdentityHashCode2 = ((i6 * 31) + java.lang.System.identityHashCode(cfeVarD)) * 31;
                                    long j6 = cfeVarD.g;
                                    i6 = iIdentityHashCode2 + ((int) (j6 ^ (j6 >>> 32)));
                                }
                            } else {
                                jArr2 = jArr2;
                                objArr3 = objArr3;
                                j = j2;
                            }
                            j2 = j >> 8;
                            j3 = j4;
                            jArr2 = jArr2;
                            objArr3 = objArr3;
                            z = false;
                            r13++;
                        }
                        jArr = jArr2;
                        objArr = objArr3;
                        if (i2 == 8) {
                            break;
                        }
                        break;
                    }
                    jArr = jArr2;
                    i = i3;
                    objArr = objArr3;
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    i3 = i;
                    jArr2 = jArr;
                    objArr3 = objArr;
                    z = false;
                }
                i3 = i6;
            }
            java.lang.Object[] objArr5 = bzcVarA.a;
            int i13 = bzcVarA.b;
            for (int i14 = 0; i14 < i13; i14++) {
                ((defpackage.bvs) objArr5[i14]).a();
            }
            return i3;
        } catch (java.lang.Throwable th) {
            java.lang.Object[] objArr6 = bzcVarA.a;
            int i15 = bzcVarA.b;
            for (int i16 = 0; i16 < i15; i16++) {
                ((defpackage.bvs) objArr6[i16]).a();
            }
            throw th;
        }
    }

    public final boolean d(defpackage.cej cejVar) {
        boolean z;
        boolean z2;
        synchronized (defpackage.cer.b) {
            z = false;
            z2 = (this.b == cejVar.v() && this.c == cejVar.h()) ? false : true;
        }
        if (this.e != a && (!z2 || this.f == c(cejVar))) {
            z = true;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (defpackage.cer.b) {
            this.b = cejVar.v();
            this.c = cejVar.h();
        }
        return z;
    }
}
