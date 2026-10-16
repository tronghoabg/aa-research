package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 extends AbstractC3343n implements l {
    public static final SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 INSTANCE = new SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1();

    public SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1() {
        super(1);
    }

    @Override // tf.l
    @NotNull
    public final KotlinType invoke(@NotNull CallableMemberDescriptor it) {
        AbstractC3340k.e(it, "it");
        KotlinType returnType = it.getReturnType();
        AbstractC3340k.b(returnType);
        return returnType;
    }
}
