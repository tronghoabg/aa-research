package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class euu {
    public final Context a;
    public final ewp b = new ewp(this, new epp(this, 4));
    public Activity c;
    public boolean d;
    public final om e;
    public boolean f;
    public final erb g;
    private final aezr h;

    public euu(Context context) {
        this.a = context;
        Object obj = null;
        this.g = new erb(context, (byte[]) null);
        Iterator itA = afrg.f(context, new dmw(15)).a();
        while (true) {
            if (!itA.hasNext()) {
                break;
            }
            Object next = itA.next();
            if (((Context) next) instanceof Activity) {
                obj = next;
                break;
            }
        }
        this.c = (Activity) obj;
        this.e = new eut(this);
        this.f = true;
        evq evqVar = this.b.k;
        evqVar.c(new evb(evqVar));
        this.b.k.c(new ety(this.a));
        this.h = new aezy(new epp(this, 5));
    }

    public final eur a(evp evpVar) {
        evpVar.getClass();
        return new eur(this, evpVar);
    }

    public final euz b() {
        return this.b.e();
    }

    public final evc c() {
        return (evc) this.h.a();
    }

    public final evq d() {
        return this.b.k;
    }

    public final euz e(int i) {
        return this.b.d(i, null);
    }

    public final void f(int i, Bundle bundle) {
        int i2;
        eve eveVar;
        int i3;
        ewp ewpVar = this.b;
        afaz afazVar = ewpVar.e;
        euz euzVar = afazVar.isEmpty() ? ewpVar.b : ((euq) afazVar.e()).a;
        if (euzVar == null) {
            throw new IllegalStateException(a.bm(this, "No current destination found. Ensure a navigation graph has been set for NavController ", "."));
        }
        eun eunVarE = euzVar.e(i);
        Bundle bundleZ = null;
        int i4 = 0;
        if (eunVarE != null) {
            eveVar = eunVarE.b;
            Bundle bundle2 = eunVarE.c;
            i2 = eunVarE.a;
            if (bundle2 != null) {
                bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
                bundleZ.putAll(bundle2);
            }
        } else {
            i2 = i;
            eveVar = null;
        }
        if (bundle != null) {
            if (bundleZ == null) {
                bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
            }
            bundleZ.putAll(bundle);
        }
        if (i2 != 0) {
            i4 = i2;
        } else if (eveVar != null && (i3 = eveVar.c) != -1) {
            if (i3 != -1) {
                ewpVar.t(i3, eveVar.d);
                return;
            }
            return;
        }
        if (i4 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        euz euzVarE = e(i4);
        if (euzVarE != null) {
            g(euzVarE, bundleZ, eveVar);
            return;
        }
        erb erbVar = this.g;
        String strK = ebf.K(erbVar, i4);
        if (eunVarE == null) {
            throw new IllegalArgumentException(a.by(euzVar, strK, "Navigation action/destination ", " cannot be found from the current destination "));
        }
        throw new IllegalArgumentException("Navigation destination " + strK + " referenced from action " + ebf.K(erbVar, i) + " cannot be found from the current destination " + euzVar);
    }

    public final void g(euz euzVar, Bundle bundle, eve eveVar) {
        this.b.p(euzVar, bundle, eveVar);
    }
}
