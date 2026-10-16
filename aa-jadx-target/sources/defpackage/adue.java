package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adue extends defpackage.adui {
    public final defpackage.adme a;
    public final defpackage.adkr b;
    public final defpackage.adkb[] c;
    public volatile defpackage.ador d;
    final /* synthetic */ defpackage.aduf e;
    private java.lang.String g;
    private java.lang.String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adue(defpackage.aduf adufVar, defpackage.adme admeVar, defpackage.adkb[] adkbVarArr, java.lang.String str, java.lang.String str2) {
        super("connecting_and_lb");
        this.e = adufVar;
        this.b = defpackage.adkr.k();
        this.a = admeVar;
        this.c = adkbVarArr;
        this.g = str;
        this.h = str2;
        for (defpackage.adkb adkbVar : adkbVarArr) {
        }
    }

    @Override // defpackage.adui
    public final void b(defpackage.advl advlVar) {
        if (this.a.a.h()) {
            advlVar.a("wait_for_ready");
            defpackage.ador adorVar = this.d;
            if (adorVar != null && !adorVar.g()) {
                advlVar.b("Last Pick Failure", adorVar);
            }
        }
        super.b(advlVar);
    }

    @Override // defpackage.adui
    public final void c(defpackage.ador adorVar) {
        super.c(adorVar);
        defpackage.aduf adufVar = this.e;
        synchronized (adufVar.a) {
            if (adufVar.e != null) {
                boolean zRemove = adufVar.g.remove(this);
                if (!adufVar.d() && zRemove) {
                    defpackage.adox adoxVar = adufVar.b;
                    adoxVar.b(adufVar.d);
                    if (adufVar.h.a != null) {
                        adoxVar.b(adufVar.e);
                        adufVar.e = null;
                    }
                }
            }
        }
        this.e.b.a();
    }

    final synchronized void p() {
        if (this.g != null) {
            for (defpackage.adkb adkbVar : this.c) {
            }
            this.g = null;
            this.h = null;
        }
    }

    final synchronized void q(java.lang.String str, java.lang.String str2) {
        if (this.f == null) {
            if (!j$.util.Objects.equals(this.g, str)) {
                if (this.g != null) {
                    for (defpackage.adkb adkbVar : this.c) {
                    }
                }
                this.g = str;
                this.h = null;
                for (defpackage.adkb adkbVar2 : this.c) {
                }
            }
            if (!j$.util.Objects.equals(this.h, str2)) {
                this.h = str2;
                for (defpackage.adkb adkbVar3 : this.c) {
                }
            }
        }
    }

    @Override // defpackage.adui
    protected final void r() {
        p();
        int i = 0;
        while (true) {
            defpackage.adkb[] adkbVarArr = this.c;
            if (i >= adkbVarArr.length) {
                return;
            }
            defpackage.adkb adkbVar = adkbVarArr[i];
            i++;
        }
    }
}
