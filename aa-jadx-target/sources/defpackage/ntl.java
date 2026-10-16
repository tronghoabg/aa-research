package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ntl {
    public final java.lang.Object a;

    public ntl(java.lang.Enum r2, defpackage.tfe tfeVar, defpackage.tfg tfgVar) {
        defpackage.tfd tfdVar = new defpackage.tfd(r2, tfeVar);
        this.a = tfdVar;
        if (tfgVar != null) {
            tfdVar.c = tfgVar;
        }
    }

    public static defpackage.ntl a() {
        return (defpackage.ntl) defpackage.mkp.a.i(defpackage.ntl.class);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void b(com.google.android.apps.auto.sdk.nav.state.TurnEvent turnEvent) throws wfo {
        defpackage.wfp.c();
        ((defpackage.eqp) this.a).m(turnEvent);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, rar] */
    public final void c(boolean z) {
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("projection_authorized", z);
            this.a.e(1, bundle);
        } catch (android.os.RemoteException e) {
            defpackage.rrx.d(5, "CAR.CLIENT.PLS", e, "Exception while invoking callback!", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tne] */
    public final defpackage.zhw d(defpackage.zhw zhwVar) {
        ?? r0 = this.a;
        return r0 == 0 ? zhwVar : r0.a();
    }

    public final void e(java.lang.Enum r2, defpackage.afer aferVar) {
        java.util.Map map = ((defpackage.tfd) this.a).a;
        java.lang.Object arrayList = map.get(r2);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            map.put(r2, arrayList);
        }
        ((java.util.List) arrayList).add(aferVar);
    }

    public final void f(java.lang.Enum r2, defpackage.afer aferVar) {
        java.util.Map map = ((defpackage.tfd) this.a).b;
        java.lang.Object arrayList = map.get(r2);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            map.put(r2, arrayList);
        }
        ((java.util.List) arrayList).add(aferVar);
    }

    public final void g(java.lang.Enum r4, java.lang.Enum[] enumArr, defpackage.afer aferVar) {
        java.util.Set setCc = defpackage.afga.cc(enumArr);
        java.util.Iterator it = setCc.iterator();
        while (it.hasNext()) {
            ((defpackage.tfd) this.a).b(r4, (java.lang.Enum) it.next());
        }
        if (aferVar != null) {
            java.util.Iterator it2 = setCc.iterator();
            while (it2.hasNext()) {
                ((defpackage.tfd) this.a).c(r4, (java.lang.Enum) it2.next(), aferVar);
            }
        }
    }

    public ntl() {
        this.a = new defpackage.eqs();
    }

    public ntl(defpackage.rar rarVar) {
        this.a = rarVar;
    }

    public ntl(defpackage.xyn xynVar) {
        this.a = (defpackage.tne) xynVar.e();
    }
}
