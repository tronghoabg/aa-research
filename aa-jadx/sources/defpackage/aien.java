package defpackage;

/* JADX INFO: loaded from: classes3.dex */
class aien<K, V> extends defpackage.aiev<defpackage.aieq<K, V>, V> implements defpackage.aiee<K, V> {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "computation";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "computeIfAbsent";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private aien(defpackage.aiez aiezVar, java.util.concurrent.ConcurrentMap<defpackage.aieq<K, V>, java.lang.Object> concurrentMap) {
        super(aiezVar, concurrentMap, new defpackage.aiem());
        if (aiezVar == null) {
            $$$reportNull$$$0(0);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(1);
        }
    }

    public V computeIfAbsent(K k, defpackage.afer<? extends V> aferVar) {
        if (aferVar == null) {
            $$$reportNull$$$0(2);
        }
        return invoke(new defpackage.aieq(k, aferVar));
    }

    public /* synthetic */ aien(defpackage.aiez aiezVar, java.util.concurrent.ConcurrentMap concurrentMap, defpackage.aiei aieiVar) {
        this(aiezVar, concurrentMap);
    }
}
