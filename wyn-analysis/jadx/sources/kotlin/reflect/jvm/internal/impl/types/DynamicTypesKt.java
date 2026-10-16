package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class DynamicTypesKt {
    public static final boolean isDynamic(@NotNull KotlinType kotlinType) {
        AbstractC3340k.e(kotlinType, "<this>");
        return kotlinType.unwrap() instanceof DynamicType;
    }
}
