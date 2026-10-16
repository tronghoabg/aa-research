package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afpk extends defpackage.afpc {
    private final defpackage.afar caller$delegate;
    private final defpackage.afar javaTypeParameters$delegate;
    private final defpackage.afar returnType$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpk(defpackage.afsj afsjVar, java.lang.reflect.Method method, java.lang.Object obj, defpackage.afqq afqqVar) {
        super(afsjVar, method, obj, afqqVar);
        afsjVar.getClass();
        method.getClass();
        afqqVar.getClass();
        this.javaTypeParameters$delegate = defpackage.afga.cB(2, new defpackage.afph(this));
        this.returnType$delegate = defpackage.afga.cB(2, new defpackage.afpi(this));
        this.caller$delegate = defpackage.afga.cB(2, new defpackage.afpj(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afxf caller_delegate$lambda$0(defpackage.afpk afpkVar) {
        if (java.lang.reflect.Modifier.isStatic(afpkVar.getJMethod().getModifiers())) {
            return afpkVar.createStaticMethodCaller(afpkVar.getJMethod());
        }
        java.lang.reflect.Member member = afpkVar.getMember();
        java.util.Objects.toString(member);
        throw new java.lang.IllegalArgumentException("Only static Java methods are supported for now: ".concat(java.lang.String.valueOf(member)));
    }

    private final defpackage.afxf<?> createStaticMethodCaller(java.lang.reflect.Method method) {
        return defpackage.afvh.isBound(this) ? new defpackage.afxz(method, false, defpackage.afvh.getBoundReceiver(this)) : new defpackage.afyc(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.reflect.TypeVariable[] javaTypeParameters_delegate$lambda$0(defpackage.afpk afpkVar) {
        return afpkVar.getJMethod().getTypeParameters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afjb returnType_delegate$lambda$0(defpackage.afpk afpkVar) {
        java.lang.reflect.Type genericReturnType = afpkVar.getJMethod().getGenericReturnType();
        genericReturnType.getClass();
        return defpackage.afks.toKType$default(genericReturnType, defpackage.afcf.a, null, defpackage.afks.isEnumValuesValueOfMethod(afpkVar.getMember()), false, null, 26, null);
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
        java.lang.reflect.Type[] genericParameterTypes = getJMethod().getGenericParameterTypes();
        genericParameterTypes.getClass();
        return genericParameterTypes;
    }

    public final java.lang.reflect.Method getJMethod() {
        java.lang.reflect.Member member = getMember();
        member.getClass();
        return (java.lang.reflect.Method) member;
    }

    @Override // defpackage.afpc
    public java.lang.reflect.TypeVariable<?>[] getJavaTypeParameters() {
        java.lang.Object objA = this.javaTypeParameters$delegate.a();
        objA.getClass();
        return (java.lang.reflect.TypeVariable[]) objA;
    }

    @Override // defpackage.afid
    public java.lang.String getName() {
        java.lang.String name = getMember().getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.afvi
    public java.util.Collection<defpackage.afvi> getOverridden() {
        if (java.lang.reflect.Modifier.isStatic(getJMethod().getModifiers())) {
            return defpackage.afce.a;
        }
        java.lang.reflect.Member member = getMember();
        java.util.Objects.toString(member);
        throw new java.lang.IllegalArgumentException("Only static Java methods are supported for now: ".concat(java.lang.String.valueOf(member)));
    }

    @Override // defpackage.afpc
    public java.lang.Class<?>[] getParameterTypes() {
        java.lang.Class<?>[] parameterTypes = getJMethod().getParameterTypes();
        parameterTypes.getClass();
        return parameterTypes;
    }

    @Override // defpackage.afid
    public defpackage.afjb getReturnType() {
        return (defpackage.afjb) this.returnType$delegate.a();
    }

    @Override // defpackage.afvi
    public java.lang.String getSignature() {
        return defpackage.afwj.getJvmSignature(getJMethod());
    }

    @Override // defpackage.afvi
    public boolean isPrimaryConstructor() {
        return false;
    }

    @Override // defpackage.afpc
    public boolean isVararg() {
        return getJMethod().isVarArgs();
    }

    @Override // defpackage.afve
    public defpackage.afve<java.lang.Object> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.afpk(afsjVar, getJMethod(), defpackage.affq.NO_RECEIVER, afqqVar);
    }
}
