package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class fbg implements defpackage.eqe {
    private final defpackage.fbm a;

    public fbg(defpackage.fbm fbmVar) {
        this.a = fbmVar;
    }

    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        if (epwVar != defpackage.epw.ON_CREATE) {
            throw new java.lang.AssertionError("Next event must be ON_CREATE");
        }
        eqgVar.getLifecycle().d(this);
        defpackage.fbm fbmVar = this.a;
        android.os.Bundle bundleA = fbmVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new java.lang.IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (java.lang.String str : stringArrayList) {
            try {
                java.lang.Class<? extends U> clsAsSubclass = java.lang.Class.forName(str, false, defpackage.fbg.class.getClassLoader()).asSubclass(fbi.class);
                clsAsSubclass.getClass();
                try {
                    java.lang.reflect.Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                        objNewInstance.getClass();
                        ((fbi) objNewInstance).a(fbmVar);
                    } catch (java.lang.Exception e) {
                        throw new java.lang.RuntimeException("Failed to instantiate ".concat(java.lang.String.valueOf(str)), e);
                    }
                } catch (java.lang.NoSuchMethodException e2) {
                    throw new java.lang.IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (java.lang.ClassNotFoundException e3) {
                throw new java.lang.RuntimeException(defpackage.a.bp(str, "Class ", " wasn't found"), e3);
            }
        }
    }
}
