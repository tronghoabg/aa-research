package defpackage;

import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
class aidn<K, V> extends aidv<aidq<K, V>, V> implements aide<K, V> {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
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
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private aidn(aidz aidzVar, ConcurrentMap<aidq<K, V>, Object> concurrentMap) {
        super(aidzVar, concurrentMap, new aidm());
        if (aidzVar == null) {
            $$$reportNull$$$0(0);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(1);
        }
    }

    public V computeIfAbsent(K k, afdr<? extends V> afdrVar) {
        if (afdrVar == null) {
            $$$reportNull$$$0(2);
        }
        return invoke(new aidq(k, afdrVar));
    }

    public /* synthetic */ aidn(aidz aidzVar, ConcurrentMap concurrentMap, aidi aidiVar) {
        this(aidzVar, concurrentMap);
    }
}
