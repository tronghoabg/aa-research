package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aqn extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    long c;
    int d;
    final /* synthetic */ defpackage.aqp e;
    final /* synthetic */ afgu f;
    final /* synthetic */ long g;
    private /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqn(defpackage.aqp aqpVar, afgu afguVar, long j, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.e = aqpVar;
        this.f = afguVar;
        this.g = j;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aqn aqnVar = new defpackage.aqn(this.e, this.f, this.g, afdkVar);
        aqnVar.h = obj;
        return aqnVar;
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
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.aqp aqpVar;
        long j;
        java.lang.Object obj2;
        java.lang.Object obj3;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (this.d != 0) {
            j = this.c;
            java.lang.Object obj4 = this.b;
            java.lang.Object obj5 = this.a;
            defpackage.aqp aqpVar2 = (defpackage.aqp) this.h;
            defpackage.afga.cz(obj);
            obj3 = obj4;
            obj2 = obj5;
            aqpVar = aqpVar2;
        } else {
            defpackage.afga.cz(obj);
            defpackage.izq izqVar = (defpackage.izq) this.h;
            defpackage.aqp aqpVar3 = this.e;
            defpackage.aqm aqmVar = new defpackage.aqm(aqpVar3, izqVar, 0);
            afgu afguVar = this.f;
            long j2 = this.g;
            defpackage.aor aorVar = aqpVar3.b;
            long j3 = afguVar.a;
            float fA = aqpVar3.a(aqpVar3.c == defpackage.apn.b ? java.lang.Float.intBitsToFloat((int) (j2 >> 32)) : java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
            this.h = aqpVar3;
            this.a = aqpVar3;
            this.b = afguVar;
            this.c = j3;
            this.d = 1;
            obj = aorVar.a(aqmVar, fA, this);
            if (obj == afdrVar) {
                return afdrVar;
            }
            aqpVar = aqpVar3;
            j = j3;
            obj3 = afguVar;
            obj2 = aqpVar3;
        }
        float fA2 = aqpVar.a(((java.lang.Number) obj).floatValue());
        ((afgu) obj3).a = ((defpackage.aqp) obj2).c == defpackage.apn.b ? defpackage.dmd.e(j, fA2, 0.0f, 2) : defpackage.dmd.e(j, 0.0f, fA2, 1);
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aqn) b((defpackage.izq) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
