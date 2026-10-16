package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tg.b;

/* loaded from: classes5.dex */
public final class JavaTypeAttributesKt {
    @NotNull
    public static final JavaTypeAttributes toAttributes(@NotNull TypeUsage typeUsage, boolean z2, boolean z10, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        AbstractC3340k.e(typeUsage, "<this>");
        return new JavaTypeAttributes(typeUsage, null, z10, z2, typeParameterDescriptor != null ? b.P(typeParameterDescriptor) : null, null, 34, null);
    }

    public static /* synthetic */ JavaTypeAttributes toAttributes$default(TypeUsage typeUsage, boolean z2, boolean z10, TypeParameterDescriptor typeParameterDescriptor, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z2 = false;
        }
        if ((i5 & 2) != 0) {
            z10 = false;
        }
        if ((i5 & 4) != 0) {
            typeParameterDescriptor = null;
        }
        return toAttributes(typeUsage, z2, z10, typeParameterDescriptor);
    }
}
