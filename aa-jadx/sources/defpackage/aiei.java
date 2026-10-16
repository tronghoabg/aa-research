package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aiei extends defpackage.aiez {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "source";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
        } else {
            objArr[1] = "recursionDetectedDefault";
        }
        if (i != 1) {
            objArr[2] = "recursionDetectedDefault";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i == 1) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    public aiei(java.lang.String str, defpackage.aiep aiepVar, defpackage.aiff aiffVar) {
        super(str, aiepVar, aiffVar, null);
    }

    @Override // defpackage.aiez
    protected <K, V> defpackage.aiey<V> recursionDetectedDefault(java.lang.String str, K k) {
        if (str == null) {
            $$$reportNull$$$0(0);
        }
        return defpackage.aiey.fallThrough();
    }
}
