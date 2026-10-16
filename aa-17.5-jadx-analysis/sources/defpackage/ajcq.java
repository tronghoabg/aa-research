package defpackage;

/* loaded from: classes2.dex */
public class ajcq {
    private final aisx a;
    public final aisx d;
    public final aisx e;

    public ajcq() {
        aisy aisyVar = aisy.a;
        this.d = new aisx(this, aisyVar);
        this.e = new aisx(this, aisyVar);
        this.a = new aisx(null, aisyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r4.d.d(r3, ((defpackage.ajcu) r5).a) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.ajcq hE() {
        /*
            r8 = this;
        L0:
            aisx r0 = r8.e
            java.lang.Object r1 = r0.a
            ajcq r1 = (defpackage.ajcq) r1
            r2 = 0
            r3 = r1
        L8:
            r4 = r2
        L9:
            aisx r5 = r3.d
            java.lang.Object r5 = r5.a
            if (r5 != r8) goto L19
            if (r1 != r3) goto L12
            goto L18
        L12:
            boolean r0 = r0.d(r1, r3)
            if (r0 == 0) goto L0
        L18:
            return r3
        L19:
            boolean r6 = r8.hA()
            if (r6 == 0) goto L20
            return r2
        L20:
            boolean r6 = r5 instanceof defpackage.ajcu
            if (r6 == 0) goto L3b
            if (r4 == 0) goto L34
            ajcu r5 = (defpackage.ajcu) r5
            ajcq r5 = r5.a
            aisx r6 = r4.d
            boolean r3 = r6.d(r3, r5)
            if (r3 == 0) goto L0
            r3 = r4
            goto L8
        L34:
            aisx r3 = r3.e
            java.lang.Object r3 = r3.a
            ajcq r3 = (defpackage.ajcq) r3
            goto L9
        L3b:
            r5.getClass()
            r4 = r5
            ajcq r4 = (defpackage.ajcq) r4
            r7 = r4
            r4 = r3
            r3 = r7
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcq.hE():ajcq");
    }

    public final Object g() {
        return this.d.a;
    }

    public final ajcq h() {
        Object objG = g();
        ajcu ajcuVar = objG instanceof ajcu ? (ajcu) objG : null;
        if (ajcuVar != null) {
            return ajcuVar.a;
        }
        objG.getClass();
        return (ajcq) objG;
    }

    public boolean hA() {
        return g() instanceof ajcu;
    }

    public final ajcq i() {
        ajcq ajcqVarHE = hE();
        if (ajcqVarHE != null) {
            return ajcqVarHE;
        }
        Object obj = this.e.a;
        while (true) {
            ajcq ajcqVar = (ajcq) obj;
            if (!ajcqVar.hA()) {
                return ajcqVar;
            }
            obj = ajcqVar.e.a;
        }
    }

    public final ajcu j() {
        aisx aisxVar = this.a;
        ajcu ajcuVar = (ajcu) aisxVar.a;
        if (ajcuVar != null) {
            return ajcuVar;
        }
        ajcu ajcuVar2 = new ajcu(this);
        aisxVar.b(ajcuVar2);
        return ajcuVar2;
    }

    public final void k(int i) {
        m(new ajcn(i), i);
    }

    public final void l(ajcq ajcqVar) {
        aisx aisxVar;
        ajcq ajcqVar2;
        do {
            aisxVar = ajcqVar.e;
            ajcqVar2 = (ajcq) aisxVar.a;
            if (g() != ajcqVar) {
                return;
            }
        } while (!aisxVar.d(ajcqVar2, this));
        if (hA()) {
            ajcqVar.hE();
        }
    }

    public final boolean m(ajcq ajcqVar, int i) {
        ajcq ajcqVarI;
        do {
            ajcqVarI = i();
            if (ajcqVarI instanceof ajcn) {
                return (((ajcn) ajcqVarI).a & i) == 0 && ajcqVarI.m(ajcqVar, i);
            }
            ajcqVar.e.b(ajcqVarI);
            ajcqVar.d.b(this);
        } while (!ajcqVarI.d.d(this, ajcqVar));
        ajcqVar.l(this);
        return true;
    }

    public final void n() {
        Object objG;
        ajcq ajcqVar;
        do {
            objG = g();
            if (objG instanceof ajcu) {
                ajcq ajcqVar2 = ((ajcu) objG).a;
                return;
            } else if (objG == this) {
                return;
            } else {
                objG.getClass();
                ajcqVar = (ajcq) objG;
            }
        } while (!this.d.d(objG, ajcqVar.j()));
        ajcqVar.hE();
    }

    public String toString() {
        return new affl(this) { // from class: ajcp
            @Override // defpackage.affl, defpackage.afhv
            public final Object get() {
                return aiua.a(this.receiver);
            }
        } + "@" + aiua.b(this);
    }
}
