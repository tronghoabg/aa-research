package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ajo extends defpackage.aiw {
    private defpackage.crd i;
    private cpu j;

    public ajo(defpackage.ask askVar, defpackage.akr akrVar, boolean z, boolean z2, java.lang.String str, defpackage.ddw ddwVar, defpackage.afer aferVar) {
        super(askVar, akrVar, z, z2, str, ddwVar, aferVar);
    }

    private final void J(boolean z) {
        if (z) {
            this.j = null;
        } else {
            this.i = null;
        }
        i(z);
        this.d = "idle";
    }

    @Override // defpackage.aiw
    protected final void F(android.view.KeyEvent keyEvent) {
        u();
    }

    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.aiw, defpackage.cpv
    public final void H(defpackage.aahg aahgVar, defpackage.cqv cqvVar) {
        super.H(aahgVar, cqvVar);
        int i = 0;
        if (cqvVar != defpackage.cqv.b) {
            if (cqvVar == defpackage.cqv.c) {
                if (this.j != null) {
                    ?? r9 = aahgVar.b;
                    int size = r9.size();
                    while (i < size) {
                        cpu cpuVar = (cpu) r9.get(i);
                        if (cpuVar.g && !defpackage.afga.f(cpuVar, this.j)) {
                            J(true);
                            break;
                        }
                        i++;
                    }
                }
                if (defpackage.afga.f(this.d, "recognized")) {
                    this.d = "idle";
                    return;
                }
                return;
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
                        this.d = "waiting";
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
        ((cpu) r11.get(0)).a();
        if (this.b) {
            this.d = "recognized";
            cpu cpuVar5 = this.j;
            cpuVar5.getClass();
            j(cpuVar5.c, true);
            u();
        }
        this.j = null;
    }

    @Override // defpackage.cpv
    public final void I() {
        J(true);
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
            if (cqvVar == defpackage.cqv.c) {
                if (this.i != null) {
                    java.util.List list = cquVar.a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        defpackage.crd crdVar = (defpackage.crd) list.get(i);
                        if (crdVar.c() && !defpackage.afga.f(crdVar, this.i)) {
                            J(false);
                            break;
                        }
                    }
                }
                if (defpackage.afga.f(this.d, "recognized")) {
                    this.d = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.i == null) {
            if (defpackage.arc.f(cquVar, true)) {
                defpackage.crd crdVar2 = (defpackage.crd) cquVar.a.get(0);
                crdVar2.b();
                this.i = crdVar2;
                if (this.b) {
                    this.d = "waiting";
                    l(crdVar2);
                    return;
                }
                return;
            }
            return;
        }
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
        ((defpackage.crd) list2.get(0)).b();
        if (this.b) {
            this.d = "recognized";
            defpackage.crd crdVar4 = this.i;
            crdVar4.getClass();
            j(crdVar4.c, false);
            u();
        }
        this.i = null;
    }

    @Override // defpackage.aiw
    protected final void G(android.view.KeyEvent keyEvent) {
    }
}
