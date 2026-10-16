package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class eur extends evr {
    public final evp a;
    public final /* synthetic */ euu b;

    public eur(euu euuVar, evp evpVar) {
        this.b = euuVar;
        this.a = evpVar;
    }

    @Override // defpackage.evr
    public final euq a(euz euzVar, Bundle bundle) {
        ewp ewpVar = this.b.b;
        return ebf.M(ewpVar.u(), euzVar, bundle, ewpVar.a(), ewpVar.r);
    }

    public final void b(euq euqVar) {
        euqVar.getClass();
        synchronized (this.h) {
            ajab ajabVar = this.f;
            ajabVar.d(woy.bZ((Collection) ajabVar.b(), euqVar));
        }
    }

    @Override // defpackage.evr
    public final void c(euq euqVar) {
        evn evnVar;
        euqVar.getClass();
        bsh bshVar = new bsh(this, euqVar, 13);
        ewp ewpVar = this.b.b;
        Map map = ewpVar.o;
        boolean zF = affa.f(map.get(euqVar), true);
        bshVar.invoke();
        map.remove(euqVar);
        afaz afazVar = ewpVar.e;
        if (afazVar.contains(euqVar)) {
            if (this.c) {
                return;
            }
            ewpVar.l();
            ewpVar.p.d(woy.ch(afazVar));
            ewpVar.q.d(ewpVar.g());
            return;
        }
        ewpVar.s(euqVar);
        if (euqVar.g.e.a(eps.c)) {
            euqVar.b(eps.a);
        }
        if (!afazVar.isEmpty()) {
            Iterator<E> it = afazVar.iterator();
            while (it.hasNext()) {
                if (affa.f(((euq) it.next()).c, euqVar.c)) {
                    break;
                }
            }
            if (!zF) {
                evnVar.a(euqVar.c);
            }
        } else if (!zF && (evnVar = ewpVar.r) != null) {
            evnVar.a(euqVar.c);
        }
        ewpVar.l();
        ewpVar.q.d(ewpVar.g());
    }

    @Override // defpackage.evr
    public final void d(euq euqVar, boolean z) {
        int i = 14;
        bsh bshVar = new bsh(this, euqVar, i);
        ewp ewpVar = this.b.b;
        evp evpVarA = ewpVar.k.a(euqVar.a.c);
        ewpVar.o.put(euqVar, Boolean.valueOf(z));
        if (!affa.f(evpVarA, this.a)) {
            Object obj = ewpVar.l.get(evpVarA);
            obj.getClass();
            ((eur) obj).d(euqVar, z);
            return;
        }
        afec afecVar = ewpVar.n;
        if (afecVar != null) {
            afecVar.invoke(euqVar);
            bshVar.invoke();
            return;
        }
        epp eppVar = new epp(bshVar, i);
        afaz afazVar = ewpVar.e;
        int iIndexOf = afazVar.indexOf(euqVar);
        if (iIndexOf < 0) {
            Log.i("NavController", a.bm(euqVar, "Ignoring pop of ", " as it was not found on the current back stack"));
            return;
        }
        int i2 = iIndexOf + 1;
        if (i2 != afazVar.a) {
            ewpVar.n(((euq) afazVar.get(i2)).a.c(), true, false);
        }
        ewp.r(ewpVar, euqVar);
        eppVar.invoke();
        ewpVar.a.invoke();
        ewpVar.m();
    }

    @Override // defpackage.evr
    public final void e(euq euqVar) {
        euqVar.getClass();
        ewp ewpVar = this.b.b;
        evp evpVarA = ewpVar.k.a(euqVar.a.c);
        if (!affa.f(evpVarA, this.a)) {
            Object obj = ewpVar.l.get(evpVarA);
            if (obj != null) {
                ((eur) obj).e(euqVar);
                return;
            }
            throw new IllegalStateException("NavigatorBackStack for " + euqVar.a.c + " should already be created");
        }
        afec afecVar = ewpVar.m;
        if (afecVar != null) {
            afecVar.invoke(euqVar);
            b(euqVar);
            return;
        }
        Log.i("NavController", "Ignoring add of destination " + euqVar.a + " outside of the call to navigate(). ");
    }
}
