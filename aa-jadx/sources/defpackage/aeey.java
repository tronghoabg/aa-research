package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aeey extends defpackage.aeeu {
    private static final defpackage.admd l = defpackage.admd.d("round_robin connecting: TCP/TLS handshake in progress to child balancers");
    private final java.util.concurrent.atomic.AtomicInteger m;
    private defpackage.admh n;

    public aeey(defpackage.admb admbVar) {
        super(admbVar);
        this.m = new java.util.concurrent.atomic.AtomicInteger(new java.util.Random().nextInt());
        this.n = new defpackage.adma(l);
    }

    private final defpackage.admh g(java.util.Collection collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.aees) it.next()).d);
        }
        return new defpackage.aeex(arrayList, this.m);
    }

    private final void h(defpackage.adkh adkhVar, defpackage.admh admhVar) {
        if (adkhVar == this.k && admhVar.equals(this.n)) {
            return;
        }
        this.h.f(adkhVar, admhVar);
        this.k = adkhVar;
        this.n = admhVar;
    }

    @Override // defpackage.aeeu
    protected final defpackage.aees e(java.lang.Object obj) {
        return new defpackage.aeew(this, obj, this.j);
    }

    @Override // defpackage.aeeu
    protected final void f() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.aees aeesVar : this.g) {
            if (aeesVar.c == defpackage.adkh.b) {
                arrayList.add(aeesVar);
            }
        }
        if (!arrayList.isEmpty()) {
            h(defpackage.adkh.b, g(arrayList));
            return;
        }
        java.util.Iterator it = this.g.iterator();
        while (it.hasNext()) {
            defpackage.adkh adkhVar = ((defpackage.aees) it.next()).c;
            defpackage.adkh adkhVar2 = defpackage.adkh.a;
            if (adkhVar == adkhVar2 || adkhVar == defpackage.adkh.d) {
                h(adkhVar2, new defpackage.adma(l));
                return;
            }
        }
        h(defpackage.adkh.c, g(this.g));
    }
}
