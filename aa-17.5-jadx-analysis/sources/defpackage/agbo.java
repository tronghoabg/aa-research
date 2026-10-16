package defpackage;

/* loaded from: classes3.dex */
public final class agbo {
    public static final agbd getTopLevelContainingClassifier(agbi agbiVar) {
        agbiVar.getClass();
        agbi containingDeclaration = agbiVar.getContainingDeclaration();
        if (containingDeclaration == null || (agbiVar instanceof agdc)) {
            return null;
        }
        if (!isTopLevelInPackage(containingDeclaration)) {
            return getTopLevelContainingClassifier(containingDeclaration);
        }
        if (containingDeclaration instanceof agbd) {
            return (agbd) containingDeclaration;
        }
        return null;
    }

    public static final boolean isTopLevelInPackage(agbi agbiVar) {
        agbiVar.getClass();
        return agbiVar.getContainingDeclaration() instanceof agdc;
    }

    public static final boolean isTypedEqualsInValueClass(agcj agcjVar) {
        aigw defaultType;
        agcjVar.getClass();
        agbi containingDeclaration = agcjVar.getContainingDeclaration();
        agba agbaVar = containingDeclaration instanceof agba ? (agba) containingDeclaration : null;
        if (agbaVar != null) {
            agba agbaVar2 = true == ahsw.isValueClass(agbaVar) ? agbaVar : null;
            if (agbaVar2 != null && (defaultType = agbaVar2.getDefaultType()) != null) {
                aigl aiglVarReplaceArgumentsWithStarProjections = aimr.replaceArgumentsWithStarProjections(defaultType);
                aigl returnType = agcjVar.getReturnType();
                if (returnType != null && affa.f(agcjVar.getName(), aiof.EQUALS) && ((aimr.isBoolean(returnType) || aimr.isNothing(returnType)) && agcjVar.getValueParameters().size() == 1)) {
                    aigl type = agcjVar.getValueParameters().get(0).getType();
                    type.getClass();
                    if (affa.f(aimr.replaceArgumentsWithStarProjections(type), aiglVarReplaceArgumentsWithStarProjections) && agcjVar.getContextReceiverParameters().isEmpty() && agcjVar.getExtensionReceiverParameter() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final agba resolveClassByFqName(agcu agcuVar, ahnf ahnfVar, aglo agloVar) {
        ahxe unsubstitutedInnerClassesScope;
        agcuVar.getClass();
        ahnfVar.getClass();
        agloVar.getClass();
        if (!ahnfVar.isRoot()) {
            agbd contributedClassifier = agcuVar.getPackage(ahnfVar.parent()).getMemberScope().getContributedClassifier(ahnfVar.shortName(), agloVar);
            agba agbaVar = contributedClassifier instanceof agba ? (agba) contributedClassifier : null;
            if (agbaVar != null) {
                return agbaVar;
            }
            agba agbaVarResolveClassByFqName = resolveClassByFqName(agcuVar, ahnfVar.parent(), agloVar);
            agbd contributedClassifier2 = (agbaVarResolveClassByFqName == null || (unsubstitutedInnerClassesScope = agbaVarResolveClassByFqName.getUnsubstitutedInnerClassesScope()) == null) ? null : unsubstitutedInnerClassesScope.getContributedClassifier(ahnfVar.shortName(), agloVar);
            if (contributedClassifier2 instanceof agba) {
                return (agba) contributedClassifier2;
            }
        }
        return null;
    }
}
