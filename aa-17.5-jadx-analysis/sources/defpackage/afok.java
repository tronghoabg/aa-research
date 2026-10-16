package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class afok extends afoc {
    private final aezr caller$delegate;
    private final aezr javaTypeParameters$delegate;
    private final aezr returnType$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afok(afrj afrjVar, Method method, Object obj, afpq afpqVar) {
        super(afrjVar, method, obj, afpqVar);
        afrjVar.getClass();
        method.getClass();
        afpqVar.getClass();
        this.javaTypeParameters$delegate = woy.dH(2, new afoh(this));
        this.returnType$delegate = woy.dH(2, new afoi(this));
        this.caller$delegate = woy.dH(2, new afoj(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afwf caller_delegate$lambda$0(afok afokVar) {
        if (Modifier.isStatic(afokVar.getJMethod().getModifiers())) {
            return afokVar.createStaticMethodCaller(afokVar.getJMethod());
        }
        Member member = afokVar.getMember();
        Objects.toString(member);
        throw new IllegalArgumentException("Only static Java methods are supported for now: ".concat(String.valueOf(member)));
    }

    private final afwf<?> createStaticMethodCaller(Method method) {
        return afuh.isBound(this) ? new afwz(method, false, afuh.getBoundReceiver(this)) : new afxc(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeVariable[] javaTypeParameters_delegate$lambda$0(afok afokVar) {
        return afokVar.getJMethod().getTypeParameters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afib returnType_delegate$lambda$0(afok afokVar) {
        Type genericReturnType = afokVar.getJMethod().getGenericReturnType();
        genericReturnType.getClass();
        return afjs.toKType$default(genericReturnType, afbf.a, null, afjs.isEnumValuesValueOfMethod(afokVar.getMember()), false, null, 26, null);
    }

    @Override // defpackage.afue
    public afwf<?> getCaller() {
        return (afwf) this.caller$delegate.a();
    }

    @Override // defpackage.afue
    public afwf<?> getCallerWithDefaults() {
        return null;
    }

    @Override // defpackage.afoc
    public Type[] getGenericParameterTypes() {
        Type[] genericParameterTypes = getJMethod().getGenericParameterTypes();
        genericParameterTypes.getClass();
        return genericParameterTypes;
    }

    public final Method getJMethod() {
        Member member = getMember();
        member.getClass();
        return (Method) member;
    }

    @Override // defpackage.afoc
    public TypeVariable<?>[] getJavaTypeParameters() {
        Object objA = this.javaTypeParameters$delegate.a();
        objA.getClass();
        return (TypeVariable[]) objA;
    }

    @Override // defpackage.afhd
    public String getName() {
        String name = getMember().getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.afui
    public Collection<afui> getOverridden() {
        if (Modifier.isStatic(getJMethod().getModifiers())) {
            return afbe.a;
        }
        Member member = getMember();
        Objects.toString(member);
        throw new IllegalArgumentException("Only static Java methods are supported for now: ".concat(String.valueOf(member)));
    }

    @Override // defpackage.afoc
    public Class<?>[] getParameterTypes() {
        Class<?>[] parameterTypes = getJMethod().getParameterTypes();
        parameterTypes.getClass();
        return parameterTypes;
    }

    @Override // defpackage.afhd
    public afib getReturnType() {
        return (afib) this.returnType$delegate.a();
    }

    @Override // defpackage.afui
    public String getSignature() {
        return afvj.getJvmSignature(getJMethod());
    }

    @Override // defpackage.afui
    public boolean isPrimaryConstructor() {
        return false;
    }

    @Override // defpackage.afoc
    public boolean isVararg() {
        return getJMethod().isVarArgs();
    }

    @Override // defpackage.afue
    public afue<Object> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new afok(afrjVar, getJMethod(), afeq.NO_RECEIVER, afpqVar);
    }
}
