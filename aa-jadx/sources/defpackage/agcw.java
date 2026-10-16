package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class agcw extends defpackage.agcn {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
        objArr[2] = "isVisible";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public agcw(defpackage.agfy agfyVar) {
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
        return true;
    }
}
