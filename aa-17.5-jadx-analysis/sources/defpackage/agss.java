package defpackage;

/* loaded from: classes3.dex */
final class agss extends agbn {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "from";
        } else if (i == 2) {
            objArr[0] = "fromPackage";
        } else if (i != 3) {
            objArr[0] = "what";
        } else {
            objArr[0] = "myPackage";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
        if (i == 2 || i == 3) {
            objArr[2] = "visibleFromPackage";
        } else {
            objArr[2] = "isVisible";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public agss(agey ageyVar) {
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
        return agsv.areInSamePackage(agbmVar, agbiVar);
    }
}
