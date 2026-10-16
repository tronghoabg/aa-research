package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class AnnotatedCreatorCollector extends CollectorBase {
    private final boolean _collectAnnotations;
    private AnnotatedConstructor _defaultConstructor;
    private final TypeResolutionContext _typeContext;

    AnnotatedCreatorCollector(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, boolean z) {
        super(annotationIntrospector);
        this._typeContext = typeResolutionContext;
        this._collectAnnotations = z;
    }

    private List<AnnotatedConstructor> _findPotentialConstructors(JavaType javaType, Class<?> cls) throws SecurityException {
        ClassUtil.Ctor ctor;
        ArrayList arrayList;
        int i2;
        List<AnnotatedConstructor> list;
        if (javaType.isEnumType()) {
            ctor = null;
            arrayList = null;
        } else {
            ctor = null;
            arrayList = null;
            for (ClassUtil.Ctor ctor2 : ClassUtil.getConstructors(javaType.getRawClass())) {
                if (isIncludableConstructor(ctor2.getConstructor())) {
                    if (ctor2.getParamCount() == 0) {
                        ctor = ctor2;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(ctor2);
                    }
                }
            }
        }
        if (arrayList == null) {
            list = Collections.EMPTY_LIST;
            if (ctor == null) {
                return list;
            }
            i2 = 0;
        } else {
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(null);
            }
            i2 = size;
            list = arrayList2;
        }
        if (cls != null) {
            MemberKey[] memberKeyArr = null;
            for (ClassUtil.Ctor ctor3 : ClassUtil.getConstructors(cls)) {
                if (ctor3.getParamCount() == 0) {
                    if (ctor != null) {
                        this._defaultConstructor = constructDefaultConstructor(ctor, ctor3);
                        ctor = null;
                    }
                } else if (arrayList != null) {
                    if (memberKeyArr == null) {
                        memberKeyArr = new MemberKey[i2];
                        for (int i4 = 0; i4 < i2; i4++) {
                            memberKeyArr[i4] = new MemberKey(((ClassUtil.Ctor) arrayList.get(i4)).getConstructor());
                        }
                    }
                    MemberKey memberKey = new MemberKey(ctor3.getConstructor());
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i2) {
                            break;
                        }
                        if (memberKey.equals(memberKeyArr[i5])) {
                            list.set(i5, constructNonDefaultConstructor((ClassUtil.Ctor) arrayList.get(i5), ctor3));
                            break;
                        }
                        i5++;
                    }
                }
            }
        }
        if (ctor != null) {
            this._defaultConstructor = constructDefaultConstructor(ctor, null);
        }
        for (int i6 = 0; i6 < i2; i6++) {
            if (list.get(i6) == null) {
                list.set(i6, constructNonDefaultConstructor((ClassUtil.Ctor) arrayList.get(i6), null));
            }
        }
        return list;
    }

    private List<AnnotatedMethod> _findPotentialFactories(TypeFactory typeFactory, JavaType javaType, Class<?> cls) throws SecurityException {
        ArrayList arrayList = null;
        for (Method method : ClassUtil.getClassMethods(javaType.getRawClass())) {
            if (_isIncludableFactoryMethod(method)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(method);
            }
        }
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        TypeResolutionContext typeResolutionContext = this._typeContext;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        if (cls != null) {
            MemberKey[] memberKeyArr = null;
            for (Method method2 : cls.getDeclaredMethods()) {
                if (_isIncludableFactoryMethod(method2)) {
                    if (memberKeyArr == null) {
                        memberKeyArr = new MemberKey[size];
                        for (int i3 = 0; i3 < size; i3++) {
                            memberKeyArr[i3] = new MemberKey((Method) arrayList.get(i3));
                        }
                    }
                    MemberKey memberKey = new MemberKey(method2);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        if (memberKey.equals(memberKeyArr[i4])) {
                            arrayList2.set(i4, constructFactoryCreator((Method) arrayList.get(i4), typeResolutionContext, method2));
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            if (((AnnotatedMethod) arrayList2.get(i5)) == null) {
                Method method3 = (Method) arrayList.get(i5);
                arrayList2.set(i5, constructFactoryCreator(method3, MethodGenericTypeResolver.narrowMethodTypeParameters(method3, javaType, typeFactory, typeResolutionContext), null));
            }
        }
        return arrayList2;
    }

    private static boolean _isIncludableFactoryMethod(Method method) {
        return Modifier.isStatic(method.getModifiers()) && !method.isSynthetic();
    }

    private AnnotationMap[] collectAnnotations(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (!this._collectAnnotations) {
            return NO_ANNOTATION_MAPS;
        }
        int length = annotationArr.length;
        AnnotationMap[] annotationMapArr = new AnnotationMap[length];
        for (int i2 = 0; i2 < length; i2++) {
            AnnotationCollector annotationCollectorCollectAnnotations = collectAnnotations(AnnotationCollector.emptyCollector(), annotationArr[i2]);
            if (annotationArr2 != null) {
                annotationCollectorCollectAnnotations = collectAnnotations(annotationCollectorCollectAnnotations, annotationArr2[i2]);
            }
            annotationMapArr[i2] = annotationCollectorCollectAnnotations.asAnnotationMap();
        }
        return annotationMapArr;
    }

    public static AnnotatedClass.Creators collectCreators(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, TypeResolutionContext typeResolutionContext, JavaType javaType, Class<?> cls, boolean z) {
        return new AnnotatedCreatorCollector(annotationIntrospector, typeResolutionContext, z | (cls != null)).collect(typeFactory, javaType, cls);
    }

    private static boolean isIncludableConstructor(Constructor<?> constructor) {
        return !constructor.isSynthetic();
    }

    AnnotatedClass.Creators collect(TypeFactory typeFactory, JavaType javaType, Class<?> cls) throws SecurityException {
        boolean z = this._collectAnnotations;
        List<AnnotatedConstructor> list_findPotentialConstructors = _findPotentialConstructors(javaType, cls);
        List<AnnotatedMethod> list_findPotentialFactories = _findPotentialFactories(typeFactory, javaType, cls);
        if (z) {
            AnnotatedConstructor annotatedConstructor = this._defaultConstructor;
            if (annotatedConstructor != null && this._intr.hasIgnoreMarker(annotatedConstructor)) {
                this._defaultConstructor = null;
            }
            int size = list_findPotentialConstructors.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                if (this._intr.hasIgnoreMarker(list_findPotentialConstructors.get(size))) {
                    list_findPotentialConstructors.remove(size);
                }
            }
            int size2 = list_findPotentialFactories.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                if (this._intr.hasIgnoreMarker(list_findPotentialFactories.get(size2))) {
                    list_findPotentialFactories.remove(size2);
                }
            }
        }
        return new AnnotatedClass.Creators(this._defaultConstructor, list_findPotentialConstructors, list_findPotentialFactories);
    }

    protected AnnotatedConstructor constructDefaultConstructor(ClassUtil.Ctor ctor, ClassUtil.Ctor ctor2) {
        return new AnnotatedConstructor(this._typeContext, ctor.getConstructor(), collectAnnotations(ctor, ctor2), NO_ANNOTATION_MAPS);
    }

    protected AnnotatedMethod constructFactoryCreator(Method method, TypeResolutionContext typeResolutionContext, Method method2) {
        AnnotationIntrospector annotationIntrospector = this._intr;
        int iM = AnnotatedCreatorCollector$$ExternalSyntheticBackport0.m(method);
        if (annotationIntrospector == null) {
            return new AnnotatedMethod(typeResolutionContext, method, _emptyAnnotationMap(), _emptyAnnotationMaps(iM));
        }
        if (iM == 0) {
            return new AnnotatedMethod(typeResolutionContext, method, collectAnnotations(method, method2), NO_ANNOTATION_MAPS);
        }
        return new AnnotatedMethod(typeResolutionContext, method, collectAnnotations(method, method2), collectAnnotations(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations()));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.databind.introspect.AnnotatedConstructor constructNonDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil.Ctor r10, com.fasterxml.jackson.databind.util.ClassUtil.Ctor r11) {
        /*
            r9 = this;
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r9._intr
            int r1 = r10.getParamCount()
            if (r0 != 0) goto L1c
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r9 = r9._typeContext
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            java.lang.reflect.Constructor r10 = r10.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r0 = _emptyAnnotationMap()
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r1 = _emptyAnnotationMaps(r1)
            r11.<init>(r9, r10, r0, r1)
            return r11
        L1c:
            if (r1 != 0) goto L30
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r0 = r9._typeContext
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r1 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            java.lang.reflect.Constructor r2 = r10.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r9 = r9.collectAnnotations(r10, r11)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r10 = com.fasterxml.jackson.databind.introspect.AnnotatedCreatorCollector.NO_ANNOTATION_MAPS
            r1.<init>(r0, r2, r9, r10)
            return r1
        L30:
            java.lang.annotation.Annotation[][] r0 = r10.getParameterAnnotations()
            int r2 = r0.length
            r3 = 0
            if (r1 == r2) goto L95
            java.lang.Class r4 = r10.getDeclaringClass()
            boolean r5 = com.fasterxml.jackson.databind.util.ClassUtil.isEnumType(r4)
            r6 = 1
            r7 = 2
            r8 = 0
            if (r5 == 0) goto L54
            int r5 = r2 + 2
            if (r1 != r5) goto L54
            java.lang.annotation.Annotation[][] r4 = new java.lang.annotation.Annotation[r5][]
            java.lang.System.arraycopy(r0, r8, r4, r7, r2)
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r3 = r9.collectAnnotations(r4, r3)
        L52:
            r0 = r4
            goto L6c
        L54:
            boolean r4 = r4.isMemberClass()
            if (r4 == 0) goto L6c
            int r4 = r2 + 1
            if (r1 != r4) goto L6c
            java.lang.annotation.Annotation[][] r4 = new java.lang.annotation.Annotation[r4][]
            java.lang.System.arraycopy(r0, r8, r4, r6, r2)
            java.lang.annotation.Annotation[] r0 = com.fasterxml.jackson.databind.introspect.AnnotatedCreatorCollector.NO_ANNOTATIONS
            r4[r8] = r0
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r3 = r9.collectAnnotations(r4, r3)
            goto L52
        L6c:
            if (r3 == 0) goto L6f
            goto La0
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.Class r10 = r10.getDeclaringClass()
            java.lang.String r10 = r10.getName()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r10
            r1[r6] = r11
            r1[r7] = r0
            java.lang.String r10 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.String r10 = java.lang.String.format(r10, r1)
            r9.<init>(r10)
            throw r9
        L95:
            if (r11 != 0) goto L98
            goto L9c
        L98:
            java.lang.annotation.Annotation[][] r3 = r11.getParameterAnnotations()
        L9c:
            com.fasterxml.jackson.databind.introspect.AnnotationMap[] r3 = r9.collectAnnotations(r0, r3)
        La0:
            com.fasterxml.jackson.databind.introspect.TypeResolutionContext r0 = r9._typeContext
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r1 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
            java.lang.reflect.Constructor r2 = r10.getConstructor()
            com.fasterxml.jackson.databind.introspect.AnnotationMap r9 = r9.collectAnnotations(r10, r11)
            r1.<init>(r0, r2, r9, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.AnnotatedCreatorCollector.constructNonDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, com.fasterxml.jackson.databind.util.ClassUtil$Ctor):com.fasterxml.jackson.databind.introspect.AnnotatedConstructor");
    }

    private final AnnotationMap collectAnnotations(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        AnnotationCollector annotationCollectorCollectAnnotations = collectAnnotations(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            annotationCollectorCollectAnnotations = collectAnnotations(annotationCollectorCollectAnnotations, annotatedElement2.getDeclaredAnnotations());
        }
        return annotationCollectorCollectAnnotations.asAnnotationMap();
    }

    private AnnotationMap collectAnnotations(ClassUtil.Ctor ctor, ClassUtil.Ctor ctor2) {
        if (!this._collectAnnotations) {
            return _emptyAnnotationMap();
        }
        AnnotationCollector annotationCollectorCollectAnnotations = collectAnnotations(ctor.getDeclaredAnnotations());
        if (ctor2 != null) {
            annotationCollectorCollectAnnotations = collectAnnotations(annotationCollectorCollectAnnotations, ctor2.getDeclaredAnnotations());
        }
        return annotationCollectorCollectAnnotations.asAnnotationMap();
    }
}
