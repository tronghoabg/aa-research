package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cee extends defpackage.ced {
    private final defpackage.ced l;
    private boolean m;

    public cee(long j, defpackage.ceq ceqVar, defpackage.affc affcVar, defpackage.affc affcVar2, defpackage.ced cedVar) {
        super(j, ceqVar, affcVar, affcVar2);
        this.l = cedVar;
        cedVar.f();
    }

    private final void E() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.l.g();
    }

    @Override // defpackage.ced
    public final defpackage.cen c() {
        defpackage.cee ceeVar;
        defpackage.ced cedVar = this.l;
        if (cedVar.f || cedVar.j) {
            return new defpackage.cel(this);
        }
        defpackage.aaw aawVar = this.g;
        long j = this.i;
        java.util.Map mapM = aawVar != null ? defpackage.cer.m(cedVar.v(), this, cedVar.x()) : null;
        java.lang.Object obj = defpackage.cer.b;
        synchronized (obj) {
            defpackage.cer.s(this);
            if (aawVar == null || aawVar.d == 0) {
                ceeVar = this;
                ceeVar.y();
            } else {
                ceeVar = this;
                defpackage.cen cenVarT = ceeVar.t(cedVar.v(), aawVar, mapM, cedVar.x());
                if (!defpackage.afga.f(cenVarT, defpackage.cem.a)) {
                    return cenVarT;
                }
                defpackage.aaw aawVarS = cedVar.s();
                if (aawVarS != null) {
                    aawVarS.f(aawVar);
                } else {
                    cedVar.u(aawVar);
                    ceeVar.g = null;
                }
            }
            if (defpackage.afga.c(cedVar.v(), j) < 0) {
                cedVar.l();
            }
            cedVar.A(cedVar.x().b(j).a(ceeVar.d));
            cedVar.o(j);
            int i = ceeVar.k;
            ceeVar.k = -1;
            if (i >= 0) {
                int[] iArr = cedVar.e;
                iArr.getClass();
                int length = iArr.length;
                int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length + 1);
                iArrCopyOf[length] = i;
                iArrCopyOf.getClass();
                cedVar.e = iArrCopyOf;
            }
            defpackage.ceq ceqVar = ceeVar.d;
            synchronized (obj) {
                cedVar.d = cedVar.d.c(ceqVar);
                defpackage.ced cedVar2 = ceeVar.l;
                int[] iArrBB = ceeVar.e;
                if (iArrBB.length != 0) {
                    int[] iArr2 = cedVar2.e;
                    if (iArr2.length != 0) {
                        iArrBB = defpackage.afga.bB(iArr2, iArrBB);
                    }
                    cedVar2.e = iArrBB;
                }
            }
            ceeVar.f = true;
            ceeVar.E();
            return defpackage.cem.a;
        }
    }

    @Override // defpackage.ced, defpackage.cej
    public final void d() {
        if (this.j) {
            return;
        }
        super.d();
        E();
    }
}
