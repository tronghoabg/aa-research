package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class afmr<V> extends defpackage.afmn<V, V> implements defpackage.afit<V> {
    static final /* synthetic */ defpackage.afja<java.lang.Object>[] $$delegatedProperties = {new defpackage.afgn(defpackage.afmr.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0)};
    private final defpackage.afvp descriptor$delegate = defpackage.afvs.lazySoft(new defpackage.afmp(this));
    private final defpackage.afar caller$delegate = defpackage.afga.cB(2, new defpackage.afmq(this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afxf caller_delegate$lambda$0(defpackage.afmr afmrVar) {
        return defpackage.afnj.computeCallerForAccessor(afmrVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.ageo descriptor_delegate$lambda$0(defpackage.afmr afmrVar) {
        defpackage.ageo getter = afmrVar.getProperty().getDescriptor().getGetter();
        if (getter != null) {
            return getter;
        }
        defpackage.agjl agjlVarCreateDefaultGetter = defpackage.ahts.createDefaultGetter(afmrVar.getProperty().getDescriptor(), defpackage.aggk.Companion.getEMPTY());
        agjlVarCreateDefaultGetter.initialize(afmrVar.getProperty().getDescriptor().getType());
        return agjlVarCreateDefaultGetter;
    }

    @Override // defpackage.aflo
    protected defpackage.airp computeReturnType() {
        return (defpackage.airp) getProperty().getReturnType();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.afmr) && defpackage.afga.f(getProperty(), ((defpackage.afmr) obj).getProperty());
    }

    @Override // defpackage.afve
    public defpackage.afxf<?> getCaller() {
        return (defpackage.afxf) this.caller$delegate.a();
    }

    @Override // defpackage.afmn, defpackage.aflo
    public defpackage.ageo getDescriptor() {
        T value = this.descriptor$delegate.getValue(this, $$delegatedProperties[0]);
        value.getClass();
        return (defpackage.ageo) value;
    }

    @Override // defpackage.afid
    public java.lang.String getName() {
        return "<get-" + getProperty().getName() + '>';
    }

    public int hashCode() {
        return getProperty().hashCode();
    }

    @Override // defpackage.afve
    public final defpackage.aflo<V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        throw new java.lang.IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    public java.lang.String toString() {
        defpackage.afni property = getProperty();
        java.util.Objects.toString(property);
        return "getter of ".concat(java.lang.String.valueOf(property));
    }
}
