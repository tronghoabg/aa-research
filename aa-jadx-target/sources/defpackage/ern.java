package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ern implements defpackage.erw {
    public final defpackage.fbm a;
    public final defpackage.esa b;
    public final android.os.Bundle c;
    private final android.app.Application d;
    private final defpackage.erw e;

    public ern(android.app.Application application, defpackage.fbm fbmVar, android.os.Bundle bundle) {
        defpackage.erv ervVar;
        if (!(fbmVar instanceof defpackage.esa)) {
            throw new java.lang.IllegalArgumentException("SavedStateRegistryOwner must implement ViewModelStoreOwner to support SavedStateHandles");
        }
        this.a = fbmVar;
        this.b = (defpackage.esa) fbmVar;
        this.c = bundle;
        this.d = application;
        if (application != null) {
            if (defpackage.erv.a == null) {
                defpackage.erv.a = new defpackage.erv(application);
            }
            ervVar = defpackage.erv.a;
            ervVar.getClass();
        } else {
            ervVar = new defpackage.erv(null);
        }
        this.e = ervVar;
    }

    @Override // defpackage.erw
    public final defpackage.ers a(java.lang.Class cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.erw
    public final defpackage.ers b(java.lang.Class cls, defpackage.esi esiVar) {
        java.lang.Object objA = esiVar.a(defpackage.ery.a);
        if (objA == null) {
            throw new java.lang.IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        java.lang.String str = (java.lang.String) objA;
        if (esiVar.a(defpackage.erm.a) == null || esiVar.a(defpackage.erm.b) == null) {
            if (this.a != null) {
                return d(str, cls);
            }
            throw new java.lang.IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY and VIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras to successfully create a ViewModel.");
        }
        android.app.Application application = (android.app.Application) esiVar.a(defpackage.erv.b);
        boolean zIsAssignableFrom = epe.class.isAssignableFrom(cls);
        java.lang.reflect.Constructor constructorB = (!zIsAssignableFrom || application == null) ? defpackage.ero.b(cls, defpackage.ero.b) : defpackage.ero.b(cls, defpackage.ero.a);
        if (constructorB == null) {
            return this.e.b(cls, esiVar);
        }
        defpackage.erh erhVarA = defpackage.erm.a(esiVar);
        return (!zIsAssignableFrom || application == null) ? defpackage.ero.a(cls, constructorB, erhVarA) : defpackage.ero.a(cls, constructorB, application, erhVarA);
    }

    @Override // defpackage.erw
    public final defpackage.ers c(defpackage.afie afieVar, defpackage.esi esiVar) {
        return b(defpackage.afga.h(afieVar), esiVar);
    }

    public final defpackage.ers d(java.lang.String str, java.lang.Class cls) {
        defpackage.esa esaVar;
        defpackage.fbm fbmVar = this.a;
        if (fbmVar == null || (esaVar = this.b) == null) {
            throw new java.lang.UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = epe.class.isAssignableFrom(cls);
        android.app.Application application = this.d;
        boolean z = application != null;
        java.lang.reflect.Constructor constructorB = (zIsAssignableFrom && z) ? defpackage.ero.b(cls, defpackage.ero.a) : defpackage.ero.b(cls, defpackage.ero.b);
        if (constructorB == null) {
            if (z) {
                return this.e.a(cls);
            }
            if (defpackage.erx.c == null) {
                defpackage.erx.c = new defpackage.erx();
            }
            defpackage.erx.c.getClass();
            return defpackage.ebl.k(cls);
        }
        defpackage.ebo.i(fbmVar, esaVar);
        defpackage.ebj.d(fbmVar);
        defpackage.esi esiVarF = defpackage.edd.f(esaVar);
        defpackage.bpn bpnVar = new defpackage.bpn(this, str, 12, null);
        esiVarF.getClass();
        defpackage.esk eskVar = new defpackage.esk(esiVarF);
        bpnVar.invoke(eskVar);
        defpackage.erh erhVarA = defpackage.erm.a(eskVar);
        return (zIsAssignableFrom && z) ? defpackage.ero.a(cls, constructorB, application, erhVarA) : defpackage.ero.a(cls, constructorB, erhVarA);
    }

    public ern() {
        this.d = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = new defpackage.erv(null);
    }
}
