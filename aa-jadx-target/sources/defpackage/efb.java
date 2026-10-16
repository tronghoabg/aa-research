package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class efb extends defpackage.afee implements defpackage.affg {
    int a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efb(aiyk aiykVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.c = aiykVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aiyk, java.lang.Object] */
    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        if (this.d != 0) {
            defpackage.efb efbVar = new defpackage.efb((aiyk) this.c, afdkVar, 1);
            efbVar.b = obj;
            return efbVar;
        }
        defpackage.efb efbVar2 = new defpackage.efb((java.util.List) this.c, afdkVar, 0);
        efbVar2.b = obj;
        return efbVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
        java.lang.Throwable th;
        aiwg aiwgVar;
        if (this.d == 0) {
            efk efkVar = (efk) this.b;
            defpackage.afdr afdrVar = defpackage.afdr.a;
            if (this.a != 0) {
                defpackage.afga.cz(obj);
            } else {
                defpackage.afga.cz(obj);
                ?? r8 = this.c;
                defpackage.ebl eblVar = defpackage.eff.a;
                this.b = null;
                this.a = 1;
                if (eblVar.h(r8, efkVar, this) == afdrVar) {
                    return afdrVar;
                }
            }
            return defpackage.afbk.a;
        }
        defpackage.afdr afdrVar2 = defpackage.afdr.a;
        if (this.a != 0) {
            aiwgVar = (aiwg) this.b;
            try {
                defpackage.afga.cz(obj);
                aiwgVar.s((java.util.concurrent.CancellationException) null);
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                aiwgVar.s((java.util.concurrent.CancellationException) null);
                throw th;
            }
        }
        defpackage.afga.cz(obj);
        aiwg aiwgVarD = ahoc.d((aiuw) this.b, (defpackage.afdo) null, 0, new defpackage.apk(null), 3);
        try {
            ?? r3 = this.c;
            this.b = aiwgVarD;
            this.a = 1;
            java.lang.Object objD = r3.d(this);
            if (objD == afdrVar2) {
                return afdrVar2;
            }
            obj = objD;
            aiwgVar = aiwgVarD;
            aiwgVar.s((java.util.concurrent.CancellationException) null);
            return obj;
        } catch (java.lang.Throwable th3) {
            th = th3;
            aiwgVar = aiwgVarD;
            aiwgVar.s((java.util.concurrent.CancellationException) null);
            throw th;
        }
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.d != 0) {
            return ((defpackage.efb) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.efb) b((efk) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efb(java.util.List list, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.c = list;
    }
}
