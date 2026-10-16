package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class agsu<TAnnotation> {
    private static final defpackage.agss Companion = new defpackage.agss(null);
    private static final java.util.Map<java.lang.String, defpackage.agsv> JAVA_APPLICABILITY_TYPES;
    private final defpackage.agud javaTypeEnhancementState;
    private final j$.util.concurrent.ConcurrentHashMap<java.lang.Object, TAnnotation> resolvedNicknames;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (defpackage.agsv agsvVar : defpackage.agsv.values()) {
            java.lang.String javaTarget = agsvVar.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, agsvVar);
            }
        }
        JAVA_APPLICABILITY_TYPES = linkedHashMap;
    }

    public agsu(defpackage.agud agudVar) {
        agudVar.getClass();
        this.javaTypeEnhancementState = agudVar;
        this.resolvedNicknames = new j$.util.concurrent.ConcurrentHashMap<>();
    }

    static /* synthetic */ boolean accessor$AbstractAnnotationTypeQualifierResolver$lambda2(java.lang.Object obj) {
        extractDefaultQualifiers$lambda$1(obj);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final java.util.Set<defpackage.agsv> allIfTypeUse(java.util.Set<? extends defpackage.agsv> set) {
        return set.contains(defpackage.agsv.TYPE_USE) ? defpackage.afga.M(defpackage.afga.L(defpackage.afga.cc(defpackage.agsv.values()), defpackage.agsv.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    public static /* synthetic */ defpackage.ague extractAndMergeDefaultQualifiers$default(defpackage.agsu agsuVar, defpackage.ague agueVar, java.lang.Iterable iterable, boolean z, int i, java.lang.Object obj) {
        if (obj == null) {
            return agsuVar.extractAndMergeDefaultQualifiers(agueVar, iterable, z & ((i & 4) == 0));
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: extractAndMergeDefaultQualifiers");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final defpackage.agtq extractDefaultQualifiers(TAnnotation tannotation, boolean z) {
        defpackage.ahef<defpackage.ahbu> ahefVarExtractNullability;
        defpackage.agtq agtqVarResolveQualifierBuiltInDefaultAnnotation = resolveQualifierBuiltInDefaultAnnotation(tannotation, z);
        if (agtqVarResolveQualifierBuiltInDefaultAnnotation != null) {
            return agtqVarResolveQualifierBuiltInDefaultAnnotation;
        }
        defpackage.afau afauVarResolveTypeQualifierDefaultAnnotation = resolveTypeQualifierDefaultAnnotation(tannotation);
        if (afauVarResolveTypeQualifierDefaultAnnotation != null) {
            java.util.Set set = (java.util.Set) afauVarResolveTypeQualifierDefaultAnnotation.b;
            defpackage.aguq aguqVarResolveJsr305CustomState = resolveJsr305CustomState(tannotation);
            java.lang.Object obj = afauVarResolveTypeQualifierDefaultAnnotation.a;
            if (aguqVarResolveJsr305CustomState == null) {
                aguqVarResolveJsr305CustomState = resolveJsr305AnnotationState(obj);
            }
            if (!aguqVarResolveJsr305CustomState.isIgnore() && (ahefVarExtractNullability = extractNullability(obj, defpackage.agsr.INSTANCE)) != null) {
                return new defpackage.agtq(defpackage.ahef.copy$default(ahefVarExtractNullability, null, z || aguqVarResolveJsr305CustomState.isWarning(), 1, null), set, false, false, false, 28, null);
            }
        }
        return null;
    }

    private static final boolean extractDefaultQualifiers$lambda$1(java.lang.Object obj) {
        obj.getClass();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final defpackage.ahef<defpackage.ahbs> extractMutability(TAnnotation tannotation) {
        defpackage.ahbs ahbsVar;
        defpackage.ahof fqName = getFqName(tannotation);
        if (fqName == null) {
            return null;
        }
        if (defpackage.aguj.getREAD_ONLY_ANNOTATIONS().contains(fqName)) {
            ahbsVar = defpackage.ahbs.READ_ONLY;
        } else {
            if (!defpackage.aguj.getMUTABLE_ANNOTATIONS().contains(fqName)) {
                return null;
            }
            ahbsVar = defpackage.ahbs.MUTABLE;
        }
        defpackage.aguq aguqVarInvoke = this.javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(fqName);
        if (aguqVarInvoke.isIgnore()) {
            return null;
        }
        if (!aguqVarInvoke.isWarning() || isK2()) {
            return new defpackage.ahef<>(ahbsVar, aguqVarInvoke.isWarning());
        }
        return null;
    }

    private final defpackage.ahef<defpackage.ahbu> extractNullability(TAnnotation tannotation, defpackage.affc<? super TAnnotation, java.lang.Boolean> affcVar) {
        defpackage.ahef<defpackage.ahbu> ahefVarKnownNullability;
        defpackage.ahef<defpackage.ahbu> ahefVarKnownNullability2 = knownNullability(tannotation, affcVar.invoke(tannotation).booleanValue());
        if (ahefVarKnownNullability2 != null) {
            return ahefVarKnownNullability2;
        }
        TAnnotation tannotationResolveTypeQualifierAnnotation = resolveTypeQualifierAnnotation(tannotation);
        if (tannotationResolveTypeQualifierAnnotation != null) {
            defpackage.aguq aguqVarResolveJsr305AnnotationState = resolveJsr305AnnotationState(tannotation);
            if (!aguqVarResolveJsr305AnnotationState.isIgnore() && (ahefVarKnownNullability = knownNullability(tannotationResolveTypeQualifierAnnotation, affcVar.invoke(tannotationResolveTypeQualifierAnnotation).booleanValue())) != null) {
                return defpackage.ahef.copy$default(ahefVarKnownNullability, null, aguqVarResolveJsr305AnnotationState.isWarning(), 1, null);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.ahef extractNullability$lambda$2(defpackage.agsu agsuVar, defpackage.affc affcVar, java.lang.Object obj) {
        obj.getClass();
        return agsuVar.extractNullability(obj, (defpackage.affc<? super java.lang.Object, java.lang.Boolean>) affcVar);
    }

    private final <TQualifier> defpackage.ahef<TQualifier> extractQualifier(java.lang.Iterable<? extends TAnnotation> iterable, defpackage.affc<? super TAnnotation, defpackage.ahef<TQualifier>> affcVar) {
        java.util.Iterator<? extends TAnnotation> it = iterable.iterator();
        defpackage.ahef<TQualifier> ahefVar = null;
        while (it.hasNext()) {
            defpackage.ahef<TQualifier> ahefVarInvoke = affcVar.invoke(it.next());
            if (ahefVar != null) {
                if (ahefVarInvoke != null && !defpackage.afga.f(ahefVarInvoke, ahefVar) && (!ahefVarInvoke.isForWarningOnly() || ahefVar.isForWarningOnly())) {
                    if (ahefVarInvoke.isForWarningOnly() || !ahefVar.isForWarningOnly()) {
                        return null;
                    }
                }
            }
            ahefVar = ahefVarInvoke;
        }
        return ahefVar;
    }

    private final TAnnotation findAnnotation(TAnnotation tannotation, defpackage.ahof ahofVar) {
        for (TAnnotation tannotation2 : getMetaAnnotations(tannotation)) {
            if (defpackage.afga.f(getFqName(tannotation2), ahofVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    private final boolean hasAnnotation(TAnnotation tannotation, defpackage.ahof ahofVar) {
        java.lang.Iterable<TAnnotation> metaAnnotations = getMetaAnnotations(tannotation);
        if ((metaAnnotations instanceof java.util.Collection) && ((java.util.Collection) metaAnnotations).isEmpty()) {
            return false;
        }
        java.util.Iterator<TAnnotation> it = metaAnnotations.iterator();
        while (it.hasNext()) {
            if (defpackage.afga.f(getFqName(it.next()), ahofVar)) {
                return true;
            }
        }
        return false;
    }

    private final defpackage.ahef<defpackage.ahbu> knownNullability(TAnnotation tannotation, boolean z) {
        defpackage.ahbu ahbuVar;
        defpackage.ahof fqName = getFqName(tannotation);
        if (fqName == null) {
            return null;
        }
        defpackage.aguq aguqVarInvoke = this.javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(fqName);
        if (aguqVarInvoke.isIgnore()) {
            return null;
        }
        if (defpackage.aguj.getNOT_NULL_ANNOTATIONS().contains(fqName)) {
            ahbuVar = defpackage.ahbu.NOT_NULL;
        } else if (defpackage.aguj.getNULLABLE_ANNOTATIONS().contains(fqName)) {
            ahbuVar = defpackage.ahbu.NULLABLE;
        } else if (defpackage.aguj.getFORCE_FLEXIBILITY_ANNOTATIONS().contains(fqName)) {
            ahbuVar = defpackage.ahbu.FORCE_FLEXIBILITY;
        } else {
            if (!defpackage.afga.f(fqName, defpackage.aguj.getJAVAX_NONNULL_ANNOTATION_FQ_NAME())) {
                return null;
            }
            java.lang.String str = (java.lang.String) defpackage.afga.aA(enumArguments(tannotation, false));
            if (str != null) {
                switch (str) {
                    case "MAYBE":
                    case "NEVER":
                        if (!str.equals("MAYBE")) {
                            return null;
                        }
                        ahbuVar = defpackage.ahbu.NULLABLE;
                        break;
                    case "UNKNOWN":
                        ahbuVar = defpackage.ahbu.FORCE_FLEXIBILITY;
                        break;
                    case "ALWAYS":
                        if (!str.equals("ALWAYS")) {
                            return null;
                        }
                        ahbuVar = defpackage.ahbu.NOT_NULL;
                        break;
                    default:
                        return null;
                }
            } else {
                ahbuVar = defpackage.ahbu.NOT_NULL;
            }
        }
        return new defpackage.ahef<>(ahbuVar, aguqVarInvoke.isWarning() || z);
    }

    private final defpackage.aguq resolveDefaultAnnotationState(TAnnotation tannotation) {
        defpackage.ahof fqName = getFqName(tannotation);
        return (fqName == null || !defpackage.agtr.getJSPECIFY_DEFAULT_ANNOTATIONS().containsKey(fqName)) ? resolveJsr305AnnotationState(tannotation) : this.javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(fqName);
    }

    private final defpackage.aguq resolveJsr305AnnotationState(TAnnotation tannotation) {
        defpackage.aguq aguqVarResolveJsr305CustomState = resolveJsr305CustomState(tannotation);
        return aguqVarResolveJsr305CustomState != null ? aguqVarResolveJsr305CustomState : this.javaTypeEnhancementState.getJsr305().getGlobalLevel();
    }

    private final defpackage.aguq resolveJsr305CustomState(TAnnotation tannotation) {
        java.lang.Iterable<java.lang.String> iterableEnumArguments;
        java.lang.String str;
        defpackage.aguq aguqVar = this.javaTypeEnhancementState.getJsr305().getUserDefinedLevelForSpecificAnnotation().get(getFqName(tannotation));
        if (aguqVar != null) {
            return aguqVar;
        }
        TAnnotation tannotationFindAnnotation = findAnnotation(tannotation, defpackage.aguj.getUNDER_MIGRATION_ANNOTATION_FQ_NAME());
        if (tannotationFindAnnotation == null || (iterableEnumArguments = enumArguments(tannotationFindAnnotation, false)) == null || (str = (java.lang.String) defpackage.afga.aA(iterableEnumArguments)) == null) {
            return null;
        }
        defpackage.aguq migrationLevel = this.javaTypeEnhancementState.getJsr305().getMigrationLevel();
        if (migrationLevel != null) {
            return migrationLevel;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return defpackage.aguq.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return defpackage.aguq.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return defpackage.aguq.WARN;
        }
        return null;
    }

    private final defpackage.agtq resolveQualifierBuiltInDefaultAnnotation(TAnnotation tannotation, boolean z) {
        defpackage.agtq agtqVar;
        if (this.javaTypeEnhancementState.getDisabledDefaultAnnotations() || (agtqVar = defpackage.agtr.getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS().get(getFqName(tannotation))) == null) {
            return null;
        }
        defpackage.aguq aguqVarResolveDefaultAnnotationState = resolveDefaultAnnotationState(tannotation);
        if (aguqVarResolveDefaultAnnotationState == defpackage.aguq.IGNORE) {
            aguqVarResolveDefaultAnnotationState = null;
        }
        if (aguqVarResolveDefaultAnnotationState == null) {
            return null;
        }
        return defpackage.agtq.copy$default(agtqVar, defpackage.ahef.copy$default(agtqVar.getNullabilityQualifier(), null, z || aguqVarResolveDefaultAnnotationState.isWarning(), 1, null), null, false, false, false, 30, null);
    }

    private final defpackage.afau<TAnnotation, java.util.Set<defpackage.agsv>> resolveTypeQualifierDefaultAnnotation(TAnnotation tannotation) {
        TAnnotation tannotationFindAnnotation;
        TAnnotation next;
        if (!this.javaTypeEnhancementState.getJsr305().isDisabled() && (tannotationFindAnnotation = findAnnotation(tannotation, defpackage.aguj.getJAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME())) != null) {
            java.util.Iterator<TAnnotation> it = getMetaAnnotations(tannotation).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (resolveTypeQualifierAnnotation(next) == null);
            if (next != null) {
                java.lang.Iterable<java.lang.String> iterableEnumArguments = enumArguments(tannotationFindAnnotation, true);
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                java.util.Iterator<java.lang.String> it2 = iterableEnumArguments.iterator();
                while (it2.hasNext()) {
                    defpackage.agsv agsvVar = JAVA_APPLICABILITY_TYPES.get(it2.next());
                    if (agsvVar != null) {
                        linkedHashSet.add(agsvVar);
                    }
                }
                return new defpackage.afau<>(next, allIfTypeUse(linkedHashSet));
            }
        }
        return null;
    }

    protected abstract java.lang.Iterable<java.lang.String> enumArguments(TAnnotation tannotation, boolean z);

    public final defpackage.ague extractAndMergeDefaultQualifiers(defpackage.ague agueVar, java.lang.Iterable<? extends TAnnotation> iterable, boolean z) {
        java.util.EnumMap<defpackage.agsv, defpackage.agtq> defaultQualifiers;
        iterable.getClass();
        if (!this.javaTypeEnhancementState.getDisabledDefaultAnnotations()) {
            java.util.ArrayList<defpackage.agtq> arrayList = new java.util.ArrayList();
            java.util.Iterator<? extends TAnnotation> it = iterable.iterator();
            while (it.hasNext()) {
                defpackage.agtq agtqVarExtractDefaultQualifiers = extractDefaultQualifiers(it.next(), z);
                if (agtqVarExtractDefaultQualifiers != null) {
                    arrayList.add(agtqVarExtractDefaultQualifiers);
                }
            }
            if (!arrayList.isEmpty()) {
                java.util.EnumMap enumMap = new java.util.EnumMap(defpackage.agsv.class);
                for (defpackage.agtq agtqVar : arrayList) {
                    for (defpackage.agsv agsvVar : agtqVar.getQualifierApplicabilityTypes()) {
                        if (enumMap.containsKey(agsvVar) && isK2()) {
                            defpackage.agtq agtqVar2 = (defpackage.agtq) enumMap.get(agsvVar);
                            if (agtqVar2 != null) {
                                defpackage.ahef<defpackage.ahbu> nullabilityQualifier = agtqVar2.getNullabilityQualifier();
                                defpackage.ahef<defpackage.ahbu> nullabilityQualifier2 = agtqVar.getNullabilityQualifier();
                                if (!defpackage.afga.f(nullabilityQualifier2, nullabilityQualifier) && (!nullabilityQualifier2.isForWarningOnly() || nullabilityQualifier.isForWarningOnly())) {
                                    agtqVar2 = (nullabilityQualifier2.isForWarningOnly() || !nullabilityQualifier.isForWarningOnly()) ? null : agtqVar;
                                }
                                enumMap.put(agsvVar, agtqVar2);
                            }
                        } else {
                            enumMap.put(agsvVar, agtqVar);
                        }
                    }
                }
                java.util.EnumMap enumMap2 = (agueVar == null || (defaultQualifiers = agueVar.getDefaultQualifiers()) == null) ? new java.util.EnumMap(defpackage.agsv.class) : new java.util.EnumMap((java.util.EnumMap) defaultQualifiers);
                boolean z2 = false;
                for (java.util.Map.Entry entry : enumMap.entrySet()) {
                    defpackage.agsv agsvVar2 = (defpackage.agsv) entry.getKey();
                    defpackage.agtq agtqVar3 = (defpackage.agtq) entry.getValue();
                    if (agtqVar3 != null) {
                        enumMap2.put(agsvVar2, agtqVar3);
                        z2 = true;
                    }
                }
                if (z2) {
                    return new defpackage.ague(enumMap2);
                }
            }
        }
        return agueVar;
    }

    protected abstract defpackage.ahof getFqName(TAnnotation tannotation);

    protected abstract java.lang.Object getKey(TAnnotation tannotation);

    protected abstract java.lang.Iterable<TAnnotation> getMetaAnnotations(TAnnotation tannotation);

    public abstract boolean isK2();

    public final boolean isTypeUseAnnotation(TAnnotation tannotation) {
        tannotation.getClass();
        TAnnotation tannotationFindAnnotation = findAnnotation(tannotation, defpackage.afzn.target);
        if (tannotationFindAnnotation == null) {
            return false;
        }
        java.lang.Iterable<java.lang.String> iterableEnumArguments = enumArguments(tannotationFindAnnotation, false);
        if ((iterableEnumArguments instanceof java.util.Collection) && ((java.util.Collection) iterableEnumArguments).isEmpty()) {
            return false;
        }
        java.util.Iterator<java.lang.String> it = iterableEnumArguments.iterator();
        while (it.hasNext()) {
            if (defpackage.afga.f(it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    public final TAnnotation resolveTypeQualifierAnnotation(TAnnotation tannotation) {
        tannotation.getClass();
        if (this.javaTypeEnhancementState.getJsr305().isDisabled()) {
            return null;
        }
        if (defpackage.afga.bh(defpackage.aguj.getBUILT_IN_TYPE_QUALIFIER_ANNOTATIONS(), getFqName(tannotation)) || hasAnnotation(tannotation, defpackage.aguj.getJAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME())) {
            return tannotation;
        }
        if (!hasAnnotation(tannotation, defpackage.aguj.getJAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME())) {
            return null;
        }
        j$.util.concurrent.ConcurrentHashMap<java.lang.Object, TAnnotation> concurrentHashMap = this.resolvedNicknames;
        java.lang.Object key = getKey(tannotation);
        TAnnotation tannotationResolveTypeQualifierAnnotation = concurrentHashMap.get(key);
        if (tannotationResolveTypeQualifierAnnotation == null) {
            java.util.Iterator<TAnnotation> it = getMetaAnnotations(tannotation).iterator();
            do {
                if (!it.hasNext()) {
                    tannotationResolveTypeQualifierAnnotation = null;
                    break;
                }
                tannotationResolveTypeQualifierAnnotation = resolveTypeQualifierAnnotation(it.next());
            } while (tannotationResolveTypeQualifierAnnotation == null);
            if (tannotationResolveTypeQualifierAnnotation == null) {
                return null;
            }
            TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(key, tannotationResolveTypeQualifierAnnotation);
            if (tannotationPutIfAbsent != null) {
                return tannotationPutIfAbsent;
            }
        }
        return tannotationResolveTypeQualifierAnnotation;
    }

    public final defpackage.ahef<defpackage.ahbu> extractNullability(java.lang.Iterable<? extends TAnnotation> iterable, defpackage.affc<? super TAnnotation, java.lang.Boolean> affcVar) {
        iterable.getClass();
        affcVar.getClass();
        return extractQualifier(iterable, new defpackage.agsq(this, affcVar));
    }

    public final defpackage.ahef<defpackage.ahbs> extractMutability(java.lang.Iterable<? extends TAnnotation> iterable) {
        iterable.getClass();
        return extractQualifier(iterable, new defpackage.agst(this));
    }
}
