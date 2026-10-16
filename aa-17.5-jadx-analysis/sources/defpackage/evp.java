package defpackage;

import android.os.Bundle;
import defpackage.euz;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class evp<D extends euz> {
    public boolean a;
    private evr b;

    public abstract euz a();

    public boolean b() {
        return true;
    }

    public void d(List list, eve eveVar) {
        airz airzVar = new airz((airk) afrg.n(afrg.q(woy.cm(list), new bpi(this, eveVar, 14))), 1);
        while (airzVar.hasNext()) {
            f().e((euq) airzVar.next());
        }
    }

    public Bundle e() {
        return null;
    }

    public final evr f() {
        evr evrVar = this.b;
        if (evrVar != null) {
            return evrVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void g(evr evrVar) {
        this.b = evrVar;
        this.a = true;
    }

    public void h(euq euqVar) {
        euqVar.getClass();
        euz euzVar = euqVar.a;
        if (true != (euzVar instanceof euz)) {
            euzVar = null;
        }
        if (euzVar == null) {
            return;
        }
        c(euzVar, null, ebk.m(new dmw(20)));
        f().f(euqVar);
    }

    public void j(euq euqVar, boolean z) {
        List list = (List) f().d.b();
        if (!list.contains(euqVar)) {
            throw new IllegalStateException(a.bt(list, euqVar, "popBackStack was called with ", " which does not exist in back stack "));
        }
        ListIterator listIterator = list.listIterator(list.size());
        euq euqVar2 = null;
        while (b()) {
            euqVar2 = (euq) listIterator.previous();
            if (affa.f(euqVar2, euqVar)) {
                break;
            }
        }
        if (euqVar2 != null) {
            f().d(euqVar2, z);
        }
    }

    public void i(Bundle bundle) {
    }

    public euz c(euz euzVar, Bundle bundle, eve eveVar) {
        return euzVar;
    }
}
