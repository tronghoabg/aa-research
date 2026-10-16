package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class erg {
    public static final esb a = new erf(1);
    public static final esb b = new erf(0);
    public static final esb c = new erf(2);

    public static final erb a(esc escVar) {
        Object objA = escVar.a(a);
        if (objA == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        fbg fbgVar = (fbg) objA;
        Object objA2 = escVar.a(ers.a);
        if (objA2 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        String str = (String) objA2;
        if (escVar.a(b) == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        ere ereVarB = dun.b(fbgVar);
        if (ereVarB == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        Bundle bundle = (Bundle) escVar.a(c);
        Map map = ereVarB.b().a;
        Object erbVar = map.get(str);
        if (erbVar == null) {
            ereVarB.c();
            Bundle bundle2 = ereVarB.a;
            Bundle bundle3 = null;
            if (bundle2 != null && fbb.f(bundle2, str)) {
                Bundle bundle4 = bundle2.getBundle(str);
                if (bundle4 == null) {
                    bundle4 = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
                }
                bundle2.remove(str);
                if (bundle2.isEmpty()) {
                    ereVarB.a = null;
                }
                bundle3 = bundle4;
            }
            if (bundle3 != null) {
                bundle = bundle3;
            }
            if (bundle == null) {
                erbVar = new erb();
            } else {
                ClassLoader classLoader = erb.class.getClassLoader();
                classLoader.getClass();
                bundle.setClassLoader(classLoader);
                afby afbyVar = new afby(bundle.size());
                for (String str2 : bundle.keySet()) {
                    str2.getClass();
                    afbyVar.put(str2, bundle.get(str2));
                }
                erbVar = new erb(afbyVar.e());
            }
            map.put(str, erbVar);
        }
        return (erb) erbVar;
    }

    public static final void b(fbg fbgVar) {
        eps epsVarA = fbgVar.getLifecycle().a();
        if (epsVarA != eps.b && epsVarA != eps.c) {
            throw new IllegalArgumentException(a.bw(epsVarA, fbgVar, "Failed to enable `SavedStateHandle` for `", "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`."));
        }
        dun.c(fbgVar, (eru) fbgVar);
    }
}
