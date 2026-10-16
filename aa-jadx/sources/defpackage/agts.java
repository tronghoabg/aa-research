package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class agts extends defpackage.agcn {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
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
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public agts(defpackage.agfy agfyVar) {
        super(agfyVar);
    }

    @Override // defpackage.agdc
    public boolean isVisible(defpackage.ahza ahzaVar, defpackage.agcm agcmVar, defpackage.agci agciVar, boolean z) {
        if (agcmVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agciVar == null) {
            $$$reportNull$$$0(1);
        }
        return defpackage.agtv.areInSamePackage(agcmVar, agciVar);
    }
}
