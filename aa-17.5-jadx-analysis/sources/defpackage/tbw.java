package defpackage;

/* loaded from: classes.dex */
public final class tbw implements eqn {
    final /* synthetic */ afec a;
    final /* synthetic */ eql b;
    private eqj c;

    public tbw(afec afecVar, eql eqlVar) {
        this.a = afecVar;
        this.b = eqlVar;
    }

    @Override // defpackage.eqn
    public final void eS(Object obj) {
        eqj eqjVar = (eqj) this.a.invoke(obj);
        eqj eqjVar2 = this.c;
        if (eqjVar2 == eqjVar) {
            return;
        }
        if (eqjVar2 != null) {
            this.b.s(eqjVar2);
        }
        eql eqlVar = this.b;
        eqlVar.r(eqjVar, new kko(new tbq(eqlVar, 2), 11));
        this.c = eqjVar;
    }
}
