package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class alo extends defpackage.cwo implements defpackage.cwm, defpackage.cyp {
    public defpackage.aja a;
    public defpackage.aiz b;
    private defpackage.aqk c;
    private defpackage.apn d;
    private boolean e;
    private defpackage.aor f;
    private defpackage.ask g;
    private defpackage.and h;
    private boolean i;
    private defpackage.aqj j;
    private defpackage.cwn k;
    private boolean l;
    private defpackage.aiz m;

    public alo(defpackage.aqk aqkVar, defpackage.apn apnVar, boolean z, defpackage.aor aorVar, defpackage.ask askVar, defpackage.and andVar, boolean z2, defpackage.aiz aizVar) {
        this.c = aqkVar;
        this.d = apnVar;
        this.e = z;
        this.f = aorVar;
        this.g = askVar;
        this.h = andVar;
        this.i = z2;
        this.m = aizVar;
    }

    private final void g() {
        defpackage.cwn cwnVar = this.k;
        if (cwnVar != null) {
            if (cwnVar.M().A) {
                return;
            }
            W(cwnVar);
            return;
        }
        if (this.i) {
            defpackage.dai.z(this, new defpackage.aln(this, 0));
        }
        defpackage.aiz aizVarD = d();
        if (aizVarD != null) {
            defpackage.cwn cwnVar2 = aizVarD.g;
            if (cwnVar2.M().A) {
                return;
            }
            W(cwnVar2);
            this.k = cwnVar2;
        }
    }

    public final boolean b() {
        defpackage.dlz dlzVar = defpackage.dlz.a;
        if (this.A) {
            dlzVar = defpackage.cjv.r(this).s;
        }
        return dlzVar != defpackage.dlz.b || this.d == defpackage.apn.a;
    }

    public final defpackage.aiz d() {
        return this.i ? this.b : this.m;
    }

    @Override // defpackage.cge
    public final void dk() {
        boolean zB = b();
        if (this.l != zB) {
            this.l = zB;
            f(this.c, this.d, this.i, d(), this.e, this.f, this.g, this.h);
        }
    }

    @Override // defpackage.cge
    public final void dz() {
        this.l = b();
        g();
        if (this.j == null) {
            defpackage.aqj aqjVar = new defpackage.aqj(this.c, d(), this.f, this.d, this.e, this.l, this.g, this.h);
            W(aqjVar);
            this.j = aqjVar;
        }
    }

    public final void f(defpackage.aqk aqkVar, defpackage.apn apnVar, boolean z, defpackage.aiz aizVar, boolean z2, defpackage.aor aorVar, defpackage.ask askVar, defpackage.and andVar) {
        boolean z3;
        this.c = aqkVar;
        this.d = apnVar;
        boolean z4 = true;
        if (this.i != z) {
            this.i = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (defpackage.afga.f(this.m, aizVar)) {
            z4 = false;
        } else {
            this.m = aizVar;
        }
        if (z3 || (z4 && !z)) {
            defpackage.cwn cwnVar = this.k;
            if (cwnVar != null) {
                V(cwnVar);
            }
            this.k = null;
            g();
        }
        this.e = z2;
        this.f = aorVar;
        this.g = askVar;
        this.h = andVar;
        boolean zB = b();
        this.l = zB;
        defpackage.aqj aqjVar = this.j;
        if (aqjVar != null) {
            aqjVar.L(aqkVar, apnVar, d(), z2, zB, aorVar, askVar, andVar);
        }
    }

    @Override // defpackage.cge
    public final void q() {
        defpackage.cwn cwnVar = this.k;
        if (cwnVar != null) {
            V(cwnVar);
        }
    }

    @Override // defpackage.cyp
    public final void r() {
        defpackage.aja ajaVar = (defpackage.aja) defpackage.cjv.y(this, defpackage.alc.a);
        if (defpackage.afga.f(ajaVar, this.a)) {
            return;
        }
        this.a = ajaVar;
        this.b = null;
        defpackage.cwn cwnVar = this.k;
        if (cwnVar != null) {
            V(cwnVar);
        }
        this.k = null;
        g();
        defpackage.aqj aqjVar = this.j;
        if (aqjVar != null) {
            aqjVar.L(this.c, this.d, d(), this.e, this.l, this.f, this.g, this.h);
        }
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }
}
