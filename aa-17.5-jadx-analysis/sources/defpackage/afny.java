package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class afny extends afoc {
    private final aezr caller$delegate;
    private final aezr javaTypeParameters$delegate;
    private final Collection<afui> overridden;
    private final aezr returnType$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afny(afrj afrjVar, Constructor<?> constructor, Object obj) {
        super(afrjVar, constructor, obj, afpq.EMPTY);
        afrjVar.getClass();
        constructor.getClass();
        this.javaTypeParameters$delegate = woy.dH(2, new afnv(this));
        this.returnType$delegate = woy.dH(2, new afnw(afrjVar));
        this.overridden = afbe.a;
        this.caller$delegate = woy.dH(2, new afnx(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afxe caller_delegate$lambda$0(afny afnyVar) {
        return afuh.isBound(afnyVar) ? new afwi(afnyVar.getJConstructor(), afuh.getBoundReceiver(afnyVar)) : new afwk(afnyVar.getJConstructor());
    }

    private final Class<?> getJClass() {
        return getContainer().getJClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeVariable[] javaTypeParameters_delegate$lambda$0(afny afnyVar) {
        TypeVariable<Class<?>>[] typeParameters = afnyVar.getJClass().getTypeParameters();
        TypeVariable<Constructor<?>>[] typeParameters2 = afnyVar.getJConstructor().getTypeParameters();
        typeParameters2.getClass();
        return (TypeVariable[]) woy.cJ(typeParameters, typeParameters2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afib returnType_delegate$lambda$0(afrj afrjVar) {
        afrjVar.getClass();
        return afir.b((afqw) afrjVar);
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
        Type[] genericParameterTypes = getJConstructor().getGenericParameterTypes();
        genericParameterTypes.getClass();
        return genericParameterTypes;
    }

    public final Constructor<?> getJConstructor() {
        Member member = getMember();
        member.getClass();
        return (Constructor) member;
    }

    @Override // defpackage.afoc
    public TypeVariable<?>[] getJavaTypeParameters() {
        return (TypeVariable[]) this.javaTypeParameters$delegate.a();
    }

    @Override // defpackage.afhd
    public String getName() {
        return "<init>";
    }

    @Override // defpackage.afui
    public Collection<afui> getOverridden() {
        return this.overridden;
    }

    @Override // defpackage.afoc
    public Class<?>[] getParameterTypes() {
        Class<?>[] parameterTypes = getJConstructor().getParameterTypes();
        parameterTypes.getClass();
        return parameterTypes;
    }

    @Override // defpackage.afhd
    public afib getReturnType() {
        return (afib) this.returnType$delegate.a();
    }

    @Override // defpackage.afui
    public String getSignature() {
        return afvj.getJvmSignature(getJConstructor());
    }

    @Override // defpackage.afui
    public boolean isPrimaryConstructor() {
        return false;
    }

    @Override // defpackage.afoc
    public boolean isVararg() {
        return getJConstructor().isVarArgs();
    }

    @Override // defpackage.afue
    public afue<Object> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        if (affa.f(afpqVar, afpq.EMPTY)) {
            return new afny(afrjVar, getJConstructor(), afeq.NO_RECEIVER);
        }
        toString();
        throw new IllegalArgumentException("Constructors cannot have fake overrides: ".concat(toString()));
    }
}
