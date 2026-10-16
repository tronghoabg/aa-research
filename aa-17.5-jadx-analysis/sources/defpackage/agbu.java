package defpackage;

/* loaded from: classes3.dex */
final class agbu extends agbn {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "from";
        } else if (i == 2) {
            objArr[0] = "whatDeclaration";
        } else if (i != 3) {
            objArr[0] = "what";
        } else {
            objArr[0] = "fromClass";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
        if (i == 2 || i == 3) {
            objArr[2] = "doesReceiverFitForProtectedVisibility";
        } else {
            objArr[2] = "isVisible";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public agbu(agey ageyVar) {
        super(ageyVar);
    }

    private boolean doesReceiverFitForProtectedVisibility(ahya ahyaVar, agbm agbmVar, agba agbaVar) {
        if (agbmVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agbaVar == null) {
            $$$reportNull$$$0(3);
        }
        if (ahyaVar == agcb.FALSE_IF_PROTECTED) {
            return false;
        }
        if (!(agbmVar instanceof agax) || (agbmVar instanceof agbh) || ahyaVar == agcb.ALWAYS_SUITABLE_RECEIVER) {
            return true;
        }
        if (ahyaVar == agcb.IRRELEVANT_RECEIVER || ahyaVar == null) {
            return false;
        }
        aigl thisType = ahyaVar instanceof ahyb ? ((ahyb) ahyaVar).getThisType() : ahyaVar.getType();
        return ahst.isSubtypeOfClass(thisType, agbaVar) || aifw.isDynamic(thisType);
    }

    @Override // defpackage.agcc
    public boolean isVisible(ahya ahyaVar, agbm agbmVar, agbi agbiVar, boolean z) {
        agba agbaVar;
        if (agbmVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agbiVar == null) {
            $$$reportNull$$$0(1);
        }
        agba agbaVar2 = (agba) ahst.getParentOfType(agbmVar, agba.class);
        agba agbaVar3 = (agba) ahst.getParentOfType(agbiVar, agba.class, false);
        if (agbaVar3 == null) {
            return false;
        }
        if (agbaVar2 != null && ahst.isCompanionObject(agbaVar2) && (agbaVar = (agba) ahst.getParentOfType(agbaVar2, agba.class)) != null && ahst.isSubclass(agbaVar3, agbaVar)) {
            return true;
        }
        agbm agbmVarUnwrapFakeOverrideToAnyDeclaration = ahst.unwrapFakeOverrideToAnyDeclaration(agbmVar);
        agba agbaVar4 = (agba) ahst.getParentOfType(agbmVarUnwrapFakeOverrideToAnyDeclaration, agba.class);
        if (agbaVar4 == null) {
            return false;
        }
        if (ahst.isSubclass(agbaVar3, agbaVar4) && doesReceiverFitForProtectedVisibility(ahyaVar, agbmVarUnwrapFakeOverrideToAnyDeclaration, agbaVar3)) {
            return true;
        }
        return isVisible(ahyaVar, agbmVar, agbaVar3.getContainingDeclaration(), z);
    }
}
