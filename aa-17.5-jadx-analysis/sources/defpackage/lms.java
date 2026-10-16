package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
final class lms implements lmt {
    final /* synthetic */ lmu a;
    private final eqa b;
    private final eqn c;
    private final eqn d;
    private final eqn e = new lkn(3);
    private final eqn f;
    private eqj g;
    private eqj h;
    private eqj i;
    private eqj j;

    public lms(lmu lmuVar, eqa eqaVar) {
        this.a = lmuVar;
        this.b = eqaVar;
        this.c = new kqc(lmuVar, 15);
        this.d = new kqc(lmuVar, 16);
        this.f = new kqc(lmuVar, 17);
    }

    @Override // defpackage.lmt
    public final void b() {
        eqj eqjVar = this.g;
        if (eqjVar != null) {
            eqjVar.k(this.c);
            this.g = null;
        }
        eqj eqjVar2 = this.h;
        if (eqjVar2 != null) {
            eqjVar2.k(this.d);
            this.h = null;
        }
        eqj eqjVar3 = this.i;
        if (eqjVar3 != null) {
            eqjVar3.k(this.e);
            this.i = null;
        }
        eqj eqjVar4 = this.j;
        if (eqjVar4 != null) {
            eqjVar4.k(this.f);
            this.j = null;
        }
    }

    @Override // defpackage.eqn
    public final /* synthetic */ void eS(Object obj) {
        lol lolVar = (lol) obj;
        yph yphVar = lmu.a;
        b();
        lmu lmuVar = this.a;
        lmuVar.e = lolVar;
        lmuVar.g = null;
        lmuVar.f = null;
        int i = yfq.d;
        yfq yfqVar = yls.a;
        lmuVar.h = false;
        if (lolVar == null) {
            return;
        }
        int iOrdinal = lolVar.e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                woy.aa(lolVar instanceof lod, "CONNECTED controller must be Active type");
                lmuVar.j = false;
                lod lodVar = (lod) lolVar;
                eqj eqjVar = lodVar.e;
                this.g = eqjVar;
                eqa eqaVar = this.b;
                eqjVar.fE(eqaVar, this.c);
                eqj eqjVar2 = lodVar.f;
                this.h = eqjVar2;
                eqjVar2.fE(eqaVar, this.d);
                eqj eqjVar3 = lodVar.g;
                this.i = eqjVar3;
                eqjVar3.fE(eqaVar, this.e);
                eqj eqjVar4 = lodVar.h;
                this.j = eqjVar4;
                eqjVar4.fE(eqaVar, this.f);
                if (lmuVar.i) {
                    return;
                }
                Iterator it = lmuVar.c.iterator();
                while (it.hasNext()) {
                    ((lju) it.next()).b();
                }
                lmuVar.j = true;
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    Iterator it2 = lmuVar.c.iterator();
                    while (it2.hasNext()) {
                        ((lju) it2.next()).j(lolVar.d().c);
                    }
                    return;
                } else if (iOrdinal != 4 && iOrdinal != 5) {
                    return;
                }
            }
        }
        ((ype) lmu.a.l().ai((char) 4011)).y("Controller in state %s. Not notifying listeners", lolVar.e());
    }
}
