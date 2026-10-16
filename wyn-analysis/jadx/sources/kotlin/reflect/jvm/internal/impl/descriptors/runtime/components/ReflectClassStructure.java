package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import Fe.b;
import ff.m;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
final class ReflectClassStructure {

    @NotNull
    public static final ReflectClassStructure INSTANCE = new ReflectClassStructure();

    private ReflectClassStructure() {
    }

    private final ClassLiteralValue classLiteralValue(Class<?> cls) {
        int i5 = 0;
        while (cls.isArray()) {
            i5++;
            cls = cls.getComponentType();
            AbstractC3340k.d(cls, "getComponentType(...)");
        }
        if (!cls.isPrimitive()) {
            ClassId classId = ReflectClassUtilKt.getClassId(cls);
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
            FqName fqNameAsSingleFqName = classId.asSingleFqName();
            AbstractC3340k.d(fqNameAsSingleFqName, "asSingleFqName(...)");
            ClassId classIdMapJavaToKotlin = javaToKotlinClassMap.mapJavaToKotlin(fqNameAsSingleFqName);
            if (classIdMapJavaToKotlin != null) {
                classId = classIdMapJavaToKotlin;
            }
            return new ClassLiteralValue(classId, i5);
        }
        if (cls.equals(Void.TYPE)) {
            ClassId classId2 = ClassId.topLevel(StandardNames.FqNames.unit.toSafe());
            AbstractC3340k.d(classId2, "topLevel(...)");
            return new ClassLiteralValue(classId2, i5);
        }
        PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
        AbstractC3340k.d(primitiveType, "getPrimitiveType(...)");
        if (i5 > 0) {
            ClassId classId3 = ClassId.topLevel(primitiveType.getArrayTypeFqName());
            AbstractC3340k.d(classId3, "topLevel(...)");
            return new ClassLiteralValue(classId3, i5 - 1);
        }
        ClassId classId4 = ClassId.topLevel(primitiveType.getTypeFqName());
        AbstractC3340k.d(classId4, "topLevel(...)");
        return new ClassLiteralValue(classId4, i5);
    }

    private final void loadConstructorAnnotations(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Constructor<?>[] constructorArr;
        int i5;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        AbstractC3340k.d(declaredConstructors, "getDeclaredConstructors(...)");
        int length = declaredConstructors.length;
        int i10 = 0;
        while (i10 < length) {
            Constructor<?> constructor = declaredConstructors[i10];
            Name name = SpecialNames.INIT;
            SignatureSerializer signatureSerializer = SignatureSerializer.INSTANCE;
            AbstractC3340k.b(constructor);
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorVisitMethod = memberVisitor.visitMethod(name, signatureSerializer.constructorDesc(constructor));
            if (methodAnnotationVisitorVisitMethod == null) {
                constructorArr = declaredConstructors;
                i5 = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                AbstractC3340k.d(declaredAnnotations, "getDeclaredAnnotations(...)");
                for (Annotation annotation : declaredAnnotations) {
                    AbstractC3340k.b(annotation);
                    processAnnotation(methodAnnotationVisitorVisitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                AbstractC3340k.b(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i11 = 0; i11 < length3; i11++) {
                        Annotation[] annotationArr = parameterAnnotations[i11];
                        AbstractC3340k.b(annotationArr);
                        int length4 = annotationArr.length;
                        int i12 = 0;
                        while (i12 < length4) {
                            Annotation annotation2 = annotationArr[i12];
                            Class<?> clsY = b.y(b.x(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            int i13 = length;
                            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitParameterAnnotation = methodAnnotationVisitorVisitMethod.visitParameterAnnotation(i11 + length2, ReflectClassUtilKt.getClassId(clsY), new ReflectAnnotationSource(annotation2));
                            if (annotationArgumentVisitorVisitParameterAnnotation != null) {
                                INSTANCE.processAnnotationArguments(annotationArgumentVisitorVisitParameterAnnotation, annotation2, clsY);
                            }
                            i12++;
                            declaredConstructors = constructorArr2;
                            length = i13;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i5 = length;
                methodAnnotationVisitorVisitMethod.visitEnd();
            }
            i10++;
            declaredConstructors = constructorArr;
            length = i5;
        }
    }

    private final void loadFieldAnnotations(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Field[] declaredFields = cls.getDeclaredFields();
        AbstractC3340k.d(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            Name nameIdentifier = Name.identifier(field.getName());
            AbstractC3340k.d(nameIdentifier, "identifier(...)");
            KotlinJvmBinaryClass.AnnotationVisitor annotationVisitorVisitField = memberVisitor.visitField(nameIdentifier, SignatureSerializer.INSTANCE.fieldDesc(field), null);
            if (annotationVisitorVisitField != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                AbstractC3340k.d(declaredAnnotations, "getDeclaredAnnotations(...)");
                for (Annotation annotation : declaredAnnotations) {
                    AbstractC3340k.b(annotation);
                    processAnnotation(annotationVisitorVisitField, annotation);
                }
                annotationVisitorVisitField.visitEnd();
            }
        }
    }

    private final void loadMethodAnnotations(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC3340k.d(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            Name nameIdentifier = Name.identifier(method.getName());
            AbstractC3340k.d(nameIdentifier, "identifier(...)");
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorVisitMethod = memberVisitor.visitMethod(nameIdentifier, SignatureSerializer.INSTANCE.methodDesc(method));
            if (methodAnnotationVisitorVisitMethod != null) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                AbstractC3340k.d(declaredAnnotations, "getDeclaredAnnotations(...)");
                for (Annotation annotation : declaredAnnotations) {
                    AbstractC3340k.b(annotation);
                    processAnnotation(methodAnnotationVisitorVisitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                AbstractC3340k.d(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i5 = 0; i5 < length; i5++) {
                    Annotation[] annotationArr2 = annotationArr[i5];
                    AbstractC3340k.b(annotationArr2);
                    for (Annotation annotation2 : annotationArr2) {
                        Class<?> clsY = b.y(b.x(annotation2));
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitParameterAnnotation = methodAnnotationVisitorVisitMethod.visitParameterAnnotation(i5, ReflectClassUtilKt.getClassId(clsY), new ReflectAnnotationSource(annotation2));
                        if (annotationArgumentVisitorVisitParameterAnnotation != null) {
                            INSTANCE.processAnnotationArguments(annotationArgumentVisitorVisitParameterAnnotation, annotation2, clsY);
                        }
                    }
                }
                methodAnnotationVisitorVisitMethod.visitEnd();
            }
        }
    }

    private final void processAnnotation(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> clsY = b.y(b.x(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = annotationVisitor.visitAnnotation(ReflectClassUtilKt.getClassId(clsY), new ReflectAnnotationSource(annotation));
        if (annotationArgumentVisitorVisitAnnotation != null) {
            INSTANCE.processAnnotationArguments(annotationArgumentVisitorVisitAnnotation, annotation, clsY);
        }
    }

    private final void processAnnotationArgumentValue(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Name name, Object obj) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (enclosingClass.equals(Class.class)) {
            annotationArgumentVisitor.visitClassLiteral(name, classLiteralValue((Class) obj));
            return;
        }
        if (ReflectKotlinClassKt.TYPES_ELIGIBLE_FOR_SIMPLE_VISIT.contains(enclosingClass)) {
            annotationArgumentVisitor.visit(name, obj);
            return;
        }
        if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            AbstractC3340k.b(enclosingClass);
            ClassId classId = ReflectClassUtilKt.getClassId(enclosingClass);
            Name nameIdentifier = Name.identifier(((Enum) obj).name());
            AbstractC3340k.d(nameIdentifier, "identifier(...)");
            annotationArgumentVisitor.visitEnum(name, classId, nameIdentifier);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            AbstractC3340k.d(interfaces, "getInterfaces(...)");
            Class<?> cls = (Class) m.E0(interfaces);
            AbstractC3340k.b(cls);
            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = annotationArgumentVisitor.visitAnnotation(name, ReflectClassUtilKt.getClassId(cls));
            if (annotationArgumentVisitorVisitAnnotation == null) {
                return;
            }
            processAnnotationArguments(annotationArgumentVisitorVisitAnnotation, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor annotationArrayArgumentVisitorVisitArray = annotationArgumentVisitor.visitArray(name);
        if (annotationArrayArgumentVisitorVisitArray == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i5 = 0;
        if (componentType.isEnum()) {
            ClassId classId2 = ReflectClassUtilKt.getClassId(componentType);
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i5 < length) {
                Object obj2 = objArr[i5];
                AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                Name nameIdentifier2 = Name.identifier(((Enum) obj2).name());
                AbstractC3340k.d(nameIdentifier2, "identifier(...)");
                annotationArrayArgumentVisitorVisitArray.visitEnum(classId2, nameIdentifier2);
                i5++;
            }
        } else if (componentType.equals(Class.class)) {
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i5 < length2) {
                Object obj3 = objArr2[i5];
                AbstractC3340k.c(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                annotationArrayArgumentVisitorVisitArray.visitClassLiteral(classLiteralValue((Class) obj3));
                i5++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i5 < length3) {
                Object obj4 = objArr3[i5];
                KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation2 = annotationArrayArgumentVisitorVisitArray.visitAnnotation(ReflectClassUtilKt.getClassId(componentType));
                if (annotationArgumentVisitorVisitAnnotation2 != null) {
                    AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    processAnnotationArguments(annotationArgumentVisitorVisitAnnotation2, (Annotation) obj4, componentType);
                }
                i5++;
            }
        } else {
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i5 < length4) {
                annotationArrayArgumentVisitorVisitArray.visit(objArr4[i5]);
                i5++;
            }
        }
        annotationArrayArgumentVisitorVisitArray.visitEnd();
    }

    private final void processAnnotationArguments(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class<?> cls) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC3340k.d(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, new Object[0]);
                AbstractC3340k.b(objInvoke);
                Name nameIdentifier = Name.identifier(method.getName());
                AbstractC3340k.d(nameIdentifier, "identifier(...)");
                processAnnotationArgumentValue(annotationArgumentVisitor, nameIdentifier, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.visitEnd();
    }

    public final void loadClassAnnotations(@NotNull Class<?> klass, @NotNull KotlinJvmBinaryClass.AnnotationVisitor visitor) {
        AbstractC3340k.e(klass, "klass");
        AbstractC3340k.e(visitor, "visitor");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        AbstractC3340k.d(declaredAnnotations, "getDeclaredAnnotations(...)");
        for (Annotation annotation : declaredAnnotations) {
            AbstractC3340k.b(annotation);
            processAnnotation(visitor, annotation);
        }
        visitor.visitEnd();
    }

    public final void visitMembers(@NotNull Class<?> klass, @NotNull KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        AbstractC3340k.e(klass, "klass");
        AbstractC3340k.e(memberVisitor, "memberVisitor");
        loadMethodAnnotations(klass, memberVisitor);
        loadConstructorAnnotations(klass, memberVisitor);
        loadFieldAnnotations(klass, memberVisitor);
    }
}
