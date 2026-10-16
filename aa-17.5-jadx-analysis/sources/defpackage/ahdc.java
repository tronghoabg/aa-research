package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahdc {
    private static final ahal ENHANCED_MUTABILITY_ANNOTATIONS;
    private static final agfk ENHANCED_NULLABILITY_ANNOTATIONS;

    static {
        ahnf ahnfVar = agti.ENHANCED_NULLABILITY_ANNOTATION;
        ahnfVar.getClass();
        ENHANCED_NULLABILITY_ANNOTATIONS = new ahal(ahnfVar);
        ahnf ahnfVar2 = agti.ENHANCED_MUTABILITY_ANNOTATION;
        ahnfVar2.getClass();
        ENHANCED_MUTABILITY_ANNOTATIONS = new ahal(ahnfVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agfk compositeAnnotationsOrSingle(List<? extends agfk> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new agfr((List<? extends agfk>) woy.cf(list)) : (agfk) woy.bN(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agbd enhanceMutability(agbd agbdVar, ahar aharVar, ahcz ahczVar) {
        afzr afzrVar = afzr.INSTANCE;
        if (!ahda.shouldEnhance(ahczVar) || !(agbdVar instanceof agba)) {
            return null;
        }
        if (aharVar.getMutability() == ahas.READ_ONLY && ahczVar == ahcz.FLEXIBLE_LOWER) {
            agba agbaVar = (agba) agbdVar;
            if (afzrVar.isMutable(agbaVar)) {
                return afzrVar.convertMutableToReadOnly(agbaVar);
            }
        }
        if (aharVar.getMutability() != ahas.MUTABLE || ahczVar != ahcz.FLEXIBLE_UPPER) {
            return null;
        }
        agba agbaVar2 = (agba) agbdVar;
        if (afzrVar.isReadOnly(agbaVar2)) {
            return afzrVar.convertReadOnlyToMutable(agbaVar2);
        }
        return null;
    }

    public static final agfk getENHANCED_NULLABILITY_ANNOTATIONS() {
        return ENHANCED_NULLABILITY_ANNOTATIONS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean getEnhancedNullability(ahar aharVar, ahcz ahczVar) {
        ahau nullability;
        if (!ahda.shouldEnhance(ahczVar) || (nullability = aharVar.getNullability()) == null) {
            return null;
        }
        int iOrdinal = nullability.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? null : false;
        }
        return true;
    }

    public static final boolean hasEnhancedNullability(aigl aiglVar) {
        aiglVar.getClass();
        return ahdd.hasEnhancedNullability(aikj.INSTANCE, aiglVar);
    }
}
