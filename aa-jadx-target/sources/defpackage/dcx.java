package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dcx implements defpackage.bvh, defpackage.eqe {
    public final defpackage.czz a;
    public final defpackage.bvh b;
    public boolean c;
    public defpackage.epy d;
    public defpackage.affg e = defpackage.dbf.a;

    public dcx(defpackage.czz czzVar, defpackage.bvh bvhVar) {
        this.a = czzVar;
        this.b = bvhVar;
    }

    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        if (epwVar == defpackage.epw.ON_DESTROY) {
            d();
        } else {
            if (epwVar != defpackage.epw.ON_CREATE || this.c) {
                return;
            }
            e(this.e);
        }
    }

    @Override // defpackage.bvh
    public final void d() {
        if (!this.c) {
            this.c = true;
            defpackage.czz czzVar = this.a;
            czzVar.setTag(2131429910, null);
            defpackage.epy epyVar = this.d;
            if (epyVar != null) {
                epyVar.d(this);
            }
            this.d = null;
            defpackage.dbn dbnVar = czzVar.g;
            if (dbnVar != null) {
                dbnVar.a.invoke();
            }
            czzVar.g = null;
        }
        this.b.d();
    }

    @Override // defpackage.bvh
    public final void e(defpackage.affg affgVar) {
        defpackage.beh behVar = new defpackage.beh(this, affgVar, 18, null);
        defpackage.czz czzVar = this.a;
        ((java.lang.Boolean) czzVar.m.a()).booleanValue();
        if (czzVar.isAttachedToWindow()) {
            behVar.invoke(czzVar.P());
        } else {
            czzVar.C = behVar;
        }
    }

    @Override // defpackage.bvh
    public final boolean f() {
        return this.b.f();
    }
}
