package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agdh {
    static /* synthetic */ int accessor$FindClassInModuleKt$lambda0(defpackage.ahod ahodVar) {
        findNonGenericClassAcrossDependencies$lambda$0(ahodVar);
        return 0;
    }

    public static final defpackage.agca findClassAcrossModuleDependencies(defpackage.agdu agduVar, defpackage.ahod ahodVar) {
        agduVar.getClass();
        ahodVar.getClass();
        defpackage.agcd agcdVarFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(agduVar, ahodVar);
        if (agcdVarFindClassifierAcrossModuleDependencies instanceof defpackage.agca) {
            return (defpackage.agca) agcdVarFindClassifierAcrossModuleDependencies;
        }
        return null;
    }

    public static final defpackage.agcd findClassifierAcrossModuleDependencies(defpackage.agdu agduVar, defpackage.ahod ahodVar) {
        agduVar.getClass();
        ahodVar.getClass();
        defpackage.agdu resolutionAnchorIfAny = defpackage.ahuo.getResolutionAnchorIfAny(agduVar);
        if (resolutionAnchorIfAny == null) {
            defpackage.agej agejVar = agduVar.getPackage(ahodVar.getPackageFqName());
            java.util.List<defpackage.ahoj> listPathSegments = ahodVar.getRelativeClassName().pathSegments();
            defpackage.agcd contributedClassifier = agejVar.getMemberScope().getContributedClassifier((defpackage.ahoj) defpackage.afga.az(listPathSegments), defpackage.agmr.FROM_DESERIALIZATION);
            if (contributedClassifier == null) {
                return null;
            }
            for (defpackage.ahoj ahojVar : listPathSegments.subList(1, listPathSegments.size())) {
                if (!(contributedClassifier instanceof defpackage.agca)) {
                    return null;
                }
                defpackage.agcd contributedClassifier2 = ((defpackage.agca) contributedClassifier).getUnsubstitutedInnerClassesScope().getContributedClassifier(ahojVar, defpackage.agmr.FROM_DESERIALIZATION);
                contributedClassifier = contributedClassifier2 instanceof defpackage.agca ? (defpackage.agca) contributedClassifier2 : null;
                if (contributedClassifier == null) {
                    return null;
                }
            }
            return contributedClassifier;
        }
        defpackage.agej agejVar2 = resolutionAnchorIfAny.getPackage(ahodVar.getPackageFqName());
        java.util.List<defpackage.ahoj> listPathSegments2 = ahodVar.getRelativeClassName().pathSegments();
        defpackage.agcd contributedClassifier3 = agejVar2.getMemberScope().getContributedClassifier((defpackage.ahoj) defpackage.afga.az(listPathSegments2), defpackage.agmr.FROM_DESERIALIZATION);
        if (contributedClassifier3 == null) {
            contributedClassifier3 = null;
            break;
        }
        for (defpackage.ahoj ahojVar2 : listPathSegments2.subList(1, listPathSegments2.size())) {
            if (contributedClassifier3 instanceof defpackage.agca) {
                defpackage.agcd contributedClassifier4 = ((defpackage.agca) contributedClassifier3).getUnsubstitutedInnerClassesScope().getContributedClassifier(ahojVar2, defpackage.agmr.FROM_DESERIALIZATION);
                contributedClassifier3 = contributedClassifier4 instanceof defpackage.agca ? (defpackage.agca) contributedClassifier4 : null;
                if (contributedClassifier3 == null) {
                }
            }
            contributedClassifier3 = null;
        }
        if (contributedClassifier3 != null) {
            return contributedClassifier3;
        }
        defpackage.agej agejVar3 = agduVar.getPackage(ahodVar.getPackageFqName());
        java.util.List<defpackage.ahoj> listPathSegments3 = ahodVar.getRelativeClassName().pathSegments();
        defpackage.agcd contributedClassifier5 = agejVar3.getMemberScope().getContributedClassifier((defpackage.ahoj) defpackage.afga.az(listPathSegments3), defpackage.agmr.FROM_DESERIALIZATION);
        if (contributedClassifier5 == null) {
            return null;
        }
        for (defpackage.ahoj ahojVar3 : listPathSegments3.subList(1, listPathSegments3.size())) {
            if (!(contributedClassifier5 instanceof defpackage.agca)) {
                return null;
            }
            defpackage.agcd contributedClassifier6 = ((defpackage.agca) contributedClassifier5).getUnsubstitutedInnerClassesScope().getContributedClassifier(ahojVar3, defpackage.agmr.FROM_DESERIALIZATION);
            contributedClassifier5 = contributedClassifier6 instanceof defpackage.agca ? (defpackage.agca) contributedClassifier6 : null;
            if (contributedClassifier5 == null) {
                return null;
            }
        }
        return contributedClassifier5;
    }

    public static final defpackage.agca findNonGenericClassAcrossDependencies(defpackage.agdu agduVar, defpackage.ahod ahodVar, defpackage.ageb agebVar) {
        agduVar.getClass();
        ahodVar.getClass();
        agebVar.getClass();
        defpackage.agca agcaVarFindClassAcrossModuleDependencies = findClassAcrossModuleDependencies(agduVar, ahodVar);
        return agcaVarFindClassAcrossModuleDependencies != null ? agcaVarFindClassAcrossModuleDependencies : agebVar.getClass(ahodVar, defpackage.afsg.j(defpackage.afsg.q(defpackage.afsg.f(ahodVar, new defpackage.afgn() { // from class: agdg
            @Override // defpackage.afgn, defpackage.afix
            public java.lang.Object get(java.lang.Object obj) {
                return ((defpackage.ahod) obj).getOuterClassId();
            }
        }), defpackage.agdf.INSTANCE)));
    }

    private static final int findNonGenericClassAcrossDependencies$lambda$0(defpackage.ahod ahodVar) {
        ahodVar.getClass();
        return 0;
    }

    public static final defpackage.agfd findTypeAliasAcrossModuleDependencies(defpackage.agdu agduVar, defpackage.ahod ahodVar) {
        agduVar.getClass();
        ahodVar.getClass();
        defpackage.agcd agcdVarFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(agduVar, ahodVar);
        if (agcdVarFindClassifierAcrossModuleDependencies instanceof defpackage.agfd) {
            return (defpackage.agfd) agcdVarFindClassifierAcrossModuleDependencies;
        }
        return null;
    }
}
