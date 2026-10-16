package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class afoy<V> extends afnu<V> implements afun<V> {
    private final aezr allParameters$delegate;
    private final aezr parameters$delegate;
    private final aezr returnType$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afoy(afrj afrjVar, Field field, Object obj, afpq afpqVar) {
        super(afrjVar, field, obj, afpqVar);
        afrjVar.getClass();
        field.getClass();
        afpqVar.getClass();
        this.allParameters$delegate = woy.dH(2, new afom(this));
        this.parameters$delegate = woy.dH(2, new afon(this));
        this.returnType$delegate = woy.dH(2, new afoo(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List allParameters_delegate$lambda$0(afoy afoyVar) {
        return afoz.computeParameters(afoyVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List parameters_delegate$lambda$0(afoy afoyVar) {
        return afuh.isBound(afoyVar) ? afoz.computeParameters(afoyVar, false) : afoyVar.getAllParameters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afib returnType_delegate$lambda$0(afoy afoyVar) {
        Type genericType = afoyVar.getJField().getGenericType();
        genericType.getClass();
        return afjs.toKType$default(genericType, afbf.a, null, false, false, null, 30, null);
    }

    public GenericDeclaration default$findJavaDeclaration() {
        return afez.a(getContainer(), getSignature());
    }

    public boolean equals(Object obj) {
        afun<?> afunVarAsReflectProperty = afvu.asReflectProperty(obj);
        return afunVarAsReflectProperty != null && affa.f(getContainer(), afunVarAsReflectProperty.getContainer()) && affa.f(getName(), afunVarAsReflectProperty.getName()) && affa.f(getSignature(), afunVarAsReflectProperty.getSignature()) && affa.f(getRawBoundReceiver(), afunVarAsReflectProperty.getRawBoundReceiver());
    }

    @Override // defpackage.affd
    public /* bridge */ GenericDeclaration findJavaDeclaration() {
        return default$findJavaDeclaration();
    }

    @Override // defpackage.afue
    public List<afhr> getAllParameters() {
        return (List) this.allParameters$delegate.a();
    }

    @Override // defpackage.afue
    public afwf<?> getCaller() {
        return getGetter().getCaller();
    }

    @Override // defpackage.afue
    public afwf<?> getCallerWithDefaults() {
        return getGetter().getCallerWithDefaults();
    }

    @Override // defpackage.afia
    public abstract afor<V> getGetter();

    public final Field getJField() {
        Member member = getMember();
        member.getClass();
        return (Field) member;
    }

    @Override // defpackage.afun
    public Field getJavaField() {
        return getJField();
    }

    @Override // defpackage.afnu, defpackage.afue
    public agox getModality() {
        return agox.FINAL;
    }

    @Override // defpackage.afhd
    public String getName() {
        String name = getJField().getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.afhd
    public List<afhr> getParameters() {
        return (List) this.parameters$delegate.a();
    }

    @Override // defpackage.afhd
    public afib getReturnType() {
        return (afib) this.returnType$delegate.a();
    }

    @Override // defpackage.afun
    public String getSignature() {
        return afvj.getJvmSignature(getJField());
    }

    @Override // defpackage.afhd
    public List<afic> getTypeParameters() {
        return afbe.a;
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.afia
    public boolean isConst() {
        if (Modifier.isFinal(getJField().getModifiers()) && Modifier.isStatic(getJField().getModifiers())) {
            return getJField().getType().isPrimitive() || affa.f(getJField().getType(), String.class);
        }
        return false;
    }

    @Override // defpackage.afia
    public boolean isLateinit() {
        return false;
    }

    public String toString() {
        return afvf.INSTANCE.renderProperty(this);
    }
}
