package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class aftr<V> extends afry<V> implements afun<V> {
    private final aezr allParameters$delegate;
    private final afrj container;
    private final aezr javaField$delegate;
    private final agoj kmProperty;
    private final aezr parameters$delegate;
    private final Object rawBoundReceiver;
    private final aezr returnType$delegate;
    private final String signature;
    private final aezr<afvq> typeParameterTable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftr(afrj afrjVar, String str, Object obj, agoj agojVar, afpq afpqVar) {
        super(afpqVar);
        afrjVar.getClass();
        str.getClass();
        agojVar.getClass();
        afpqVar.getClass();
        this.container = afrjVar;
        this.signature = str;
        this.rawBoundReceiver = obj;
        this.kmProperty = agojVar;
        this.allParameters$delegate = woy.dH(2, new afsx(this));
        this.parameters$delegate = woy.dH(2, new afsy(this));
        this.returnType$delegate = woy.dH(2, new afsz(this));
        this.typeParameterTable = woy.dH(2, new afta(this));
        this.javaField$delegate = woy.dH(2, new aftb(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List allParameters_delegate$lambda$0(aftr aftrVar) {
        return afrz.computeParameters(aftrVar, aftrVar.kmProperty.getContextParameters(), aftrVar.kmProperty.getReceiverParameterType(), afbe.a, (afvq) aftrVar.typeParameterTable.a(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field javaField_delegate$lambda$0(aftr aftrVar) {
        agql fieldSignature;
        if (afuo.isLocalDelegated(aftrVar) || (fieldSignature = agqk.getFieldSignature(aftrVar.kmProperty)) == null) {
            return null;
        }
        if (aftrVar.getContainer() instanceof afrt) {
            try {
                return aftrVar.getContainer().getJClass().getDeclaredField(fieldSignature.getName());
            } catch (NoSuchFieldException unused) {
                return null;
            }
        }
        throw new IllegalArgumentException("javaField is only supported for top-level properties for now: " + aftrVar.getContainer() + '/' + aftrVar.getName() + ' ' + aftrVar.getSignature());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List parameters_delegate$lambda$0(aftr aftrVar) {
        return afuh.isBound(aftrVar) ? afrz.computeParameters(aftrVar, aftrVar.kmProperty.getContextParameters(), aftrVar.kmProperty.getReceiverParameterType(), afbe.a, (afvq) aftrVar.typeParameterTable.a(), false) : aftrVar.getAllParameters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aiqc returnType_delegate$lambda$0(aftr aftrVar) {
        return afjz.toKType$default(aftrVar.kmProperty.getReturnType(), agkc.getSafeClassLoader(aftrVar.getContainer().getJClass()), (afvq) aftrVar.typeParameterTable.a(), false, afuo.isLocalDelegated(aftrVar) ? null : new aftc(aftrVar), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V> Type returnType_delegate$lambda$0$0(aftr<? extends V> aftrVar) {
        return aftrVar.getCaller().getReturnType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afvq typeParameterTable$lambda$0(aftr aftrVar) {
        afrj container = aftrVar.getContainer();
        afqw afqwVar = container instanceof afqw ? (afqw) container : null;
        return afvq.Companion.create(aftrVar.kmProperty.getTypeParameters(), afqwVar != null ? afqwVar.getTypeParameterTable$kotlin_reflection() : null, aftrVar, agkc.getSafeClassLoader(aftrVar.getContainer().getJClass()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Member computeDelegateSource() {
        if (!agmo.isDelegated(this.kmProperty)) {
            return null;
        }
        agqp syntheticMethodForDelegate = agqk.getSyntheticMethodForDelegate(this.kmProperty);
        return syntheticMethodForDelegate != null ? getContainer().findMethodBySignature(syntheticMethodForDelegate.getName(), syntheticMethodForDelegate.getDescriptor()) : getJavaField();
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

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() throws NoSuchMethodException, SecurityException {
        Annotation[] annotations;
        if (afuo.isLocalDelegated(this) || getContainer().getJClass().isAnnotation()) {
            List<agms> annotations2 = this.kmProperty.getAnnotations();
            ArrayList arrayList = new ArrayList(woy.bp(annotations2, 10));
            Iterator<T> it = annotations2.iterator();
            while (it.hasNext()) {
                arrayList.add(afjz.toAnnotation((agms) it.next(), agkc.getSafeClassLoader(getContainer().getJClass())));
            }
            return arrayList;
        }
        if (!(getContainer() instanceof afrt)) {
            throw new IllegalArgumentException("Annotations are only supported for top-level properties for now: " + getContainer() + '/' + getName() + ' ' + getSignature());
        }
        agqp syntheticMethodForAnnotations = agqk.getSyntheticMethodForAnnotations(this.kmProperty);
        if (syntheticMethodForAnnotations == null) {
            return afbe.a;
        }
        Method methodFindMethodBySignature = getContainer().findMethodBySignature(syntheticMethodForAnnotations.getName(), syntheticMethodForAnnotations.getDescriptor());
        if (methodFindMethodBySignature != null && (annotations = methodFindMethodBySignature.getAnnotations()) != null) {
            return afvu.unwrapKotlinRepeatableAnnotations(woy.df(annotations));
        }
        toString();
        throw new aftw("No synthetic method found: ".concat(toString()));
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

    @Override // defpackage.afia
    public abstract aftf<V> getGetter();

    @Override // defpackage.afun
    public Field getJavaField() {
        return (Field) this.javaField$delegate.a();
    }

    public final agoj getKmProperty() {
        return this.kmProperty;
    }

    @Override // defpackage.afue
    public agox getModality() {
        return agmo.getModality(this.kmProperty);
    }

    @Override // defpackage.afhd
    public String getName() {
        return this.kmProperty.getName();
    }

    @Override // defpackage.afhd
    public List<afhr> getParameters() {
        return (List) this.parameters$delegate.a();
    }

    @Override // defpackage.afue
    public Object getRawBoundReceiver() {
        return this.rawBoundReceiver;
    }

    @Override // defpackage.afhd
    public afib getReturnType() {
        return (afib) this.returnType$delegate.a();
    }

    @Override // defpackage.afun
    public String getSignature() {
        return this.signature;
    }

    public final aezr<afvq> getTypeParameterTable() {
        return this.typeParameterTable;
    }

    @Override // defpackage.afhd
    public List<afic> getTypeParameters() {
        return ((afvq) this.typeParameterTable.a()).getOwnTypeParameters();
    }

    @Override // defpackage.afhd
    public afif getVisibility() {
        return afjz.toKVisibility(agmo.getVisibility(this.kmProperty));
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.afia
    public boolean isConst() {
        return agmo.isConst(this.kmProperty);
    }

    @Override // defpackage.afia
    public boolean isLateinit() {
        return agmo.isLateinit(this.kmProperty);
    }

    @Override // defpackage.afhd
    public boolean isSuspend() {
        return false;
    }

    public String toString() {
        return afvf.INSTANCE.renderProperty(this);
    }
}
