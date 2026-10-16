package defpackage;

/* loaded from: classes.dex */
public final class oam implements erq {
    private final qrn a;
    private final eqj b;
    private final eqj c;

    public /* synthetic */ oam(qrn qrnVar) {
        neo neoVarA = neo.a.a();
        eql eqlVar = new eql();
        affq affqVar = new affq();
        affqVar.a = true;
        eqlVar.r(neoVarA, new kko(new beq(eqlVar, affqVar, 5, null), 9));
        eqj eqjVarA = nev.a.a().a();
        eqjVarA.getClass();
        this.a = qrnVar;
        this.b = eqlVar;
        this.c = eqjVarA;
    }

    @Override // defpackage.erq
    public final erm a(Class cls) {
        if (cls.isAssignableFrom(oal.class)) {
            return new oal(this.b, this.c, this.a);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: ".concat(String.valueOf(cls.getName())));
    }

    @Override // defpackage.erq
    public final /* synthetic */ erm b(Class cls, esc escVar) {
        return a(cls);
    }

    @Override // defpackage.erq
    public final /* synthetic */ erm c(afhe afheVar, esc escVar) {
        Class<?> jClass = ((afer) afheVar).getJClass();
        jClass.getClass();
        return a(jClass);
    }
}
