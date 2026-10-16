package defpackage;

/* loaded from: classes.dex */
public final class tbn extends eql {
    public spu a;
    public spu h;
    private final afeg i;
    private boolean j;

    public tbn(eqj eqjVar, eqj eqjVar2, afeg afegVar) {
        this.i = afegVar;
        tce tceVar = tce.a;
        this.a = tceVar;
        this.h = tceVar;
        if (eqjVar == eqjVar2) {
            r(eqjVar, new kko(new tbm(this, 4), 11));
        } else {
            r(eqjVar, new kko(new njq(this, 18), 11));
            r(eqjVar2, new kko(new njq(this, 19), 11));
        }
    }

    public final void a() {
        spu spuVar = this.a;
        boolean z = spuVar instanceof tcf;
        spu spuVar2 = this.h;
        if (z && (spuVar2 instanceof tcf)) {
            Object objInvoke = this.i.invoke(((tcf) spuVar).a, ((tcf) spuVar2).a);
            if (this.j && objInvoke == e()) {
                return;
            }
            m(objInvoke);
            this.j = true;
        }
    }
}
