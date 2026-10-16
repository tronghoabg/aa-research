package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class erh implements erq {
    public final fbg a;
    public final eru b;
    public final Bundle c;
    private final Application d;
    private final erq e;

    public erh(Application application, fbg fbgVar, Bundle bundle) {
        erp erpVar;
        if (!(fbgVar instanceof eru)) {
            throw new IllegalArgumentException("SavedStateRegistryOwner must implement ViewModelStoreOwner to support SavedStateHandles");
        }
        this.a = fbgVar;
        this.b = (eru) fbgVar;
        this.c = bundle;
        this.d = application;
        if (application != null) {
            if (erp.a == null) {
                erp.a = new erp(application);
            }
            erpVar = erp.a;
            erpVar.getClass();
        } else {
            erpVar = new erp(null);
        }
        this.e = erpVar;
    }

    @Override // defpackage.erq
    public final erm a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.erq
    public final erm b(Class cls, esc escVar) {
        Object objA = escVar.a(ers.a);
        if (objA == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        String str = (String) objA;
        if (escVar.a(erg.a) == null || escVar.a(erg.b) == null) {
            if (this.a != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY and VIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras to successfully create a ViewModel.");
        }
        Application application = (Application) escVar.a(erp.b);
        boolean zIsAssignableFrom = eoy.class.isAssignableFrom(cls);
        Constructor constructorB = (!zIsAssignableFrom || application == null) ? eri.b(cls, eri.b) : eri.b(cls, eri.a);
        if (constructorB == null) {
            return this.e.b(cls, escVar);
        }
        erb erbVarA = erg.a(escVar);
        return (!zIsAssignableFrom || application == null) ? eri.a(cls, constructorB, erbVarA) : eri.a(cls, constructorB, application, erbVarA);
    }

    @Override // defpackage.erq
    public final erm c(afhe afheVar, esc escVar) {
        return b(affa.h(afheVar), escVar);
    }

    public final erm d(String str, Class cls) {
        eru eruVar;
        fbg fbgVar = this.a;
        if (fbgVar == null || (eruVar = this.b) == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = eoy.class.isAssignableFrom(cls);
        Application application = this.d;
        boolean z = application != null;
        Constructor constructorB = (zIsAssignableFrom && z) ? eri.b(cls, eri.a) : eri.b(cls, eri.b);
        if (constructorB == null) {
            if (z) {
                return this.e.a(cls);
            }
            if (err.c == null) {
                err.c = new err();
            }
            err.c.getClass();
            return eqy.d(cls);
        }
        dun.a(fbgVar, dun.c(fbgVar, eruVar));
        esc escVarG = ecw.g(eruVar);
        bpi bpiVar = new bpi(this, str, 12, null);
        escVarG.getClass();
        ese eseVar = new ese(escVarG);
        bpiVar.invoke(eseVar);
        erb erbVarA = erg.a(eseVar);
        return (zIsAssignableFrom && z) ? eri.a(cls, constructorB, application, erbVarA) : eri.a(cls, constructorB, erbVarA);
    }

    public erh() {
        this.d = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = new erp(null);
    }
}
