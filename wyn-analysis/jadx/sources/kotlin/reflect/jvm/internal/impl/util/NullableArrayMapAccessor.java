package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wf.InterfaceC4406b;

/* loaded from: classes5.dex */
public final class NullableArrayMapAccessor<K, V, T extends V> extends AbstractArrayMapOwner.AbstractArrayMapAccessor<K, V, T> implements InterfaceC4406b {
    public NullableArrayMapAccessor(int i5) {
        super(i5);
    }

    @Override // wf.InterfaceC4406b
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((AbstractArrayMapOwner) obj, (KProperty<?>) kProperty);
    }

    @Nullable
    public T getValue(@NotNull AbstractArrayMapOwner<K, V> thisRef, @NotNull KProperty<?> property) {
        AbstractC3340k.e(thisRef, "thisRef");
        AbstractC3340k.e(property, "property");
        return extractValue(thisRef);
    }
}
