package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1 extends AbstractC3343n implements l {
    final /* synthetic */ ValueParameterDescriptor $p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1(ValueParameterDescriptor valueParameterDescriptor) {
        super(1);
        this.$p = valueParameterDescriptor;
    }

    @Override // tf.l
    @NotNull
    public final KotlinType invoke(@NotNull CallableMemberDescriptor it) {
        AbstractC3340k.e(it, "it");
        KotlinType type = it.getValueParameters().get(this.$p.getIndex()).getType();
        AbstractC3340k.d(type, "getType(...)");
        return type;
    }
}
