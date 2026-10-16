package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajdq {
    private final defpackage.aitx a;
    public final defpackage.aitx d;
    public final defpackage.aitx e;

    public ajdq() {
        defpackage.aity aityVar = defpackage.aity.a;
        this.d = new defpackage.aitx(this, aityVar);
        this.e = new defpackage.aitx(this, aityVar);
        this.a = new defpackage.aitx(null, aityVar);
    }

    private final defpackage.ajdq gQ() {
        defpackage.ajdq ajdqVar;
        java.lang.Object obj;
        while (true) {
            defpackage.aitx aitxVar = this.e;
            defpackage.ajdq ajdqVar2 = (defpackage.ajdq) aitxVar.a;
            ajdqVar = ajdqVar2;
            while (true) {
                defpackage.ajdq ajdqVar3 = null;
                while (true) {
                    obj = ajdqVar.d.a;
                    if (obj == this) {
                        if (ajdqVar2 != ajdqVar && !aitxVar.d(ajdqVar2, ajdqVar)) {
                            break;
                        }
                        break;
                    }
                    if (gM()) {
                        return null;
                    }
                    if (!(obj instanceof defpackage.ajdu)) {
                        obj.getClass();
                        ajdqVar3 = ajdqVar;
                        ajdqVar = (defpackage.ajdq) obj;
                    } else {
                        if (ajdqVar3 != null) {
                            break;
                        }
                        ajdqVar = (defpackage.ajdq) ajdqVar.e.a;
                    }
                }
                if (!ajdqVar3.d.d(ajdqVar, ((defpackage.ajdu) obj).a)) {
                    break;
                }
                ajdqVar = ajdqVar3;
            }
        }
        return ajdqVar;
    }

    public final java.lang.Object g() {
        return this.d.a;
    }

    public boolean gM() {
        return g() instanceof defpackage.ajdu;
    }

    public final defpackage.ajdq h() {
        java.lang.Object objG = g();
        defpackage.ajdu ajduVar = objG instanceof defpackage.ajdu ? (defpackage.ajdu) objG : null;
        if (ajduVar != null) {
            return ajduVar.a;
        }
        objG.getClass();
        return (defpackage.ajdq) objG;
    }

    public final defpackage.ajdq i() {
        defpackage.ajdq ajdqVarGQ = gQ();
        if (ajdqVarGQ != null) {
            return ajdqVarGQ;
        }
        java.lang.Object obj = this.e.a;
        while (true) {
            defpackage.ajdq ajdqVar = (defpackage.ajdq) obj;
            if (!ajdqVar.gM()) {
                return ajdqVar;
            }
            obj = ajdqVar.e.a;
        }
    }

    public final defpackage.ajdu j() {
        defpackage.aitx aitxVar = this.a;
        defpackage.ajdu ajduVar = (defpackage.ajdu) aitxVar.a;
        if (ajduVar != null) {
            return ajduVar;
        }
        defpackage.ajdu ajduVar2 = new defpackage.ajdu(this);
        aitxVar.b(ajduVar2);
        return ajduVar2;
    }

    public final void k(int i) {
        m(new defpackage.ajdn(i), i);
    }

    public final void l(defpackage.ajdq ajdqVar) {
        defpackage.aitx aitxVar;
        defpackage.ajdq ajdqVar2;
        do {
            aitxVar = ajdqVar.e;
            ajdqVar2 = (defpackage.ajdq) aitxVar.a;
            if (g() != ajdqVar) {
                return;
            }
        } while (!aitxVar.d(ajdqVar2, this));
        if (gM()) {
            ajdqVar.gQ();
        }
    }

    public final boolean m(defpackage.ajdq ajdqVar, int i) {
        defpackage.ajdq ajdqVarI;
        do {
            ajdqVarI = i();
            if (ajdqVarI instanceof defpackage.ajdn) {
                return (((defpackage.ajdn) ajdqVarI).a & i) == 0 && ajdqVarI.m(ajdqVar, i);
            }
            ajdqVar.e.b(ajdqVarI);
            ajdqVar.d.b(this);
        } while (!ajdqVarI.d.d(this, ajdqVar));
        ajdqVar.l(this);
        return true;
    }

    public final void n() {
        java.lang.Object objG;
        defpackage.ajdq ajdqVar;
        do {
            objG = g();
            if (objG instanceof defpackage.ajdu) {
                defpackage.ajdq ajdqVar2 = ((defpackage.ajdu) objG).a;
                return;
            } else if (objG == this) {
                return;
            } else {
                objG.getClass();
                ajdqVar = (defpackage.ajdq) objG;
            }
        } while (!this.d.d(objG, ajdqVar.j()));
        ajdqVar.gQ();
    }

    public java.lang.String toString() {
        return new defpackage.afgl(this) { // from class: ajdp
            @Override // defpackage.afgl, defpackage.afiv
            public final java.lang.Object get() {
                return defpackage.aiuz.a(this.receiver);
            }
        } + "@" + defpackage.aiuz.b(this);
    }
}
