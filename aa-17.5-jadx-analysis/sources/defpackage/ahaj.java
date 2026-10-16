package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class ahaj<TAnnotation> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List _get_boundsNullability_$lambda$0$2(List list, ahaj ahajVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ailw enhancedForWarnings = ahajVar.getEnhancedForWarnings((ailw) it.next());
            if (enhancedForWarnings != null) {
                arrayList.add(enhancedForWarnings);
            }
        }
        return arrayList;
    }

    private static final List<ailw> _get_boundsNullability_$lambda$0$3(aezr<? extends List<? extends ailw>> aezrVar) {
        return (List) aezrVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agsq computeIndexedQualifiers$lambda$2(ahaj ahajVar, List list, int i) {
        return ahajVar.extractDefaultQualifier((ahai) list.get(i));
    }

    private static final agsq computeIndexedQualifiers$lambda$3(aezr<agsq> aezrVar) {
        return (agsq) aezrVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahar computeIndexedQualifiers$lambda$5(ahdb ahdbVar, ahar[] aharVarArr, int i) {
        Map<Integer, ahar> map;
        ahar aharVar;
        return (ahdbVar == null || (map = ahdbVar.getMap()) == null || (aharVar = map.get(Integer.valueOf(i))) == null) ? (i < 0 || i >= aharVarArr.length) ? ahar.Companion.getNONE() : aharVarArr[i] : aharVar;
    }

    private final agte extractAndMergeDefaultQualifiers(ailw ailwVar, agte agteVar) {
        return agru.extractAndMergeDefaultQualifiers$default(getAnnotationTypeQualifierResolver(), agteVar, getAnnotations(ailwVar), false, 4, null);
    }

    private final agsq extractDefaultQualifier(ahai ahaiVar) {
        agrv containerApplicabilityType = (ahaiVar.getTypeParameterForArgument() == null || getContainerApplicabilityType() == agrv.TYPE_PARAMETER_BOUNDS) ? getContainerApplicabilityType() : agrv.TYPE_USE;
        agte defaultQualifiers = ahaiVar.getDefaultQualifiers();
        if (defaultQualifiers != null) {
            return defaultQualifiers.get(containerApplicabilityType);
        }
        return null;
    }

    private final ahar extractQualifiers(ailw ailwVar) {
        ahau nullabilityQualifier;
        boolean z;
        ahau nullabilityQualifier2 = getNullabilityQualifier(ailwVar);
        ahas mutabilityQualifier = null;
        if (nullabilityQualifier2 == null) {
            ailw enhancedForWarnings = getEnhancedForWarnings(ailwVar);
            nullabilityQualifier = enhancedForWarnings != null ? getNullabilityQualifier(enhancedForWarnings) : null;
        } else {
            nullabilityQualifier = nullabilityQualifier2;
        }
        ahas mutabilityQualifier2 = getMutabilityQualifier(ailwVar);
        ahas mutabilityQualifier3 = getMutabilityQualifier(ailwVar);
        if (mutabilityQualifier3 == null) {
            ailw enhancedForWarnings2 = getEnhancedForWarnings(ailwVar);
            if (enhancedForWarnings2 != null) {
                mutabilityQualifier = getMutabilityQualifier(enhancedForWarnings2);
            }
        } else {
            mutabilityQualifier = mutabilityQualifier3;
        }
        boolean z2 = true;
        if (getTypeSystem().isDefinitelyNotNullType(ailwVar) || isNotNullTypeParameterCompat(ailwVar)) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        return new ahar(nullabilityQualifier, mutabilityQualifier2, z2, nullabilityQualifier != nullabilityQualifier2 ? z : false, mutabilityQualifier != mutabilityQualifier2 ? z : false);
    }

    private final ahar extractQualifiersFromAnnotations(ahai ahaiVar, agsq agsqVar) {
        Iterable<? extends TAnnotation> iterableBW;
        ahdf<ahau> boundsNullability;
        ahdf<ahau> boundsNullability2;
        ahas qualifier;
        ahas qualifier2;
        ailw type;
        aimd aimdVarTypeConstructor;
        ahdf<ahas> ahdfVar = null;
        if (ahaiVar.getType() == null) {
            aimg typeSystem = getTypeSystem();
            aime typeParameterForArgument = ahaiVar.getTypeParameterForArgument();
            if ((typeParameterForArgument != null ? typeSystem.getVariance(typeParameterForArgument) : null) == aimm.IN) {
                return ahar.Companion.getNONE();
            }
        }
        aime typeParameterForArgument2 = ahaiVar.getTypeParameterForArgument();
        ailw type2 = ahaiVar.getType();
        if (type2 == null || (iterableBW = getAnnotations(type2)) == null) {
            iterableBW = afbe.a;
        }
        aimg typeSystem2 = getTypeSystem();
        ailw type3 = ahaiVar.getType();
        aime typeParameterClassifier = (type3 == null || (aimdVarTypeConstructor = typeSystem2.typeConstructor(type3)) == null) ? null : typeSystem2.getTypeParameterClassifier(aimdVarTypeConstructor);
        agrv containerApplicabilityType = getContainerApplicabilityType();
        agrv agrvVar = agrv.TYPE_PARAMETER_BOUNDS;
        if (typeParameterForArgument2 == null) {
            if (containerApplicabilityType == agrvVar || !getEnableImprovementsInStrictMode() || (type = ahaiVar.getType()) == null || !isArrayOrPrimitiveArray(type)) {
                iterableBW = woy.bW(getContainerAnnotations(), iterableBW);
            } else {
                Iterable<TAnnotation> containerAnnotations = getContainerAnnotations();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : containerAnnotations) {
                    if (!getAnnotationTypeQualifierResolver().isTypeUseAnnotation(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                iterableBW = woy.bY(arrayList, iterableBW);
            }
        }
        ahdf<ahas> ahdfVarExtractMutability = getAnnotationTypeQualifierResolver().extractMutability((Iterable) iterableBW);
        ahdf<ahau> ahdfVarExtractNullability = getAnnotationTypeQualifierResolver().extractNullability((Iterable) iterableBW, (afec) new ahad(this, ahaiVar));
        if (ahdfVarExtractNullability != null) {
            ahau qualifier3 = ahdfVarExtractNullability.getQualifier();
            if (ahdfVarExtractMutability != null) {
                qualifier2 = ahdfVarExtractMutability.getQualifier();
                ahdfVar = ahdfVarExtractMutability;
            } else {
                qualifier2 = null;
            }
            return new ahar(qualifier3, qualifier2, ahdfVarExtractNullability.getQualifier() == ahau.NOT_NULL && typeParameterClassifier != null, ahdfVarExtractNullability.isForWarningOnly(), ahdfVar != null && ahdfVar.isForWarningOnly());
        }
        if (typeParameterClassifier != null) {
            boundsNullability = getBoundsNullability(typeParameterClassifier);
        } else {
            boundsNullability = null;
            typeParameterClassifier = null;
        }
        ahdf<ahau> defaultNullability = getDefaultNullability(boundsNullability, agsqVar);
        boolean z = (boundsNullability != null ? boundsNullability.getQualifier() : null) == ahau.NOT_NULL || !(typeParameterClassifier == null || agsqVar == null || !agsqVar.getDefinitelyNotNull());
        aime typeParameterForArgument3 = ahaiVar.getTypeParameterForArgument();
        if (typeParameterForArgument3 == null || (boundsNullability2 = getBoundsNullability(typeParameterForArgument3)) == null) {
            boundsNullability2 = null;
        } else if (boundsNullability2.getQualifier() == ahau.NULLABLE) {
            boundsNullability2 = ahdf.copy$default(boundsNullability2, ahau.FORCE_FLEXIBILITY, false, 2, null);
        }
        ahdf<ahau> ahdfVarMostSpecific = mostSpecific(boundsNullability2, defaultNullability);
        ahau qualifier4 = ahdfVarMostSpecific != null ? ahdfVarMostSpecific.getQualifier() : null;
        if (ahdfVarExtractMutability != null) {
            qualifier = ahdfVarExtractMutability.getQualifier();
            ahdfVar = ahdfVarExtractMutability;
        } else {
            qualifier = null;
        }
        return new ahar(qualifier4, qualifier, z, ahdfVarMostSpecific != null && ahdfVarMostSpecific.isForWarningOnly(), ahdfVar != null && ahdfVar.isForWarningOnly());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean extractQualifiersFromAnnotations$lambda$3(ahaj ahajVar, ahai ahaiVar, Object obj) {
        obj.getClass();
        return ahajVar.forceWarning(obj, ahaiVar.getType());
    }

    private final <T> void flattenTree(T t, List<T> list, afec<? super T, ? extends Iterable<? extends T>> afecVar) {
        list.add(t);
        Iterable<? extends T> iterableInvoke = afecVar.invoke(t);
        if (iterableInvoke != null) {
            Iterator<? extends T> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                flattenTree(it.next(), list, afecVar);
            }
        }
    }

    private final ahdf<ahau> getBoundsNullability(aime aimeVar) {
        List<ailw> list_get_boundsNullability_$lambda$0$3;
        ahau ahauVar;
        aimg typeSystem = getTypeSystem();
        if (!isFromJava(aimeVar)) {
            return null;
        }
        List<ailw> upperBounds = typeSystem.getUpperBounds(aimeVar);
        if ((upperBounds instanceof Collection) && upperBounds.isEmpty()) {
            return null;
        }
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            if (!typeSystem.isError((ailw) it.next())) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : upperBounds) {
                    if (getNullabilityQualifier((ailw) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                aezr aezrVarDH = woy.dH(3, new ahae(upperBounds, this));
                if (!arrayList.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (getShouldPropagateBoundNullness((ailw) it2.next())) {
                                list_get_boundsNullability_$lambda$0$3 = upperBounds;
                            }
                        }
                    }
                    return new ahdf<>(ahau.FORCE_FLEXIBILITY, false);
                }
                if (_get_boundsNullability_$lambda$0$3(aezrVarDH).isEmpty()) {
                    return null;
                }
                List<ailw> list_get_boundsNullability_$lambda$0$32 = _get_boundsNullability_$lambda$0$3(aezrVarDH);
                if (!(list_get_boundsNullability_$lambda$0$32 instanceof Collection) || !list_get_boundsNullability_$lambda$0$32.isEmpty()) {
                    Iterator<T> it3 = list_get_boundsNullability_$lambda$0$32.iterator();
                    while (it3.hasNext()) {
                        if (getShouldPropagateBoundNullness((ailw) it3.next())) {
                            list_get_boundsNullability_$lambda$0$3 = _get_boundsNullability_$lambda$0$3(aezrVarDH);
                        }
                    }
                }
                return new ahdf<>(ahau.FORCE_FLEXIBILITY, true);
                if ((list_get_boundsNullability_$lambda$0$3 instanceof Collection) && list_get_boundsNullability_$lambda$0$3.isEmpty()) {
                    ahauVar = ahau.NULLABLE;
                } else {
                    Iterator<T> it4 = list_get_boundsNullability_$lambda$0$3.iterator();
                    while (it4.hasNext()) {
                        if (!typeSystem.isNullableType((ailw) it4.next())) {
                            ahauVar = ahau.NOT_NULL;
                            break;
                        }
                    }
                    ahauVar = ahau.NULLABLE;
                }
                return new ahdf<>(ahauVar, list_get_boundsNullability_$lambda$0$3 != upperBounds);
            }
        }
        return null;
    }

    private final ahas getMutabilityQualifier(ailw ailwVar) {
        aimg typeSystem = getTypeSystem();
        if (afzq.INSTANCE.isReadOnly(getFqNameUnsafe(typeSystem.lowerBoundIfFlexible(ailwVar)))) {
            return ahas.READ_ONLY;
        }
        if (afzq.INSTANCE.isMutable(getFqNameUnsafe(typeSystem.upperBoundIfFlexible(ailwVar)))) {
            return ahas.MUTABLE;
        }
        return null;
    }

    private final ahau getNullabilityQualifier(ailw ailwVar) {
        aimg typeSystem = getTypeSystem();
        if (typeSystem.isMarkedNullable(typeSystem.lowerBoundIfFlexible(ailwVar))) {
            return ahau.NULLABLE;
        }
        if (typeSystem.isMarkedNullable(typeSystem.upperBoundIfFlexible(ailwVar))) {
            return null;
        }
        return ahau.NOT_NULL;
    }

    private final ahdf<ahau> mostSpecific(ahdf<ahau> ahdfVar, ahdf<ahau> ahdfVar2) {
        return (ahdfVar != null && (ahdfVar2 == null || ((!ahdfVar.isForWarningOnly() || ahdfVar2.isForWarningOnly()) && ((!ahdfVar.isForWarningOnly() && ahdfVar2.isForWarningOnly()) || (ahdfVar.getQualifier().compareTo(ahdfVar2.getQualifier()) >= 0 && ahdfVar.getQualifier().compareTo(ahdfVar2.getQualifier()) > 0))))) ? ahdfVar : ahdfVar2;
    }

    private final List<ahai> toIndexed(ailw ailwVar) {
        return flattenTree(new ahai(ailwVar, extractAndMergeDefaultQualifiers(ailwVar, getContainerDefaultTypeQualifiers()), null), new ahah(this, getTypeSystem()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable toIndexed$lambda$0$0(ahaj ahajVar, aimg aimgVar, ahai ahaiVar) {
        ailw type;
        aimd aimdVarTypeConstructor;
        List<aime> parameters;
        ailw type2;
        ahaiVar.getClass();
        if ((ahajVar.getSkipRawTypeArguments() && (type2 = ahaiVar.getType()) != null && aimgVar.isRawType(type2)) || (type = ahaiVar.getType()) == null || (aimdVarTypeConstructor = aimgVar.typeConstructor(type)) == null || (parameters = aimgVar.getParameters(aimdVarTypeConstructor)) == null) {
            return null;
        }
        List<aima> arguments = aimgVar.getArguments(ahaiVar.getType());
        Iterator<T> it = parameters.iterator();
        Iterator<T> it2 = arguments.iterator();
        ArrayList arrayList = new ArrayList(Math.min(woy.bp(parameters, 10), woy.bp(arguments, 10)));
        while (it.hasNext() && it2.hasNext()) {
            aime aimeVar = (aime) it.next();
            ailw type3 = aimgVar.getType((aima) it2.next());
            arrayList.add(type3 == null ? new ahai(null, ahaiVar.getDefaultQualifiers(), aimeVar) : new ahai(type3, ahajVar.extractAndMergeDefaultQualifiers(type3, ahaiVar.getDefaultQualifiers()), aimeVar));
        }
        return arrayList;
    }

    public final afec<Integer, ahar> computeIndexedQualifiers(ailw ailwVar, Iterable<? extends ailw> iterable, ahdb ahdbVar, boolean z) {
        boolean z2;
        boolean z3;
        ahar aharVarComputeQualifiersForOverride;
        ailw type;
        agsq agsqVarComputeIndexedQualifiers$lambda$3;
        ailwVar.getClass();
        iterable.getClass();
        List<ahai> indexed = toIndexed(ailwVar);
        ArrayList arrayList = new ArrayList(woy.bp(iterable, 10));
        Iterator<? extends ailw> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(toIndexed(it.next()));
        }
        if (!isCovariant() || ((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
            z2 = false;
        } else {
            Iterator<? extends ailw> it2 = iterable.iterator();
            while (it2.hasNext()) {
                if (!isEqual(ailwVar, it2.next())) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        int size = getForceOnlyHeadTypeConstructor() ? 1 : indexed.size();
        ahar[] aharVarArr = new ahar[size];
        int i = 0;
        while (i < size) {
            aezr aezrVarDH = woy.dH(3, new ahaf(this, indexed, i));
            if (i <= 0 || !z2) {
                ahar aharVarExtractQualifiersFromAnnotations = extractQualifiersFromAnnotations(indexed.get(i), computeIndexedQualifiers$lambda$3(aezrVarDH));
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ahai ahaiVar = (ahai) woy.bI((List) it3.next(), i);
                    ahar aharVarExtractQualifiers = null;
                    if (ahaiVar != null && (type = ahaiVar.getType()) != null) {
                        aharVarExtractQualifiers = extractQualifiers(type);
                    }
                    if (aharVarExtractQualifiers != null) {
                        arrayList2.add(aharVarExtractQualifiers);
                    }
                }
                boolean z4 = i == 0 && isCovariant();
                if (i != 0) {
                    z3 = false;
                } else if (getContainerIsVarargParameter()) {
                    z3 = true;
                    i = 0;
                } else {
                    i = 0;
                    z3 = false;
                }
                aharVarComputeQualifiersForOverride = ahdd.computeQualifiersForOverride(aharVarExtractQualifiersFromAnnotations, arrayList2, z4, z3, z);
            } else {
                aharVarComputeQualifiersForOverride = (isK2() && (agsqVarComputeIndexedQualifiers$lambda$3 = computeIndexedQualifiers$lambda$3(aezrVarDH)) != null && agsqVarComputeIndexedQualifiers$lambda$3.getPreferQualifierOverSupertype()) ? extractQualifiersFromAnnotations(indexed.get(i), computeIndexedQualifiers$lambda$3(aezrVarDH)) : ahar.Companion.getNONE();
            }
            aharVarArr[i] = aharVarComputeQualifiersForOverride;
            i++;
        }
        return new ahag(ahdbVar, aharVarArr);
    }

    public abstract boolean forceWarning(TAnnotation tannotation, ailw ailwVar);

    public abstract agru<TAnnotation> getAnnotationTypeQualifierResolver();

    public abstract Iterable<TAnnotation> getAnnotations(ailw ailwVar);

    public abstract Iterable<TAnnotation> getContainerAnnotations();

    public abstract agrv getContainerApplicabilityType();

    public abstract agte getContainerDefaultTypeQualifiers();

    public abstract boolean getContainerIsVarargParameter();

    protected abstract ahdf<ahau> getDefaultNullability(ahdf<ahau> ahdfVar, agsq agsqVar);

    public abstract boolean getEnableImprovementsInStrictMode();

    public abstract ailw getEnhancedForWarnings(ailw ailwVar);

    public boolean getForceOnlyHeadTypeConstructor() {
        return false;
    }

    public abstract ahnh getFqNameUnsafe(ailw ailwVar);

    public boolean getShouldPropagateBoundNullness(ailw ailwVar) {
        ailwVar.getClass();
        return true;
    }

    public abstract boolean getSkipRawTypeArguments();

    public abstract aimg getTypeSystem();

    public abstract boolean isArrayOrPrimitiveArray(ailw ailwVar);

    public abstract boolean isCovariant();

    public abstract boolean isEqual(ailw ailwVar, ailw ailwVar2);

    public abstract boolean isFromJava(aime aimeVar);

    public abstract boolean isK2();

    public boolean isNotNullTypeParameterCompat(ailw ailwVar) {
        ailwVar.getClass();
        return false;
    }

    private final <T> List<T> flattenTree(T t, afec<? super T, ? extends Iterable<? extends T>> afecVar) {
        ArrayList arrayList = new ArrayList(1);
        flattenTree(t, arrayList, afecVar);
        return arrayList;
    }
}
