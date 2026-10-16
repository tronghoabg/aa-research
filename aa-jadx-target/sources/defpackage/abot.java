package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abot extends defpackage.abor implements defpackage.abov, abdx {
    public abot(defpackage.abou abouVar) {
        super(abouVar);
    }

    private final defpackage.abon bl() {
        defpackage.abon abonVar = ((defpackage.abou) this.b).w;
        if (!abonVar.c) {
            return abonVar;
        }
        defpackage.abon abonVarClone = abonVar.clone();
        ((defpackage.abou) this.b).w = abonVarClone;
        return abonVarClone;
    }

    private final void bm(defpackage.aboj abojVar) {
        if (abojVar.a != this.a) {
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    @Override // defpackage.abor, defpackage.abpx
    /* JADX INFO: renamed from: aX, reason: merged with bridge method [inline-methods] */
    public final defpackage.abou r() {
        if (!((defpackage.abou) this.b).T()) {
            return (defpackage.abou) this.b;
        }
        ((defpackage.abou) this.b).w.e();
        return (defpackage.abou) super.r();
    }

    @Override // defpackage.abov
    public final java.lang.Object aY(defpackage.aboj abojVar) {
        defpackage.abou abouVar = (defpackage.abou) this.b;
        abouVar.j(abojVar);
        java.lang.Object objJ = abouVar.w.j(abojVar.d);
        return objJ == null ? abojVar.b : abojVar.c(objJ);
    }

    @Override // defpackage.abov
    public final boolean aZ(defpackage.aboj abojVar) {
        defpackage.abou abouVar = (defpackage.abou) this.b;
        abouVar.j(abojVar);
        return abouVar.w.m(abojVar.d);
    }

    public final abdr b() {
        abdr abdrVar = this.b.c;
        return abdrVar == null ? abdr.a : abdrVar;
    }

    public final void ba(defpackage.aboj abojVar, java.lang.Object obj) {
        bm(abojVar);
        t();
        bl().k(abojVar.d, abojVar.e(obj));
    }

    public final void bb(defpackage.aboj abojVar) {
        int i = defpackage.abox.am;
        bm(abojVar);
        t();
        defpackage.abon abonVarBl = bl();
        defpackage.abow abowVar = abojVar.d;
        defpackage.abqs abqsVar = abonVarBl.b;
        abqsVar.remove(abowVar);
        if (abqsVar.isEmpty()) {
            abonVarBl.d = false;
        }
    }

    public final void bc(defpackage.aboj abojVar, java.lang.Object obj) {
        int i = defpackage.abox.am;
        bm(abojVar);
        t();
        defpackage.abon abonVarBl = bl();
        defpackage.abow abowVar = abojVar.d;
        if (!abowVar.d) {
            obj = abojVar.e(obj);
        } else if (abowVar.a() == defpackage.abrg.h) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(abojVar.e(it.next()));
            }
            obj = arrayList;
        }
        abonVarBl.l(abowVar, obj);
    }

    public final void bd(abdq abdqVar) {
        t();
        abdr abdrVar = this.b;
        abdr abdrVar2 = abdr.a;
        abdqVar.getClass();
        defpackage.abpj abpjVar = abdrVar.c;
        if (!abpjVar.c()) {
            abdrVar.c = defpackage.abox.I(abpjVar);
        }
        abdrVar.c.add(abdqVar);
    }

    public final abhg be(int i) {
        return (abhg) this.b.d.get(i);
    }

    public final void bf(abhw abhwVar) {
        t();
        abhm abhmVar = this.b;
        abhm abhmVar2 = abhm.a;
        abhwVar.getClass();
        defpackage.abpj abpjVar = abhmVar.c;
        if (!abpjVar.c()) {
            abhmVar.c = defpackage.abox.I(abpjVar);
        }
        abhmVar.c.add(abhwVar);
    }

    public final void bg(abbe abbeVar) {
        abbe abbeVar2;
        t();
        abhm abhmVar = this.b;
        abhm abhmVar2 = abhm.a;
        abbeVar.getClass();
        defpackage.abox aboxVar = abhmVar.j;
        if (aboxVar != null && aboxVar != (abbeVar2 = abbe.a)) {
            defpackage.abot abotVar = (defpackage.abot) abbeVar2.o(aboxVar);
            abotVar.w(abbeVar);
            abbeVar = (abbe) abotVar.r();
        }
        abhmVar.j = abbeVar;
        abhmVar.b |= 2097152;
    }

    public final void bh(int i, abhg abhgVar) {
        t();
        abhm abhmVar = this.b;
        abhm abhmVar2 = abhm.a;
        abhgVar.getClass();
        abhmVar.b();
        abhmVar.d.set(i, abhgVar);
    }

    public final void bi(abic abicVar) {
        t();
        abid abidVar = this.b;
        abid abidVar2 = abid.a;
        abicVar.getClass();
        abidVar.b();
        abidVar.d.add(abicVar);
    }

    public final void bj(defpackage.abot abotVar) {
        t();
        abeu abeuVar = this.b;
        abdi abdiVarQ = abotVar.q();
        abeu abeuVar2 = abeu.a;
        abdiVarQ.getClass();
        defpackage.abpj abpjVar = abeuVar.c;
        if (!abpjVar.c()) {
            abeuVar.c = defpackage.abox.I(abpjVar);
        }
        abeuVar.c.add(abdiVarQ);
    }

    @java.lang.Deprecated
    public final void bk(defpackage.abor aborVar) {
        t();
        abhg abhgVar = this.b;
        abhf abhfVarQ = aborVar.q();
        abhg abhgVar2 = abhg.a;
        abhfVarQ.getClass();
        defpackage.abpj abpjVar = abhgVar.f;
        if (!abpjVar.c()) {
            abhgVar.f = defpackage.abox.I(abpjVar);
        }
        abhgVar.f.add(abhfVarQ);
    }

    public final abdr c() {
        abdr abdrVar = this.b.d;
        return abdrVar == null ? abdr.a : abdrVar;
    }

    public final boolean d() {
        return (this.b.b & 2) != 0;
    }

    @Override // defpackage.abor
    protected final void u() {
        super.u();
        if (((defpackage.abou) this.b).w != defpackage.abon.a) {
            defpackage.abou abouVar = (defpackage.abou) this.b;
            abouVar.w = abouVar.w.clone();
        }
    }

    public abot() {
        throw null;
    }
}
