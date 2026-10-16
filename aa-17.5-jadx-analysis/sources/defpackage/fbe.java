package defpackage;

import android.os.Bundle;
import com.google.android.gms.car.lifecycle.CarActivityRegionLayoutConfig;

/* loaded from: classes.dex */
public final class fbe {
    public final Object a;
    public Object b;

    public fbe(CarActivityRegionLayoutConfig carActivityRegionLayoutConfig, Runnable runnable) {
        this.b = carActivityRegionLayoutConfig;
        this.a = runnable;
    }

    public final Bundle a(String str) {
        fbj fbjVar = (fbj) this.a;
        if (!fbjVar.d) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = fbjVar.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundleB = fbb.f(bundle, str) ? fbb.b(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            fbjVar.c = null;
        }
        return bundleB;
    }

    public final fbd b(String str) {
        fbd fbdVar;
        Object obj = this.a;
        synchronized (((fbj) obj).g) {
            fbdVar = (fbd) ((fbj) obj).f.a(str);
        }
        return fbdVar;
    }

    public final void c(String str, fbd fbdVar) {
        fbdVar.getClass();
        Object obj = this.a;
        synchronized (((fbj) obj).g) {
            aan aanVar = ((fbj) obj).f;
            if (aan.f(aanVar, str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            aanVar.m(str, fbdVar);
        }
    }

    public final void d(Class cls) throws NoSuchMethodException, SecurityException {
        if (!((fbj) this.a).e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Object fazVar = this.b;
        if (fazVar == null) {
            fazVar = new faz(this);
        }
        this.b = fazVar;
        try {
            cls.getDeclaredConstructor(null);
            Object obj = this.b;
            if (obj != null) {
                String name = cls.getName();
                name.getClass();
                ((faz) obj).a.add(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public fbe(fbj fbjVar) {
        this.a = fbjVar;
    }
}
