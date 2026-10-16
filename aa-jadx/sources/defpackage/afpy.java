package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class afpy<V> extends defpackage.afou<V> implements defpackage.afvn<V> {
    private final defpackage.afar allParameters$delegate;
    private final defpackage.afar parameters$delegate;
    private final defpackage.afar returnType$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpy(defpackage.afsj afsjVar, java.lang.reflect.Field field, java.lang.Object obj, defpackage.afqq afqqVar) {
        super(afsjVar, field, obj, afqqVar);
        afsjVar.getClass();
        field.getClass();
        afqqVar.getClass();
        this.allParameters$delegate = defpackage.afga.cB(2, new defpackage.afpm(this));
        this.parameters$delegate = defpackage.afga.cB(2, new defpackage.afpn(this));
        this.returnType$delegate = defpackage.afga.cB(2, new defpackage.afpo(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List allParameters_delegate$lambda$0(defpackage.afpy afpyVar) {
        return defpackage.afpz.computeParameters(afpyVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List parameters_delegate$lambda$0(defpackage.afpy afpyVar) {
        return defpackage.afvh.isBound(afpyVar) ? defpackage.afpz.computeParameters(afpyVar, false) : afpyVar.getAllParameters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afjb returnType_delegate$lambda$0(defpackage.afpy afpyVar) {
        java.lang.reflect.Type genericType = afpyVar.getJField().getGenericType();
        genericType.getClass();
        return defpackage.afks.toKType$default(genericType, defpackage.afcf.a, null, false, false, null, 30, null);
    }

    public java.lang.reflect.GenericDeclaration default$findJavaDeclaration() {
        return defpackage.afjk.h(getContainer(), getSignature());
    }

    public boolean equals(java.lang.Object obj) {
        defpackage.afvn<?> afvnVarAsReflectProperty = defpackage.afwu.asReflectProperty(obj);
        return afvnVarAsReflectProperty != null && defpackage.afga.f(getContainer(), afvnVarAsReflectProperty.getContainer()) && defpackage.afga.f(getName(), afvnVarAsReflectProperty.getName()) && defpackage.afga.f(getSignature(), afvnVarAsReflectProperty.getSignature()) && defpackage.afga.f(getRawBoundReceiver(), afvnVarAsReflectProperty.getRawBoundReceiver());
    }

    @Override // defpackage.afgd
    public /* bridge */ java.lang.reflect.GenericDeclaration findJavaDeclaration() {
        return default$findJavaDeclaration();
    }

    @Override // defpackage.afve
    public java.util.List<defpackage.afir> getAllParameters() {
        return (java.util.List) this.allParameters$delegate.a();
    }

    @Override // defpackage.afve
    public defpackage.afxf<?> getCaller() {
        return getGetter().getCaller();
    }

    @Override // defpackage.afve
    public defpackage.afxf<?> getCallerWithDefaults() {
        return getGetter().getCallerWithDefaults();
    }

    @Override // defpackage.afja
    public abstract defpackage.afpr<V> getGetter();

    public final java.lang.reflect.Field getJField() {
        java.lang.reflect.Member member = getMember();
        member.getClass();
        return (java.lang.reflect.Field) member;
    }

    @Override // defpackage.afvn
    public java.lang.reflect.Field getJavaField() {
        return getJField();
    }

    @Override // defpackage.afou, defpackage.afve
    public defpackage.agpx getModality() {
        return defpackage.agpx.FINAL;
    }

    @Override // defpackage.afid
    public java.lang.String getName() {
        java.lang.String name = getJField().getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.afid
    public java.util.List<defpackage.afir> getParameters() {
        return (java.util.List) this.parameters$delegate.a();
    }

    @Override // defpackage.afid
    public defpackage.afjb getReturnType() {
        return (defpackage.afjb) this.returnType$delegate.a();
    }

    @Override // defpackage.afvn
    public java.lang.String getSignature() {
        return defpackage.afwj.getJvmSignature(getJField());
    }

    @Override // defpackage.afid
    public java.util.List<defpackage.afjc> getTypeParameters() {
        return defpackage.afce.a;
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.afja
    public boolean isConst() {
        if (java.lang.reflect.Modifier.isFinal(getJField().getModifiers()) && java.lang.reflect.Modifier.isStatic(getJField().getModifiers())) {
            return getJField().getType().isPrimitive() || defpackage.afga.f(getJField().getType(), java.lang.String.class);
        }
        return false;
    }

    @Override // defpackage.afja
    public boolean isLateinit() {
        return false;
    }

    public java.lang.String toString() {
        return defpackage.afwf.INSTANCE.renderProperty(this);
    }
}
