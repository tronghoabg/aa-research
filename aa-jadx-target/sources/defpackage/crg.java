package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class crg {
    public defpackage.ctc a;
    public defpackage.cqu b;
    public final /* synthetic */ defpackage.crj c;
    public int d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public crg(defpackage.crj crjVar) {
        this();
        this.c = crjVar;
        this.d = 1;
    }

    public final void a(defpackage.cqu cquVar, boolean z) {
        java.util.List list = cquVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((defpackage.crd) list.get(i)).c()) {
                c(cquVar);
                return;
            }
        }
        defpackage.ctc ctcVar = this.a;
        if (ctcVar == null) {
            throw new java.lang.IllegalStateException("layoutCoordinates not set");
        }
        defpackage.crj crjVar = this.c;
        defpackage.tq.g(cquVar, ctcVar.j(0L), new defpackage.bpn(this, crjVar, 3, null), false);
        if (this.d == 2) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((defpackage.crd) list.get(i2)).b();
                }
            }
            defpackage.xh xhVar = cquVar.f;
            if (xhVar != null) {
                xhVar.a = !crjVar.b;
            }
        }
    }

    public final void b() {
        this.d = 1;
        this.c.b = false;
        this.b = null;
    }

    public final void c(defpackage.cqu cquVar) {
        if (this.d == 2) {
            defpackage.ctc ctcVar = this.a;
            if (ctcVar == null) {
                throw new java.lang.IllegalStateException("layoutCoordinates not set");
            }
            defpackage.tq.g(cquVar, ctcVar.j(0L), new defpackage.chs(this.c, 9), true);
        }
        this.d = 3;
    }

    public crg() {
    }
}
