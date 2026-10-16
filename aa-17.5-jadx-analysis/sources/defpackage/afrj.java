package defpackage;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class afrj implements afer {
    public static final afrg Companion = new afrg(null);
    private static final Class<?> DEFAULT_CONSTRUCTOR_MARKER = Class.forName("afeu");
    public static final aisp LOCAL_PROPERTY_SIGNATURE = new aisp("<v#(\\d+)>");

    private final void addParametersAndMasks(List<Class<?>> list, List<? extends Class<?>> list2, boolean z, boolean z2) {
        if (affa.f(woy.bL(list2), DEFAULT_CONSTRUCTOR_MARKER)) {
            list2 = list2.subList(0, list2.size() - 1);
        }
        int size = z2 ? list2.size() - 1 : list2.size();
        list.addAll(list2);
        for (int i = 0; i < (size + 31) / 32; i++) {
            Class<?> cls = Integer.TYPE;
            cls.getClass();
            list.add(cls);
        }
        Class cls2 = z ? DEFAULT_CONSTRUCTOR_MARKER : Object.class;
        cls2.getClass();
        list.add(cls2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findConstructorMetadata$lambda$1$0(agnw agnwVar) {
        agnwVar.getClass();
        return String.valueOf(agqk.getSignature(agnwVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findFunctionDescriptor$lambda$1(agcj agcjVar) {
        agcjVar.getClass();
        return ahre.DEBUG_TEXT.render(agcjVar) + " | " + afvg.INSTANCE.mapSignature(agcjVar).asString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findFunctionMetadata$lambda$2(agog agogVar) {
        agogVar.getClass();
        return agogVar.getName() + " | " + agqk.getSignature(agogVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findJavaConstructor$lambda$1$0(Constructor constructor) {
        constructor.getClass();
        return afvj.getJvmSignature((Constructor<?>) constructor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findJavaField$lambda$0$0(Field field) {
        return field.getName() + ' ' + field.getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findJavaMethod$lambda$0$0(Method method) {
        method.getClass();
        return afvj.getJvmSignature(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int findPropertyDescriptor$lambda$2(agcc agccVar, agcc agccVar2) {
        Integer numCompare = agcb.compare(agccVar, agccVar2);
        if (numCompare != null) {
            return numCompare.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int findPropertyDescriptor$lambda$3(afeg afegVar, Object obj, Object obj2) {
        return ((Number) afegVar.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findPropertyDescriptor$lambda$4(agdn agdnVar) {
        agdnVar.getClass();
        return ahre.DEBUG_TEXT.render(agdnVar) + " | " + afvg.INSTANCE.mapPropertySignature(agdnVar).asString();
    }

    private final ClassLoader getClassLoader() {
        return agkc.getSafeClassLoader(getJClass());
    }

    private final Method lookupMethod(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) throws NoSuchMethodException, SecurityException {
        afrj afrjVar;
        String str2;
        Class<?>[] clsArr2;
        Class<?> cls3;
        boolean z2;
        Class<?> clsTryLoadClass;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodTryGetMethod = tryGetMethod(cls, str, clsArr, cls2);
        if (methodTryGetMethod != null) {
            return methodTryGetMethod;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            Method methodLookupMethod = lookupMethod(superclass, str, clsArr, cls2, z);
            afrjVar = this;
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z2 = z;
            if (methodLookupMethod != null) {
                return methodLookupMethod;
            }
        } else {
            afrjVar = this;
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z2 = z;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        interfaces.getClass();
        for (Class<?> cls4 : interfaces) {
            cls4.getClass();
            Method methodLookupMethod2 = afrjVar.lookupMethod(cls4, str2, clsArr2, cls3, z2);
            if (methodLookupMethod2 != null) {
                return methodLookupMethod2;
            }
            if (z2 && (clsTryLoadClass = agji.tryLoadClass(agkc.getSafeClassLoader(cls4), String.valueOf(cls4.getName()).concat("$DefaultImpls"))) != null) {
                clsArr2[0] = cls4;
                Method methodTryGetMethod2 = afrjVar.tryGetMethod(clsTryLoadClass, str2, clsArr2, cls3);
                if (methodTryGetMethod2 != null) {
                    return methodTryGetMethod2;
                }
            }
        }
        return null;
    }

    private final Constructor<?> tryGetConstructor(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method tryGetMethod(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (affa.f(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (affa.f(method.getName(), str) && affa.f(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final afhv<?> createLocalProperty(int i, String str) {
        str.getClass();
        agoj localPropertyMetadata = getLocalPropertyMetadata(i);
        if (localPropertyMetadata == null) {
            return null;
        }
        if (localPropertyMetadata.getReceiverParameterType() == null) {
            return agmo.isVar(localPropertyMetadata) ? new afsj(this, str, null, localPropertyMetadata, afpq.EMPTY) : new aftm(this, str, null, localPropertyMetadata, afpq.EMPTY);
        }
        throw new aftw("Local property " + localPropertyMetadata.getName() + " is an extension, which is not yet supported");
    }

    public final Constructor<?> findConstructorBySignature(String str) {
        str.getClass();
        return tryGetConstructor(getJClass(), afvu.parseAndLoadDescriptor(getClassLoader(), str, false).getParameters());
    }

    public final agnw findConstructorMetadata(String str) throws IOException {
        str.getClass();
        Iterator<T> it = getConstructorsMetadata().iterator();
        boolean z = false;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (affa.f(String.valueOf(agqk.getSignature((agnw) next)), str)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        agnw agnwVar = (agnw) obj;
        if (agnwVar != null) {
            return agnwVar;
        }
        String strCu = woy.cu(getConstructorsMetadata(), "\n", null, null, afrd.INSTANCE, 30);
        StringBuilder sb = new StringBuilder("Constructor (JVM signature: ");
        sb.append(str);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        sb.append(strCu.length() == 0 ? " no constructors found" : " several matching constructors found:\n".concat(strCu));
        throw new aftw(sb.toString());
    }

    public final Constructor<?> findDefaultConstructor(String str) {
        str.getClass();
        Class<?> jClass = getJClass();
        ArrayList arrayList = new ArrayList();
        addParametersAndMasks(arrayList, afvu.parseAndLoadDescriptor(getClassLoader(), str, false).getParameters(), true, false);
        return tryGetConstructor(jClass, arrayList);
    }

    public final Method findDefaultMethod(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        if (affa.f(str, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(getJClass());
        }
        afnb andLoadDescriptor = afvu.parseAndLoadDescriptor(getClassLoader(), str2, true);
        addParametersAndMasks(arrayList, andLoadDescriptor.getParameters(), false, z2);
        Class<?> methodOwner = getMethodOwner();
        String strConcat = str.concat("$default");
        Class<?>[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<?> returnType = andLoadDescriptor.getReturnType();
        returnType.getClass();
        return lookupMethod(methodOwner, strConcat, clsArr, returnType, z);
    }

    public final agcj findFunctionDescriptor(String str, String str2) throws IOException {
        str.getClass();
        str2.getClass();
        Collection<agcj> collectionCf = affa.f(str, "<init>") ? woy.cf(getConstructorDescriptors()) : getFunctions(ahnj.identifier(str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionCf) {
            if (affa.f(afvg.INSTANCE.mapSignature((agcj) obj).asString(), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            return (agcj) woy.bN(arrayList);
        }
        String strCu = woy.cu(collectionCf, "\n", null, null, afrb.INSTANCE, 30);
        StringBuilder sb = new StringBuilder("Function '");
        sb.append(str);
        sb.append("' (JVM signature: ");
        sb.append(str2);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        sb.append(strCu.length() == 0 ? " no members found" : "\n" + strCu);
        throw new aftw(sb.toString());
    }

    public final agog findFunctionMetadata(String str, String str2) throws IOException {
        str.getClass();
        str2.getClass();
        if (!(this instanceof afrt)) {
            throw new IllegalArgumentException("Only top-level functions are supported for now: " + this + '/' + str + " (" + str2 + ')');
        }
        afrt afrtVar = (afrt) this;
        Collection<agog> functionsMetadata = afrtVar.getFunctionsMetadata();
        ArrayList arrayList = new ArrayList();
        for (Object obj : functionsMetadata) {
            agog agogVar = (agog) obj;
            if (affa.f(agogVar.getName(), str) && affa.f(String.valueOf(agqk.getSignature(agogVar)), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            return (agog) woy.bN(arrayList);
        }
        String strCu = woy.cu(afrtVar.getFunctionsMetadata(), "\n", null, null, afra.INSTANCE, 30);
        StringBuilder sb = new StringBuilder("Function '");
        sb.append(str);
        sb.append("' (JVM signature: ");
        sb.append(str2);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        sb.append(strCu.length() == 0 ? " no members found" : " several matching members found:\n".concat(strCu));
        throw new aftw(sb.toString());
    }

    public final Constructor<?> findJavaConstructor(String str) throws SecurityException, IOException {
        String str2;
        str.getClass();
        Constructor<?>[] declaredConstructors = getJClass().getDeclaredConstructors();
        declaredConstructors.getClass();
        int i = 0;
        Constructor<?> constructor = null;
        boolean z = false;
        Constructor<?> constructor2 = null;
        while (true) {
            if (i < declaredConstructors.length) {
                Constructor<?> constructor3 = declaredConstructors[i];
                constructor3.getClass();
                if (affa.f(afvj.getJvmSignature(constructor3), str)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    constructor2 = constructor3;
                }
                i++;
            } else if (z) {
                constructor = constructor2;
            }
        }
        if (constructor != null) {
            return constructor;
        }
        Constructor<?>[] declaredConstructors2 = getJClass().getDeclaredConstructors();
        declaredConstructors2.getClass();
        String strDy = woy.dy(declaredConstructors2, "\n", null, null, afre.INSTANCE, 30);
        StringBuilder sb = new StringBuilder("Constructor (JVM signature: ");
        sb.append(str);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        if (strDy.length() == 0) {
            str2 = " no constructors found";
        } else {
            str2 = "\n" + strDy;
        }
        sb.append(str2);
        throw new aftw(sb.toString());
    }

    public final Field findJavaField(String str) throws NoSuchFieldException {
        String str2;
        str.getClass();
        Field declaredField = getJClass().getDeclaredField(str);
        if (declaredField != null) {
            return declaredField;
        }
        StringBuilder sb = new StringBuilder("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(getJClass());
        sb.append(':');
        Field[] declaredFields = getJClass().getDeclaredFields();
        declaredFields.getClass();
        if (declaredFields.length == 0) {
            str2 = " no fields found";
        } else {
            str2 = "\n" + woy.dy(declaredFields, "\n", null, null, afrf.INSTANCE, 30);
        }
        sb.append(str2);
        throw new aftw(sb.toString());
    }

    public final Method findJavaMethod(String str, String str2) throws NoSuchMethodException, SecurityException, IOException {
        String str3;
        str.getClass();
        str2.getClass();
        String strSubstring = str2.substring(afyh.D(str2, '(', 0), str2.length());
        strSubstring.getClass();
        afnb andLoadDescriptor = afvu.parseAndLoadDescriptor(getClassLoader(), strSubstring, true);
        Class<?>[] clsArr = (Class[]) andLoadDescriptor.getParameters().toArray(new Class[0]);
        Class<?> returnType = andLoadDescriptor.getReturnType();
        returnType.getClass();
        Method methodLookupMethod = lookupMethod(getMethodOwner(), str, clsArr, returnType, false);
        if (methodLookupMethod != null) {
            return methodLookupMethod;
        }
        Method[] declaredMethods = getJClass().getDeclaredMethods();
        declaredMethods.getClass();
        String strDy = woy.dy(declaredMethods, "\n", null, null, afrc.INSTANCE, 30);
        StringBuilder sb = new StringBuilder("Method '");
        sb.append(str);
        sb.append("' (JVM signature: ");
        sb.append(strSubstring);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        if (strDy.length() == 0) {
            str3 = " no methods found";
        } else {
            str3 = "\n" + strDy;
        }
        sb.append(str3);
        throw new aftw(sb.toString());
    }

    public final Method findMethodBySignature(String str, String str2) throws NoSuchMethodException, SecurityException {
        Method methodLookupMethod;
        str.getClass();
        str2.getClass();
        if (affa.f(str, "<init>")) {
            return null;
        }
        afnb andLoadDescriptor = afvu.parseAndLoadDescriptor(getClassLoader(), str2, true);
        Class<?>[] clsArr = (Class[]) andLoadDescriptor.getParameters().toArray(new Class[0]);
        Class<?> returnType = andLoadDescriptor.getReturnType();
        returnType.getClass();
        Method methodLookupMethod2 = lookupMethod(getMethodOwner(), str, clsArr, returnType, false);
        if (methodLookupMethod2 != null) {
            return methodLookupMethod2;
        }
        if (!getMethodOwner().isInterface() || (methodLookupMethod = lookupMethod(Object.class, str, clsArr, returnType, false)) == null) {
            return null;
        }
        return methodLookupMethod;
    }

    public final agdn findPropertyDescriptor(String str, String str2) throws IOException {
        str.getClass();
        str2.getClass();
        aisj aisjVarD = LOCAL_PROPERTY_SIGNATURE.d(str2);
        if (aisjVarD != null) {
            String str3 = (String) aisjVarD.a().get(1);
            agdn localPropertyDescriptor = getLocalPropertyDescriptor(Integer.parseInt(str3));
            if (localPropertyDescriptor != null) {
                return localPropertyDescriptor;
            }
            throw new aftw("Local property #" + str3 + " not found in " + getJClass());
        }
        Collection<agdn> properties = getProperties(ahnj.identifier(str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : properties) {
            if (affa.f(afvg.INSTANCE.mapPropertySignature((agdn) obj).asString(), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new aftw("Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (agdn) woy.bN(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            agcc visibility = ((agdn) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = woy.aX(linkedHashMap, new afqy(afqx.INSTANCE)).values();
        collectionValues.getClass();
        List list = (List) woy.bJ(collectionValues);
        if (list.size() == 1) {
            list.getClass();
            return (agdn) woy.bF(list);
        }
        String strCu = woy.cu(getProperties(ahnj.identifier(str)), "\n", null, null, afqz.INSTANCE, 30);
        StringBuilder sb = new StringBuilder("Property '");
        sb.append(str);
        sb.append("' (JVM signature: ");
        sb.append(str2);
        sb.append(") not resolved in ");
        sb.append(this);
        sb.append(':');
        sb.append(strCu.length() == 0 ? " no members found" : "\n" + strCu);
        throw new aftw(sb.toString());
    }

    public final agoj findPropertyMetadata(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (!(this instanceof afrt)) {
            throw new IllegalArgumentException("Only top-level properties are supported for now: " + this + '/' + str + " (" + str2 + ')');
        }
        Collection<agoj> propertiesMetadata = ((afrt) this).getPropertiesMetadata();
        ArrayList arrayList = new ArrayList();
        for (Object obj : propertiesMetadata) {
            agoj agojVar = (agoj) obj;
            if (affa.f(agojVar.getName(), str) && affa.f(afjz.computeJvmSignature(agojVar, this), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new aftw("Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + this);
        }
        if (arrayList.size() <= 1) {
            return (agoj) woy.bN(arrayList);
        }
        throw new aftw("Property '" + str + "' (JVM signature: " + str2 + ") resolved in several methods in " + this);
    }

    public abstract Collection<agbh> getConstructorDescriptors();

    public abstract Collection<agnw> getConstructorsMetadata();

    public abstract Collection<agcj> getFunctions(ahnj ahnjVar);

    public abstract agdn getLocalPropertyDescriptor(int i);

    public abstract agoj getLocalPropertyMetadata(int i);

    protected Class<?> getMethodOwner() {
        Class<?> wrapperByPrimitive = agkc.getWrapperByPrimitive(getJClass());
        return wrapperByPrimitive == null ? getJClass() : wrapperByPrimitive;
    }

    public abstract Collection<agdn> getProperties(ahnj ahnjVar);
}
