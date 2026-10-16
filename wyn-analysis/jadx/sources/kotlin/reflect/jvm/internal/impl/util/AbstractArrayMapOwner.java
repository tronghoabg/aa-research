package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public abstract class AbstractArrayMapOwner<K, V> implements Iterable<V>, InterfaceC4291a {

    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {

        /* renamed from: id, reason: collision with root package name */
        private final int f39776id;

        public AbstractArrayMapAccessor(int i5) {
            this.f39776id = i5;
        }

        @Nullable
        public final T extractValue(@NotNull AbstractArrayMapOwner<K, V> thisRef) {
            AbstractC3340k.e(thisRef, "thisRef");
            return thisRef.getArrayMap().get(this.f39776id);
        }
    }

    @NotNull
    public abstract ArrayMap<V> getArrayMap();

    @NotNull
    public abstract TypeRegistry<K, V> getTypeRegistry();

    public final boolean isEmpty() {
        return getArrayMap().getSize() == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<V> iterator() {
        return getArrayMap().iterator();
    }

    public abstract void registerComponent(@NotNull String str, @NotNull V v2);

    public final void registerComponent(@NotNull KClass<? extends K> tClass, @NotNull V value) {
        AbstractC3340k.e(tClass, "tClass");
        AbstractC3340k.e(value, "value");
        String qualifiedName = tClass.getQualifiedName();
        AbstractC3340k.b(qualifiedName);
        registerComponent(qualifiedName, (String) value);
    }
}
