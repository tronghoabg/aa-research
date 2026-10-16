package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 extends AbstractC3343n implements l {
    public static final SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 INSTANCE = new SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1();

    public SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1() {
        super(1);
    }

    @Override // tf.l
    @NotNull
    public final KotlinType invoke(@NotNull CallableMemberDescriptor it) {
        AbstractC3340k.e(it, "it");
        ReceiverParameterDescriptor extensionReceiverParameter = it.getExtensionReceiverParameter();
        AbstractC3340k.b(extensionReceiverParameter);
        KotlinType type = extensionReceiverParameter.getType();
        AbstractC3340k.d(type, "getType(...)");
        return type;
    }
}
