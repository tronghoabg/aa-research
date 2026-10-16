package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class afvu {
    private static final ahnf JVM_STATIC = new ahnf("kotlin.jvm.JvmStatic");
    private static final String SUSPEND_FUNCTION_PREFIX = afzg.INSTANCE.getPackageFqName().asString() + '.' + afzg.INSTANCE.getClassNamePrefix();

    /* JADX INFO: Access modifiers changed from: private */
    public static final afib _get_isAlwaysBoxedByCompiler_$lambda$0(afib afibVar) {
        afibVar.getClass();
        return unsubstitutedUnderlyingType(afibVar);
    }

    private static final Object arrayToRuntimeValue(ahuc ahucVar, ClassLoader classLoader) throws NegativeArraySizeException {
        aigl type;
        Class clsLoadClass$default;
        ahvj ahvjVar = ahucVar instanceof ahvj ? (ahvj) ahucVar : null;
        if (ahvjVar == null || (type = ahvjVar.getType()) == null) {
            return null;
        }
        List<? extends ahuh<?>> value = ahucVar.getValue();
        ArrayList arrayList = new ArrayList(woy.bp(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(toRuntimeValue((ahuh) it.next(), classLoader));
        }
        afyi primitiveArrayElementType = afye.getPrimitiveArrayElementType(type);
        int i = 0;
        if (primitiveArrayElementType == null) {
            if (!afye.isArray(type)) {
                Objects.toString(type);
                throw new IllegalStateException("Not an array type: ".concat(type.toString()));
            }
            aigl type2 = ((aiin) woy.bN(type.getArguments())).getType();
            type2.getClass();
            agbd declarationDescriptor = type2.getConstructor().getDeclarationDescriptor();
            agba agbaVar = declarationDescriptor instanceof agba ? (agba) declarationDescriptor : null;
            if (agbaVar == null) {
                Objects.toString(type2);
                throw new IllegalStateException("Not a class type: ".concat(type2.toString()));
            }
            if (afye.isString(type2)) {
                int size = ahucVar.getValue().size();
                String[] strArr = new String[size];
                while (i < size) {
                    Object obj = arrayList.get(i);
                    obj.getClass();
                    strArr[i] = (String) obj;
                    i++;
                }
                return strArr;
            }
            if (afye.isKClass(agbaVar)) {
                int size2 = ahucVar.getValue().size();
                Class[] clsArr = new Class[size2];
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    obj2.getClass();
                    clsArr[i] = (Class) obj2;
                    i++;
                }
                return clsArr;
            }
            ahnd classId = ahvz.getClassId(agbaVar);
            if (classId == null || (clsLoadClass$default = loadClass$default(classLoader, classId, 0, 2, null)) == null) {
                return null;
            }
            Object objNewInstance = Array.newInstance((Class<?>) clsLoadClass$default, ahucVar.getValue().size());
            objNewInstance.getClass();
            Object[] objArr = (Object[]) objNewInstance;
            int size3 = arrayList.size();
            while (i < size3) {
                objArr[i] = arrayList.get(i);
                i++;
            }
            return objArr;
        }
        switch (primitiveArrayElementType.ordinal()) {
            case 0:
                int size4 = ahucVar.getValue().size();
                boolean[] zArr = new boolean[size4];
                while (i < size4) {
                    Object obj3 = arrayList.get(i);
                    obj3.getClass();
                    zArr[i] = ((Boolean) obj3).booleanValue();
                    i++;
                }
                return zArr;
            case 1:
                int size5 = ahucVar.getValue().size();
                char[] cArr = new char[size5];
                while (i < size5) {
                    Object obj4 = arrayList.get(i);
                    obj4.getClass();
                    cArr[i] = ((Character) obj4).charValue();
                    i++;
                }
                return cArr;
            case 2:
                int size6 = ahucVar.getValue().size();
                byte[] bArr = new byte[size6];
                while (i < size6) {
                    Object obj5 = arrayList.get(i);
                    obj5.getClass();
                    bArr[i] = ((Byte) obj5).byteValue();
                    i++;
                }
                return bArr;
            case 3:
                int size7 = ahucVar.getValue().size();
                short[] sArr = new short[size7];
                while (i < size7) {
                    Object obj6 = arrayList.get(i);
                    obj6.getClass();
                    sArr[i] = ((Short) obj6).shortValue();
                    i++;
                }
                return sArr;
            case 4:
                int size8 = ahucVar.getValue().size();
                int[] iArr = new int[size8];
                while (i < size8) {
                    Object obj7 = arrayList.get(i);
                    obj7.getClass();
                    iArr[i] = ((Integer) obj7).intValue();
                    i++;
                }
                return iArr;
            case 5:
                int size9 = ahucVar.getValue().size();
                float[] fArr = new float[size9];
                while (i < size9) {
                    Object obj8 = arrayList.get(i);
                    obj8.getClass();
                    fArr[i] = ((Float) obj8).floatValue();
                    i++;
                }
                return fArr;
            case 6:
                int size10 = ahucVar.getValue().size();
                long[] jArr = new long[size10];
                while (i < size10) {
                    Object obj9 = arrayList.get(i);
                    obj9.getClass();
                    jArr[i] = ((Long) obj9).longValue();
                    i++;
                }
                return jArr;
            case 7:
                int size11 = ahucVar.getValue().size();
                double[] dArr = new double[size11];
                while (i < size11) {
                    Object obj10 = arrayList.get(i);
                    obj10.getClass();
                    dArr[i] = ((Double) obj10).doubleValue();
                    i++;
                }
                return dArr;
            default:
                throw new aezs();
        }
    }

    public static final afue<?> asReflectCallable(Object obj) {
        if (obj instanceof afub) {
            return asReflectCallable(((afub) obj).getDelegate());
        }
        if (obj instanceof afue) {
            return (afue) obj;
        }
        if (!(obj instanceof afeq)) {
            return null;
        }
        afhd afhdVarCompute = ((afeq) obj).compute();
        if (afhdVarCompute == obj) {
            afhdVarCompute = null;
        }
        if (afhdVarCompute == null) {
            return null;
        }
        return asReflectCallable(afhdVarCompute);
    }

    public static final afui asReflectFunction(Object obj) {
        if (obj instanceof afui) {
            return (afui) obj;
        }
        if (!(obj instanceof afex)) {
            return null;
        }
        afhd afhdVarCompute = ((afex) obj).compute();
        if (afhdVarCompute instanceof afui) {
            return (afui) afhdVarCompute;
        }
        return null;
    }

    public static final afun<?> asReflectProperty(Object obj) {
        if (obj instanceof afub) {
            return asReflectProperty(((afub) obj).getDelegate());
        }
        if (obj instanceof afun) {
            return (afun) obj;
        }
        if (!(obj instanceof affp)) {
            return null;
        }
        afhd afhdVarCompute = ((affp) obj).compute();
        if (afhdVarCompute == obj) {
            afhdVarCompute = null;
        }
        if (afhdVarCompute == null) {
            return null;
        }
        return asReflectProperty(afhdVarCompute);
    }

    public static final List<Annotation> computeAnnotations(agez agezVar) {
        Annotation annotationInstance;
        agezVar.getClass();
        agfk annotations = agezVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (agfc agfcVar : annotations) {
            agdx source = agfcVar.getSource();
            if (source instanceof agjf) {
                annotationInstance = ((agjf) source).getAnnotation();
            } else if (source instanceof agjr) {
                agkx javaElement = ((agjr) source).getJavaElement();
                agkd agkdVar = javaElement instanceof agkd ? (agkd) javaElement : null;
                annotationInstance = agkdVar != null ? agkdVar.getAnnotation() : null;
            } else {
                annotationInstance = toAnnotationInstance(agfcVar);
            }
            if (annotationInstance != null) {
                arrayList.add(annotationInstance);
            }
        }
        return unwrapKotlinRepeatableAnnotations(arrayList);
    }

    public static final Class<?> createArrayType(Class<?> cls) {
        cls.getClass();
        return Array.newInstance(cls, 0).getClass();
    }

    public static final Object defaultPrimitiveValue(Type type) {
        type.getClass();
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (affa.f(cls, Boolean.TYPE)) {
                    return false;
                }
                if (affa.f(cls, Character.TYPE)) {
                    return (char) 0;
                }
                if (affa.f(cls, Byte.TYPE)) {
                    return (byte) 0;
                }
                if (affa.f(cls, Short.TYPE)) {
                    return (short) 0;
                }
                if (affa.f(cls, Integer.TYPE)) {
                    return 0;
                }
                if (affa.f(cls, Float.TYPE)) {
                    return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
                }
                if (affa.f(cls, Long.TYPE)) {
                    return 0L;
                }
                if (affa.f(cls, Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (affa.f(cls, Void.TYPE)) {
                    throw new IllegalStateException("Parameter with void type is illegal");
                }
                Objects.toString(type);
                throw new UnsupportedOperationException("Unknown primitive: ".concat(type.toString()));
            }
        }
        return null;
    }

    public static final <M extends ahpg, D extends agav> D deserializeToDescriptor(Class cls, aibv aibvVar, M m, ahld ahldVar, ahlh ahlhVar, ahkv ahkvVar, afeg<? super ahzy, ? super M, ? extends D> afegVar) {
        List<ahjv> typeParameterList;
        cls.getClass();
        m.getClass();
        ahldVar.getClass();
        ahlhVar.getClass();
        ahkvVar.getClass();
        afegVar.getClass();
        boolean z = m instanceof ahif;
        agjq orCreateModule = afud.getOrCreateModule(cls);
        if (z) {
            typeParameterList = ((ahif) m).getTypeParameterList();
        } else {
            if (!(m instanceof ahis)) {
                Objects.toString(m);
                throw new IllegalStateException("Unsupported message: ".concat(m.toString()));
            }
            typeParameterList = ((ahis) m).getTypeParameterList();
        }
        List<ahjv> list = typeParameterList;
        ahyv deserialization = orCreateModule.getDeserialization();
        agcu module = orCreateModule.getModule();
        ahln empty = ahln.Companion.getEMPTY();
        list.getClass();
        return afegVar.invoke(new ahzy(new ahyy(deserialization, ahldVar, module, ahlhVar, empty, ahkvVar, aibvVar, null, list)), m);
    }

    public static final Field getDeclaredFieldOrNull(Class<?> cls, String str) {
        cls.getClass();
        str.getClass();
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static final Method getDeclaredMethodOrNull(Class<?> cls, String str, Class<?>... clsArr) {
        cls.getClass();
        str.getClass();
        clsArr.getClass();
        try {
            return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final agdq getInstanceReceiverParameter(afko<?> afkoVar) {
        afkoVar.getClass();
        agax descriptor = afkoVar.getDescriptor();
        if (afkoVar.getOverriddenStorage().isFakeOverride() && afmz.isStatic(afkoVar)) {
            return null;
        }
        if (afkoVar.getOverriddenStorage().isFakeOverride() && !afmz.isStatic(afkoVar)) {
            afrj container = afkoVar.getContainer();
            afqw afqwVar = container instanceof afqw ? (afqw) container : null;
            if (afqwVar == null) {
                return null;
            }
            return afqwVar.getDescriptor().getThisAsReceiverParameter();
        }
        if (descriptor instanceof agbh) {
            return ((agbh) descriptor).getDispatchReceiverParameter();
        }
        if (descriptor.getDispatchReceiverParameter() == null) {
            return null;
        }
        agbi containingDeclaration = descriptor.getContainingDeclaration();
        containingDeclaration.getClass();
        return ((agba) containingDeclaration).getThisAsReceiverParameter();
    }

    public static final ahnf getJVM_STATIC() {
        return JVM_STATIC;
    }

    private static final afhe<? extends Annotation> getRepeatableContainerComponentType(afhe<? extends Annotation> afheVar) {
        Class<?> componentType = affa.h(afheVar).getDeclaredMethod("value", null).getReturnType().getComponentType();
        componentType.getClass();
        afhe<? extends Annotation> afheVarL = affa.l(componentType);
        afheVarL.getClass();
        return afheVarL;
    }

    public static final ClassLoader getStdlibClassLoader() {
        return agkc.getSafeClassLoader(afak.class);
    }

    public static final afhe<? extends Annotation> getUnwrappedAnnotationClass(Annotation annotation) {
        annotation.getClass();
        afhe<? extends Annotation> afheVarK = affa.k(annotation);
        return isJavaRepeatableContainer(afheVarK) ? getRepeatableContainerComponentType(afheVarK) : afheVarK;
    }

    private static final boolean hasInherited(afhe<? extends Annotation> afheVar) {
        return affa.h(afheVar).getAnnotation(Inherited.class) != null;
    }

    public static final boolean isAlwaysBoxedByCompiler(afhr afhrVar) {
        afhrVar.getClass();
        if ((afhrVar instanceof aful) && ((aful) afhrVar).getDeclaresDefaultValue() && isInlineClassType(afhrVar.getType())) {
            Iterator itA = afrg.k(afrg.f(afhrVar.getType(), afvt.INSTANCE), 1).a();
            while (itA.hasNext()) {
                if (isNullableType((afib) itA.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isInlineClassType(afib afibVar) {
        afibVar.getClass();
        afhf classifier = afibVar.getClassifier();
        afqw afqwVar = classifier instanceof afqw ? (afqw) classifier : null;
        return afqwVar != null && afqwVar.isValue();
    }

    private static final boolean isJavaRepeatableContainer(afhe<? extends Annotation> afheVar) {
        Class<?> componentType;
        Annotation annotation;
        Object objInvoke;
        Class clsH = affa.h(afheVar);
        Method declaredMethodOrNull = getDeclaredMethodOrNull(clsH, "value", new Class[0]);
        if (declaredMethodOrNull != null && (componentType = declaredMethodOrNull.getReturnType().getComponentType()) != null && componentType.isAnnotation()) {
            Annotation[] annotations = componentType.getAnnotations();
            annotations.getClass();
            int i = 0;
            while (true) {
                if (i >= annotations.length) {
                    annotation = null;
                    break;
                }
                annotation = annotations[i];
                if (affa.f(affa.h(affa.k(annotation)).getName(), agti.REPEATABLE_ANNOTATION.asString())) {
                    break;
                }
                i++;
            }
            if (annotation != null && (objInvoke = affa.h(affa.k(annotation)).getMethod("value", null).invoke(annotation, null)) != null) {
                return affa.f(clsH, objInvoke);
            }
        }
        return false;
    }

    private static final boolean isKotlinRepeatableContainer(afhe<? extends Annotation> afheVar) {
        Class clsH = affa.h(afheVar);
        return affa.f(clsH.getSimpleName(), "Container") && clsH.getAnnotation(affy.class) != null;
    }

    public static final boolean isNullableType(afib afibVar) {
        afibVar.getClass();
        if (afibVar.isMarkedNullable()) {
            return true;
        }
        aiqc aiqcVar = (aiqc) afibVar;
        aiqc aiqcVarUpperBoundIfFlexible = aiqcVar.upperBoundIfFlexible();
        if (aiqcVarUpperBoundIfFlexible != null && isNullableType(aiqcVarUpperBoundIfFlexible)) {
            return true;
        }
        if (aiqcVar.isDefinitelyNotNullType()) {
            return false;
        }
        afhf classifier = afibVar.getClassifier();
        if (classifier instanceof afic) {
            List<afib> upperBounds = ((afic) classifier).getUpperBounds();
            if ((upperBounds instanceof Collection) && upperBounds.isEmpty()) {
                return false;
            }
            Iterator<T> it = upperBounds.iterator();
            while (it.hasNext()) {
                if (isNullableType((afib) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isPackagePrivate(int i) {
        return (Modifier.isPublic(i) || Modifier.isProtected(i) || Modifier.isPrivate(i)) ? false : true;
    }

    public static final boolean isRepeatableContainerForNonInheritedAnnotation(Annotation annotation) {
        annotation.getClass();
        return isJavaRepeatableContainer(affa.k(annotation)) && !hasInherited(getRepeatableContainerComponentType(affa.k(annotation)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static final Class<?> loadClass(ClassLoader classLoader, String str, String str2, int i) {
        if (affa.f(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str.length() > 0) {
            sb.append(str + '.');
        }
        sb.append(afyh.I(str2, '.', '$'));
        if (i > 0) {
            sb.append(";");
        }
        return agji.tryLoadClass(classLoader, sb.toString());
    }

    public static /* synthetic */ Class loadClass$default(ClassLoader classLoader, ahnd ahndVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return loadClass(classLoader, ahndVar, i);
    }

    public static final afnb parseAndLoadDescriptor(ClassLoader classLoader, String str, boolean z) {
        classLoader.getClass();
        str.getClass();
        afna jvmDescriptor = parseJvmDescriptor(str);
        List<String> parameters = jvmDescriptor.getParameters();
        ArrayList arrayList = new ArrayList(woy.bp(parameters, 10));
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            ClassLoader classLoader2 = classLoader;
            arrayList.add(parseAndLoadType$default(classLoader2, (String) it.next(), 0, 0, 6, null));
            classLoader = classLoader2;
        }
        return new afnb(arrayList, z ? parseAndLoadType$default(classLoader, jvmDescriptor.getReturnType(), 0, 0, 6, null) : null);
    }

    private static final Class<?> parseAndLoadType(ClassLoader classLoader, String str, int i, int i2) throws ClassNotFoundException {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            String strSubstring = str.substring(i + 1, i2 - 1);
            strSubstring.getClass();
            Class<?> clsLoadClass = classLoader.loadClass(afyh.I(strSubstring, '/', '.'));
            clsLoadClass.getClass();
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class<?> cls = Void.TYPE;
            cls.getClass();
            return cls;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return createArrayType(parseAndLoadType(classLoader, str, i + 1, i2));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new aftw("Unknown type prefix in the method signature: ".concat(String.valueOf(str)));
        }
    }

    static /* synthetic */ Class parseAndLoadType$default(ClassLoader classLoader, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        return parseAndLoadType(classLoader, str, i, i2);
    }

    public static final afna parseJvmDescriptor(String str) {
        int iD;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (afyh.A("VZCBSIFJD", cCharAt)) {
                iD = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new aftw("Unknown type prefix in the method signature: ".concat(str));
                }
                iD = afyh.D(str, ';', i) + 1;
            }
            String strSubstring = str.substring(i, iD);
            strSubstring.getClass();
            arrayList.add(strSubstring);
            i = iD;
        }
        String strSubstring2 = str.substring(i + 1);
        strSubstring2.getClass();
        return new afna(arrayList, strSubstring2);
    }

    private static final Annotation toAnnotationInstance(agfc agfcVar) {
        agba annotationClass = ahvz.getAnnotationClass(agfcVar);
        Class<?> javaClass = annotationClass != null ? toJavaClass(annotationClass) : null;
        if (true != (javaClass instanceof Class)) {
            javaClass = null;
        }
        if (javaClass == null) {
            return null;
        }
        Set<Map.Entry<ahnj, ahuh<?>>> setEntrySet = agfcVar.getAllValueArguments().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ahnj ahnjVar = (ahnj) entry.getKey();
            Object runtimeValue = toRuntimeValue((ahuh) entry.getValue(), agkc.getSafeClassLoader(javaClass));
            aezu aezuVar = runtimeValue != null ? new aezu(ahnjVar.asString(), runtimeValue) : null;
            if (aezuVar != null) {
                arrayList.add(aezuVar);
            }
        }
        return (Annotation) afwd.createAnnotationInstance$default(javaClass, woy.bc(arrayList), null, 4, null);
    }

    public static final Class<?> toJavaClass(agba agbaVar) {
        agbaVar.getClass();
        agdx source = agbaVar.getSource();
        source.getClass();
        if (source instanceof ahfl) {
            ahfj binaryClass = ((ahfl) source).getBinaryClass();
            binaryClass.getClass();
            return ((agjk) binaryClass).getKlass();
        }
        if (source instanceof agjr) {
            agkx javaElement = ((agjr) source).getJavaElement();
            javaElement.getClass();
            return ((agkt) javaElement).getElement();
        }
        ahnd classId = ahvz.getClassId(agbaVar);
        if (classId == null) {
            return null;
        }
        return loadClass$default(agkc.getSafeClassLoader(agbaVar.getClass()), classId, 0, 2, null);
    }

    public static final String toJvmDescriptor(afhe<?> afheVar) {
        afheVar.getClass();
        return "L" + afyh.I(afir.g(afheVar), '.', '/') + ';';
    }

    public static final afif toKVisibility(agcc agccVar) {
        agccVar.getClass();
        if (affa.f(agccVar, agcb.PUBLIC)) {
            return afif.a;
        }
        if (affa.f(agccVar, agcb.PROTECTED)) {
            return afif.b;
        }
        if (affa.f(agccVar, agcb.INTERNAL)) {
            return afif.c;
        }
        if (affa.f(agccVar, agcb.PRIVATE) || affa.f(agccVar, agcb.PRIVATE_TO_THIS)) {
            return afif.d;
        }
        return null;
    }

    private static final Object toRuntimeValue(ahuh<?> ahuhVar, ClassLoader classLoader) {
        if (ahuhVar instanceof ahub) {
            return toAnnotationInstance((agfc) ((ahub) ahuhVar).getValue());
        }
        if (ahuhVar instanceof ahuc) {
            return arrayToRuntimeValue((ahuc) ahuhVar, classLoader);
        }
        if (ahuhVar instanceof ahul) {
            aezu aezuVar = (aezu) ((ahul) ahuhVar).getValue();
            ahnd ahndVar = (ahnd) aezuVar.a;
            ahnj ahnjVar = (ahnj) aezuVar.b;
            Class clsLoadClass$default = loadClass$default(classLoader, ahndVar, 0, 2, null);
            if (clsLoadClass$default == null) {
                return null;
            }
            return afvs.getEnumConstantByName(clsLoadClass$default, ahnjVar.asString());
        }
        if (!(ahuhVar instanceof ahvc)) {
            if ((ahuhVar instanceof ahuo) || (ahuhVar instanceof ahve)) {
                return null;
            }
            return ahuhVar.getValue();
        }
        ahvb ahvbVar = (ahvb) ((ahvc) ahuhVar).getValue();
        if (ahvbVar instanceof ahva) {
            ahva ahvaVar = (ahva) ahvbVar;
            return loadClass(classLoader, ahvaVar.getClassId(), ahvaVar.getArrayDimensions());
        }
        if (!(ahvbVar instanceof ahuz)) {
            throw new aezs();
        }
        agbd declarationDescriptor = ((ahuz) ahvbVar).getType().getConstructor().getDeclarationDescriptor();
        agba agbaVar = declarationDescriptor instanceof agba ? (agba) declarationDescriptor : null;
        if (agbaVar == null) {
            return null;
        }
        return toJavaClass(agbaVar);
    }

    public static final afib unsubstitutedUnderlyingType(afib afibVar) {
        afibVar.getClass();
        afhf classifier = afibVar.getClassifier();
        afqw afqwVar = classifier instanceof afqw ? (afqw) classifier : null;
        if (afqwVar != null) {
            return afqwVar.getInlineClassUnderlyingType$kotlin_reflection();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<Annotation> unwrapKotlinRepeatableAnnotations(List<? extends Annotation> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List listBg;
        list.getClass();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (affa.f(affa.h(affa.k((Annotation) it.next())).getSimpleName(), "Container")) {
                    ArrayList arrayList = new ArrayList();
                    for (Annotation annotation : list) {
                        afhe afheVarK = affa.k(annotation);
                        if (isKotlinRepeatableContainer(afheVarK)) {
                            Object objInvoke = affa.h(afheVarK).getDeclaredMethod("value", null).invoke(annotation, null);
                            objInvoke.getClass();
                            listBg = woy.cD((Annotation[]) objInvoke);
                        } else {
                            listBg = woy.bg(annotation);
                        }
                        woy.cq(arrayList, listBg);
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }

    public static final boolean hasInherited(Annotation annotation) {
        annotation.getClass();
        return hasInherited((afhe<? extends Annotation>) affa.k(annotation));
    }

    public static final Class<?> loadClass(ClassLoader classLoader, ahnd ahndVar, int i) {
        classLoader.getClass();
        ahndVar.getClass();
        ahnh unsafe = ahndVar.asSingleFqName().toUnsafe();
        String strAsString = unsafe.asString();
        Integer numC = afyh.c(afyh.o(strAsString, SUSPEND_FUNCTION_PREFIX, strAsString));
        if (numC != null) {
            return loadClass(classLoader, afzd.INSTANCE.numberedClassId(numC.intValue() + 1), i);
        }
        ahnd ahndVarMapKotlinToJava = afzq.INSTANCE.mapKotlinToJava(unsafe);
        if (ahndVarMapKotlinToJava == null) {
            ahndVarMapKotlinToJava = ahndVar;
        }
        if (!affa.f(ahndVarMapKotlinToJava, ahndVar)) {
            classLoader = getStdlibClassLoader();
        }
        return loadClass(classLoader, ahndVarMapKotlinToJava.getPackageFqName().asString(), ahndVarMapKotlinToJava.getRelativeClassName().asString(), i);
    }
}
