package kotlin.reflect.jvm.internal.impl.storage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.a;
import tf.l;

/* loaded from: classes5.dex */
public interface StorageManager {
    <T> T compute(@NotNull a aVar);

    @NotNull
    <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues();

    @NotNull
    <K, V> CacheWithNullableValues<K, V> createCacheWithNullableValues();

    @NotNull
    <T> NotNullLazyValue<T> createLazyValue(@NotNull a aVar);

    @NotNull
    <T> NotNullLazyValue<T> createLazyValueWithPostCompute(@NotNull a aVar, @Nullable l lVar, @NotNull l lVar2);

    @NotNull
    <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull l lVar);

    @NotNull
    <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull l lVar);

    @NotNull
    <T> NullableLazyValue<T> createNullableLazyValue(@NotNull a aVar);

    @NotNull
    <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(@NotNull a aVar, @NotNull T t10);
}
