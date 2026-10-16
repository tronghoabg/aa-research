package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ajr extends defpackage.aiw implements defpackage.cwm {
    private defpackage.crd i;
    private cpu j;
    private final defpackage.zv k;
    private final defpackage.zv l;

    public ajr(defpackage.afer aferVar, defpackage.ask askVar) {
        super(askVar, null, false, true, null, null, aferVar);
        int i = defpackage.zw.a;
        this.k = new defpackage.zv(6);
        this.l = new defpackage.zv(6);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c A[LOOP:2: B:24:0x0071->B:35:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x009f A[EDGE_INSN: B:44:0x009f->B:36:0x009f BREAK  A[LOOP:2: B:24:0x0071->B:35:0x009c], SYNTHETIC] */
    private final void K() {
        char c;
        long j;
        long j2;
        defpackage.zv zvVar = this.k;
        java.lang.Object[] objArr = zvVar.c;
        long[] jArr = zvVar.a;
        int length = jArr.length - 2;
        char c2 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            ((aiwg) objArr[(i << 3) + i3]).s((java.util.concurrent.CancellationException) null);
                        }
                        j3 >>= 8;
                        i3++;
                        c2 = c2;
                    }
                    c = c2;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c2;
                }
                if (i == length) {
                    break;
                }
                i++;
                c2 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        zvVar.d();
        defpackage.zv zvVar2 = this.l;
        java.lang.Object[] objArr2 = zvVar2.c;
        long[] jArr2 = zvVar2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        zvVar2.d();
    }

    @Override // defpackage.aiw
    protected final void F(android.view.KeyEvent keyEvent) {
        defpackage.zv zvVar = this.k;
        long jI = defpackage.tn.i(keyEvent);
        if (zvVar.a(jI) != null) {
            aiwg aiwgVar = (aiwg) zvVar.a(jI);
            boolean z = false;
            if (aiwgVar != null) {
                if (aiwgVar.t()) {
                    aiwgVar.s((java.util.concurrent.CancellationException) null);
                } else {
                    z = true;
                }
            }
            zvVar.c(jI);
            if (z) {
                return;
            }
        }
        u();
    }

    @Override // defpackage.aiw
    protected final void G(android.view.KeyEvent keyEvent) {
        if (((defpackage.afw) this.l.a(defpackage.tn.i(keyEvent))) != null) {
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.aiw, defpackage.cpv
    public final void H(defpackage.aahg aahgVar, defpackage.cqv cqvVar) {
        super.H(aahgVar, cqvVar);
        int i = 0;
        if (cqvVar != defpackage.cqv.b) {
            if (cqvVar != defpackage.cqv.c || this.j == null) {
                return;
            }
            ?? r9 = aahgVar.b;
            int size = r9.size();
            while (i < size) {
                cpu cpuVar = (cpu) r9.get(i);
                if (cpuVar.g && !defpackage.afga.f(cpuVar, this.j)) {
                    J(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.j == null) {
            ?? r10 = aahgVar.b;
            int size2 = r10.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (defpackage.ca.aI((cpu) r10.get(i2))) {
                    cpu cpuVar2 = (cpu) r10.get(0);
                    cpuVar2.a();
                    this.j = cpuVar2;
                    if (this.b) {
                        k(cpuVar2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        ?? r11 = aahgVar.b;
        int size3 = r11.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (!defpackage.afw.u((cpu) r11.get(i3))) {
                float fD = ((defpackage.dck) defpackage.cjv.y(this, defpackage.dbl.n)).d();
                int size4 = r11.size();
                while (i < size4) {
                    cpu cpuVar3 = (cpu) r11.get(i);
                    long j = cpuVar3.c;
                    cpu cpuVar4 = this.j;
                    cpuVar4.getClass();
                    float fAbs = java.lang.Math.abs(defpackage.cji.a(defpackage.acmj.r(j, cpuVar4.c)));
                    if (cpuVar3.g || fAbs > fD) {
                        J(true);
                        return;
                    }
                    i++;
                }
                return;
            }
        }
        cpu cpuVar5 = (cpu) r11.get(0);
        cpuVar5.a();
        long j2 = cpuVar5.b;
        cpu cpuVar6 = this.j;
        cpuVar6.getClass();
        if (this.b) {
            j(cpuVar6.c, true);
            u();
        }
        this.j = null;
    }

    @Override // defpackage.cpv
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

    @Override // defpackage.cge
    public final void du() {
        K();
    }

    @Override // defpackage.aiw
    public final void n() {
        K();
    }

    @Override // defpackage.aiw, defpackage.cza
    public final void o() {
        super.o();
        J(false);
    }

    @Override // defpackage.aiw, defpackage.cza
    public final void s(defpackage.cqu cquVar, defpackage.cqv cqvVar, long j) {
        super.s(cquVar, cqvVar, j);
        if (cqvVar != defpackage.cqv.b) {
            if (cqvVar != defpackage.cqv.c || this.i == null) {
                return;
            }
            java.util.List list = cquVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                defpackage.crd crdVar = (defpackage.crd) list.get(i);
                if (crdVar.c() && !defpackage.afga.f(crdVar, this.i)) {
                    J(false);
                    return;
                }
            }
            return;
        }
        if (this.i == null) {
            if (defpackage.arc.f(cquVar, true)) {
                defpackage.crd crdVar2 = (defpackage.crd) cquVar.a.get(0);
                crdVar2.b();
                this.i = crdVar2;
                if (this.b) {
                    l(crdVar2);
                    return;
                }
                return;
            }
            return;
        }
        defpackage.ca.aA(cquVar);
        java.util.List list2 = cquVar.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!defpackage.tq.k((defpackage.crd) list2.get(i2))) {
                long jA = a(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    defpackage.crd crdVar3 = (defpackage.crd) list2.get(i3);
                    if (crdVar3.c() || defpackage.tq.m(crdVar3, j, jA)) {
                        J(false);
                        return;
                    }
                }
                return;
            }
        }
        defpackage.crd crdVar4 = (defpackage.crd) list2.get(0);
        crdVar4.b();
        long j2 = crdVar4.b;
        defpackage.crd crdVar5 = this.i;
        crdVar5.getClass();
        if (this.b) {
            j(crdVar5.c, false);
            u();
        }
        this.i = null;
    }

    @Override // defpackage.aiw
    public final void f(defpackage.dek dekVar) {
    }
}
