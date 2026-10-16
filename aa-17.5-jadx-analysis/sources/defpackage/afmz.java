package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;

/* loaded from: classes3.dex */
public final class afmz {
    private static final Comparator<afue<?>> modalityIntersectionOverrideComparator = new czs(new afec[]{afmw.INSTANCE, afmx.INSTANCE}, 11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean areEqualKTypes(afib afibVar, afib afibVar2) {
        return afik.g(afibVar, afibVar2) && afik.g(afibVar2, afibVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afib coerceFlexibleTypesAndMutabilityRecursive(afib afibVar, String str) {
        boolean z = afibVar instanceof aiqc;
        aird airdVar = aird.INSTANCE;
        aiqc aiqcVar = z ? (aiqc) afibVar : null;
        if (aiqcVar != null && airdVar.isError(aiqcVar)) {
            return afibVar;
        }
        afhf classifier = afibVar.getClassifier();
        if (classifier != null) {
            List<afid> arguments = afibVar.getArguments();
            ArrayList arrayList = new ArrayList(woy.bp(arguments, 10));
            for (afid afidVar : arguments) {
                afib afibVar2 = afidVar.c;
                arrayList.add(afid.a(afidVar, afibVar2 != null ? coerceFlexibleTypesAndMutabilityRecursive(afibVar2, str) : null));
            }
            return afik.h(classifier, arrayList, false, afibVar.getAnnotations());
        }
        throw new IllegalStateException("Non-denotable parameter types are not possible. Some parameter types appear non-denotable for type '" + afibVar + "' (" + affw.b(afibVar.getClass()) + ") which belongs to member '" + str + '\'');
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [afue, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [afue, java.lang.Object] */
    public static final afmv computeFakeOverrideMembers(afqw<?> afqwVar) {
        afqwVar.getClass();
        HashMap map = new HashMap();
        boolean zIsKotlin = isKotlin(affa.h(afqwVar));
        HashMap map2 = new HashMap();
        if (zIsKotlin) {
            for (afue<?> afueVar : getDeclaredReflectKCallableMembers(afqwVar)) {
                if (!isNonTransitiveMember(afqwVar, afueVar)) {
                    map2.put(toEquatableCallableSignature(afueVar, afmq.INSTANCE), afueVar);
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        for (afib afibVar : afqwVar.getSupertypes()) {
            afhf classifier = afibVar.getClassifier();
            afhe afheVar = classifier instanceof afhe ? (afhe) classifier : null;
            if (afheVar == null) {
                throw new IllegalStateException(a.cj((byte) 39, afqwVar, afibVar, "Non-denotable supertypes are not possible. Supertype '", "' appears non-denotable in class '"));
            }
            aiqu aiquVarCreate = aiqu.Companion.create(afibVar);
            afmv fakeOverrideMembers = getFakeOverrideMembers(afheVar);
            z = z || fakeOverrideMembers.getContainsInheritedStatics();
            z2 = z2 || fakeOverrideMembers.getContainsPackagePrivate();
            Iterator<Map.Entry<afms<afmp>, afue<?>>> it = fakeOverrideMembers.getMembers().entrySet().iterator();
            while (it.hasNext()) {
                afue<?> value = it.next().getValue();
                afue<?> afueVarShallowCopy = value.shallowCopy(afqwVar, afpq.copy$default(value.getOverriddenStorage().withChainedClassTypeParametersSubstitutor(aiquVarCreate), null, null, Boolean.valueOf(isStatic(value)), getOriginalContainer(value), value.getTypeParameters(), false, false, false, false, 483, null));
                afms equatableCallableSignature = toEquatableCallableSignature(afueVarShallowCopy, afmq.INSTANCE);
                if (!map2.containsKey(equatableCallableSignature)) {
                    afms afmsVarWithEqualityMode = equatableCallableSignature.withEqualityMode(afmp.INSTANCE);
                    Object obj = map.get(afmsVarWithEqualityMode);
                    if (obj != null) {
                        afue afueVar2 = (afue) obj;
                        ?? A = affa.A(afueVar2, afueVarShallowCopy, afka.INSTANCE);
                        afue<?> afueVarShallowCopy2 = A;
                        if (afueVar2 instanceof afhh) {
                            afueVarShallowCopy2 = A;
                            if (afueVarShallowCopy instanceof afhh) {
                                afhh afhhVar = (afhh) afueVar2;
                                afueVarShallowCopy2 = A.shallowCopy(A.getContainer(), afpq.copy$default(A.getOverriddenStorage(), null, affa.A(afueVar2, afueVarShallowCopy, modalityIntersectionOverrideComparator).getModality(), null, null, null, afhhVar.isExternal() || ((afhh) afueVarShallowCopy).isExternal(), afhhVar.isOperator() || ((afhh) afueVarShallowCopy).isOperator(), afhhVar.isInfix() || ((afhh) afueVarShallowCopy).isInfix(), afhhVar.isInline() || ((afhh) afueVarShallowCopy).isInline(), 29, null));
                            }
                        }
                        if (afueVarShallowCopy2 != null) {
                            afueVarShallowCopy = afueVarShallowCopy2;
                        }
                    }
                    map.put(afmsVarWithEqualityMode, afueVarShallowCopy);
                }
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            afms afmsVar = (afms) entry.getKey();
            afue afueVar3 = (afue) entry.getValue();
            z = z || isStatic(afueVar3);
            z2 = z2 || afueVar3.isPackagePrivate();
            map.put(afmsVar.withEqualityMode(afmp.INSTANCE), afueVar3);
        }
        if (!zIsKotlin) {
            for (afue<?> afueVar4 : getDeclaredReflectKCallableMembers(afqwVar)) {
                if (!isNonTransitiveMember(afqwVar, afueVar4)) {
                    z = z || isStatic(afueVar4);
                    z2 = z2 || afueVar4.isPackagePrivate();
                    map.put(toEquatableCallableSignature(afueVar4, afmp.INSTANCE), afueVar4);
                }
            }
        }
        return new afmv(map, z, z2);
    }

    public static final Collection<afue<?>> getAllMembers(afqw<?> afqwVar) {
        Map<afms<afmp>, afue<?>> mapNewHashMapWithExpectedSize;
        afqwVar.getClass();
        afmv fakeOverrideMembers$kotlin_reflection = ((afqs) afqwVar.getData().a()).getFakeOverrideMembers$kotlin_reflection();
        boolean zIsKotlin = isKotlin(affa.h(afqwVar));
        boolean z = false;
        if (fakeOverrideMembers$kotlin_reflection.getContainsInheritedStatics() && afqwVar.getClassKind$kotlin_reflection() != agmp.ENUM_CLASS && zIsKotlin) {
            z = true;
        }
        if (fakeOverrideMembers$kotlin_reflection.getContainsPackagePrivate() || z) {
            Map<afms<afmp>, afue<?>> members = fakeOverrideMembers$kotlin_reflection.getMembers();
            mapNewHashMapWithExpectedSize = aiow.newHashMapWithExpectedSize(fakeOverrideMembers$kotlin_reflection.getMembers().size());
            for (Map.Entry<afms<afmp>, afue<?>> entry : members.entrySet()) {
                afue<?> value = entry.getValue();
                if (!z || !isStatic(value)) {
                    if (!value.isPackagePrivate() || affa.f(getOriginalContainer(value).getJClass().getPackage(), affa.h(afqwVar).getPackage())) {
                        mapNewHashMapWithExpectedSize.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        } else {
            mapNewHashMapWithExpectedSize = fakeOverrideMembers$kotlin_reflection.getMembers();
        }
        Collection<afue<?>> collectionValues = mapNewHashMapWithExpectedSize.values();
        Collection<afue<?>> declaredReflectKCallableMembers = getDeclaredReflectKCallableMembers(afqwVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : declaredReflectKCallableMembers) {
            if (isNonTransitiveMember(afqwVar, (afue) obj)) {
                arrayList.add(obj);
            }
        }
        return woy.bY(collectionValues, arrayList);
    }

    private static final Collection<afue<?>> getDeclaredReflectKCallableMembers(afhe<?> afheVar) {
        afheVar.getClass();
        return ((afqs) ((afqw) afheVar).getData().a()).getDeclaredMembers();
    }

    private static final afmv getFakeOverrideMembers(afhe<?> afheVar) {
        if (afheVar instanceof afqw) {
            return ((afqs) ((afqw) afheVar).getData().a()).getFakeOverrideMembers$kotlin_reflection();
        }
        if (afheVar instanceof aiqx) {
            return getFakeOverrideMembers(((aiqx) afheVar).getKlass());
        }
        afhe afheVarB = affw.b(afheVar.getClass());
        Objects.toString(afheVarB);
        throw new IllegalStateException("Unknown type ".concat(String.valueOf(afheVarB)));
    }

    private static final afrj getOriginalContainer(afue<?> afueVar) {
        afrj originalContainerIfFakeOverride = afueVar.getOverriddenStorage().getOriginalContainerIfFakeOverride();
        return originalContainerIfFakeOverride == null ? afueVar.getContainer() : originalContainerIfFakeOverride;
    }

    private static final boolean isJavaField(afue<?> afueVar) {
        Field fieldB;
        Class<?> declaringClass;
        return (!(afueVar instanceof afia) || (fieldB = afiu.b((afia) afueVar)) == null || (declaringClass = fieldB.getDeclaringClass()) == null || isKotlin(declaringClass)) ? false : true;
    }

    public static final boolean isKotlin(Class<?> cls) {
        cls.getClass();
        return cls.getAnnotation(Metadata.class) != null;
    }

    private static final boolean isNonTransitiveMember(afqw<?> afqwVar, afue<?> afueVar) {
        return afueVar.getVisibility() == afif.d || isStaticMethodInInterface(afueVar, afqwVar);
    }

    public static final boolean isStatic(afue<?> afueVar) {
        afueVar.getClass();
        Boolean boolIsStatic = afueVar.getOverriddenStorage().isStatic();
        if (boolIsStatic != null) {
            return boolIsStatic.booleanValue();
        }
        afhr afhrVar = (afhr) woy.bH(afueVar.getAllParameters());
        return (afhrVar != null ? afhrVar.getKind() : null) != afhq.a;
    }

    private static final boolean isStaticMethodInInterface(afue<?> afueVar, afqw<?> afqwVar) {
        return isStatic(afueVar) && afqwVar.getClassKind$kotlin_reflection() == agmp.INTERFACE && !isJavaField(afueVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable modalityIntersectionOverrideComparator$lambda$0(afue afueVar) {
        afueVar.getClass();
        afhg originalContainer = getOriginalContainer(afueVar);
        afhe afheVar = originalContainer instanceof afhe ? (afhe) originalContainer : null;
        boolean z = false;
        if (afheVar != null && affa.h(afheVar).isInterface()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable modalityIntersectionOverrideComparator$lambda$1(afue afueVar) {
        afueVar.getClass();
        return Boolean.valueOf(affa.f(getOriginalContainer(afueVar), affw.b(Object.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<afib> sortedUpperBounds(List<? extends afib> list, String str) {
        return woy.cc(list, new afmy(str));
    }

    public static final Void starProjectionInTopLevelTypeIsNotPossible(String str) {
        str.getClass();
        throw new IllegalStateException("Star projection in top level type is not possible. Star projection appeared in the following container: '" + str + '\'');
    }

    public static final aiqu substitutedWith(List<? extends afic> list, List<? extends afic> list2) {
        list.getClass();
        list2.getClass();
        afeu afeuVar = null;
        if (list.size() != list2.size()) {
            return null;
        }
        if (list.isEmpty()) {
            return aiqu.Companion.getEMPTY();
        }
        List listCi = woy.ci(list, list2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(listCi, 10)), 16));
        Iterator it = listCi.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                return new aiqu(linkedHashMap, z, 2, afeuVar);
            }
            aezu aezuVar = (aezu) it.next();
            afic aficVar = (afic) aezuVar.a;
            afic aficVar2 = (afic) aezuVar.b;
            afid afidVar = afid.a;
            aezu aezuVar2 = new aezu(aficVar, afik.f(afik.k(aficVar2, null, false, 7)));
            linkedHashMap.put(aezuVar2.a, aezuVar2.b);
        }
    }

    private static final <T extends afmr> afms<T> toEquatableCallableSignature(afue afueVar, T t) {
        afvk afvkVar;
        List<afhr> parameters = afueVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((afhr) obj).getKind() != afhq.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(woy.bp(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((afhr) it.next()).getType());
        }
        if (isJavaField(afueVar)) {
            afvkVar = afvk.FIELD_IN_JAVA_CLASS;
        } else if (afueVar instanceof afia) {
            afvkVar = afvk.PROPERTY;
        } else {
            if (!(afueVar instanceof afhh)) {
                afhe afheVarB = affw.b(afueVar.getClass());
                Objects.toString(afheVarB);
                throw new IllegalStateException("Unknown kind for ".concat(String.valueOf(afheVarB)));
            }
            afvkVar = afvk.FUNCTION;
        }
        afvk afvkVar2 = afvkVar;
        afhh afhhVar = afueVar instanceof afhh ? (afhh) afueVar : null;
        Method methodD = afhhVar != null ? afiu.d(afhhVar) : null;
        Type[] genericParameterTypes = methodD != null ? methodD.getGenericParameterTypes() : null;
        if (genericParameterTypes == null) {
            genericParameterTypes = new Type[0];
        }
        List listDf = woy.df(genericParameterTypes);
        Class<?>[] parameterTypes = methodD != null ? methodD.getParameterTypes() : null;
        if (parameterTypes == null) {
            parameterTypes = new Class[0];
        }
        List listDf2 = woy.df(parameterTypes);
        return new afms<>(afvkVar2, afueVar.getName(), methodD != null ? methodD.getName() : null, afueVar.getTypeParameters(), arrayList2, listDf2, listDf, isStatic(afueVar), t);
    }
}
