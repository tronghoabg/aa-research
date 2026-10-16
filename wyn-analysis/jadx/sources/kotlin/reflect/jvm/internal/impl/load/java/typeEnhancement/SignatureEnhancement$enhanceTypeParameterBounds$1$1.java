package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class SignatureEnhancement$enhanceTypeParameterBounds$1$1 extends AbstractC3343n implements l {
    public static final SignatureEnhancement$enhanceTypeParameterBounds$1$1 INSTANCE = new SignatureEnhancement$enhanceTypeParameterBounds$1$1();

    public SignatureEnhancement$enhanceTypeParameterBounds$1$1() {
        super(1);
    }

    @Override // tf.l
    @NotNull
    public final Boolean invoke(@NotNull UnwrappedType it) {
        AbstractC3340k.e(it, "it");
        return Boolean.valueOf(it instanceof RawType);
    }
}
