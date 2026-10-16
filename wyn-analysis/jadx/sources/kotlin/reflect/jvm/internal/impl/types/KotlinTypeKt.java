package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class KotlinTypeKt {
    public static final boolean isError(@NotNull KotlinType kotlinType) {
        AbstractC3340k.e(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof ErrorType) {
            return true;
        }
        return (unwrappedTypeUnwrap instanceof FlexibleType) && (((FlexibleType) unwrappedTypeUnwrap).getDelegate() instanceof ErrorType);
    }

    public static final boolean isNullable(@NotNull KotlinType kotlinType) {
        AbstractC3340k.e(kotlinType, "<this>");
        return TypeUtils.isNullableType(kotlinType);
    }
}
