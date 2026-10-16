package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class afnt extends afug implements afhv, afun {
    public static final afnq Companion = new afnq(null);
    private static final Method enumEntriesMethod;
    private final afwf<?> caller;
    private final afqw<? extends Enum<?>> enumClass;
    private final aezr getter$delegate;
    private final afdf<?> result;
    private final aezr returnType$delegate;

    static {
        Method method = null;
        Method[] declaredMethods = afvu.getStdlibClassLoader().loadClass("kotlin.enums.EnumEntriesKt").getDeclaredMethods();
        declaredMethods.getClass();
        boolean z = false;
        for (Method method2 : declaredMethods) {
            if (affa.f(method2.getName(), "enumEntries")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                Object objCZ = woy.cZ(parameterTypes);
                if (objCZ != null) {
                    Class cls = (Class) objCZ;
                    if (cls.isArray() && affa.f(cls.getComponentType(), Enum.class)) {
                        if (z) {
                            throw new IllegalArgumentException("Array contains more than one matching element.");
                        }
                        z = true;
                        method = method2;
                    }
                } else {
                    continue;
                }
            }
        }
        if (!z) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        method.getClass();
        enumEntriesMethod = method;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afnt(afqw<? extends Enum<?>> afqwVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(afpq.EMPTY);
        afqwVar.getClass();
        this.enumClass = afqwVar;
        Object objInvoke = enumEntriesMethod.invoke(null, affa.h(afqwVar).getEnumConstants());
        objInvoke.getClass();
        this.result = (afdf) objInvoke;
        this.returnType$delegate = woy.dH(2, new afno(this));
        this.caller = new afns(this);
        this.getter$delegate = woy.dH(2, new afnp(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afnr getter_delegate$lambda$0(afnt afntVar) {
        return new afnr(afntVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afib returnType_delegate$lambda$0(afnt afntVar) {
        afhe afheVarB = affw.b(afdf.class);
        afid afidVar = afid.a;
        return afik.k(afheVarB, woy.bg(afik.f(afik.k(afntVar.enumClass, null, false, 7))), false, 6);
    }

    public GenericDeclaration default$findJavaDeclaration() {
        return afez.a(getContainer(), getSignature());
    }

    public boolean equals(Object obj) {
        afun<?> afunVarAsReflectProperty = afvu.asReflectProperty(obj);
        return afunVarAsReflectProperty != null && affa.f(getContainer(), afunVarAsReflectProperty.getContainer()) && affa.f(getName(), afunVarAsReflectProperty.getName()) && affa.f(getSignature(), afunVarAsReflectProperty.getSignature()) && affa.f(null, afunVarAsReflectProperty.getRawBoundReceiver());
    }

    @Override // defpackage.affd
    public /* bridge */ GenericDeclaration findJavaDeclaration() {
        return default$findJavaDeclaration();
    }

    @Override // defpackage.afue
    public List<afhr> getAllParameters() {
        return afbe.a;
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        return afbe.a;
    }

    @Override // defpackage.afue
    public afwf<?> getCaller() {
        return this.caller;
    }

    @Override // defpackage.afue
    public afwf<?> getCallerWithDefaults() {
        return null;
    }

    @Override // defpackage.afue
    public afrj getContainer() {
        return this.enumClass;
    }

    @Override // defpackage.afhv
    public Object getDelegate() {
        return null;
    }

    @Override // defpackage.afia
    public afhu<afdf<?>> getGetter() {
        return (afhu) this.getter$delegate.a();
    }

    @Override // defpackage.afun
    public Field getJavaField() {
        return null;
    }

    @Override // defpackage.afue
    public agox getModality() {
        return agox.FINAL;
    }

    @Override // defpackage.afhd
    public String getName() {
        return "entries";
    }

    @Override // defpackage.afhd
    public List<afhr> getParameters() {
        return afbe.a;
    }

    @Override // defpackage.afue
    public Object getRawBoundReceiver() {
        return null;
    }

    @Override // defpackage.afhd
    public afib getReturnType() {
        return (afib) this.returnType$delegate.a();
    }

    @Override // defpackage.afun
    public String getSignature() {
        return "getEntries()Lkotlin/enums/EnumEntries;";
    }

    @Override // defpackage.afhd
    public List<afic> getTypeParameters() {
        return afbe.a;
    }

    @Override // defpackage.afhd
    public afif getVisibility() {
        return afif.a;
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // defpackage.afdr
    public afdf<?> invoke() {
        return get();
    }

    @Override // defpackage.afia
    public boolean isConst() {
        return false;
    }

    @Override // defpackage.afia
    public boolean isLateinit() {
        return false;
    }

    @Override // defpackage.afue
    public boolean isPackagePrivate() {
        return false;
    }

    @Override // defpackage.afhd
    public boolean isSuspend() {
        return false;
    }

    @Override // defpackage.afue
    public afue<afdf<?>> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new afnt(this.enumClass);
    }

    public String toString() {
        return afvf.INSTANCE.renderProperty(this);
    }

    @Override // defpackage.afhv
    public afdf<?> get() {
        return this.result;
    }
}
