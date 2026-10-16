package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aiel<K, V> extends defpackage.aien<K, V> implements defpackage.aied<K, V> {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 3 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "computation";
        } else if (i != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        }
        if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i == 2) {
            objArr[2] = "computeIfAbsent";
        } else if (i != 3) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i == 3) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private aiel(defpackage.aiez aiezVar, java.util.concurrent.ConcurrentMap<defpackage.aieq<K, V>, java.lang.Object> concurrentMap) {
        super(aiezVar, concurrentMap, null);
        if (aiezVar == null) {
            $$$reportNull$$$0(0);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(1);
        }
    }

    @Override // defpackage.aien, defpackage.aied
    public V computeIfAbsent(K k, defpackage.afer<? extends V> aferVar) {
        if (aferVar == null) {
            $$$reportNull$$$0(2);
        }
        V v = (V) super.computeIfAbsent(k, aferVar);
        if (v == null) {
            $$$reportNull$$$0(3);
        }
        return v;
    }

    public /* synthetic */ aiel(defpackage.aiez aiezVar, java.util.concurrent.ConcurrentMap concurrentMap, defpackage.aiei aieiVar) {
        this(aiezVar, concurrentMap);
    }
}
