package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aecq {
    public int a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public aecq(defpackage.rpe rpeVar) throws defpackage.qst, rlo {
        this.c = new java.util.concurrent.CopyOnWriteArrayList();
        this.a = -1;
        defpackage.lji ljiVar = new defpackage.lji(this, 2);
        this.d = ljiVar;
        this.b = rpeVar;
        rpeVar.f(ljiVar, 7, 0);
        defpackage.qsz qszVarA = rpeVar.a(7);
        if (qszVarA != null) {
            ljiVar.d(qszVarA.a, qszVarA.b, qszVarA.c, qszVarA.d);
        }
    }

    public final void a(boolean z, aeco aecoVar, ajny ajnyVar, boolean z2) {
        ajnyVar.getClass();
        int iB = aecoVar.b();
        boolean zD = aecoVar.d();
        int i = (int) ajnyVar.b;
        if (zD || iB < i) {
            if (!zD && iB > 0) {
                aecoVar.c(ajnyVar, iB, false);
            }
            aecoVar.a.a(ajnyVar, (int) ajnyVar.b);
            aecoVar.d = z | aecoVar.d;
        } else {
            aecoVar.c(ajnyVar, i, z);
        }
        if (z2) {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aedf, java.lang.Object] */
    public final void b() {
        try {
            this.c.c();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aecp, java.lang.Object] */
    public final void c() {
        ?? r0 = this.b;
        aeco[] aecoVarArrR = r0.r();
        java.util.Collections.shuffle(java.util.Arrays.asList(aecoVarArrR));
        int length = aecoVarArrR.length;
        int i = ((aeco) this.d).b;
        while (true) {
            int i2 = 0;
            if (length <= 0 || i <= 0) {
                break;
            }
            int iCeil = (int) java.lang.Math.ceil(i / length);
            for (int i3 = 0; i3 < length && i > 0; i3++) {
                aeco aecoVar = aecoVarArrR[i3];
                int iMin = java.lang.Math.min(i, java.lang.Math.min(aecoVar.a(), iCeil));
                if (iMin > 0) {
                    aecoVar.c += iMin;
                    i -= iMin;
                }
                if (aecoVar.a() > 0) {
                    aecoVarArrR[i2] = aecoVar;
                    i2++;
                }
            }
            length = i2;
        }
        up upVar = new up((short[]) null);
        for (aeco aecoVar2 : r0.r()) {
            aecoVar2.f(aecoVar2.c, upVar);
            aecoVar2.c = 0;
        }
        if (upVar.e()) {
            b();
        }
    }

    public final void d(aeco aecoVar, int i) {
        if (aecoVar == null) {
            ((aeco) this.d).e(i);
            c();
            return;
        }
        aecoVar.e(i);
        up upVar = new up((short[]) null);
        aecoVar.f(aecoVar.b(), upVar);
        if (upVar.e()) {
            b();
        }
    }

    public aecq(aecp aecpVar, aedf aedfVar) {
        this.b = aecpVar;
        aedfVar.getClass();
        this.c = aedfVar;
        this.a = 65535;
        this.d = new aeco(this, 0, 65535, (aecn) null);
    }
}
