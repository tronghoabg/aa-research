package defpackage;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public final class cds implements cdp, fbg {
    public fbf a;
    private final /* synthetic */ cdp b;
    private eqc c;

    public cds(cdp cdpVar) {
        this.b = cdpVar;
        Object objA = a("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objA instanceof Bundle ? (Bundle) objA : null;
        if (bundle != null) {
            c(bundle);
        }
        e("androidx.savedstate.SavedStateRegistry", new bxh(this, 3));
    }

    private final fbf c(Bundle bundle) {
        fbf fbfVar = this.a;
        if (fbfVar != null) {
            return fbfVar;
        }
        fbf fbfVarL = ebi.l(this);
        this.a = fbfVarL;
        fbfVarL.b(bundle);
        return fbfVarL;
    }

    @Override // defpackage.cdp
    public final Object a(String str) {
        return this.b.a(str);
    }

    @Override // defpackage.cdp
    public final Map b() {
        return this.b.b();
    }

    @Override // defpackage.cdp
    public final boolean d(Object obj) {
        return this.b.d(obj);
    }

    @Override // defpackage.cdp
    public final rpp e(String str, afdr afdrVar) {
        return this.b.e(str, afdrVar);
    }

    @Override // defpackage.eqa
    public final /* synthetic */ ept getLifecycle() {
        eqc eqcVar = this.c;
        if (eqcVar != null) {
            return eqcVar;
        }
        eqc eqcVar2 = new eqc(this, false);
        this.c = eqcVar2;
        return eqcVar2;
    }

    @Override // defpackage.fbg
    public final fbe getSavedStateRegistry() {
        return (fbe) c(null).b;
    }
}
