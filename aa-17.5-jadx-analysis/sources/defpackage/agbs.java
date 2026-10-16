package defpackage;

/* loaded from: classes3.dex */
final class agbs extends agbn {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "what";
        } else if (i != 2) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
        if (i == 1 || i == 2) {
            objArr[2] = "isVisible";
        } else {
            objArr[2] = "hasContainingSourceFile";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public agbs(agey ageyVar) {
        super(ageyVar);
    }

    private boolean hasContainingSourceFile(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(0);
        }
        return ahst.getContainingSourceFile(agbiVar) != agdz.NO_SOURCE_FILE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [agbi, agbm] */
    /* JADX WARN: Type inference failed for: r3v1, types: [agbi] */
    /* JADX WARN: Type inference failed for: r3v2, types: [agbi] */
    /* JADX WARN: Type inference failed for: r3v4, types: [agbi] */
    @Override // defpackage.agcc
    public boolean isVisible(ahya ahyaVar, agbm agbmVar, agbi agbiVar, boolean z) {
        if (agbmVar == 0) {
            $$$reportNull$$$0(1);
        }
        if (agbiVar == null) {
            $$$reportNull$$$0(2);
        }
        if (ahst.isTopLevelDeclaration(agbmVar) && hasContainingSourceFile(agbiVar)) {
            return agcb.inSameFile(agbmVar, agbiVar);
        }
        if (agbmVar instanceof agbh) {
            agbe containingDeclaration = ((agbh) agbmVar).getContainingDeclaration();
            if (z && ahst.isSealedClass(containingDeclaration) && ahst.isTopLevelDeclaration(containingDeclaration) && (agbiVar instanceof agbh) && ahst.isTopLevelDeclaration(agbiVar.getContainingDeclaration()) && agcb.inSameFile(agbmVar, agbiVar)) {
                return true;
            }
        }
        while (agbmVar != 0) {
            agbmVar = agbmVar.getContainingDeclaration();
            if (((agbmVar instanceof agba) && !ahst.isCompanionObject(agbmVar)) || (agbmVar instanceof agdc)) {
                break;
            }
        }
        if (agbmVar != 0) {
            while (agbiVar != null) {
                if (agbmVar == agbiVar) {
                    return true;
                }
                if (agbiVar instanceof agdc) {
                    return (agbmVar instanceof agdc) && agbmVar.getFqName().equals(((agdc) agbiVar).getFqName()) && ahst.areInSameModule(agbiVar, agbmVar);
                }
                agbiVar = agbiVar.getContainingDeclaration();
            }
        }
        return false;
    }
}
