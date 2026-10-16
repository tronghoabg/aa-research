package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afoy extends defpackage.afpc {
    private final defpackage.afar caller$delegate;
    private final defpackage.afar javaTypeParameters$delegate;
    private final java.util.Collection<defpackage.afvi> overridden;
    private final defpackage.afar returnType$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afoy(defpackage.afsj afsjVar, java.lang.reflect.Constructor<?> constructor, java.lang.Object obj) {
        super(afsjVar, constructor, obj, defpackage.afqq.EMPTY);
        afsjVar.getClass();
        constructor.getClass();
        this.javaTypeParameters$delegate = defpackage.afga.cB(2, new defpackage.afov(this));
        this.returnType$delegate = defpackage.afga.cB(2, new defpackage.afow(afsjVar));
        this.overridden = defpackage.afce.a;
        this.caller$delegate = defpackage.afga.cB(2, new defpackage.afox(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afye caller_delegate$lambda$0(defpackage.afoy afoyVar) {
        return defpackage.afvh.isBound(afoyVar) ? new defpackage.afxi(afoyVar.getJConstructor(), defpackage.afvh.getBoundReceiver(afoyVar)) : new defpackage.afxk(afoyVar.getJConstructor());
    }

    private final java.lang.Class<?> getJClass() {
        return getContainer().getJClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.reflect.TypeVariable[] javaTypeParameters_delegate$lambda$0(defpackage.afoy afoyVar) {
        java.lang.reflect.TypeVariable<java.lang.Class<?>>[] typeParameters = afoyVar.getJClass().getTypeParameters();
        java.lang.reflect.TypeVariable<java.lang.reflect.Constructor<?>>[] typeParameters2 = afoyVar.getJConstructor().getTypeParameters();
        typeParameters2.getClass();
        return (java.lang.reflect.TypeVariable[]) defpackage.afga.bD(typeParameters, typeParameters2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afjb returnType_delegate$lambda$0(defpackage.afsj afsjVar) {
        afsjVar.getClass();
        return defpackage.afjr.b((defpackage.afrw) afsjVar);
    }

    @Override // defpackage.afve
    public defpackage.afxf<?> getCaller() {
        return (defpackage.afxf) this.caller$delegate.a();
    }

    @Override // defpackage.afve
    public defpackage.afxf<?> getCallerWithDefaults() {
        return null;
    }

    @Override // defpackage.afpc
    public java.lang.reflect.Type[] getGenericParameterTypes() {
        java.lang.reflect.Type[] genericParameterTypes = getJConstructor().getGenericParameterTypes();
        genericParameterTypes.getClass();
        return genericParameterTypes;
    }

    public final java.lang.reflect.Constructor<?> getJConstructor() {
        java.lang.reflect.Member member = getMember();
        member.getClass();
        return (java.lang.reflect.Constructor) member;
    }

    @Override // defpackage.afpc
    public java.lang.reflect.TypeVariable<?>[] getJavaTypeParameters() {
        return (java.lang.reflect.TypeVariable[]) this.javaTypeParameters$delegate.a();
    }

    @Override // defpackage.afid
    public java.lang.String getName() {
        return "<init>";
    }

    @Override // defpackage.afvi
    public java.util.Collection<defpackage.afvi> getOverridden() {
        return this.overridden;
    }

    @Override // defpackage.afpc
    public java.lang.Class<?>[] getParameterTypes() {
        java.lang.Class<?>[] parameterTypes = getJConstructor().getParameterTypes();
        parameterTypes.getClass();
        return parameterTypes;
    }

    @Override // defpackage.afid
    public defpackage.afjb getReturnType() {
        return (defpackage.afjb) this.returnType$delegate.a();
    }

    @Override // defpackage.afvi
    public java.lang.String getSignature() {
        return defpackage.afwj.getJvmSignature(getJConstructor());
    }

    @Override // defpackage.afvi
    public boolean isPrimaryConstructor() {
        return false;
    }

    @Override // defpackage.afpc
    public boolean isVararg() {
        return getJConstructor().isVarArgs();
    }

    @Override // defpackage.afve
    public defpackage.afve<java.lang.Object> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        if (defpackage.afga.f(afqqVar, defpackage.afqq.EMPTY)) {
            return new defpackage.afoy(afsjVar, getJConstructor(), defpackage.affq.NO_RECEIVER);
        }
        toString();
        throw new java.lang.IllegalArgumentException("Constructors cannot have fake overrides: ".concat(toString()));
    }
}
