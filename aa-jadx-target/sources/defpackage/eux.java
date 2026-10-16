package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eux extends defpackage.evx {
    public final defpackage.evv a;
    public final /* synthetic */ defpackage.eva b;

    public eux(defpackage.eva evaVar, defpackage.evv evvVar) {
        this.b = evaVar;
        this.a = evvVar;
    }

    @Override // defpackage.evx
    public final defpackage.euw a(defpackage.evf evfVar, android.os.Bundle bundle) {
        ewv ewvVar = this.b.b;
        return defpackage.ebm.i(ewvVar.u(), evfVar, bundle, ewvVar.a(), ewvVar.r);
    }

    public final void b(defpackage.euw euwVar) {
        euwVar.getClass();
        synchronized (this.h) {
            ajba ajbaVar = this.f;
            ajbaVar.d(defpackage.afga.aT((java.util.Collection) ajbaVar.b(), euwVar));
        }
    }

    @Override // defpackage.evx
    public final void c(defpackage.euw euwVar) {
        evt evtVar;
        euwVar.getClass();
        defpackage.bso bsoVar = new defpackage.bso(this, euwVar, 13);
        ewv ewvVar = this.b.b;
        java.util.Map map = ewvVar.o;
        boolean zF = defpackage.afga.f(map.get(euwVar), java.lang.Boolean.TRUE);
        bsoVar.invoke();
        map.remove(euwVar);
        defpackage.afbz afbzVar = ewvVar.e;
        if (afbzVar.contains(euwVar)) {
            if (this.c) {
                return;
            }
            ewvVar.l();
            ewvVar.p.d(defpackage.afga.bb(afbzVar));
            ewvVar.q.d(ewvVar.g());
            return;
        }
        ewvVar.s(euwVar);
        if (euwVar.g.e.a(defpackage.epx.c)) {
            euwVar.b(defpackage.epx.a);
        }
        if (!afbzVar.isEmpty()) {
            java.util.Iterator<E> it = afbzVar.iterator();
            while (it.hasNext()) {
                if (defpackage.afga.f(((defpackage.euw) it.next()).c, euwVar.c)) {
                }
            }
            if (!zF) {
                evtVar.a(euwVar.c);
            }
        } else if (!zF && (evtVar = ewvVar.r) != null) {
            evtVar.a(euwVar.c);
        }
        ewvVar.l();
        ewvVar.q.d(ewvVar.g());
    }

    @Override // defpackage.evx
    public final void d(defpackage.euw euwVar, boolean z) {
        defpackage.bso bsoVar = new defpackage.bso(this, euwVar, 14);
        ewv ewvVar = this.b.b;
        defpackage.evv evvVarA = ewvVar.k.a(euwVar.a.c);
        ewvVar.o.put(euwVar, java.lang.Boolean.valueOf(z));
        if (!defpackage.afga.f(evvVarA, this.a)) {
            java.lang.Object obj = ewvVar.l.get(evvVarA);
            obj.getClass();
            ((defpackage.eux) obj).d(euwVar, z);
            return;
        }
        defpackage.affc affcVar = ewvVar.n;
        if (affcVar != null) {
            affcVar.invoke(euwVar);
            bsoVar.invoke();
            return;
        }
        defpackage.eig eigVar = new defpackage.eig(bsoVar, 15);
        defpackage.afbz afbzVar = ewvVar.e;
        int iIndexOf = afbzVar.indexOf(euwVar);
        if (iIndexOf < 0) {
            android.util.Log.i("NavController", defpackage.a.bl(euwVar, "Ignoring pop of ", " as it was not found on the current back stack"));
            return;
        }
        int i = iIndexOf + 1;
        if (i != afbzVar.a) {
            ewvVar.n(((defpackage.euw) afbzVar.get(i)).a.c(), true, false);
        }
        ewv.r(ewvVar, euwVar);
        eigVar.invoke();
        ewvVar.a.invoke();
        ewvVar.m();
    }

    @Override // defpackage.evx
    public final void e(defpackage.euw euwVar) {
        euwVar.getClass();
        ewv ewvVar = this.b.b;
        defpackage.evv evvVarA = ewvVar.k.a(euwVar.a.c);
        if (!defpackage.afga.f(evvVarA, this.a)) {
            java.lang.Object obj = ewvVar.l.get(evvVarA);
            if (obj != null) {
                ((defpackage.eux) obj).e(euwVar);
                return;
            }
            throw new java.lang.IllegalStateException("NavigatorBackStack for " + euwVar.a.c + " should already be created");
        }
        defpackage.affc affcVar = ewvVar.m;
        if (affcVar != null) {
            affcVar.invoke(euwVar);
            b(euwVar);
            return;
        }
        android.util.Log.i("NavController", "Ignoring add of destination " + euwVar.a + " outside of the call to navigate(). ");
    }
}
