package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class DescriptorRendererOptionsImpl$typeNormalizer$2 extends AbstractC3343n implements l {
    public static final DescriptorRendererOptionsImpl$typeNormalizer$2 INSTANCE = new DescriptorRendererOptionsImpl$typeNormalizer$2();

    public DescriptorRendererOptionsImpl$typeNormalizer$2() {
        super(1);
    }

    @Override // tf.l
    @NotNull
    public final KotlinType invoke(@NotNull KotlinType it) {
        AbstractC3340k.e(it, "it");
        return it;
    }
}
