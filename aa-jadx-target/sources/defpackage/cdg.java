package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cdg {
    public java.util.Set a;
    public final defpackage.bzc b;
    public defpackage.bzc c;
    public final defpackage.bzc d;
    public final defpackage.bzc e;
    public java.util.ArrayList f;
    public defpackage.aaw g;
    public defpackage.aaw h;
    public defpackage.aaw i;
    public defpackage.aau j;
    private defpackage.cfm k;

    public cdg() {
        defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.bxx[16]);
        this.b = bzcVar;
        defpackage.aaw aawVar = defpackage.aax.a;
        this.h = new defpackage.aaw(6);
        this.c = bzcVar;
        this.d = new defpackage.bzc(new java.lang.Object[16]);
        this.e = new defpackage.bzc(new defpackage.afer[16]);
    }

    private static final boolean i(defpackage.bxx bxxVar, defpackage.bzc bzcVar) {
        java.lang.Object[] objArr = bzcVar.a;
        int i = bzcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.bxw bxwVarA = ((defpackage.bxx) objArr[i2]).a();
            if (bxwVarA instanceof defpackage.cdb) {
                defpackage.bzc bzcVar2 = ((defpackage.cdb) bxwVarA).a;
                if (bzcVar2.m(bxxVar) || i(bxxVar, bzcVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.a = null;
        this.k = null;
        defpackage.bzc bzcVar = this.b;
        bzcVar.g();
        this.h.d();
        this.c = bzcVar;
        this.d.g();
        this.e.g();
        this.i = null;
        this.j = null;
        this.f = null;
    }

    public final void b() {
        java.util.Set set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        defpackage.aaj aajVar = new defpackage.aaj((defpackage.aak) set, 0);
        while (aajVar.hasNext()) {
            defpackage.bxw bxwVar = (defpackage.bxw) aajVar.next();
            aajVar.remove();
            bxwVar.ee();
        }
    }

    public final void c() {
        java.util.Set set;
        java.util.Set set2 = this.a;
        if (set2 == null) {
            return;
        }
        this.g = null;
        defpackage.bzc bzcVar = this.d;
        int i = bzcVar.b;
        if (i != 0) {
            defpackage.aaw aawVar = this.i;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                java.lang.Object obj = bzcVar.a[i];
                try {
                    if (obj instanceof defpackage.bxx) {
                        defpackage.bxw bxwVarA = ((defpackage.bxx) obj).a();
                        set2.remove(bxwVarA);
                        bxwVarA.ef();
                    }
                    if (obj instanceof defpackage.buy) {
                        if (aawVar == null || !aawVar.a(obj)) {
                            ((defpackage.buy) obj).b();
                        } else {
                            ((defpackage.buy) obj).c();
                        }
                    }
                } catch (java.lang.Throwable th) {
                    defpackage.cfm cfmVar = this.k;
                    if (cfmVar != null) {
                        cfmVar.c(th, obj);
                    }
                    throw th;
                }
            }
        }
        defpackage.bzc bzcVar2 = this.b;
        int i2 = bzcVar2.b;
        if (i2 == 0 || (set = this.a) == null) {
            return;
        }
        java.lang.Object[] objArr = bzcVar2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            defpackage.bxx bxxVar = (defpackage.bxx) objArr[i3];
            defpackage.bxw bxwVarA2 = bxxVar.a();
            set.remove(bxwVarA2);
            try {
                bxwVarA2.dw();
            } catch (java.lang.Throwable th2) {
                defpackage.cfm cfmVar2 = this.k;
                if (cfmVar2 != null) {
                    cfmVar2.c(th2, bxxVar);
                }
                throw th2;
            }
        }
    }

    public final void d() {
        defpackage.bzc bzcVar = this.e;
        int i = bzcVar.b;
        if (i != 0) {
            java.lang.Object[] objArr = bzcVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                ((defpackage.afer) objArr[i2]).invoke();
            }
            bzcVar.g();
        }
    }

    public final void e(defpackage.bxx bxxVar) {
        if (!this.h.a(bxxVar)) {
            defpackage.aaw aawVar = this.g;
            if (aawVar == null || !aawVar.a(bxxVar)) {
                f(bxxVar);
                return;
            }
            return;
        }
        this.h.l(bxxVar);
        if (!this.c.m(bxxVar)) {
            defpackage.bzc bzcVar = this.b;
            if (!bzcVar.m(bxxVar)) {
                i(bxxVar, bzcVar);
            }
        }
        java.util.Set set = this.a;
        if (set == null) {
            return;
        }
        set.add(bxxVar.a());
    }

    public final void f(java.lang.Object obj) {
        this.d.n(obj);
    }

    public final void g(defpackage.bxx bxxVar) {
        this.c.n(bxxVar);
        this.h.j(bxxVar);
    }

    public final void h(java.util.Set set, defpackage.cfm cfmVar) {
        a();
        this.a = set;
        this.k = cfmVar;
    }
}
