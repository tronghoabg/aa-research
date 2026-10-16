package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class evv<D extends defpackage.evf> {
    public boolean a;
    private defpackage.evx b;

    public abstract defpackage.evf a();

    public boolean b() {
        return true;
    }

    public void d(java.util.List list, defpackage.evk evkVar) {
        aisy aisyVar = new aisy(afsg.n(afsg.q(defpackage.afga.bg(list), new defpackage.bpn(this, evkVar, 14))), 1);
        while (aisyVar.hasNext()) {
            f().e((defpackage.euw) aisyVar.next());
        }
    }

    public android.os.Bundle e() {
        return null;
    }

    public final defpackage.evx f() {
        defpackage.evx evxVar = this.b;
        if (evxVar != null) {
            return evxVar;
        }
        throw new java.lang.IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void g(defpackage.evx evxVar) {
        this.b = evxVar;
        this.a = true;
    }

    public void h(defpackage.euw euwVar) {
        euwVar.getClass();
        defpackage.evf evfVar = euwVar.a;
        if (true != (evfVar instanceof defpackage.evf)) {
            evfVar = null;
        }
        if (evfVar == null) {
            return;
        }
        c(evfVar, null, defpackage.ebr.h(new dne(19)));
        f().f(euwVar);
    }

    public void j(defpackage.euw euwVar, boolean z) {
        java.util.List list = (java.util.List) f().d.b();
        if (!list.contains(euwVar)) {
            throw new java.lang.IllegalStateException(defpackage.a.bs(list, euwVar, "popBackStack was called with ", " which does not exist in back stack "));
        }
        java.util.ListIterator listIterator = list.listIterator(list.size());
        defpackage.euw euwVar2 = null;
        while (b()) {
            euwVar2 = (defpackage.euw) listIterator.previous();
            if (defpackage.afga.f(euwVar2, euwVar)) {
                break;
            }
        }
        if (euwVar2 != null) {
            f().d(euwVar2, z);
        }
    }

    public void i(android.os.Bundle bundle) {
    }

    public defpackage.evf c(defpackage.evf evfVar, android.os.Bundle bundle, defpackage.evk evkVar) {
        return evfVar;
    }
}
