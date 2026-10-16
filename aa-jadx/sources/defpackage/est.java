package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class est extends defpackage.eqs {
    public final int a;
    public final android.os.Bundle h;
    public final defpackage.etb i;
    public defpackage.esu j;
    private defpackage.eqg k;
    private defpackage.etb l;

    public est(int i, android.os.Bundle bundle, defpackage.etb etbVar, defpackage.etb etbVar2) {
        this.a = i;
        this.h = bundle;
        this.i = etbVar;
        this.l = etbVar2;
        if (etbVar.j != null) {
            throw new java.lang.IllegalStateException("There is already a listener registered");
        }
        etbVar.j = this;
        etbVar.c = i;
    }

    public final defpackage.etb a(boolean z) {
        if (defpackage.ess.d(3)) {
            toString();
            android.util.Log.d("LoaderManager", "  Destroying: ".concat(toString()));
        }
        defpackage.etb etbVar = this.i;
        etbVar.h();
        etbVar.f = true;
        defpackage.esu esuVar = this.j;
        if (esuVar != null) {
            k(esuVar);
            if (z && esuVar.c) {
                if (defpackage.ess.d(2)) {
                    defpackage.etb etbVar2 = esuVar.a;
                    java.util.Objects.toString(etbVar2);
                    android.util.Log.v("LoaderManager", "  Resetting: ".concat(java.lang.String.valueOf(etbVar2)));
                }
                esuVar.b.a(esuVar.a);
            }
        }
        defpackage.est estVar = etbVar.j;
        if (estVar == null) {
            throw new java.lang.IllegalStateException("No listener register");
        }
        if (estVar != this) {
            throw new java.lang.IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        etbVar.j = null;
        if ((esuVar == null || esuVar.c) && !z) {
            return etbVar;
        }
        etbVar.p();
        return this.l;
    }

    public final void b() {
        defpackage.eqg eqgVar = this.k;
        defpackage.esu esuVar = this.j;
        if (eqgVar == null || esuVar == null) {
            return;
        }
        super.k(esuVar);
        eM(eqgVar, esuVar);
    }

    @Override // defpackage.eqp
    protected final void c() {
        if (defpackage.ess.d(2)) {
            toString();
            android.util.Log.v("LoaderManager", "  Starting: ".concat(toString()));
        }
        defpackage.etb etbVar = this.i;
        etbVar.e = true;
        etbVar.g = false;
        etbVar.f = false;
        etbVar.m();
    }

    @Override // defpackage.eqp
    protected final void d() {
        if (defpackage.ess.d(2)) {
            toString();
            android.util.Log.v("LoaderManager", "  Stopping: ".concat(toString()));
        }
        defpackage.etb etbVar = this.i;
        etbVar.e = false;
        etbVar.n();
    }

    @Override // defpackage.eqp
    public final void k(defpackage.eqt eqtVar) {
        super.k(eqtVar);
        this.k = null;
        this.j = null;
    }

    @Override // defpackage.eqp
    public final void m(java.lang.Object obj) {
        super.m(obj);
        defpackage.etb etbVar = this.l;
        if (etbVar != null) {
            etbVar.p();
            this.l = null;
        }
    }

    final void r(defpackage.eqg eqgVar, defpackage.esr esrVar) {
        defpackage.esu esuVar = new defpackage.esu(this.i, esrVar);
        eM(eqgVar, esuVar);
        defpackage.eqt eqtVar = this.j;
        if (eqtVar != null) {
            k(eqtVar);
        }
        this.k = eqgVar;
        this.j = esuVar;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.a);
        sb.append(" : ");
        defpackage.etb etbVar = this.i;
        sb.append(etbVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(etbVar)));
        sb.append("}}");
        return sb.toString();
    }
}
