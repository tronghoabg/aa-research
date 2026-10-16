package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class agkt extends agkx implements agkh, agld, agzj {
    private final Class<?> klass;

    public agkt(Class<?> cls) {
        cls.getClass();
        this.klass = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_innerClassNames_$lambda$0(Class cls) {
        String simpleName = cls.getSimpleName();
        simpleName.getClass();
        return simpleName.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnj _get_innerClassNames_$lambda$1(Class cls) {
        String simpleName = cls.getSimpleName();
        if (true != ahnj.isValidIdentifier(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return ahnj.identifier(simpleName);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_methods_$lambda$0(agkt agktVar, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        if (agktVar.isEnum()) {
            method.getClass();
            if (agktVar.isEnumValuesOrValueOf(method)) {
                return false;
            }
        }
        return true;
    }

    private final boolean isEnumValuesOrValueOf(Method method) {
        String name = method.getName();
        if (affa.f(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (affa.f(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof agkt) && affa.f(this.klass, ((agkt) obj).klass);
    }

    @Override // defpackage.agkh, defpackage.agzh
    public agkd findAnnotation(ahnf ahnfVar) {
        Annotation[] declaredAnnotations;
        ahnfVar.getClass();
        AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return agki.findAnnotation(declaredAnnotations, ahnfVar);
    }

    @Override // defpackage.agkh, defpackage.agzh
    public List<agkd> getAnnotations() {
        Annotation[] declaredAnnotations;
        AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) ? afbe.a : agki.getAnnotations(declaredAnnotations);
    }

    @Override // defpackage.agzj
    public List<agkw> getConstructors() throws SecurityException {
        Constructor<?>[] declaredConstructors = this.klass.getDeclaredConstructors();
        declaredConstructors.getClass();
        return afrg.j(afrg.q(afrg.m(woy.dk(declaredConstructors), agko.INSTANCE), agkp.INSTANCE));
    }

    @Override // defpackage.agzj
    public List<agkz> getFields() {
        Field[] declaredFields = this.klass.getDeclaredFields();
        declaredFields.getClass();
        return afrg.j(afrg.q(afrg.m(woy.dk(declaredFields), agkq.INSTANCE), agkr.INSTANCE));
    }

    @Override // defpackage.agzj
    public ahnf getFqName() {
        return agkc.getClassId(this.klass).asSingleFqName();
    }

    @Override // defpackage.agzj
    public List<ahnj> getInnerClassNames() {
        Class<?>[] declaredClasses = this.klass.getDeclaredClasses();
        declaredClasses.getClass();
        return afrg.j(afrg.r(afrg.m(woy.dk(declaredClasses), agkl.INSTANCE), agkm.INSTANCE));
    }

    @Override // defpackage.agzj
    public ahab getLightClassOriginKind() {
        return null;
    }

    @Override // defpackage.agzj
    public List<aglc> getMethods() throws SecurityException {
        Method[] declaredMethods = this.klass.getDeclaredMethods();
        declaredMethods.getClass();
        return afrg.j(afrg.q(afrg.l(woy.dk(declaredMethods), new agkn(this)), agks.INSTANCE));
    }

    @Override // defpackage.agld
    public int getModifiers() {
        return this.klass.getModifiers();
    }

    @Override // defpackage.agzt
    public ahnj getName() {
        boolean zIsAnonymousClass = this.klass.isAnonymousClass();
        Class<?> cls = this.klass;
        if (!zIsAnonymousClass) {
            return ahnj.identifier(cls.getSimpleName());
        }
        String name = cls.getName();
        name.getClass();
        return ahnj.identifier(afyh.O(name, name));
    }

    @Override // defpackage.agzj
    public agkt getOuterClass() {
        Class<?> declaringClass = this.klass.getDeclaringClass();
        if (declaringClass != null) {
            return new agkt(declaringClass);
        }
        return null;
    }

    @Override // defpackage.agzj
    public Collection<agzv> getRecordComponents() {
        Object[] objArrLoadGetRecordComponents = agjx.INSTANCE.loadGetRecordComponents(this.klass);
        if (objArrLoadGetRecordComponents == null) {
            objArrLoadGetRecordComponents = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrLoadGetRecordComponents.length);
        for (Object obj : objArrLoadGetRecordComponents) {
            arrayList.add(new aglg(obj));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.reflect.Type] */
    @Override // defpackage.agzj
    public Collection<agzl> getSupertypes() {
        Class cls;
        cls = Object.class;
        if (affa.f(this.klass, cls)) {
            return afbe.a;
        }
        ArrayList arrayList = new ArrayList(2);
        ?? genericSuperclass = this.klass.getGenericSuperclass();
        arrayList.add(genericSuperclass != 0 ? genericSuperclass : Object.class);
        affx.a(this.klass.getGenericInterfaces(), arrayList);
        List listBi = woy.bi(arrayList.toArray(new Type[arrayList.size()]));
        ArrayList arrayList2 = new ArrayList(woy.bp(listBi, 10));
        Iterator it = listBi.iterator();
        while (it.hasNext()) {
            arrayList2.add(new agkv((Type) it.next()));
        }
        return arrayList2;
    }

    @Override // defpackage.agzy
    public List<aglj> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.klass.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new aglj(typeVariable));
        }
        return arrayList;
    }

    @Override // defpackage.agzs
    public agey getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? agev.INSTANCE : Modifier.isPrivate(modifiers) ? ages.INSTANCE : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? agjd.INSTANCE : agjc.INSTANCE : agjb.INSTANCE;
    }

    @Override // defpackage.agzj
    public boolean hasDefaultConstructor() {
        return false;
    }

    public int hashCode() {
        return this.klass.hashCode();
    }

    @Override // defpackage.agzs
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // defpackage.agzj
    public boolean isAnnotationType() {
        return this.klass.isAnnotation();
    }

    @Override // defpackage.agzh
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // defpackage.agzj
    public boolean isEnum() {
        return this.klass.isEnum();
    }

    @Override // defpackage.agzs
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // defpackage.agzj
    public boolean isInterface() {
        return this.klass.isInterface();
    }

    @Override // defpackage.agzj
    public boolean isRecord() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Boolean boolLoadIsRecord = agjx.INSTANCE.loadIsRecord(this.klass);
        if (boolLoadIsRecord != null) {
            return boolLoadIsRecord.booleanValue();
        }
        return false;
    }

    @Override // defpackage.agzj
    public boolean isSealed() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Boolean boolLoadIsSealed = agjx.INSTANCE.loadIsSealed(this.klass);
        if (boolLoadIsSealed != null) {
            return boolLoadIsSealed.booleanValue();
        }
        return false;
    }

    @Override // defpackage.agzs
    public boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    public String toString() {
        return getClass().getName() + ": " + this.klass;
    }

    @Override // defpackage.agkh
    public Class<?> getElement() {
        return this.klass;
    }

    @Override // defpackage.agzh
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // defpackage.agzh
    public /* bridge */ /* synthetic */ agzf findAnnotation(ahnf ahnfVar) {
        return findAnnotation(ahnfVar);
    }
}
