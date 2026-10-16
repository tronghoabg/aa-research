package defpackage;

import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
final class aidw<K, V> extends aidv<K, V> implements aiea<K, V> {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 3 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
        }
        if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
        } else {
            objArr[1] = "invoke";
        }
        if (i != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 3) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aidw(aidz aidzVar, ConcurrentMap<K, Object> concurrentMap, afec<? super K, ? extends V> afecVar) {
        super(aidzVar, concurrentMap, afecVar);
        if (aidzVar == null) {
            $$$reportNull$$$0(0);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(1);
        }
        if (afecVar == null) {
            $$$reportNull$$$0(2);
        }
    }

    @Override // defpackage.aidv, defpackage.afec
    public V invoke(K k) {
        V v = (V) super.invoke(k);
        if (v == null) {
            $$$reportNull$$$0(3);
        }
        return v;
    }
}
