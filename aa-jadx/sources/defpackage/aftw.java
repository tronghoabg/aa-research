package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aftw extends defpackage.afvl {
    private final defpackage.afsy<?> callable;
    private final int index;
    private final defpackage.afiq kind;
    private final defpackage.agpq kmParameter;
    private final java.lang.String name;
    private final defpackage.afar type$delegate;

    public aftw(defpackage.afsy<?> afsyVar, defpackage.agpq agpqVar, int i, defpackage.afiq afiqVar, defpackage.afwq afwqVar) {
        afsyVar.getClass();
        agpqVar.getClass();
        afiqVar.getClass();
        afwqVar.getClass();
        this.callable = afsyVar;
        this.kmParameter = agpqVar;
        this.index = i;
        this.kind = afiqVar;
        java.lang.String name = agpqVar.getName();
        this.name = true == defpackage.afzh.g(name, "<", false) ? null : name;
        this.type$delegate = defpackage.afga.cB(2, new defpackage.aftu(this, afwqVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.airc type_delegate$lambda$0(defpackage.aftw aftwVar, defpackage.afwq afwqVar) {
        return defpackage.afkz.toKType$default(aftwVar.kmParameter.getType(), defpackage.aglc.getSafeClassLoader(aftwVar.getCallable().getContainer().getJClass()), afwqVar, false, new defpackage.aftv(aftwVar), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.reflect.Type type_delegate$lambda$0$0(defpackage.aftw aftwVar) {
        if ((aftwVar.getCallable().getContainer() instanceof defpackage.afst) || defpackage.afvh.isConstructor(aftwVar.getCallable())) {
            return aftwVar.getCallable().getCaller().getParameterTypes().get(aftwVar.getIndex());
        }
        throw new java.lang.IllegalArgumentException("Only constructors and top-level callables are supported for now: " + aftwVar.getCallable().getContainer() + '/' + aftwVar.getCallable().getName() + ' ' + aftwVar.getName());
    }

    @Override // defpackage.afvl
    public boolean getDeclaresDefaultValue() {
        return defpackage.agno.getDeclaresDefaultValue(this.kmParameter);
    }

    @Override // defpackage.afir
    public int getIndex() {
        return this.index;
    }

    @Override // defpackage.afir
    public defpackage.afiq getKind() {
        return this.kind;
    }

    public final defpackage.agpq getKmParameter$kotlin_reflection() {
        return this.kmParameter;
    }

    @Override // defpackage.afir
    public java.lang.String getName() {
        return this.name;
    }

    @Override // defpackage.afir
    public defpackage.afjb getType() {
        return (defpackage.afjb) this.type$delegate.a();
    }

    @Override // defpackage.afir
    public boolean isOptional() {
        if ((getCallable() instanceof defpackage.afur) || (getCallable().getContainer() instanceof defpackage.afst) || defpackage.afvh.isConstructor(getCallable())) {
            return defpackage.agno.getDeclaresDefaultValue(this.kmParameter);
        }
        throw new java.lang.IllegalArgumentException("Only constructors and top-level callables are supported for now: " + getCallable().getContainer() + '/' + getCallable().getName() + ' ' + getName());
    }

    @Override // defpackage.afir
    public boolean isVararg() {
        return this.kmParameter.getVarargElementType() != null;
    }

    @Override // defpackage.afvl
    public defpackage.afsy<?> getCallable() {
        return this.callable;
    }
}
