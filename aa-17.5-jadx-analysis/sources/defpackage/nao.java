package defpackage;

/* loaded from: classes2.dex */
public final class nao extends naq {
    public final eqj a;
    public final eqj b;
    public final eqj c;
    private final eqm k;

    public nao() {
        afco afcoVar = tby.a;
        eqm eqmVar = new eqm(0);
        this.k = eqmVar;
        eqj eqjVarU = tby.u(this.e, afbe.a);
        eql eqlVar = new eql();
        affq affqVar = new affq();
        affqVar.a = true;
        eqlVar.r(eqjVarU, new med(new mzx(eqlVar, affqVar, 2), 13));
        this.a = tby.G(eqlVar, eqmVar, new mqe(16));
        eqj eqjVarB = tby.B(tby.u(this.i, false), new mzg(this, 20));
        this.b = eqjVarB;
        this.c = tby.G(eqjVarB, this.j, new mqe(17));
    }

    public final void a(int i) {
        this.k.m(Integer.valueOf(i));
    }
}
