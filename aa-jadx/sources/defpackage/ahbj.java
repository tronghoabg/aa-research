package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahbj<TAnnotation> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List _get_boundsNullability_$lambda$0$2(java.util.List list, defpackage.ahbj ahbjVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.aimw enhancedForWarnings = ahbjVar.getEnhancedForWarnings((defpackage.aimw) it.next());
            if (enhancedForWarnings != null) {
                arrayList.add(enhancedForWarnings);
            }
        }
        return arrayList;
    }

    private static final java.util.List<defpackage.aimw> _get_boundsNullability_$lambda$0$3(defpackage.afar<? extends java.util.List<? extends defpackage.aimw>> afarVar) {
        return (java.util.List) afarVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.agtq computeIndexedQualifiers$lambda$2(defpackage.ahbj ahbjVar, java.util.List list, int i) {
        return ahbjVar.extractDefaultQualifier((defpackage.ahbi) list.get(i));
    }

    private static final defpackage.agtq computeIndexedQualifiers$lambda$3(defpackage.afar<defpackage.agtq> afarVar) {
        return (defpackage.agtq) afarVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.ahbr computeIndexedQualifiers$lambda$5(defpackage.aheb ahebVar, defpackage.ahbr[] ahbrVarArr, int i) {
        java.util.Map<java.lang.Integer, defpackage.ahbr> map;
        defpackage.ahbr ahbrVar;
        if (ahebVar == null || (map = ahebVar.getMap()) == null || (ahbrVar = map.get(java.lang.Integer.valueOf(i))) == null) {
            return (i < 0 || i >= ahbrVarArr.length) ? defpackage.ahbr.Companion.getNONE() : ahbrVarArr[i];
        }
        return ahbrVar;
    }

    private final defpackage.ague extractAndMergeDefaultQualifiers(defpackage.aimw aimwVar, defpackage.ague agueVar) {
        return defpackage.agsu.extractAndMergeDefaultQualifiers$default(getAnnotationTypeQualifierResolver(), agueVar, getAnnotations(aimwVar), false, 4, null);
    }

    private final defpackage.agtq extractDefaultQualifier(defpackage.ahbi ahbiVar) {
        defpackage.agsv containerApplicabilityType = (ahbiVar.getTypeParameterForArgument() == null || getContainerApplicabilityType() == defpackage.agsv.TYPE_PARAMETER_BOUNDS) ? getContainerApplicabilityType() : defpackage.agsv.TYPE_USE;
        defpackage.ague defaultQualifiers = ahbiVar.getDefaultQualifiers();
        if (defaultQualifiers != null) {
            return defaultQualifiers.get(containerApplicabilityType);
        }
        return null;
    }

    private final defpackage.ahbr extractQualifiers(defpackage.aimw aimwVar) {
        defpackage.ahbu nullabilityQualifier;
        defpackage.ahbu nullabilityQualifier2 = getNullabilityQualifier(aimwVar);
        defpackage.ahbs mutabilityQualifier = null;
        if (nullabilityQualifier2 == null) {
            defpackage.aimw enhancedForWarnings = getEnhancedForWarnings(aimwVar);
            nullabilityQualifier = enhancedForWarnings != null ? getNullabilityQualifier(enhancedForWarnings) : null;
        } else {
            nullabilityQualifier = nullabilityQualifier2;
        }
        defpackage.ahbs mutabilityQualifier2 = getMutabilityQualifier(aimwVar);
        defpackage.ahbs mutabilityQualifier3 = getMutabilityQualifier(aimwVar);
        if (mutabilityQualifier3 == null) {
            defpackage.aimw enhancedForWarnings2 = getEnhancedForWarnings(aimwVar);
            if (enhancedForWarnings2 != null) {
                mutabilityQualifier = getMutabilityQualifier(enhancedForWarnings2);
            }
        } else {
            mutabilityQualifier = mutabilityQualifier3;
        }
        boolean z = true;
        if (!getTypeSystem().isDefinitelyNotNullType(aimwVar) && !isNotNullTypeParameterCompat(aimwVar)) {
            z = false;
        }
        return new defpackage.ahbr(nullabilityQualifier, mutabilityQualifier2, z, nullabilityQualifier != nullabilityQualifier2, mutabilityQualifier != mutabilityQualifier2 ? z : false);
    }

    private final defpackage.ahbr extractQualifiersFromAnnotations(defpackage.ahbi ahbiVar, defpackage.agtq agtqVar) {
        java.lang.Iterable<? extends TAnnotation> iterableAQ;
        defpackage.ahef<defpackage.ahbu> boundsNullability;
        defpackage.ahef<defpackage.ahbu> boundsNullability2;
        defpackage.ahbs qualifier;
        defpackage.ahbs qualifier2;
        defpackage.aimw type;
        defpackage.aind aindVarTypeConstructor;
        defpackage.ahef<defpackage.ahbs> ahefVar = null;
        if (ahbiVar.getType() == null) {
            defpackage.aing typeSystem = getTypeSystem();
            defpackage.aine typeParameterForArgument = ahbiVar.getTypeParameterForArgument();
            if ((typeParameterForArgument != null ? typeSystem.getVariance(typeParameterForArgument) : null) == defpackage.ainm.IN) {
                return defpackage.ahbr.Companion.getNONE();
            }
        }
        defpackage.aine typeParameterForArgument2 = ahbiVar.getTypeParameterForArgument();
        defpackage.aimw type2 = ahbiVar.getType();
        if (type2 == null || (iterableAQ = getAnnotations(type2)) == null) {
            iterableAQ = defpackage.afce.a;
        }
        defpackage.aing typeSystem2 = getTypeSystem();
        defpackage.aimw type3 = ahbiVar.getType();
        defpackage.aine typeParameterClassifier = (type3 == null || (aindVarTypeConstructor = typeSystem2.typeConstructor(type3)) == null) ? null : typeSystem2.getTypeParameterClassifier(aindVarTypeConstructor);
        defpackage.agsv containerApplicabilityType = getContainerApplicabilityType();
        defpackage.agsv agsvVar = defpackage.agsv.TYPE_PARAMETER_BOUNDS;
        if (typeParameterForArgument2 == null) {
            if (containerApplicabilityType == agsvVar || !getEnableImprovementsInStrictMode() || (type = ahbiVar.getType()) == null || !isArrayOrPrimitiveArray(type)) {
                iterableAQ = defpackage.afga.aQ(getContainerAnnotations(), iterableAQ);
            } else {
                java.lang.Iterable<TAnnotation> containerAnnotations = getContainerAnnotations();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (TAnnotation tannotation : containerAnnotations) {
                    if (!getAnnotationTypeQualifierResolver().isTypeUseAnnotation(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                iterableAQ = defpackage.afga.aS(arrayList, iterableAQ);
            }
        }
        defpackage.ahef<defpackage.ahbs> ahefVarExtractMutability = getAnnotationTypeQualifierResolver().extractMutability((java.lang.Iterable) iterableAQ);
        defpackage.ahef<defpackage.ahbu> ahefVarExtractNullability = getAnnotationTypeQualifierResolver().extractNullability((java.lang.Iterable) iterableAQ, (defpackage.affc) new defpackage.ahbd(this, ahbiVar));
        if (ahefVarExtractNullability != null) {
            defpackage.ahbu qualifier3 = ahefVarExtractNullability.getQualifier();
            if (ahefVarExtractMutability != null) {
                qualifier2 = ahefVarExtractMutability.getQualifier();
                ahefVar = ahefVarExtractMutability;
            } else {
                qualifier2 = null;
            }
            return new defpackage.ahbr(qualifier3, qualifier2, ahefVarExtractNullability.getQualifier() == defpackage.ahbu.NOT_NULL && typeParameterClassifier != null, ahefVarExtractNullability.isForWarningOnly(), ahefVar != null && ahefVar.isForWarningOnly());
        }
        if (typeParameterClassifier != null) {
            boundsNullability = getBoundsNullability(typeParameterClassifier);
        } else {
            boundsNullability = null;
            typeParameterClassifier = null;
        }
        defpackage.ahef<defpackage.ahbu> defaultNullability = getDefaultNullability(boundsNullability, agtqVar);
        boolean z = (boundsNullability != null ? boundsNullability.getQualifier() : null) == defpackage.ahbu.NOT_NULL || !(typeParameterClassifier == null || agtqVar == null || !agtqVar.getDefinitelyNotNull());
        defpackage.aine typeParameterForArgument3 = ahbiVar.getTypeParameterForArgument();
        if (typeParameterForArgument3 == null || (boundsNullability2 = getBoundsNullability(typeParameterForArgument3)) == null) {
            boundsNullability2 = null;
        } else if (boundsNullability2.getQualifier() == defpackage.ahbu.NULLABLE) {
            boundsNullability2 = defpackage.ahef.copy$default(boundsNullability2, defpackage.ahbu.FORCE_FLEXIBILITY, false, 2, null);
        }
        defpackage.ahef<defpackage.ahbu> ahefVarMostSpecific = mostSpecific(boundsNullability2, defaultNullability);
        defpackage.ahbu qualifier4 = ahefVarMostSpecific != null ? ahefVarMostSpecific.getQualifier() : null;
        if (ahefVarExtractMutability != null) {
            qualifier = ahefVarExtractMutability.getQualifier();
            ahefVar = ahefVarExtractMutability;
        } else {
            qualifier = null;
        }
        return new defpackage.ahbr(qualifier4, qualifier, z, ahefVarMostSpecific != null && ahefVarMostSpecific.isForWarningOnly(), ahefVar != null && ahefVar.isForWarningOnly());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean extractQualifiersFromAnnotations$lambda$3(defpackage.ahbj ahbjVar, defpackage.ahbi ahbiVar, java.lang.Object obj) {
        obj.getClass();
        return ahbjVar.forceWarning(obj, ahbiVar.getType());
    }

    private final <T> void flattenTree(T t, java.util.List<T> list, defpackage.affc<? super T, ? extends java.lang.Iterable<? extends T>> affcVar) {
        list.add(t);
        java.lang.Iterable<? extends T> iterableInvoke = affcVar.invoke(t);
        if (iterableInvoke != null) {
            java.util.Iterator<? extends T> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                flattenTree(it.next(), list, affcVar);
            }
        }
    }

    private final defpackage.ahef<defpackage.ahbu> getBoundsNullability(defpackage.aine aineVar) {
        java.util.List<defpackage.aimw> list_get_boundsNullability_$lambda$0$3;
        defpackage.ahbu ahbuVar;
        defpackage.aing typeSystem = getTypeSystem();
        if (!isFromJava(aineVar)) {
            return null;
        }
        java.util.List<defpackage.aimw> upperBounds = typeSystem.getUpperBounds(aineVar);
        if ((upperBounds instanceof java.util.Collection) && upperBounds.isEmpty()) {
            return null;
        }
        java.util.Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            if (!typeSystem.isError((defpackage.aimw) it.next())) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : upperBounds) {
                    if (getNullabilityQualifier((defpackage.aimw) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                defpackage.afar afarVarCB = defpackage.afga.cB(3, new defpackage.ahbe(upperBounds, this));
                if (!arrayList.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        java.util.Iterator it2 = arrayList.iterator();
                        do {
                            if (it2.hasNext()) {
                            }
                        } while (!getShouldPropagateBoundNullness((defpackage.aimw) it2.next()));
                        list_get_boundsNullability_$lambda$0$3 = upperBounds;
                    }
                    return new defpackage.ahef<>(defpackage.ahbu.FORCE_FLEXIBILITY, false);
                }
                if (_get_boundsNullability_$lambda$0$3(afarVarCB).isEmpty()) {
                    return null;
                }
                java.util.List<defpackage.aimw> list_get_boundsNullability_$lambda$0$4 = _get_boundsNullability_$lambda$0$3(afarVarCB);
                if (!(list_get_boundsNullability_$lambda$0$4 instanceof java.util.Collection) || !list_get_boundsNullability_$lambda$0$4.isEmpty()) {
                    java.util.Iterator<T> it3 = list_get_boundsNullability_$lambda$0$4.iterator();
                    do {
                        if (it3.hasNext()) {
                        }
                    } while (!getShouldPropagateBoundNullness((defpackage.aimw) it3.next()));
                    list_get_boundsNullability_$lambda$0$3 = _get_boundsNullability_$lambda$0$3(afarVarCB);
                }
                return new defpackage.ahef<>(defpackage.ahbu.FORCE_FLEXIBILITY, true);
                if (!(list_get_boundsNullability_$lambda$0$3 instanceof java.util.Collection) || !list_get_boundsNullability_$lambda$0$3.isEmpty()) {
                    java.util.Iterator<T> it4 = list_get_boundsNullability_$lambda$0$3.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            ahbuVar = defpackage.ahbu.NULLABLE;
                            break;
                        }
                        if (!typeSystem.isNullableType((defpackage.aimw) it4.next())) {
                            ahbuVar = defpackage.ahbu.NOT_NULL;
                            break;
                        }
                    }
                } else {
                    ahbuVar = defpackage.ahbu.NULLABLE;
                    break;
                }
                return new defpackage.ahef<>(ahbuVar, list_get_boundsNullability_$lambda$0$3 != upperBounds);
            }
        }
        return null;
    }

    private final defpackage.ahbs getMutabilityQualifier(defpackage.aimw aimwVar) {
        defpackage.aing typeSystem = getTypeSystem();
        if (defpackage.agaq.INSTANCE.isReadOnly(getFqNameUnsafe(typeSystem.lowerBoundIfFlexible(aimwVar)))) {
            return defpackage.ahbs.READ_ONLY;
        }
        if (defpackage.agaq.INSTANCE.isMutable(getFqNameUnsafe(typeSystem.upperBoundIfFlexible(aimwVar)))) {
            return defpackage.ahbs.MUTABLE;
        }
        return null;
    }

    private final defpackage.ahbu getNullabilityQualifier(defpackage.aimw aimwVar) {
        defpackage.aing typeSystem = getTypeSystem();
        if (typeSystem.isMarkedNullable(typeSystem.lowerBoundIfFlexible(aimwVar))) {
            return defpackage.ahbu.NULLABLE;
        }
        if (typeSystem.isMarkedNullable(typeSystem.upperBoundIfFlexible(aimwVar))) {
            return null;
        }
        return defpackage.ahbu.NOT_NULL;
    }

    private final defpackage.ahef<defpackage.ahbu> mostSpecific(defpackage.ahef<defpackage.ahbu> ahefVar, defpackage.ahef<defpackage.ahbu> ahefVar2) {
        return (ahefVar != null && (ahefVar2 == null || ((!ahefVar.isForWarningOnly() || ahefVar2.isForWarningOnly()) && ((!ahefVar.isForWarningOnly() && ahefVar2.isForWarningOnly()) || (ahefVar.getQualifier().compareTo(ahefVar2.getQualifier()) >= 0 && ahefVar.getQualifier().compareTo(ahefVar2.getQualifier()) > 0))))) ? ahefVar : ahefVar2;
    }

    private final java.util.List<defpackage.ahbi> toIndexed(defpackage.aimw aimwVar) {
        return flattenTree(new defpackage.ahbi(aimwVar, extractAndMergeDefaultQualifiers(aimwVar, getContainerDefaultTypeQualifiers()), null), new defpackage.ahbh(this, getTypeSystem()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Iterable toIndexed$lambda$0$0(defpackage.ahbj ahbjVar, defpackage.aing aingVar, defpackage.ahbi ahbiVar) {
        defpackage.aimw type;
        defpackage.aind aindVarTypeConstructor;
        java.util.List<defpackage.aine> parameters;
        defpackage.aimw type2;
        ahbiVar.getClass();
        if ((ahbjVar.getSkipRawTypeArguments() && (type2 = ahbiVar.getType()) != null && aingVar.isRawType(type2)) || (type = ahbiVar.getType()) == null || (aindVarTypeConstructor = aingVar.typeConstructor(type)) == null || (parameters = aingVar.getParameters(aindVarTypeConstructor)) == null) {
            return null;
        }
        java.util.List<defpackage.aina> arguments = aingVar.getArguments(ahbiVar.getType());
        java.util.Iterator<T> it = parameters.iterator();
        java.util.Iterator<T> it2 = arguments.iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList(java.lang.Math.min(defpackage.afga.aj(parameters, 10), defpackage.afga.aj(arguments, 10)));
        while (it.hasNext() && it2.hasNext()) {
            defpackage.aine aineVar = (defpackage.aine) it.next();
            defpackage.aimw type3 = aingVar.getType((defpackage.aina) it2.next());
            arrayList.add(type3 == null ? new defpackage.ahbi(null, ahbiVar.getDefaultQualifiers(), aineVar) : new defpackage.ahbi(type3, ahbjVar.extractAndMergeDefaultQualifiers(type3, ahbiVar.getDefaultQualifiers()), aineVar));
        }
        return arrayList;
    }

    public final defpackage.affc<java.lang.Integer, defpackage.ahbr> computeIndexedQualifiers(defpackage.aimw aimwVar, java.lang.Iterable<? extends defpackage.aimw> iterable, defpackage.aheb ahebVar, boolean z) {
        boolean z2;
        boolean z3;
        defpackage.ahbr ahbrVarComputeQualifiersForOverride;
        defpackage.aimw type;
        defpackage.agtq agtqVarComputeIndexedQualifiers$lambda$3;
        aimwVar.getClass();
        iterable.getClass();
        java.util.List<defpackage.ahbi> indexed = toIndexed(aimwVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(iterable, 10));
        java.util.Iterator<? extends defpackage.aimw> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(toIndexed(it.next()));
        }
        if (isCovariant() && (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty())) {
            java.util.Iterator<? extends defpackage.aimw> it2 = iterable.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                if (!isEqual(aimwVar, it2.next())) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        int size = getForceOnlyHeadTypeConstructor() ? 1 : indexed.size();
        defpackage.ahbr[] ahbrVarArr = new defpackage.ahbr[size];
        int i = 0;
        while (i < size) {
            defpackage.afar afarVarCB = defpackage.afga.cB(3, new defpackage.ahbf(this, indexed, i));
            if (i <= 0 || !z2) {
                defpackage.ahbr ahbrVarExtractQualifiersFromAnnotations = extractQualifiersFromAnnotations(indexed.get(i), computeIndexedQualifiers$lambda$3(afarVarCB));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    defpackage.ahbi ahbiVar = (defpackage.ahbi) defpackage.afga.aC((java.util.List) it3.next(), i);
                    defpackage.ahbr ahbrVarExtractQualifiers = null;
                    if (ahbiVar != null && (type = ahbiVar.getType()) != null) {
                        ahbrVarExtractQualifiers = extractQualifiers(type);
                    }
                    if (ahbrVarExtractQualifiers != null) {
                        arrayList2.add(ahbrVarExtractQualifiers);
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
                ahbrVarComputeQualifiersForOverride = defpackage.ahed.computeQualifiersForOverride(ahbrVarExtractQualifiersFromAnnotations, arrayList2, z4, z3, z);
            } else {
                ahbrVarComputeQualifiersForOverride = (isK2() && (agtqVarComputeIndexedQualifiers$lambda$3 = computeIndexedQualifiers$lambda$3(afarVarCB)) != null && agtqVarComputeIndexedQualifiers$lambda$3.getPreferQualifierOverSupertype()) ? extractQualifiersFromAnnotations(indexed.get(i), computeIndexedQualifiers$lambda$3(afarVarCB)) : defpackage.ahbr.Companion.getNONE();
            }
            ahbrVarArr[i] = ahbrVarComputeQualifiersForOverride;
            i++;
        }
        return new defpackage.ahbg(ahebVar, ahbrVarArr);
    }

    public abstract boolean forceWarning(TAnnotation tannotation, defpackage.aimw aimwVar);

    public abstract defpackage.agsu<TAnnotation> getAnnotationTypeQualifierResolver();

    public abstract java.lang.Iterable<TAnnotation> getAnnotations(defpackage.aimw aimwVar);

    public abstract java.lang.Iterable<TAnnotation> getContainerAnnotations();

    public abstract defpackage.agsv getContainerApplicabilityType();

    public abstract defpackage.ague getContainerDefaultTypeQualifiers();

    public abstract boolean getContainerIsVarargParameter();

    protected abstract defpackage.ahef<defpackage.ahbu> getDefaultNullability(defpackage.ahef<defpackage.ahbu> ahefVar, defpackage.agtq agtqVar);

    public abstract boolean getEnableImprovementsInStrictMode();

    public abstract defpackage.aimw getEnhancedForWarnings(defpackage.aimw aimwVar);

    public boolean getForceOnlyHeadTypeConstructor() {
        return false;
    }

    public abstract defpackage.ahoh getFqNameUnsafe(defpackage.aimw aimwVar);

    public boolean getShouldPropagateBoundNullness(defpackage.aimw aimwVar) {
        aimwVar.getClass();
        return true;
    }

    public abstract boolean getSkipRawTypeArguments();

    public abstract defpackage.aing getTypeSystem();

    public abstract boolean isArrayOrPrimitiveArray(defpackage.aimw aimwVar);

    public abstract boolean isCovariant();

    public abstract boolean isEqual(defpackage.aimw aimwVar, defpackage.aimw aimwVar2);

    public abstract boolean isFromJava(defpackage.aine aineVar);

    public abstract boolean isK2();

    public boolean isNotNullTypeParameterCompat(defpackage.aimw aimwVar) {
        aimwVar.getClass();
        return false;
    }

    private final <T> java.util.List<T> flattenTree(T t, defpackage.affc<? super T, ? extends java.lang.Iterable<? extends T>> affcVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        flattenTree(t, arrayList, affcVar);
        return arrayList;
    }
}
