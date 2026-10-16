package defpackage;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class fgp {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public fgp(ept eptVar, eps epsVar, epg epgVar, aivh aivhVar) {
        eptVar.getClass();
        this.a = eptVar;
        this.d = epsVar;
        this.b = epgVar;
        epu epuVar = new epu(this, aivhVar, 0, null);
        this.c = epuVar;
        if (((eqc) eptVar).e != eps.a) {
            eptVar.c(epuVar);
        } else {
            aivhVar.s(null);
            a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [epz, java.lang.Object] */
    public final void a() {
        ((ept) this.a).d(this.c);
        epg epgVar = (epg) this.b;
        epgVar.b = true;
        epgVar.a();
    }

    public fgp(ell ellVar, ell ellVar2, Object obj) {
        this.b = ellVar;
        this.d = "";
        this.c = ellVar2;
        this.a = obj;
    }

    public fgp(afdr afdrVar, cfy cfyVar, dnk dnkVar, afeg afegVar) {
        this.d = afdrVar;
        this.b = cfyVar;
        this.c = dnkVar;
        this.a = afegVar;
    }

    public fgp() {
        this.a = new yw();
        this.b = new SparseArray();
        this.c = new zs(10);
        this.d = new yw();
    }
}
