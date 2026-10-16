package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class agch {
    static /* synthetic */ int accessor$FindClassInModuleKt$lambda0(ahnd ahndVar) {
        findNonGenericClassAcrossDependencies$lambda$0(ahndVar);
        return 0;
    }

    public static final agba findClassAcrossModuleDependencies(agcu agcuVar, ahnd ahndVar) {
        agcuVar.getClass();
        ahndVar.getClass();
        agbd agbdVarFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(agcuVar, ahndVar);
        if (agbdVarFindClassifierAcrossModuleDependencies instanceof agba) {
            return (agba) agbdVarFindClassifierAcrossModuleDependencies;
        }
        return null;
    }

    public static final agbd findClassifierAcrossModuleDependencies(agcu agcuVar, ahnd ahndVar) {
        agcuVar.getClass();
        ahndVar.getClass();
        agcu resolutionAnchorIfAny = ahto.getResolutionAnchorIfAny(agcuVar);
        if (resolutionAnchorIfAny == null) {
            agdj agdjVar = agcuVar.getPackage(ahndVar.getPackageFqName());
            List<ahnj> listPathSegments = ahndVar.getRelativeClassName().pathSegments();
            agbd contributedClassifier = agdjVar.getMemberScope().getContributedClassifier((ahnj) woy.bF(listPathSegments), aglr.FROM_DESERIALIZATION);
            if (contributedClassifier == null) {
                return null;
            }
            for (ahnj ahnjVar : listPathSegments.subList(1, listPathSegments.size())) {
                if (!(contributedClassifier instanceof agba)) {
                    return null;
                }
                agbd contributedClassifier2 = ((agba) contributedClassifier).getUnsubstitutedInnerClassesScope().getContributedClassifier(ahnjVar, aglr.FROM_DESERIALIZATION);
                contributedClassifier = contributedClassifier2 instanceof agba ? (agba) contributedClassifier2 : null;
                if (contributedClassifier == null) {
                    return null;
                }
            }
            return contributedClassifier;
        }
        agdj agdjVar2 = resolutionAnchorIfAny.getPackage(ahndVar.getPackageFqName());
        List<ahnj> listPathSegments2 = ahndVar.getRelativeClassName().pathSegments();
        agbd contributedClassifier3 = agdjVar2.getMemberScope().getContributedClassifier((ahnj) woy.bF(listPathSegments2), aglr.FROM_DESERIALIZATION);
        if (contributedClassifier3 == null) {
            contributedClassifier3 = null;
            break;
        }
        for (ahnj ahnjVar2 : listPathSegments2.subList(1, listPathSegments2.size())) {
            if (contributedClassifier3 instanceof agba) {
                agbd contributedClassifier4 = ((agba) contributedClassifier3).getUnsubstitutedInnerClassesScope().getContributedClassifier(ahnjVar2, aglr.FROM_DESERIALIZATION);
                contributedClassifier3 = contributedClassifier4 instanceof agba ? (agba) contributedClassifier4 : null;
                if (contributedClassifier3 == null) {
                }
            }
            contributedClassifier3 = null;
        }
        if (contributedClassifier3 != null) {
            return contributedClassifier3;
        }
        agdj agdjVar3 = agcuVar.getPackage(ahndVar.getPackageFqName());
        List<ahnj> listPathSegments3 = ahndVar.getRelativeClassName().pathSegments();
        agbd contributedClassifier5 = agdjVar3.getMemberScope().getContributedClassifier((ahnj) woy.bF(listPathSegments3), aglr.FROM_DESERIALIZATION);
        if (contributedClassifier5 == null) {
            return null;
        }
        for (ahnj ahnjVar3 : listPathSegments3.subList(1, listPathSegments3.size())) {
            if (!(contributedClassifier5 instanceof agba)) {
                return null;
            }
            agbd contributedClassifier6 = ((agba) contributedClassifier5).getUnsubstitutedInnerClassesScope().getContributedClassifier(ahnjVar3, aglr.FROM_DESERIALIZATION);
            contributedClassifier5 = contributedClassifier6 instanceof agba ? (agba) contributedClassifier6 : null;
            if (contributedClassifier5 == null) {
                return null;
            }
        }
        return contributedClassifier5;
    }

    public static final agba findNonGenericClassAcrossDependencies(agcu agcuVar, ahnd ahndVar, agdb agdbVar) {
        agcuVar.getClass();
        ahndVar.getClass();
        agdbVar.getClass();
        agba agbaVarFindClassAcrossModuleDependencies = findClassAcrossModuleDependencies(agcuVar, ahndVar);
        return agbaVarFindClassAcrossModuleDependencies != null ? agbaVarFindClassAcrossModuleDependencies : agdbVar.getClass(ahndVar, afrg.j(afrg.q(afrg.f(ahndVar, new affn() { // from class: agcg
            @Override // defpackage.affn, defpackage.afhx
            public Object get(Object obj) {
                return ((ahnd) obj).getOuterClassId();
            }
        }), agcf.INSTANCE)));
    }

    private static final int findNonGenericClassAcrossDependencies$lambda$0(ahnd ahndVar) {
        ahndVar.getClass();
        return 0;
    }

    public static final aged findTypeAliasAcrossModuleDependencies(agcu agcuVar, ahnd ahndVar) {
        agcuVar.getClass();
        ahndVar.getClass();
        agbd agbdVarFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(agcuVar, ahndVar);
        if (agbdVarFindClassifierAcrossModuleDependencies instanceof aged) {
            return (aged) agbdVarFindClassifierAcrossModuleDependencies;
        }
        return null;
    }
}
