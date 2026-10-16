package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class vqy implements defpackage.vqw {
    final /* synthetic */ defpackage.xzi a;
    final /* synthetic */ defpackage.xzi b;
    final /* synthetic */ defpackage.vra c;
    final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public vqy(defpackage.vra vraVar, defpackage.xzi xziVar, defpackage.xzi xziVar2, java.lang.Object obj, int i) {
        this.e = i;
        this.a = xziVar;
        this.b = xziVar2;
        this.d = obj;
        this.c = vraVar;
    }

    private final void a() {
        defpackage.vra vraVar = this.c;
        defpackage.vqu vquVar = vraVar.b;
        if (vquVar != null) {
            ((defpackage.vrl) this.d).g.remove(vquVar);
            vraVar.b = null;
        }
    }

    private final void b() {
        defpackage.vra vraVar = this.c;
        defpackage.vrb vrbVar = vraVar.a;
        if (vrbVar != null) {
            ((defpackage.vsl) this.d).b(vrbVar);
            vraVar.a = null;
        }
    }

    @Override // defpackage.vqw
    public final void g(defpackage.vlu vluVar) {
        int i = this.e;
        defpackage.xzi xziVar = this.a;
        if (i != 0) {
            if (((java.lang.Boolean) xziVar.fF()).booleanValue()) {
                this.c.c.k(vluVar);
                return;
            } else if (((java.lang.Boolean) this.b.fF()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.k(vluVar);
                return;
            }
        }
        if (((java.lang.Boolean) xziVar.fF()).booleanValue()) {
            this.c.c.k(vluVar);
        } else if (((java.lang.Boolean) this.b.fF()).booleanValue()) {
            this.c.c.k(vluVar);
        } else {
            a();
        }
    }

    @Override // defpackage.vqw
    public final void j(defpackage.vlu vluVar) {
        int i = this.e;
        defpackage.xzi xziVar = this.a;
        if (i != 0) {
            if (((java.lang.Boolean) xziVar.fF()).booleanValue()) {
                this.c.c.l(vluVar);
                return;
            } else if (((java.lang.Boolean) this.b.fF()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.l(vluVar);
                return;
            }
        }
        if (((java.lang.Boolean) xziVar.fF()).booleanValue()) {
            this.c.c.l(vluVar);
        } else if (((java.lang.Boolean) this.b.fF()).booleanValue()) {
            this.c.c.l(vluVar);
        } else {
            a();
        }
    }
}
