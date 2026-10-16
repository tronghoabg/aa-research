package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes5.dex */
public final class DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1 extends AbstractC3343n implements p {
    final /* synthetic */ CallableDescriptor $a;
    final /* synthetic */ CallableDescriptor $b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        super(2);
        this.$a = callableDescriptor;
        this.$b = callableDescriptor2;
    }

    @Override // tf.p
    @NotNull
    public final Boolean invoke(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2) {
        return Boolean.valueOf(AbstractC3340k.a(declarationDescriptor, this.$a) && AbstractC3340k.a(declarationDescriptor2, this.$b));
    }
}
