package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class erm {
    public static final defpackage.esh a = new defpackage.erl(1);
    public static final defpackage.esh b = new defpackage.erl(0);
    public static final defpackage.esh c = new defpackage.erl(2);

    public static final defpackage.erh a(defpackage.esi esiVar) {
        java.lang.Object objA = esiVar.a(a);
        if (objA == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        defpackage.fbm fbmVar = (defpackage.fbm) objA;
        java.lang.Object objA2 = esiVar.a(defpackage.ery.a);
        if (objA2 == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        java.lang.String str = (java.lang.String) objA2;
        if (esiVar.a(b) == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        defpackage.erj erjVarH = defpackage.ebo.h(fbmVar);
        if (erjVarH == null) {
            throw new java.lang.IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        android.os.Bundle bundle = (android.os.Bundle) esiVar.a(c);
        java.util.Map map = erjVarH.b().a;
        java.lang.Object erhVar = map.get(str);
        if (erhVar == null) {
            erjVarH.c();
            android.os.Bundle bundle2 = erjVarH.a;
            android.os.Bundle bundle3 = null;
            if (bundle2 != null && defpackage.fbh.f(bundle2, str)) {
                android.os.Bundle bundle4 = bundle2.getBundle(str);
                if (bundle4 == null) {
                    bundle4 = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
                }
                bundle2.remove(str);
                if (bundle2.isEmpty()) {
                    erjVarH.a = null;
                }
                bundle3 = bundle4;
            }
            if (bundle3 != null) {
                bundle = bundle3;
            }
            if (bundle == null) {
                erhVar = new defpackage.erh();
            } else {
                java.lang.ClassLoader classLoader = defpackage.erh.class.getClassLoader();
                classLoader.getClass();
                bundle.setClassLoader(classLoader);
                defpackage.afcy afcyVar = new defpackage.afcy(bundle.size());
                for (java.lang.String str2 : bundle.keySet()) {
                    str2.getClass();
                    afcyVar.put(str2, bundle.get(str2));
                }
                erhVar = new defpackage.erh(afcyVar.e());
            }
            map.put(str, erhVar);
        }
        return (defpackage.erh) erhVar;
    }

    public static final void b(defpackage.fbm fbmVar) {
        defpackage.epx epxVarA = fbmVar.getLifecycle().a();
        if (epxVarA != defpackage.epx.b && epxVarA != defpackage.epx.c) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bv(epxVarA, fbmVar, "Failed to enable `SavedStateHandle` for `", "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`."));
        }
        defpackage.ebo.i(fbmVar, (defpackage.esa) fbmVar);
    }
}
