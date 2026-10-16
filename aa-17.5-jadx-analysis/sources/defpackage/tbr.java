package defpackage;

/* loaded from: classes.dex */
public final class tbr extends eql {
    public spu a;
    public spu h;
    public spu i;
    private final afeh j;
    private boolean k;

    public tbr(eqj eqjVar, eqj eqjVar2, eqj eqjVar3, afeh afehVar) {
        this.j = afehVar;
        tce tceVar = tce.a;
        this.a = tceVar;
        this.h = tceVar;
        this.i = tceVar;
        r(eqjVar, new kko(new njq(this, 20), 11));
        r(eqjVar2, new kko(new tbq(this, 1), 11));
        r(eqjVar3, new kko(new tbq(this, 0), 11));
    }

    public final void a() {
        spu spuVar = this.a;
        boolean z = spuVar instanceof tcf;
        spu spuVar2 = this.h;
        spu spuVar3 = this.i;
        if (z && (spuVar2 instanceof tcf) && (spuVar3 instanceof tcf)) {
            Object objInvoke = this.j.invoke(((tcf) spuVar).a, ((tcf) spuVar2).a, ((tcf) spuVar3).a);
            if (this.k && objInvoke == e()) {
                return;
            }
            m(objInvoke);
            this.k = true;
        }
    }
}
