package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class StorageKt {
    @NotNull
    public static final <T> T getValue(@NotNull NotNullLazyValue<? extends T> notNullLazyValue, @Nullable Object obj, @NotNull KProperty<?> p10) {
        AbstractC3340k.e(notNullLazyValue, "<this>");
        AbstractC3340k.e(p10, "p");
        return (T) notNullLazyValue.invoke();
    }

    @Nullable
    public static final <T> T getValue(@NotNull NullableLazyValue<? extends T> nullableLazyValue, @Nullable Object obj, @NotNull KProperty<?> p10) {
        AbstractC3340k.e(nullableLazyValue, "<this>");
        AbstractC3340k.e(p10, "p");
        return (T) nullableLazyValue.invoke();
    }
}
