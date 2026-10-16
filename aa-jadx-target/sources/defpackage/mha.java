package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mha implements defpackage.eqe {
    private final /* synthetic */ int a;
    private final java.lang.Object b;
    private final java.lang.Object c;

    public mha(defpackage.epl eplVar, defpackage.eqe eqeVar, int i) {
        this.a = i;
        this.c = eplVar;
        this.b = eqeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [epl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [epl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [epl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [epl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [epl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [epl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mgu] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, mgu] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, mhb] */
    /* JADX WARN: Type inference failed for: r2v4, types: [eqe, java.lang.Object] */
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
    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        if (this.a == 0) {
            defpackage.mft mftVarA = ((defpackage.mfu) defpackage.mkp.a.i(defpackage.mfu.class)).a();
            defpackage.epw epwVar2 = defpackage.epw.ON_CREATE;
            defpackage.mfx mfxVar = (defpackage.mfx) mftVarA;
            defpackage.mgv mgvVar = mfxVar.b;
            if (epwVar != epwVar2) {
                if (epwVar == defpackage.epw.ON_DESTROY) {
                    mgvVar.c(this.c);
                    return;
                }
                return;
            } else if (mfxVar.c != null) {
                mgvVar.b(this.c);
                return;
            } else {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.mhc.a.h()).ai((char) 4906)).u("Session is null at ON_CREATE, finishing early");
                this.b.finish();
                return;
            }
        }
        switch (epwVar.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                this.c.eD(eqgVar);
                break;
            case 1:
                this.c.eG(eqgVar);
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                this.c.eF(eqgVar);
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                this.c.eU();
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                this.c.eT(eqgVar);
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                this.c.eE(eqgVar);
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                throw new java.lang.IllegalArgumentException("ON_ANY must not be sent by anybody");
            default:
                throw new defpackage.afas();
        }
        ?? r2 = this.b;
        if (r2 != 0) {
            r2.a(eqgVar, epwVar);
        }
    }

    public mha(defpackage.mhb mhbVar, defpackage.mgu mguVar, int i) {
        this.a = i;
        this.b = mhbVar;
        this.c = mguVar;
    }
}
