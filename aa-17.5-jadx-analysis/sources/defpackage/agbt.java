package defpackage;

/* loaded from: classes3.dex */
final class agbt extends agbn {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public agbt(agey ageyVar) {
        super(ageyVar);
    }

    @Override // defpackage.agcc
    public boolean isVisible(ahya ahyaVar, agbm agbmVar, agbi agbiVar, boolean z) {
        agbi parentOfType;
        if (agbmVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agbiVar == null) {
            $$$reportNull$$$0(1);
        }
        if (!agcb.PRIVATE.isVisible(ahyaVar, agbmVar, agbiVar, z)) {
            return false;
        }
        if (ahyaVar == agcb.ALWAYS_SUITABLE_RECEIVER) {
            return true;
        }
        if (ahyaVar == agcb.IRRELEVANT_RECEIVER || (parentOfType = ahst.getParentOfType(agbmVar, agba.class)) == null || !(ahyaVar instanceof ahxy)) {
            return false;
        }
        return ((ahxy) ahyaVar).getClassDescriptor().getOriginal().equals(parentOfType.getOriginal());
    }
}
