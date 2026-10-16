package kotlin.reflect.jvm.internal.impl.util;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public abstract class TypeRegistry<K, V> {

    @NotNull
    private final ConcurrentHashMap<String, Integer> idPerType = new ConcurrentHashMap<>();

    @NotNull
    private final AtomicInteger idCounter = new AtomicInteger(0);

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.TypeRegistry$getId$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ TypeRegistry<K, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TypeRegistry<K, V> typeRegistry) {
            super(1);
            this.this$0 = typeRegistry;
        }

        @Override // tf.l
        @NotNull
        public final Integer invoke(@NotNull String it) {
            AbstractC3340k.e(it, "it");
            return Integer.valueOf(((TypeRegistry) this.this$0).idCounter.getAndIncrement());
        }
    }

    public abstract int customComputeIfAbsent(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull String str, @NotNull l lVar);

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T extends V, KK extends K> NullableArrayMapAccessor<K, V, T> generateNullableAccessor(@NotNull KClass<KK> kClass) {
        AbstractC3340k.e(kClass, "kClass");
        return new NullableArrayMapAccessor<>(getId(kClass));
    }

    public final <T extends K> int getId(@NotNull KClass<T> kClass) {
        AbstractC3340k.e(kClass, "kClass");
        String qualifiedName = kClass.getQualifiedName();
        AbstractC3340k.b(qualifiedName);
        return getId(qualifiedName);
    }

    @NotNull
    public final Collection<Integer> getIndices() {
        Collection<Integer> collectionValues = this.idPerType.values();
        AbstractC3340k.d(collectionValues, "<get-values>(...)");
        return collectionValues;
    }

    public final int getId(@NotNull String keyQualifiedName) {
        AbstractC3340k.e(keyQualifiedName, "keyQualifiedName");
        return customComputeIfAbsent(this.idPerType, keyQualifiedName, new AnonymousClass1(this));
    }
}
