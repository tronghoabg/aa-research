package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class azp implements defpackage.cub {
    private final defpackage.cvm a;
    private final defpackage.azm b;
    private final defpackage.zo c;
    private final defpackage.ngb d;

    /* JADX WARN: Type inference failed for: r1v1, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [azm, java.lang.Object] */
    public azp(defpackage.ngb ngbVar, defpackage.cvm cvmVar) {
        this.d = ngbVar;
        this.a = cvmVar;
        this.b = ngbVar.c.invoke();
        defpackage.zo zoVar = defpackage.zp.a;
        new defpackage.zo(6);
        this.c = new defpackage.zo(6);
    }

    @Override // defpackage.dlo
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.dlu
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.dlu
    public final float dE(long j) {
        return this.a.dE(j);
    }

    @Override // defpackage.dlo
    public final float dF(float f) {
        return this.a.dF(f);
    }

    @Override // defpackage.dlo
    public final float dG(int i) {
        return this.a.dG(i);
    }

    @Override // defpackage.dlo
    public final float dH(long j) {
        return this.a.dH(j);
    }

    @Override // defpackage.dlo
    public final float dI(float f) {
        return this.a.dI(f);
    }

    @Override // defpackage.dlo
    public final int dM(long j) {
        return this.a.dM(j);
    }

    @Override // defpackage.dlo
    public final int dN(float f) {
        return this.a.dN(f);
    }

    @Override // defpackage.dlo
    public final long dO(long j) {
        return this.a.dO(j);
    }

    @Override // defpackage.dlo
    public final long dP(long j) {
        return this.a.dP(j);
    }

    @Override // defpackage.dlu
    public final long dQ(float f) {
        return this.a.dQ(f);
    }

    @Override // defpackage.dlo
    public final long dR(float f) {
        return this.a.dR(f);
    }

    @Override // defpackage.cub
    public final defpackage.ctz dS(int i, int i2, java.util.Map map, defpackage.affc affcVar) {
        return this.a.dS(i, i2, map, affcVar);
    }

    @Override // defpackage.cub
    public final defpackage.ctz dT(int i, int i2, java.util.Map map, defpackage.affc affcVar, defpackage.affc affcVar2) {
        return this.a.dT(i, i2, map, affcVar, affcVar2);
    }

    @Override // defpackage.csz
    public final boolean dU() {
        return this.a.dU();
    }

    @Override // defpackage.csz
    public final defpackage.dlz p() {
        return this.a.p();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final java.util.List r(int i) {
        defpackage.zo zoVar = this.c;
        java.util.List list = (java.util.List) zoVar.a(i);
        if (list != null) {
            return list;
        }
        defpackage.azm azmVar = this.b;
        java.lang.Object objD = azmVar.d(i);
        java.util.List listR = this.a.r(objD, this.d.z(i, objD, azmVar.c(i)));
        zoVar.g(i, listR);
        return listR;
    }
}
