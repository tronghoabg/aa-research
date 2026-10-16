package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bww extends defpackage.byf {
    public final defpackage.aau a;
    private final java.util.List b;
    private final defpackage.ceg c;
    private final defpackage.aau d;

    public bww() {
        long[] jArr = defpackage.aav.a;
        this.a = new defpackage.aau(6);
        this.b = new java.util.ArrayList();
        this.d = new defpackage.aau(6);
        this.c = defpackage.bzd.i(new defpackage.amc(this, 12));
    }

    @Override // defpackage.byf
    public final defpackage.affc a(aiyx aiyxVar) {
        defpackage.aau aauVar = this.d;
        defpackage.affc affcVar = (defpackage.affc) aauVar.a(aiyxVar);
        if (affcVar != null) {
            return affcVar;
        }
        defpackage.beh behVar = new defpackage.beh(this, aiyxVar, 10, null);
        aauVar.h(aiyxVar, behVar);
        return behVar;
    }

    @Override // defpackage.byf
    public final void b(aiyx aiyxVar) {
        this.b.add(new defpackage.bwu(aiyxVar));
    }

    @Override // defpackage.byf
    public final void c() {
        java.util.List list;
        synchronized (this.f) {
            list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                defpackage.bwv bwvVar = (defpackage.bwv) list.get(i);
                if (bwvVar instanceof defpackage.bwt) {
                    defpackage.bwt bwtVar = (defpackage.bwt) bwvVar;
                    defpackage.bzg.a(this.a, bwtVar.a, bwtVar.b);
                } else {
                    if (!(bwvVar instanceof defpackage.bwu)) {
                        throw new defpackage.afas();
                    }
                    defpackage.bzg.b(this.a, ((defpackage.bwu) bwvVar).a);
                }
            }
        }
        list.clear();
    }

    @Override // defpackage.byf
    public final void d() {
        this.c.a();
        this.b.clear();
        this.d.k();
        synchronized (this.f) {
            this.a.k();
        }
    }

    @Override // defpackage.byf
    public final void e(aiyx aiyxVar) {
        this.d.i(aiyxVar);
        b(aiyxVar);
        c();
    }

    public final void f(aiyx aiyxVar, java.lang.Object obj) {
        this.b.add(new defpackage.bwt(obj, aiyxVar));
    }
}
