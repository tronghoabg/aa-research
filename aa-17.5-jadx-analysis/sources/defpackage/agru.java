package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class agru<TAnnotation> {
    private static final agrs Companion = new agrs(null);
    private static final Map<String, agrv> JAVA_APPLICABILITY_TYPES;
    private final agtd javaTypeEnhancementState;
    private final ConcurrentHashMap<Object, TAnnotation> resolvedNicknames;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (agrv agrvVar : agrv.values()) {
            String javaTarget = agrvVar.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, agrvVar);
            }
        }
        JAVA_APPLICABILITY_TYPES = linkedHashMap;
    }

    public agru(agtd agtdVar) {
        agtdVar.getClass();
        this.javaTypeEnhancementState = agtdVar;
        this.resolvedNicknames = new ConcurrentHashMap<>();
    }

    static /* synthetic */ boolean accessor$AbstractAnnotationTypeQualifierResolver$lambda2(Object obj) {
        extractDefaultQualifiers$lambda$1(obj);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Set<agrv> allIfTypeUse(Set<? extends agrv> set) {
        return set.contains(agrv.TYPE_USE) ? woy.aS(woy.aR(woy.di(agrv.values()), agrv.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    public static /* synthetic */ agte extractAndMergeDefaultQualifiers$default(agru agruVar, agte agteVar, Iterable iterable, boolean z, int i, Object obj) {
        if (obj == null) {
            return agruVar.extractAndMergeDefaultQualifiers(agteVar, iterable, z & ((i & 4) == 0));
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: extractAndMergeDefaultQualifiers");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final agsq extractDefaultQualifiers(TAnnotation tannotation, boolean z) {
        ahdf<ahau> ahdfVarExtractNullability;
        agsq agsqVarResolveQualifierBuiltInDefaultAnnotation = resolveQualifierBuiltInDefaultAnnotation(tannotation, z);
        if (agsqVarResolveQualifierBuiltInDefaultAnnotation != null) {
            return agsqVarResolveQualifierBuiltInDefaultAnnotation;
        }
        aezu aezuVarResolveTypeQualifierDefaultAnnotation = resolveTypeQualifierDefaultAnnotation(tannotation);
        if (aezuVarResolveTypeQualifierDefaultAnnotation != null) {
            Set set = (Set) aezuVarResolveTypeQualifierDefaultAnnotation.b;
            agtq agtqVarResolveJsr305CustomState = resolveJsr305CustomState(tannotation);
            Object obj = aezuVarResolveTypeQualifierDefaultAnnotation.a;
            if (agtqVarResolveJsr305CustomState == null) {
                agtqVarResolveJsr305CustomState = resolveJsr305AnnotationState(obj);
            }
            if (!agtqVarResolveJsr305CustomState.isIgnore() && (ahdfVarExtractNullability = extractNullability((agru<TAnnotation>) obj, (afec<? super agru<TAnnotation>, Boolean>) agrr.INSTANCE)) != null) {
                return new agsq(ahdf.copy$default(ahdfVarExtractNullability, null, z || agtqVarResolveJsr305CustomState.isWarning(), 1, null), set, false, false, false, 28, null);
            }
        }
        return null;
    }

    private static final boolean extractDefaultQualifiers$lambda$1(Object obj) {
        obj.getClass();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ahdf<ahas> extractMutability(TAnnotation tannotation) {
        ahas ahasVar;
        ahnf fqName = getFqName(tannotation);
        if (fqName == null) {
            return null;
        }
        if (agtj.getREAD_ONLY_ANNOTATIONS().contains(fqName)) {
            ahasVar = ahas.READ_ONLY;
        } else {
            if (!agtj.getMUTABLE_ANNOTATIONS().contains(fqName)) {
                return null;
            }
            ahasVar = ahas.MUTABLE;
        }
        agtq agtqVarInvoke = this.javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(fqName);
        if (agtqVarInvoke.isIgnore()) {
            return null;
        }
        if (!agtqVarInvoke.isWarning() || isK2()) {
            return new ahdf<>(ahasVar, agtqVarInvoke.isWarning());
        }
        return null;
    }

    private final ahdf<ahau> extractNullability(TAnnotation tannotation, afec<? super TAnnotation, Boolean> afecVar) {
        ahdf<ahau> ahdfVarKnownNullability;
        ahdf<ahau> ahdfVarKnownNullability2 = knownNullability(tannotation, afecVar.invoke(tannotation).booleanValue());
        if (ahdfVarKnownNullability2 != null) {
            return ahdfVarKnownNullability2;
        }
        TAnnotation tannotationResolveTypeQualifierAnnotation = resolveTypeQualifierAnnotation(tannotation);
        if (tannotationResolveTypeQualifierAnnotation != null) {
            agtq agtqVarResolveJsr305AnnotationState = resolveJsr305AnnotationState(tannotation);
            if (!agtqVarResolveJsr305AnnotationState.isIgnore() && (ahdfVarKnownNullability = knownNullability(tannotationResolveTypeQualifierAnnotation, afecVar.invoke(tannotationResolveTypeQualifierAnnotation).booleanValue())) != null) {
                return ahdf.copy$default(ahdfVarKnownNullability, null, agtqVarResolveJsr305AnnotationState.isWarning(), 1, null);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahdf extractNullability$lambda$2(agru agruVar, afec afecVar, Object obj) {
        obj.getClass();
        return agruVar.extractNullability((agru) obj, (afec<? super agru, Boolean>) afecVar);
    }

    private final <TQualifier> ahdf<TQualifier> extractQualifier(Iterable<? extends TAnnotation> iterable, afec<? super TAnnotation, ahdf<TQualifier>> afecVar) {
        Iterator<? extends TAnnotation> it = iterable.iterator();
        ahdf<TQualifier> ahdfVar = null;
        while (it.hasNext()) {
            ahdf<TQualifier> ahdfVarInvoke = afecVar.invoke(it.next());
            if (ahdfVar != null) {
                if (ahdfVarInvoke != null && !affa.f(ahdfVarInvoke, ahdfVar) && (!ahdfVarInvoke.isForWarningOnly() || ahdfVar.isForWarningOnly())) {
                    if (ahdfVarInvoke.isForWarningOnly() || !ahdfVar.isForWarningOnly()) {
                        return null;
                    }
                }
            }
            ahdfVar = ahdfVarInvoke;
        }
        return ahdfVar;
    }

    private final TAnnotation findAnnotation(TAnnotation tannotation, ahnf ahnfVar) {
        for (TAnnotation tannotation2 : getMetaAnnotations(tannotation)) {
            if (affa.f(getFqName(tannotation2), ahnfVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    private final boolean hasAnnotation(TAnnotation tannotation, ahnf ahnfVar) {
        Iterable<TAnnotation> metaAnnotations = getMetaAnnotations(tannotation);
        if ((metaAnnotations instanceof Collection) && ((Collection) metaAnnotations).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = metaAnnotations.iterator();
        while (it.hasNext()) {
            if (affa.f(getFqName(it.next()), ahnfVar)) {
                return true;
            }
        }
        return false;
    }

    private final ahdf<ahau> knownNullability(TAnnotation tannotation, boolean z) {
        ahau ahauVar;
        ahnf fqName = getFqName(tannotation);
        if (fqName == null) {
            return null;
        }
        agtq agtqVarInvoke = this.javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(fqName);
        if (agtqVarInvoke.isIgnore()) {
            return null;
        }
        if (agtj.getNOT_NULL_ANNOTATIONS().contains(fqName)) {
            ahauVar = ahau.NOT_NULL;
        } else if (agtj.getNULLABLE_ANNOTATIONS().contains(fqName)) {
            ahauVar = ahau.NULLABLE;
        } else if (agtj.getFORCE_FLEXIBILITY_ANNOTATIONS().contains(fqName)) {
            ahauVar = ahau.FORCE_FLEXIBILITY;
        } else {
            if (!affa.f(fqName, agtj.getJAVAX_NONNULL_ANNOTATION_FQ_NAME())) {
                return null;
            }
            String str = (String) woy.bG(enumArguments(tannotation, false));
            if (str != null) {
                switch (str.hashCode()) {
                    case 73135176:
                        if (!str.equals("MAYBE")) {
                            return null;
                        }
                        ahauVar = ahau.NULLABLE;
                        break;
                    case 74175084:
                        if (!str.equals("NEVER")) {
                            return null;
                        }
                        ahauVar = ahau.NULLABLE;
                        break;
                    case 433141802:
                        if (!str.equals("UNKNOWN")) {
                            return null;
                        }
                        ahauVar = ahau.FORCE_FLEXIBILITY;
                        break;
                    case 1933739535:
                        if (!str.equals("ALWAYS")) {
                            return null;
                        }
                        ahauVar = ahau.NOT_NULL;
                        break;
                    default:
                        return null;
                }
            } else {
                ahauVar = ahau.NOT_NULL;
            }
        }
        return new ahdf<>(ahauVar, agtqVarInvoke.isWarning() || z);
    }

    private final agtq resolveDefaultAnnotationState(TAnnotation tannotation) {
        ahnf fqName = getFqName(tannotation);
        return (fqName == null || !agsr.getJSPECIFY_DEFAULT_ANNOTATIONS().containsKey(fqName)) ? resolveJsr305AnnotationState(tannotation) : this.javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(fqName);
    }

    private final agtq resolveJsr305AnnotationState(TAnnotation tannotation) {
        agtq agtqVarResolveJsr305CustomState = resolveJsr305CustomState(tannotation);
        return agtqVarResolveJsr305CustomState != null ? agtqVarResolveJsr305CustomState : this.javaTypeEnhancementState.getJsr305().getGlobalLevel();
    }

    private final agtq resolveJsr305CustomState(TAnnotation tannotation) {
        Iterable<String> iterableEnumArguments;
        String str;
        agtq agtqVar = this.javaTypeEnhancementState.getJsr305().getUserDefinedLevelForSpecificAnnotation().get(getFqName(tannotation));
        if (agtqVar != null) {
            return agtqVar;
        }
        TAnnotation tannotationFindAnnotation = findAnnotation(tannotation, agtj.getUNDER_MIGRATION_ANNOTATION_FQ_NAME());
        if (tannotationFindAnnotation == null || (iterableEnumArguments = enumArguments(tannotationFindAnnotation, false)) == null || (str = (String) woy.bG(iterableEnumArguments)) == null) {
            return null;
        }
        agtq migrationLevel = this.javaTypeEnhancementState.getJsr305().getMigrationLevel();
        if (migrationLevel != null) {
            return migrationLevel;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return agtq.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return agtq.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return agtq.WARN;
        }
        return null;
    }

    private final agsq resolveQualifierBuiltInDefaultAnnotation(TAnnotation tannotation, boolean z) {
        agsq agsqVar;
        if (this.javaTypeEnhancementState.getDisabledDefaultAnnotations() || (agsqVar = agsr.getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS().get(getFqName(tannotation))) == null) {
            return null;
        }
        agtq agtqVarResolveDefaultAnnotationState = resolveDefaultAnnotationState(tannotation);
        if (agtqVarResolveDefaultAnnotationState == agtq.IGNORE) {
            agtqVarResolveDefaultAnnotationState = null;
        }
        if (agtqVarResolveDefaultAnnotationState == null) {
            return null;
        }
        return agsq.copy$default(agsqVar, ahdf.copy$default(agsqVar.getNullabilityQualifier(), null, z || agtqVarResolveDefaultAnnotationState.isWarning(), 1, null), null, false, false, false, 30, null);
    }

    private final aezu<TAnnotation, Set<agrv>> resolveTypeQualifierDefaultAnnotation(TAnnotation tannotation) {
        TAnnotation tannotationFindAnnotation;
        TAnnotation next;
        if (!this.javaTypeEnhancementState.getJsr305().isDisabled() && (tannotationFindAnnotation = findAnnotation(tannotation, agtj.getJAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME())) != null) {
            Iterator<TAnnotation> it = getMetaAnnotations(tannotation).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (resolveTypeQualifierAnnotation(next) != null) {
                    break;
                }
            }
            if (next != null) {
                Iterable<String> iterableEnumArguments = enumArguments(tannotationFindAnnotation, true);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<String> it2 = iterableEnumArguments.iterator();
                while (it2.hasNext()) {
                    agrv agrvVar = JAVA_APPLICABILITY_TYPES.get(it2.next());
                    if (agrvVar != null) {
                        linkedHashSet.add(agrvVar);
                    }
                }
                return new aezu<>(next, allIfTypeUse(linkedHashSet));
            }
        }
        return null;
    }

    protected abstract Iterable<String> enumArguments(TAnnotation tannotation, boolean z);

    public final agte extractAndMergeDefaultQualifiers(agte agteVar, Iterable<? extends TAnnotation> iterable, boolean z) {
        EnumMap<agrv, agsq> defaultQualifiers;
        iterable.getClass();
        if (!this.javaTypeEnhancementState.getDisabledDefaultAnnotations()) {
            ArrayList<agsq> arrayList = new ArrayList();
            Iterator<? extends TAnnotation> it = iterable.iterator();
            while (it.hasNext()) {
                agsq agsqVarExtractDefaultQualifiers = extractDefaultQualifiers(it.next(), z);
                if (agsqVarExtractDefaultQualifiers != null) {
                    arrayList.add(agsqVarExtractDefaultQualifiers);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(agrv.class);
                for (agsq agsqVar : arrayList) {
                    for (agrv agrvVar : agsqVar.getQualifierApplicabilityTypes()) {
                        if (enumMap.containsKey(agrvVar) && isK2()) {
                            agsq agsqVar2 = (agsq) enumMap.get(agrvVar);
                            if (agsqVar2 != null) {
                                ahdf<ahau> nullabilityQualifier = agsqVar2.getNullabilityQualifier();
                                ahdf<ahau> nullabilityQualifier2 = agsqVar.getNullabilityQualifier();
                                if (!affa.f(nullabilityQualifier2, nullabilityQualifier) && (!nullabilityQualifier2.isForWarningOnly() || nullabilityQualifier.isForWarningOnly())) {
                                    agsqVar2 = (nullabilityQualifier2.isForWarningOnly() || !nullabilityQualifier.isForWarningOnly()) ? null : agsqVar;
                                }
                                enumMap.put((EnumMap) agrvVar, (agrv) agsqVar2);
                            }
                        } else {
                            enumMap.put((EnumMap) agrvVar, (agrv) agsqVar);
                        }
                    }
                }
                EnumMap enumMap2 = (agteVar == null || (defaultQualifiers = agteVar.getDefaultQualifiers()) == null) ? new EnumMap(agrv.class) : new EnumMap((EnumMap) defaultQualifiers);
                boolean z2 = false;
                for (Map.Entry entry : enumMap.entrySet()) {
                    agrv agrvVar2 = (agrv) entry.getKey();
                    agsq agsqVar3 = (agsq) entry.getValue();
                    if (agsqVar3 != null) {
                        enumMap2.put((EnumMap) agrvVar2, (agrv) agsqVar3);
                        z2 = true;
                    }
                }
                if (z2) {
                    return new agte(enumMap2);
                }
            }
        }
        return agteVar;
    }

    protected abstract ahnf getFqName(TAnnotation tannotation);

    protected abstract Object getKey(TAnnotation tannotation);

    protected abstract Iterable<TAnnotation> getMetaAnnotations(TAnnotation tannotation);

    public abstract boolean isK2();

    public final boolean isTypeUseAnnotation(TAnnotation tannotation) {
        tannotation.getClass();
        TAnnotation tannotationFindAnnotation = findAnnotation(tannotation, afyn.target);
        if (tannotationFindAnnotation == null) {
            return false;
        }
        Iterable<String> iterableEnumArguments = enumArguments(tannotationFindAnnotation, false);
        if ((iterableEnumArguments instanceof Collection) && ((Collection) iterableEnumArguments).isEmpty()) {
            return false;
        }
        Iterator<String> it = iterableEnumArguments.iterator();
        while (it.hasNext()) {
            if (affa.f(it.next(), "TYPE")) {
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
        if (woy.cn(agtj.getBUILT_IN_TYPE_QUALIFIER_ANNOTATIONS(), getFqName(tannotation)) || hasAnnotation(tannotation, agtj.getJAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME())) {
            return tannotation;
        }
        if (!hasAnnotation(tannotation, agtj.getJAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.resolvedNicknames;
        Object key = getKey(tannotation);
        TAnnotation tannotationResolveTypeQualifierAnnotation = concurrentHashMap.get(key);
        if (tannotationResolveTypeQualifierAnnotation == null) {
            Iterator<TAnnotation> it = getMetaAnnotations(tannotation).iterator();
            while (true) {
                if (!it.hasNext()) {
                    tannotationResolveTypeQualifierAnnotation = null;
                    break;
                }
                tannotationResolveTypeQualifierAnnotation = resolveTypeQualifierAnnotation(it.next());
                if (tannotationResolveTypeQualifierAnnotation != null) {
                    break;
                }
            }
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

    public final ahdf<ahau> extractNullability(Iterable<? extends TAnnotation> iterable, afec<? super TAnnotation, Boolean> afecVar) {
        iterable.getClass();
        afecVar.getClass();
        return extractQualifier(iterable, new agrq(this, afecVar));
    }

    public final ahdf<ahas> extractMutability(Iterable<? extends TAnnotation> iterable) {
        iterable.getClass();
        return extractQualifier(iterable, new agrt(this));
    }
}
