package defpackage;

import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
final class aidl<K, V> extends aidn<K, V> implements aidd<K, V> {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 3 ? 3 : 2];
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
        String str2 = String.format(str, objArr);
        if (i == 3) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private aidl(aidz aidzVar, ConcurrentMap<aidq<K, V>, Object> concurrentMap) {
        super(aidzVar, concurrentMap, null);
        if (aidzVar == null) {
            $$$reportNull$$$0(0);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(1);
        }
    }

    @Override // defpackage.aidn, defpackage.aidd
    public V computeIfAbsent(K k, afdr<? extends V> afdrVar) {
        if (afdrVar == null) {
            $$$reportNull$$$0(2);
        }
        V v = (V) super.computeIfAbsent(k, afdrVar);
        if (v == null) {
            $$$reportNull$$$0(3);
        }
        return v;
    }

    public /* synthetic */ aidl(aidz aidzVar, ConcurrentMap concurrentMap, aidi aidiVar) {
        this(aidzVar, concurrentMap);
    }
}
