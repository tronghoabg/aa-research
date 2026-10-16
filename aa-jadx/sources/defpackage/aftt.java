package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aftt extends defpackage.aftg {
    private final defpackage.afar<defpackage.afwq> _typeParameterTable;
    private final defpackage.agpg kmFunction;
    private final defpackage.afar returnType$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftt(defpackage.afsj afsjVar, java.lang.String str, java.lang.Object obj, defpackage.agpg agpgVar, defpackage.afqq afqqVar) {
        super(afsjVar, str, obj, afqqVar);
        afsjVar.getClass();
        str.getClass();
        agpgVar.getClass();
        afqqVar.getClass();
        this.kmFunction = agpgVar;
        this._typeParameterTable = defpackage.afga.cB(2, new defpackage.aftq(afsjVar, this));
        this.returnType$delegate = defpackage.afga.cB(2, new defpackage.aftr(this, afsjVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afwq _typeParameterTable$lambda$0(defpackage.afsj afsjVar, defpackage.aftt afttVar) {
        defpackage.afrw afrwVar = afsjVar instanceof defpackage.afrw ? (defpackage.afrw) afsjVar : null;
        return defpackage.afwq.Companion.create(afttVar.kmFunction.getTypeParameters(), afrwVar != null ? afrwVar.getTypeParameterTable$kotlin_reflection() : null, afttVar, defpackage.aglc.getSafeClassLoader(afsjVar.getJClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.airc returnType_delegate$lambda$0(defpackage.aftt afttVar, defpackage.afsj afsjVar) {
        return defpackage.afkz.toKType$default(afttVar.kmFunction.getReturnType(), defpackage.aglc.getSafeClassLoader(afsjVar.getJClass()), afttVar.getTypeParameterTable(), false, new defpackage.afts(afttVar), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.reflect.Type returnType_delegate$lambda$0$0(defpackage.aftt afttVar) {
        java.lang.reflect.Type typeExtractContinuationArgument = defpackage.afvj.extractContinuationArgument(afttVar);
        return typeExtractContinuationArgument == null ? afttVar.getCaller().getReturnType() : typeExtractContinuationArgument;
    }

    @Override // defpackage.aftg
    protected java.util.List<defpackage.agpq> getContextParameters() {
        return this.kmFunction.getContextParameters();
    }

    @Override // defpackage.aftg
    protected defpackage.agpl getExtensionReceiverType() {
        return this.kmFunction.getReceiverParameterType();
    }

    @Override // defpackage.aftg
    protected defpackage.agrp getJvmSignature() {
        defpackage.agrp signature = defpackage.agrk.getSignature(this.kmFunction);
        if (signature != null) {
            return signature;
        }
        toString();
        throw new defpackage.afuw("No signature for function: ".concat(toString()));
    }

    @Override // defpackage.afve
    public defpackage.agpx getModality() {
        return defpackage.agno.getModality(this.kmFunction);
    }

    @Override // defpackage.afid
    public java.lang.String getName() {
        return this.kmFunction.getName();
    }

    @Override // defpackage.afid
    public defpackage.afjb getReturnType() {
        return (defpackage.afjb) this.returnType$delegate.a();
    }

    @Override // defpackage.aftg
    protected defpackage.afwq getTypeParameterTable() {
        return (defpackage.afwq) this._typeParameterTable.a();
    }

    @Override // defpackage.aftg
    protected java.util.List<defpackage.agpq> getValueParameters() {
        return this.kmFunction.getValueParameters();
    }

    @Override // defpackage.afid
    public defpackage.afjf getVisibility() {
        return defpackage.afkz.toKVisibility(defpackage.agno.getVisibility(this.kmFunction));
    }

    @Override // defpackage.afih
    public boolean isExternal() {
        return defpackage.agno.isExternal(this.kmFunction);
    }

    @Override // defpackage.afih
    public boolean isInfix() {
        return defpackage.agno.isInfix(this.kmFunction);
    }

    @Override // defpackage.afih
    public boolean isInline() {
        return defpackage.agno.isInline(this.kmFunction);
    }

    @Override // defpackage.afih
    public boolean isOperator() {
        return defpackage.agno.isOperator(this.kmFunction);
    }

    @Override // defpackage.afvi
    public boolean isPrimaryConstructor() {
        return false;
    }

    @Override // defpackage.afid
    public boolean isSuspend() {
        return defpackage.agno.isSuspend(this.kmFunction);
    }

    @Override // defpackage.afve
    public defpackage.afve<java.lang.Object> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.aftt(afsjVar, getSignature(), defpackage.affq.NO_RECEIVER, this.kmFunction, afqqVar);
    }
}
