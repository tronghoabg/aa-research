package defpackage;

/* loaded from: classes3.dex */
final class aidi extends aidz {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
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
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public aidi(String str, aidp aidpVar, aief aiefVar) {
        super(str, aidpVar, aiefVar, null);
    }

    @Override // defpackage.aidz
    protected <K, V> aidy<V> recursionDetectedDefault(String str, K k) {
        if (str == null) {
            $$$reportNull$$$0(0);
        }
        return aidy.fallThrough();
    }
}
