package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aiag implements defpackage.aiah {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.aiah
    public void reportCannotInferVisibility(defpackage.agbx agbxVar) {
        if (agbxVar == null) {
            $$$reportNull$$$0(2);
        }
    }

    @Override // defpackage.aiah
    public void reportIncompleteHierarchy(defpackage.agca agcaVar, java.util.List<java.lang.String> list) {
        if (agcaVar == null) {
            $$$reportNull$$$0(0);
        }
        if (list == null) {
            $$$reportNull$$$0(1);
        }
    }
}
