package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class afjs {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _get_kotlinContainer_$lambda$1(afhh afhhVar) {
        afhhVar.getClass();
        return "  - " + afhhVar + " (" + afiu.a(afhhVar) + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _get_kotlinContainer_$lambda$4(afhh afhhVar) {
        afhhVar.getClass();
        return "  - " + afhhVar + " (" + afiu.d(afhhVar) + ')';
    }

    public static final List<TypeVariable<?>> allTypeParameters(Class<?> cls) {
        cls.getClass();
        return afrg.j(afrg.o(afrg.f(cls, afjn.INSTANCE), afjo.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class allTypeParameters$lambda$0(Class cls) {
        cls.getClass();
        if (Modifier.isStatic(cls.getModifiers())) {
            return null;
        }
        return cls.getDeclaringClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final airp allTypeParameters$lambda$1(Class cls) {
        cls.getClass();
        TypeVariable[] typeParameters = cls.getTypeParameters();
        typeParameters.getClass();
        return woy.dk(typeParameters);
    }

    private static final boolean argumentsMakeSenseOnlyForMutableContainer(Type type, aire aireVar) {
        if (!(type instanceof ParameterizedType)) {
            return false;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        actualTypeArguments.getClass();
        Type type2 = (Type) woy.cX(actualTypeArguments);
        if (!(type2 instanceof WildcardType) || ((WildcardType) type2).getLowerBounds().length != 1 || aireVar == null) {
            return false;
        }
        afhf classifier = aireVar.getClassifier();
        classifier.getClass();
        return ((afic) woy.bK(((afhe) classifier).getTypeParameters())).getVariance() == afie.c;
    }

    private static final List<Type> collectAllArguments(ParameterizedType parameterizedType) {
        return afrg.j(afrg.p(afrg.f(parameterizedType, afjp.INSTANCE), afjq.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterizedType collectAllArguments$lambda$0(ParameterizedType parameterizedType) {
        parameterizedType.getClass();
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable collectAllArguments$lambda$1(ParameterizedType parameterizedType) {
        parameterizedType.getClass();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return woy.df(actualTypeArguments);
    }

    public static final afif computeVisibilityForJavaModifiers(int i) {
        if (Modifier.isPublic(i)) {
            return afif.a;
        }
        if (Modifier.isPrivate(i)) {
            return afif.d;
        }
        return null;
    }

    private static final afhe<?> convertJavaClass(Class<?> cls, boolean z) {
        return (z && affa.f(cls, Class.class)) ? affw.b(afhe.class) : affa.l(cls);
    }

    private static final aire createJavaSimpleType(Type type, afhf afhfVar, List<afid> list, boolean z, afhe<?> afheVar) {
        return new aire(afhfVar, list, z, afbe.a, null, false, false, false, afheVar, new afjk(type));
    }

    static /* synthetic */ aire createJavaSimpleType$default(Type type, afhf afhfVar, List list, boolean z, afhe afheVar, int i, Object obj) {
        if ((i & 16) != 0) {
            afheVar = null;
        }
        return createJavaSimpleType(type, afhfVar, list, z, afheVar);
    }

    private static final aire createMutableCollectionType(aire aireVar, Type type) {
        afhf classifier = aireVar.getClassifier();
        afhe afheVar = classifier instanceof afhe ? (afhe) classifier : null;
        if (afheVar != null) {
            afzq afzqVar = afzq.INSTANCE;
            String qualifiedName = afheVar.getQualifiedName();
            ahnf onlyToMutable = afzqVar.readOnlyToMutable(qualifiedName != null ? new ahnh(qualifiedName) : null);
            if (onlyToMutable != null) {
                return createJavaSimpleType(type, aireVar.getClassifier(), aireVar.getArguments(), aireVar.isMarkedNullable(), aira.getMutableCollectionKClass(onlyToMutable, afheVar));
            }
        }
        return null;
    }

    private static final afib createRawJavaType(Class<?> cls, Map<TypeVariable<?>, ? extends afic> map, boolean z) {
        afhe<?> afheVarConvertJavaClass = convertJavaClass(cls, z);
        List<TypeVariable<?>> listAllTypeParameters = allTypeParameters(cls);
        ArrayList arrayList = new ArrayList(woy.bp(listAllTypeParameters, 10));
        int i = 0;
        for (Object obj : listAllTypeParameters) {
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            Type[] bounds = ((TypeVariable) afrg.i(afrg.f((TypeVariable) obj, afjl.INSTANCE))).getBounds();
            bounds.getClass();
            Type type = (Type) woy.cU(bounds);
            afvo afvoVar = z ? afvo.NOT_NULL : isMappedBuiltin(afheVarConvertJavaClass) ? afik.g(afik.k(aiqj.allTypeParameters(afheVarConvertJavaClass).get(i), null, false, 7), afvm.INSTANCE.getANY()) ? afvo.NOT_NULL : afvo.NULLABLE : afvo.FLEXIBLE;
            afid afidVar = afid.a;
            type.getClass();
            arrayList.add(afik.f(toKType$default(type, map, afvoVar, false, true, null, 20, null)));
            i = i2;
        }
        aire aireVarCreateJavaSimpleType$default = createJavaSimpleType$default(cls, afheVarConvertJavaClass, arrayList, false, null, 16, null);
        aire aireVarCreateMutableCollectionType = createMutableCollectionType(aireVarCreateJavaSimpleType$default, cls);
        aire aireVar = aireVarCreateMutableCollectionType != null ? aireVarCreateMutableCollectionType : aireVarCreateJavaSimpleType$default;
        List<TypeVariable<?>> listAllTypeParameters2 = allTypeParameters(cls);
        ArrayList arrayList2 = new ArrayList(woy.bp(listAllTypeParameters2, 10));
        Iterator<T> it = listAllTypeParameters2.iterator();
        while (it.hasNext()) {
            arrayList2.add(afid.a);
        }
        return aiqr.Companion.create(aireVar, createJavaSimpleType$default(cls, afheVarConvertJavaClass, arrayList2, true, null, 16, null), true, new afjm(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeVariable createRawJavaType$lambda$0$0(TypeVariable typeVariable) {
        typeVariable.getClass();
        Type[] bounds = typeVariable.getBounds();
        bounds.getClass();
        Object objCU = woy.cU(bounds);
        if (objCU instanceof TypeVariable) {
            return (TypeVariable) objCU;
        }
        return null;
    }

    private static final afic findKTypeParameterInContainer(TypeVariable<?> typeVariable, Map<TypeVariable<?>, ? extends afic> map) {
        afic aficVar = map.get(typeVariable);
        if (aficVar != null) {
            return aficVar;
        }
        Iterator<T> it = getKotlinContainer(typeVariable).getTypeParameters().iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (affa.f(((afic) next).getName(), typeVariable.getName())) {
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
        afic aficVar2 = (afic) obj;
        if (aficVar2 != null) {
            return aficVar2;
        }
        throw new aftw("Type parameter " + typeVariable.getName() + " is not found in " + getKotlinContainer(typeVariable));
    }

    private static final afrx getKotlinContainer(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            afhe afheVarL = affa.l((Class) genericDeclaration);
            afheVarL.getClass();
            return (afqw) afheVarL;
        }
        boolean z = false;
        Object obj = null;
        if (genericDeclaration instanceof Constructor) {
            Class declaringClass = ((Constructor) genericDeclaration).getDeclaringClass();
            declaringClass.getClass();
            afhe afheVarL2 = affa.l(declaringClass);
            afheVarL2.getClass();
            afqw afqwVar = (afqw) afheVarL2;
            Iterator it = afqwVar.getConstructors().iterator();
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (affa.f(afiu.a((afhh) next), genericDeclaration)) {
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
            afny afnyVar = (afny) obj;
            if (afnyVar != null) {
                return afnyVar;
            }
            throw new aftw("Constructor " + genericDeclaration + " is not found in " + afqwVar + ":\n" + woy.cu(afqwVar.getConstructors(), "\n", null, null, afjr.INSTANCE, 30));
        }
        if (!(genericDeclaration instanceof Method)) {
            throw new aftw(a.cj((byte) 41, typeVariable, genericDeclaration, "Unsupported container of a type parameter: ", " ("));
        }
        Method method = (Method) genericDeclaration;
        if (!Modifier.isStatic(method.getModifiers())) {
            Objects.toString(genericDeclaration);
            throw new IllegalArgumentException("Only static methods are supported for now: ".concat(String.valueOf(genericDeclaration)));
        }
        Class<?> declaringClass2 = method.getDeclaringClass();
        declaringClass2.getClass();
        afhe afheVarL3 = affa.l(declaringClass2);
        afheVarL3.getClass();
        afqw afqwVar2 = (afqw) afheVarL3;
        Iterator it2 = afir.a(afqwVar2).iterator();
        Object obj3 = null;
        while (true) {
            if (it2.hasNext()) {
                Object next2 = it2.next();
                if (affa.f(afiu.d((afhh) next2), genericDeclaration)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj3 = next2;
                }
            } else if (z) {
                obj = obj3;
            }
        }
        afoc afocVar = (afoc) obj;
        if (afocVar != null) {
            return afocVar;
        }
        throw new aftw("Method " + genericDeclaration + " is not found in " + afqwVar2 + ":\n" + woy.cu(afir.a(afqwVar2), "\n", null, null, afjh.INSTANCE, 30));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.afib getPurelyImplementedSupertype(defpackage.afqw<?> r13) {
        /*
            r13.getClass()
            java.util.List r0 = r13.getAnnotations()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            r3 = r1
            java.lang.annotation.Annotation r3 = (java.lang.annotation.Annotation) r3
            boolean r3 = r3 instanceof defpackage.afdq
            if (r3 == 0) goto Lb
            goto L1f
        L1e:
            r1 = r2
        L1f:
            afdq r1 = (defpackage.afdq) r1
            if (r1 == 0) goto L47
            java.lang.String r0 = r1.a()
            if (r0 == 0) goto L47
            ahnf r1 = new ahnf
            r1.<init>(r0)
            boolean r0 = r1.isRoot()
            if (r0 != 0) goto L3d
            ahnj r0 = defpackage.afyo.BUILT_INS_PACKAGE_NAME
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L3d
            goto L3e
        L3d:
            r1 = r2
        L3e:
            if (r1 == 0) goto L47
            ahnc r0 = defpackage.ahnd.Companion
            ahnd r0 = r0.topLevel(r1)
            goto L48
        L47:
            r0 = r2
        L48:
            if (r0 != 0) goto L58
            agsj r1 = defpackage.agsj.INSTANCE
            ahnd r3 = r13.getClassId$kotlin_reflection()
            ahnd r1 = r1.getPurelyImplementedInterface(r3)
            if (r1 == 0) goto L57
            goto L59
        L57:
            return r2
        L58:
            r1 = r0
        L59:
            java.lang.Class r3 = defpackage.affa.h(r13)
            java.lang.ClassLoader r3 = defpackage.agkc.getSafeClassLoader(r3)
            r4 = 2
            r5 = 0
            java.lang.Class r6 = defpackage.afvu.loadClass$default(r3, r1, r5, r4, r2)
            if (r6 != 0) goto L6a
            return r2
        L6a:
            java.util.List r1 = allTypeParameters(r6)
            int r1 = r1.size()
            java.util.List r13 = r13.getTypeParameters()
            int r3 = r13.size()
            r4 = 7
            if (r3 != r1) goto La8
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.woy.bp(r13, r1)
            r0.<init>(r1)
            java.util.Iterator r13 = r13.iterator()
        L8c:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r13.next()
            afic r1 = (defpackage.afic) r1
            afid r3 = defpackage.afid.a
            afib r1 = defpackage.afik.k(r1, r2, r5, r4)
            afid r1 = defpackage.afik.f(r1)
            r0.add(r1)
            goto L8c
        La6:
            r8 = r0
            goto Lcc
        La8:
            r7 = 1
            if (r3 != r7) goto Le1
            if (r1 <= r7) goto Le1
            if (r0 != 0) goto Le1
            afid r0 = defpackage.afid.a
            java.lang.Object r13 = defpackage.woy.bN(r13)
            afhf r13 = (defpackage.afhf) r13
            afib r13 = defpackage.afik.k(r13, r2, r5, r4)
            afid r13 = defpackage.afik.f(r13)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
        Lc4:
            if (r5 >= r1) goto La6
            r0.add(r13)
            int r5 = r5 + 1
            goto Lc4
        Lcc:
            afhe r7 = defpackage.affa.l(r6)
            r11 = 16
            r12 = 0
            r9 = 0
            r10 = 0
            aire r13 = createJavaSimpleType$default(r6, r7, r8, r9, r10, r11, r12)
            aire r0 = createMutableCollectionType(r13, r6)
            if (r0 == 0) goto Le0
            return r0
        Le0:
            return r13
        Le1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afjs.getPurelyImplementedSupertype(afqw):afib");
    }

    public static final boolean isEnumValuesValueOfMethod(Member member) {
        member.getClass();
        if (member instanceof Method) {
            Method method = (Method) member;
            if (method.getDeclaringClass().isEnum() && Modifier.isStatic(method.getModifiers())) {
                if (affa.f(method.getName(), "values") && method.getParameterTypes().length == 0) {
                    return true;
                }
                if (affa.f(method.getName(), "valueOf")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    return affa.f(woy.cZ(parameterTypes), String.class);
                }
            }
        }
        return false;
    }

    public static final boolean isMappedBuiltin(afhe<?> afheVar) {
        afheVar.getClass();
        return !affa.f(affa.h(afheVar).getCanonicalName(), afheVar.getQualifiedName());
    }

    private static final afib toFlexibleArrayType(aire aireVar, Type type, afvo afvoVar, boolean z) {
        if (z) {
            return aireVar;
        }
        aiqq aiqqVar = aiqr.Companion;
        afhf classifier = aireVar.getClassifier();
        List<afid> arguments = aireVar.getArguments();
        ArrayList arrayList = new ArrayList(woy.bp(arguments, 10));
        for (afid afidVarE : arguments) {
            afib afibVar = afidVarE.c;
            if (afibVar != null) {
                afidVarE = afik.e(afibVar);
            }
            arrayList.add(afidVarE);
        }
        return (aiqr) aiqqVar.create(aireVar, createJavaSimpleType$default(type, classifier, arrayList, afvoVar != afvo.NOT_NULL, null, 16, null), false, new afji(type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c6 A[RETURN] */
    /* JADX WARN: Type inference failed for: r11v11, types: [aiqc, aire] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [afib, aiqc] */
    /* JADX WARN: Type inference failed for: r11v17, types: [aiqc] */
    /* JADX WARN: Type inference failed for: r13v5, types: [aiqq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.afib toKType(java.lang.reflect.Type r10, java.util.Map<java.lang.reflect.TypeVariable<?>, ? extends defpackage.afic> r11, defpackage.afvo r12, boolean r13, boolean r14, defpackage.afvr r15) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afjs.toKType(java.lang.reflect.Type, java.util.Map, afvo, boolean, boolean, afvr):afib");
    }

    public static /* synthetic */ afib toKType$default(Type type, Map map, afvo afvoVar, boolean z, boolean z2, afvr afvrVar, int i, Object obj) {
        if ((i & 2) != 0) {
            afvoVar = afvo.FLEXIBLE;
        }
        afvo afvoVar2 = afvoVar;
        boolean z3 = ((i & 4) == 0) & z;
        boolean z4 = ((i & 8) == 0) & z2;
        if ((i & 16) != 0) {
            afvrVar = afvr.COMMON;
        }
        return toKType(type, map, afvoVar2, z3, z4, afvrVar);
    }

    public static final List<afic> toKTypeParameters(TypeVariable<?>[] typeVariableArr, afrx afrxVar) {
        afrx afrxVarUnbindAllReceivers;
        typeVariableArr.getClass();
        afrxVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(typeVariableArr.length), 16));
        for (TypeVariable<?> typeVariable : typeVariableArr) {
            afue afueVar = afrxVar instanceof afue ? (afue) afrxVar : null;
            if (afueVar == null || (afrxVarUnbindAllReceivers = afuh.unbindAllReceivers(afueVar)) == null) {
                afrxVarUnbindAllReceivers = afrxVar;
            }
            String name = typeVariable.getName();
            name.getClass();
            linkedHashMap.put(typeVariable, new afrv(afrxVarUnbindAllReceivers, name, afie.a, false));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            TypeVariable typeVariable2 = (TypeVariable) entry.getKey();
            afrv afrvVar = (afrv) entry.getValue();
            Type[] bounds = typeVariable2.getBounds();
            bounds.getClass();
            ArrayList arrayList = new ArrayList(bounds.length);
            for (Type type : bounds) {
                type.getClass();
                arrayList.add(toKType$default(type, linkedHashMap, null, false, false, null, 30, null));
            }
            afrvVar.setUpperBounds(arrayList);
        }
        return woy.cf(linkedHashMap.values());
    }

    private static final afid toKTypeProjection(Type type, Map<TypeVariable<?>, ? extends afic> map, boolean z) {
        int length;
        if (!(type instanceof WildcardType)) {
            afid afidVar = afid.a;
            return afik.f(toKType$default(type, map, null, z, false, null, 26, null));
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        int length2 = upperBounds.length;
        if (length2 > 1 || (length = lowerBounds.length) > 1) {
            Objects.toString(type);
            throw new aftw("Wildcard types with many bounds are not supported: ".concat(String.valueOf(type)));
        }
        if (length == 1) {
            afid afidVar2 = afid.a;
            lowerBounds.getClass();
            Object objCY = woy.cY(lowerBounds);
            objCY.getClass();
            return afik.d(toKType$default((Type) objCY, map, null, z, false, null, 26, null));
        }
        if (length2 != 1) {
            return afid.a;
        }
        upperBounds.getClass();
        if (affa.f((Type) woy.cY(upperBounds), Object.class)) {
            return afid.a;
        }
        afid afidVar3 = afid.a;
        Object objCY2 = woy.cY(upperBounds);
        objCY2.getClass();
        return afik.e(toKType$default((Type) objCY2, map, null, z, false, null, 26, null));
    }

    static /* synthetic */ Type accessor$ConvertFromJavaKt$lambda0(Type type) {
        return type;
    }

    static /* synthetic */ Type accessor$ConvertFromJavaKt$lambda1(Type type) {
        return type;
    }

    static /* synthetic */ Type accessor$ConvertFromJavaKt$lambda11(Type type) {
        return type;
    }

    static /* synthetic */ Type accessor$ConvertFromJavaKt$lambda2(Type type) {
        return type;
    }

    static /* synthetic */ Type accessor$ConvertFromJavaKt$lambda4(Class cls) {
        return cls;
    }

    private static final Type createJavaSimpleType$lambda$0(Type type) {
        return type;
    }

    private static final Type createRawJavaType$lambda$3(Class cls) {
        return cls;
    }

    private static final Type toFlexibleArrayType$lambda$1(Type type) {
        return type;
    }

    private static final Type toKType$lambda$3$0(Type type) {
        return type;
    }

    private static final Type toKType$lambda$4(Type type) {
        return type;
    }
}
