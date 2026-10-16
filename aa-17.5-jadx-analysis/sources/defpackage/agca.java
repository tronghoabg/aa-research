package defpackage;

/* loaded from: classes3.dex */
final class agca extends agbn {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public agca(agey ageyVar) {
        super(ageyVar);
    }

    @Override // defpackage.agcc
    public boolean isVisible(ahya ahyaVar, agbm agbmVar, agbi agbiVar, boolean z) {
        if (agbmVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agbiVar == null) {
            $$$reportNull$$$0(1);
        }
        return false;
    }
}
