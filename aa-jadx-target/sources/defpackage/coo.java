package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class coo extends defpackage.col {
    public final defpackage.cnl a;
    public java.lang.String b;
    public boolean c;
    public defpackage.afer d;
    public final defpackage.bwx e;
    public final defpackage.bwx f;
    public float g;
    public float h;
    private final defpackage.cnj i;
    private defpackage.cke j;
    private long k;
    private final defpackage.affc l;

    public coo(defpackage.cnl cnlVar) {
        this.a = cnlVar;
        cnlVar.d = new defpackage.chq(this, 8);
        this.b = "";
        this.c = true;
        this.i = new defpackage.cnj();
        this.d = new defpackage.con(0);
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, bxvVar);
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.cjl(0L), bxvVar);
        this.k = 9205357640488583168L;
        this.g = 1.0f;
        this.h = 1.0f;
        this.l = new defpackage.chq(this, 9);
    }

    public final long a() {
        return ((defpackage.cjl) this.f.a()).a;
    }

    @Override // defpackage.col
    public final void c(defpackage.cml cmlVar) {
        e(cmlVar, 1.0f, null);
    }

    public final defpackage.cke d() {
        return (defpackage.cke) this.e.a();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    public final void e(defpackage.cml cmlVar, float f, defpackage.cke ckeVar) {
        defpackage.cjx cjxVar;
        defpackage.cnj cnjVar;
        int i;
        defpackage.cjr cjrVarF;
        defpackage.ckc ckcVarB;
        int i2;
        defpackage.cml cmlVar2;
        long jK;
        defpackage.cke ckeVarD;
        defpackage.cnl cnlVar = this.a;
        int i3 = (cnlVar.b && cnlVar.c != 16 && defpackage.cov.b(d()) && defpackage.cov.b(ckeVar)) ? 1 : 0;
        if (this.c || this.k != cmlVar.o()) {
            if (i3 == 1) {
                jK = cnlVar.c;
                if (defpackage.ckd.a(jK) != 1.0f) {
                    float fD = defpackage.ckd.d(jK);
                    float fC = defpackage.ckd.c(jK);
                    float fB = defpackage.ckd.b(jK);
                    float[] fArr = defpackage.clr.a;
                    jK = defpackage.cjv.k(fD, fC, fB, 1.0f, defpackage.clr.y[(int) (jK & 63)]);
                }
                cjxVar = new defpackage.cjx(jK, 5);
            } else {
                cjxVar = null;
            }
            this.j = cjxVar;
            this.g = java.lang.Float.intBitsToFloat((int) (cmlVar.o() >> 32)) / java.lang.Float.intBitsToFloat((int) (a() >> 32));
            this.h = java.lang.Float.intBitsToFloat((int) (cmlVar.o() & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (a() & 4294967295L));
            cnjVar = this.i;
            float fCeil = (float) java.lang.Math.ceil(java.lang.Float.intBitsToFloat((int) (cmlVar.o() >> 32)));
            float fCeil2 = (float) java.lang.Math.ceil(java.lang.Float.intBitsToFloat((int) (cmlVar.o() & 4294967295L)));
            defpackage.dlz dlzVarP = cmlVar.p();
            defpackage.affc affcVar = this.l;
            long j = (((long) ((int) fCeil)) << 32) | (((long) ((int) fCeil2)) & 4294967295L);
            i = (int) (j >> 32);
            cjrVarF = cnjVar.e;
            ckcVarB = cnjVar.a;
            i2 = (int) (4294967295L & j);
            if (cjrVarF != null || ckcVarB == null || i > cjrVarF.c() || i2 > cjrVarF.b() || cnjVar.c != i3) {
                cjrVarF = defpackage.cjv.f(i, i2, i3, 24);
                ckcVarB = defpackage.cjn.b(cjrVarF);
                cnjVar.e = cjrVarF;
                cnjVar.a = ckcVarB;
                cnjVar.c = i3;
            }
            cnjVar.b = j;
            defpackage.cmj cmjVar = cnjVar.d;
            long jF = defpackage.dlv.f(j);
            defpackage.cmh cmhVar = cmjVar.a;
            defpackage.dlo dloVar = cmhVar.a;
            defpackage.dlz dlzVar = cmhVar.b;
            defpackage.ckc ckcVar = cmhVar.c;
            long j2 = cmhVar.d;
            cmlVar2 = cmlVar;
            cmhVar.a = cmlVar2;
            cmhVar.b = dlzVarP;
            cmhVar.c = ckcVarB;
            cmhVar.d = jF;
            ckcVarB.g();
            defpackage.dai.U(cmjVar, -72057594037927936L, 0L, 0L, 0.0f, null, 62);
            affcVar.invoke(cmjVar);
            ckcVarB.e();
            cmhVar.a = dloVar;
            cmhVar.b = dlzVar;
            cmhVar.c = ckcVar;
            cmhVar.d = j2;
            cjrVarF.d();
            this.c = false;
            this.k = cmlVar2.o();
        } else {
            defpackage.cjr cjrVar = this.i.e;
            if (i3 == (cjrVar != null ? cjrVar.a() : 0)) {
                cmlVar2 = cmlVar;
            } else {
                if (i3 == 1) {
                    jK = cnlVar.c;
                    if (defpackage.ckd.a(jK) != 1.0f) {
                        float fD2 = defpackage.ckd.d(jK);
                        float fC2 = defpackage.ckd.c(jK);
                        float fB2 = defpackage.ckd.b(jK);
                        float[] fArr2 = defpackage.clr.a;
                        jK = defpackage.cjv.k(fD2, fC2, fB2, 1.0f, defpackage.clr.y[(int) (jK & 63)]);
                    }
                    cjxVar = new defpackage.cjx(jK, 5);
                } else {
                    cjxVar = null;
                }
                this.j = cjxVar;
                this.g = java.lang.Float.intBitsToFloat((int) (cmlVar.o() >> 32)) / java.lang.Float.intBitsToFloat((int) (a() >> 32));
                this.h = java.lang.Float.intBitsToFloat((int) (cmlVar.o() & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (a() & 4294967295L));
                cnjVar = this.i;
                float fCeil3 = (float) java.lang.Math.ceil(java.lang.Float.intBitsToFloat((int) (cmlVar.o() >> 32)));
                float fCeil4 = (float) java.lang.Math.ceil(java.lang.Float.intBitsToFloat((int) (cmlVar.o() & 4294967295L)));
                defpackage.dlz dlzVarP2 = cmlVar.p();
                defpackage.affc affcVar2 = this.l;
                long j3 = (((long) ((int) fCeil3)) << 32) | (((long) ((int) fCeil4)) & 4294967295L);
                i = (int) (j3 >> 32);
                cjrVarF = cnjVar.e;
                ckcVarB = cnjVar.a;
                i2 = (int) (4294967295L & j3);
                if (cjrVarF != null) {
                    cjrVarF = defpackage.cjv.f(i, i2, i3, 24);
                    ckcVarB = defpackage.cjn.b(cjrVarF);
                    cnjVar.e = cjrVarF;
                    cnjVar.a = ckcVarB;
                    cnjVar.c = i3;
                } else {
                    cjrVarF = defpackage.cjv.f(i, i2, i3, 24);
                    ckcVarB = defpackage.cjn.b(cjrVarF);
                    cnjVar.e = cjrVarF;
                    cnjVar.a = ckcVarB;
                    cnjVar.c = i3;
                }
                cnjVar.b = j3;
                defpackage.cmj cmjVar2 = cnjVar.d;
                long jF2 = defpackage.dlv.f(j3);
                defpackage.cmh cmhVar2 = cmjVar2.a;
                defpackage.dlo dloVar2 = cmhVar2.a;
                defpackage.dlz dlzVar2 = cmhVar2.b;
                defpackage.ckc ckcVar2 = cmhVar2.c;
                long j4 = cmhVar2.d;
                cmlVar2 = cmlVar;
                cmhVar2.a = cmlVar2;
                cmhVar2.b = dlzVarP2;
                cmhVar2.c = ckcVarB;
                cmhVar2.d = jF2;
                ckcVarB.g();
                defpackage.dai.U(cmjVar2, -72057594037927936L, 0L, 0L, 0.0f, null, 62);
                affcVar2.invoke(cmjVar2);
                ckcVarB.e();
                cmhVar2.a = dloVar2;
                cmhVar2.b = dlzVar2;
                cmhVar2.c = ckcVar2;
                cmhVar2.d = j4;
                cjrVarF.d();
                this.c = false;
                this.k = cmlVar2.o();
            }
        }
        if (ckeVar != null) {
            ckeVarD = ckeVar;
        } else {
            ckeVarD = d() != null ? d() : this.j;
        }
        defpackage.cnj cnjVar2 = this.i;
        defpackage.cjr cjrVar2 = cnjVar2.e;
        if (cjrVar2 == null) {
            defpackage.csc.c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        defpackage.dai.V(cmlVar2, cjrVar2, 0L, cnjVar2.b, 0L, f, ckeVarD, 0, 858);
    }

    public final java.lang.String toString() {
        return "Params: \tname: " + this.b + "\n\tviewportWidth: " + java.lang.Float.intBitsToFloat((int) (a() >> 32)) + "\n\tviewportHeight: " + java.lang.Float.intBitsToFloat((int) (a() & 4294967295L)) + "\n";
    }
}
