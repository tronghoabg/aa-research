package kotlin.reflect.jvm.internal.impl.storage;

import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public interface CacheWithNotNullValues<K, V> {
    @NotNull
    V computeIfAbsent(K k, @NotNull a aVar);
}
