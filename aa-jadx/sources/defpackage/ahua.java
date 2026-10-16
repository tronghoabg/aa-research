package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahua implements defpackage.aiko {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.aiko
    public boolean equals(defpackage.aijd aijdVar, defpackage.aijd aijdVar2) {
        if (aijdVar == null) {
            $$$reportNull$$$0(0);
        }
        if (aijdVar2 == null) {
            $$$reportNull$$$0(1);
        }
        return aijdVar.equals(aijdVar2);
    }
}
