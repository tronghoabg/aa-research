package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class ErasedOverridabilityCondition$isOverridable$signatureTypes$1 extends AbstractC3343n implements l {
    public static final ErasedOverridabilityCondition$isOverridable$signatureTypes$1 INSTANCE = new ErasedOverridabilityCondition$isOverridable$signatureTypes$1();

    public ErasedOverridabilityCondition$isOverridable$signatureTypes$1() {
        super(1);
    }

    @Override // tf.l
    @NotNull
    public final KotlinType invoke(ValueParameterDescriptor valueParameterDescriptor) {
        return valueParameterDescriptor.getType();
    }
}
