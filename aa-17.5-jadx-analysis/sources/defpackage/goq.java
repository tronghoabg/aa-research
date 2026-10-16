package defpackage;

/* loaded from: classes2.dex */
public final class goq extends gwc {
    public final gzp a;
    public final ajab b;
    private final geu c;
    private final aiyk d;

    public goq(geu geuVar) {
        this.c = geuVar;
        this.a = new gzp(geuVar);
        ajab ajabVarA = ajac.a(0);
        this.b = ajabVarA;
        aiyk aiykVarA = aiov.a(new jxz(this.n, 6), ajabVarA, this.o, gop.a);
        gon gonVar = new gon((afck) null, this, 0);
        int i = aizc.a;
        this.d = new fmn(new ajaq(gonVar, aiykVarA), 5);
    }

    @Override // defpackage.gwc
    public final aiyk a() {
        return this.d;
    }

    @Override // defpackage.gwc
    public final Object b() {
        return new gom(((Number) this.b.b()).intValue(), this.a.b());
    }

    @Override // defpackage.gwc
    public final void c(Object obj) {
        if (!(obj instanceof gom)) {
            this.a.c(obj);
            return;
        }
        gom gomVar = (gom) obj;
        this.b.d(Integer.valueOf(gomVar.a));
        this.a.c(gomVar.b);
    }
}
