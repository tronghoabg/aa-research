package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class agjg {
    public static final agjg INSTANCE = new agjg();

    private agjg() {
    }

    private final ahug classLiteralValue(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            cls = cls.getComponentType();
            cls.getClass();
            i++;
        }
        if (cls.isPrimitive()) {
            if (affa.f(cls, Void.TYPE)) {
                return new ahug(ahnd.Companion.topLevel(afyn.unit.toSafe()), i);
            }
            afyi primitiveType = ahwe.get(cls.getName()).getPrimitiveType();
            primitiveType.getClass();
            return i > 0 ? new ahug(ahnd.Companion.topLevel(primitiveType.getArrayTypeFqName()), i - 1) : new ahug(ahnd.Companion.topLevel(primitiveType.getTypeFqName()), i);
        }
        ahnd classId = agkc.getClassId(cls);
        ahnd ahndVarMapJavaToKotlin = afzq.INSTANCE.mapJavaToKotlin(classId.asSingleFqName());
        if (ahndVarMapJavaToKotlin != null) {
            classId = ahndVarMapJavaToKotlin;
        }
        return new ahug(classId, i);
    }

    private final void loadConstructorAnnotations(Class<?> cls, ahfh ahfhVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        declaredConstructors.getClass();
        for (Constructor<?> constructor : declaredConstructors) {
            ahnj ahnjVar = ahnm.INIT;
            agjt agjtVar = agjt.INSTANCE;
            constructor.getClass();
            ahfi ahfiVarVisitMethod = ahfhVar.visitMethod(ahnjVar, agjtVar.constructorDesc(constructor));
            if (ahfiVarVisitMethod != null) {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    processAnnotation(ahfiVarVisitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                parameterAnnotations.getClass();
                int length = parameterAnnotations.length;
                if (length != 0) {
                    int length2 = constructor.getParameterTypes().length - length;
                    for (int i = 0; i < length; i++) {
                        Annotation[] annotationArr = parameterAnnotations[i];
                        annotationArr.getClass();
                        for (Annotation annotation2 : annotationArr) {
                            Class<?> clsH = affa.h(affa.k(annotation2));
                            ahnd classId = agkc.getClassId(clsH);
                            annotation2.getClass();
                            ahfe ahfeVarVisitParameterAnnotation = ahfiVarVisitMethod.visitParameterAnnotation(i + length2, classId, new agjf(annotation2));
                            if (ahfeVarVisitParameterAnnotation != null) {
                                INSTANCE.processAnnotationArguments(ahfeVarVisitParameterAnnotation, annotation2, clsH);
                            }
                        }
                    }
                }
                ahfiVarVisitMethod.visitEnd();
            }
        }
    }

    private final void loadFieldAnnotations(Class<?> cls, ahfh ahfhVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        for (Field field : declaredFields) {
            ahnj ahnjVarIdentifier = ahnj.identifier(field.getName());
            agjt agjtVar = agjt.INSTANCE;
            field.getClass();
            ahfg ahfgVarVisitField = ahfhVar.visitField(ahnjVarIdentifier, agjtVar.fieldDesc(field), null);
            if (ahfgVarVisitField != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    processAnnotation(ahfgVarVisitField, annotation);
                }
                ahfgVarVisitField.visitEnd();
            }
        }
    }

    private final void loadMethodAnnotations(Class<?> cls, ahfh ahfhVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            ahnj ahnjVarIdentifier = ahnj.identifier(method.getName());
            agjt agjtVar = agjt.INSTANCE;
            method.getClass();
            ahfi ahfiVarVisitMethod = ahfhVar.visitMethod(ahnjVarIdentifier, agjtVar.methodDesc(method));
            if (ahfiVarVisitMethod != null) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                declaredAnnotations.getClass();
                for (Annotation annotation : declaredAnnotations) {
                    annotation.getClass();
                    processAnnotation(ahfiVarVisitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                parameterAnnotations.getClass();
                for (int i = 0; i < parameterAnnotations.length; i++) {
                    Annotation[] annotationArr = parameterAnnotations[i];
                    annotationArr.getClass();
                    for (Annotation annotation2 : annotationArr) {
                        Class<?> clsH = affa.h(affa.k(annotation2));
                        ahnd classId = agkc.getClassId(clsH);
                        annotation2.getClass();
                        ahfe ahfeVarVisitParameterAnnotation = ahfiVarVisitMethod.visitParameterAnnotation(i, classId, new agjf(annotation2));
                        if (ahfeVarVisitParameterAnnotation != null) {
                            INSTANCE.processAnnotationArguments(ahfeVarVisitParameterAnnotation, annotation2, clsH);
                        }
                    }
                }
                ahfiVarVisitMethod.visitEnd();
            }
        }
    }

    private final void processAnnotation(ahfg ahfgVar, Annotation annotation) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> clsH = affa.h(affa.k(annotation));
        ahfe ahfeVarVisitAnnotation = ahfgVar.visitAnnotation(agkc.getClassId(clsH), new agjf(annotation));
        if (ahfeVarVisitAnnotation != null) {
            INSTANCE.processAnnotationArguments(ahfeVarVisitAnnotation, annotation, clsH);
        }
    }

    private final void processAnnotationArgumentValue(ahfe ahfeVar, ahnj ahnjVar, Object obj) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (affa.f(enclosingClass, Class.class)) {
            obj.getClass();
            ahfeVar.visitClassLiteral(ahnjVar, classLiteralValue((Class) obj));
            return;
        }
        if (agjn.TYPES_ELIGIBLE_FOR_SIMPLE_VISIT.contains(enclosingClass)) {
            ahfeVar.visit(ahnjVar, obj);
            return;
        }
        if (agkc.isEnumClassOrSpecializedEnumEntryClass(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            enclosingClass.getClass();
            ahnd classId = agkc.getClassId(enclosingClass);
            obj.getClass();
            ahfeVar.visitEnum(ahnjVar, classId, ahnj.identifier(((Enum) obj).name()));
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            interfaces.getClass();
            Class<?> cls = (Class) woy.cY(interfaces);
            cls.getClass();
            ahfe ahfeVarVisitAnnotation = ahfeVar.visitAnnotation(ahnjVar, agkc.getClassId(cls));
            if (ahfeVarVisitAnnotation == null) {
                return;
            }
            obj.getClass();
            processAnnotationArguments(ahfeVarVisitAnnotation, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException(a.bt(obj, enclosingClass, "Unsupported annotation argument value (", "): "));
        }
        ahff ahffVarVisitArray = ahfeVar.visitArray(ahnjVar);
        if (ahffVarVisitArray != null) {
            Class<?> componentType = enclosingClass.getComponentType();
            int i = 0;
            if (componentType.isEnum()) {
                componentType.getClass();
                ahnd classId2 = agkc.getClassId(componentType);
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                while (i < length) {
                    Object obj2 = objArr[i];
                    obj2.getClass();
                    ahffVarVisitArray.visitEnum(classId2, ahnj.identifier(((Enum) obj2).name()));
                    i++;
                }
            } else if (affa.f(componentType, Class.class)) {
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                int length2 = objArr2.length;
                while (i < length2) {
                    Object obj3 = objArr2[i];
                    obj3.getClass();
                    ahffVarVisitArray.visitClassLiteral(classLiteralValue((Class) obj3));
                    i++;
                }
            } else if (Annotation.class.isAssignableFrom(componentType)) {
                obj.getClass();
                Object[] objArr3 = (Object[]) obj;
                int length3 = objArr3.length;
                while (i < length3) {
                    Object obj4 = objArr3[i];
                    componentType.getClass();
                    ahfe ahfeVarVisitAnnotation2 = ahffVarVisitArray.visitAnnotation(agkc.getClassId(componentType));
                    if (ahfeVarVisitAnnotation2 != null) {
                        obj4.getClass();
                        processAnnotationArguments(ahfeVarVisitAnnotation2, (Annotation) obj4, componentType);
                    }
                    i++;
                }
            } else {
                obj.getClass();
                Object[] objArr4 = (Object[]) obj;
                int length4 = objArr4.length;
                while (i < length4) {
                    ahffVarVisitArray.visit(objArr4[i]);
                    i++;
                }
            }
            ahffVarVisitArray.visitEnd();
        }
    }

    private final void processAnnotationArguments(ahfe ahfeVar, Annotation annotation, Class<?> cls) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                objInvoke.getClass();
                processAnnotationArgumentValue(ahfeVar, ahnj.identifier(method.getName()), objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        ahfeVar.visitEnd();
    }

    public final void loadClassAnnotations(Class<?> cls, ahfg ahfgVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        cls.getClass();
        ahfgVar.getClass();
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            processAnnotation(ahfgVar, annotation);
        }
        ahfgVar.visitEnd();
    }

    public final void visitMembers(Class<?> cls, ahfh ahfhVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        cls.getClass();
        ahfhVar.getClass();
        loadMethodAnnotations(cls, ahfhVar);
        loadConstructorAnnotations(cls, ahfhVar);
        loadFieldAnnotations(cls, ahfhVar);
    }
}
