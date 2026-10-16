package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adsr extends defpackage.admj {
    final /* synthetic */ defpackage.adss f;
    private final defpackage.admb g;
    private defpackage.admj h;
    private defpackage.adml i;

    public adsr(defpackage.adss adssVar, defpackage.admb admbVar) {
        this.f = adssVar;
        this.g = admbVar;
        defpackage.adml admlVar = adssVar.a;
        this.i = admlVar;
        this.h = admlVar.a(admbVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // defpackage.admj
    public final defpackage.ador a(defpackage.admf admfVar) {
        defpackage.aean aeanVar = (defpackage.aean) admfVar.c;
        if (aeanVar == null) {
            aeanVar = new defpackage.aean(this.f.a, null);
        }
        defpackage.adml admlVar = this.i;
        if (admlVar != null) {
            if (!aeanVar.a.c().equals(admlVar.c())) {
                defpackage.admb admbVar = this.g;
                admbVar.f(defpackage.adkh.a, new defpackage.adma(defpackage.admd.a));
                this.h.d();
                defpackage.adml admlVar2 = aeanVar.a;
                this.i = admlVar2;
                defpackage.admj admjVar = this.h;
                this.h = admlVar2.a(admbVar);
                admbVar.a().b(2, "Load balancer changed from {0} to {1}", admjVar.getClass().getSimpleName(), this.h.getClass().getSimpleName());
            }
        } else {
            defpackage.admb admbVar2 = this.g;
            admbVar2.f(defpackage.adkh.a, new defpackage.adma(defpackage.admd.a));
            this.h.d();
            defpackage.adml admlVar3 = aeanVar.a;
            this.i = admlVar3;
            defpackage.admj admjVar2 = this.h;
            this.h = admlVar3.a(admbVar2);
            admbVar2.a().b(2, "Load balancer changed from {0} to {1}", admjVar2.getClass().getSimpleName(), this.h.getClass().getSimpleName());
        }
        java.lang.Object obj = aeanVar.b;
        if (obj != null) {
            this.g.a().b(1, "Load-balancing config: {0}", obj);
        }
        defpackage.admj admjVar3 = this.h;
        defpackage.adjs adjsVar = defpackage.adjs.a;
        return admjVar3.a(new defpackage.admf(admfVar.a, admfVar.b, obj));
    }

    @Override // defpackage.admj
    public final void b(defpackage.ador adorVar) {
        this.h.b(adorVar);
    }

    @Override // defpackage.admj
    public final void c() {
        this.h.c();
    }

    @Override // defpackage.admj
    public final void d() {
        this.h.d();
        this.h = null;
    }
}
