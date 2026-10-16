package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public abstract class afmi<V> extends afko<V> implements afun<V> {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(afmi.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0)};
    public static final aflo Companion = new aflo(null);
    private static final Object EXTENSION_PROPERTY_DELEGATE = new Object();
    private final afrj container;
    private final afup descriptor$delegate;
    private final aezr javaField$delegate;
    private final String name;
    private final Object rawBoundReceiver;
    private final String signature;

    /* JADX WARN: Illegal instructions before constructor call */
    public afmi(afrj afrjVar, agdn agdnVar, afpq afpqVar) {
        afrjVar.getClass();
        agdnVar.getClass();
        afpqVar.getClass();
        String strAsString = agdnVar.getName().asString();
        strAsString.getClass();
        this(afrjVar, strAsString, afvg.INSTANCE.mapPropertySignature(agdnVar).asString(), agdnVar, afeq.NO_RECEIVER, afpqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V> Type computeReturnType$lambda$0(afmi<? extends V> afmiVar) {
        return afmiVar.getCaller().getReturnType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agdn descriptor_delegate$lambda$0(afmi afmiVar) {
        return afmiVar.getContainer().findPropertyDescriptor(afmiVar.getName(), afmiVar.getSignature());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field javaField_delegate$lambda$0(afmi afmiVar) {
        Class<?> enclosingClass;
        afpn afpnVarMapPropertySignature = afvg.INSTANCE.mapPropertySignature(afmiVar.getDescriptor());
        if (!(afpnVarMapPropertySignature instanceof afpl)) {
            if (afpnVarMapPropertySignature instanceof afpj) {
                return ((afpj) afpnVarMapPropertySignature).getField();
            }
            if ((afpnVarMapPropertySignature instanceof afpk) || (afpnVarMapPropertySignature instanceof afpm)) {
                return null;
            }
            throw new aezs();
        }
        afpl afplVar = (afpl) afpnVarMapPropertySignature;
        agdn descriptor = afplVar.getDescriptor();
        ahml jvmFieldSignature = ahmt.INSTANCE.getJvmFieldSignature(afplVar.getProto(), afplVar.getNameResolver(), afplVar.getTypeTable(), false | (!((8 & 8) == 0)));
        if (jvmFieldSignature != null) {
            if (agsh.isPropertyWithBackingFieldInOuterClass(descriptor) || ahmt.isMovedFromInterfaceCompanion(afplVar.getProto())) {
                enclosingClass = afmiVar.getContainer().getJClass().getEnclosingClass();
            } else {
                agbi containingDeclaration = descriptor.getContainingDeclaration();
                enclosingClass = containingDeclaration instanceof agba ? afvu.toJavaClass((agba) containingDeclaration) : afmiVar.getContainer().getJClass();
            }
            if (enclosingClass != null) {
                try {
                    return enclosingClass.getDeclaredField(jvmFieldSignature.getName());
                } catch (NoSuchFieldException unused) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Member computeDelegateSource() {
        if (!getDescriptor().isDelegated()) {
            return null;
        }
        afpn afpnVarMapPropertySignature = afvg.INSTANCE.mapPropertySignature(getDescriptor());
        if (afpnVarMapPropertySignature instanceof afpl) {
            afpl afplVar = (afpl) afpnVarMapPropertySignature;
            if (afplVar.getSignature().hasDelegateMethod()) {
                ahlv delegateMethod = afplVar.getSignature().getDelegateMethod();
                if (!delegateMethod.hasName() || !delegateMethod.hasDesc()) {
                    return null;
                }
                return getContainer().findMethodBySignature(afplVar.getNameResolver().getString(delegateMethod.getName()), afplVar.getNameResolver().getString(delegateMethod.getDesc()));
            }
        }
        return getJavaField();
    }

    @Override // defpackage.afko
    protected aiqp computeReturnType() {
        aigl returnType = getDescriptor().getReturnType();
        returnType.getClass();
        return new aiqp(returnType, afuo.isLocalDelegated(this) ? null : new aflm(this));
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
    public afwf<?> getCaller() {
        return getGetter().getCaller();
    }

    @Override // defpackage.afue
    public afwf<?> getCallerWithDefaults() {
        return getGetter().getCallerWithDefaults();
    }

    @Override // defpackage.afue
    public afrj getContainer() {
        return this.container;
    }

    @Override // defpackage.afko
    public agdn getDescriptor() {
        T value = this.descriptor$delegate.getValue(this, $$delegatedProperties[0]);
        value.getClass();
        return (agdn) value;
    }

    @Override // defpackage.afia
    public abstract aflr<V> getGetter();

    @Override // defpackage.afun
    public Field getJavaField() {
        return (Field) this.javaField$delegate.a();
    }

    @Override // defpackage.afhd
    public String getName() {
        return this.name;
    }

    @Override // defpackage.afue
    public Object getRawBoundReceiver() {
        return this.rawBoundReceiver;
    }

    @Override // defpackage.afun
    public String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.afia
    public boolean isConst() {
        return getDescriptor().isConst();
    }

    @Override // defpackage.afia
    public boolean isLateinit() {
        return getDescriptor().isLateInit();
    }

    @Override // defpackage.afhd
    public boolean isSuspend() {
        return false;
    }

    public String toString() {
        return afvf.INSTANCE.renderProperty(this);
    }

    private afmi(afrj afrjVar, String str, String str2, agdn agdnVar, Object obj, afpq afpqVar) {
        super(afpqVar);
        this.container = afrjVar;
        this.name = str;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this.javaField$delegate = woy.dH(2, new aflk(this));
        this.descriptor$delegate = afus.lazySoft(agdnVar, new afll(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public afmi(afrj afrjVar, String str, String str2, Object obj) {
        this(afrjVar, str, str2, null, obj, afpq.EMPTY);
        afrjVar.getClass();
        str.getClass();
        str2.getClass();
    }
}
