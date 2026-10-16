package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cdy implements defpackage.cdv, defpackage.fbm {
    public defpackage.fbl a;
    private final /* synthetic */ defpackage.cdv b;
    private defpackage.eqi c;

    public cdy(defpackage.cdv cdvVar) {
        this.b = cdvVar;
        java.lang.Object objA = a("androidx.savedstate.SavedStateRegistry");
        android.os.Bundle bundle = objA instanceof android.os.Bundle ? (android.os.Bundle) objA : null;
        if (bundle != null) {
            c(bundle);
        }
        e("androidx.savedstate.SavedStateRegistry", new defpackage.cew(this, 1));
    }

    private final defpackage.fbl c(android.os.Bundle bundle) {
        defpackage.fbl fblVar = this.a;
        if (fblVar != null) {
            return fblVar;
        }
        defpackage.fbl fblVarH = defpackage.ebq.h(this);
        this.a = fblVarH;
        fblVarH.b(bundle);
        return fblVarH;
    }

    @Override // defpackage.cdv
    public final java.lang.Object a(java.lang.String str) {
        return this.b.a(str);
    }

    @Override // defpackage.cdv
    public final java.util.Map b() {
        return this.b.b();
    }

    @Override // defpackage.cdv
    public final boolean d(java.lang.Object obj) {
        return this.b.d(obj);
    }

    @Override // defpackage.cdv
    public final defpackage.rqj e(java.lang.String str, defpackage.afer aferVar) {
        return this.b.e(str, aferVar);
    }

    @Override // defpackage.eqg
    public final /* synthetic */ defpackage.epy getLifecycle() {
        defpackage.eqi eqiVar = this.c;
        if (eqiVar != null) {
            return eqiVar;
        }
        defpackage.eqi eqiVar2 = new defpackage.eqi(this, false);
        this.c = eqiVar2;
        return eqiVar2;
    }

    @Override // defpackage.fbm
    public final defpackage.fbk getSavedStateRegistry() {
        return (defpackage.fbk) c(null).b;
    }
}
