package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ahdd {
    public static final ahar computeQualifiersForOverride(ahar aharVar, Collection<ahar> collection, boolean z, boolean z2, boolean z3) {
        ahau ahauVarSelect;
        boolean z4;
        ahas ahasVar;
        aharVar.getClass();
        collection.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ahau nullabilityForErrors = getNullabilityForErrors((ahar) it.next());
            if (nullabilityForErrors != null) {
                arrayList.add(nullabilityForErrors);
            }
        }
        ahau ahauVarSelect2 = select(woy.cl(arrayList), getNullabilityForErrors(aharVar), z);
        if (ahauVarSelect2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                ahau nullability = ((ahar) it2.next()).getNullability();
                if (nullability != null) {
                    arrayList2.add(nullability);
                }
            }
            ahauVarSelect = select(woy.cl(arrayList2), aharVar.getNullability(), z);
        } else {
            ahauVarSelect = ahauVarSelect2;
        }
        ahau ahauVar = (ahauVarSelect == null || z3 || (z2 && ahauVarSelect == ahau.NULLABLE)) ? null : ahauVarSelect;
        boolean z5 = ahauVar != null && ahauVarSelect2 == null;
        if (ahauVar == ahau.NOT_NULL) {
            if (!isDefinitelyNotNullAndSameSeverity(aharVar, z5)) {
                if (!collection.isEmpty()) {
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        if (isDefinitelyNotNullAndSameSeverity((ahar) it3.next(), z5)) {
                        }
                    }
                }
                z4 = false;
            }
            z4 = true;
            break;
        }
        z4 = false;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it4 = collection.iterator();
        while (it4.hasNext()) {
            ahas mutabilityForErrors = getMutabilityForErrors((ahar) it4.next());
            if (mutabilityForErrors != null) {
                arrayList3.add(mutabilityForErrors);
            }
        }
        ahas ahasVar2 = (ahas) select(woy.cl(arrayList3), ahas.MUTABLE, ahas.READ_ONLY, getMutabilityForErrors(aharVar), z);
        if (ahasVar2 == null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it5 = collection.iterator();
            while (it5.hasNext()) {
                ahas mutability = ((ahar) it5.next()).getMutability();
                if (mutability != null) {
                    arrayList4.add(mutability);
                }
            }
            ahasVar = (ahas) select(woy.cl(arrayList4), ahas.MUTABLE, ahas.READ_ONLY, aharVar.getMutability(), z);
        } else {
            ahasVar = ahasVar2;
        }
        return new ahar(ahauVar, ahasVar, z4, z5, ahasVar != null && ahasVar2 == null);
    }

    private static final ahas getMutabilityForErrors(ahar aharVar) {
        if (aharVar.isMutabilityQualifierForWarning()) {
            return null;
        }
        return aharVar.getMutability();
    }

    private static final ahau getNullabilityForErrors(ahar aharVar) {
        if (aharVar.isNullabilityQualifierForWarning()) {
            return null;
        }
        return aharVar.getNullability();
    }

    public static final boolean hasEnhancedNullability(aiiz aiizVar, ailw ailwVar) {
        aiizVar.getClass();
        ailwVar.getClass();
        ahnf ahnfVar = agti.ENHANCED_NULLABILITY_ANNOTATION;
        ahnfVar.getClass();
        return aiizVar.hasAnnotation(ailwVar, ahnfVar);
    }

    private static final boolean isDefinitelyNotNullAndSameSeverity(ahar aharVar, boolean z) {
        return aharVar.isNullabilityQualifierForWarning() == z && aharVar.getDefinitelyNotNull();
    }

    private static final <T> T select(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        if (!z) {
            if (t3 != null) {
                set = woy.cl(woy.aT(set, t3));
            }
            return (T) woy.bO(set);
        }
        T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
        if (affa.f(t4, t) && affa.f(t3, t2)) {
            return null;
        }
        return t3 == null ? t4 : t3;
    }

    private static final ahau select(Set<? extends ahau> set, ahau ahauVar, boolean z) {
        ahau ahauVar2 = ahau.FORCE_FLEXIBILITY;
        return ahauVar == ahauVar2 ? ahauVar2 : (ahau) select(set, ahau.NOT_NULL, ahau.NULLABLE, ahauVar, z);
    }
}
