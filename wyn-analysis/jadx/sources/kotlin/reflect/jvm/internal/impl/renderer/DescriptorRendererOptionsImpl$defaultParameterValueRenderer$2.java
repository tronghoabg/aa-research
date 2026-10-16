package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 extends AbstractC3343n implements l {
    public static final DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 INSTANCE = new DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2();

    public DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2() {
        super(1);
    }

    @Override // tf.l
    @NotNull
    public final String invoke(@NotNull ValueParameterDescriptor it) {
        AbstractC3340k.e(it, "it");
        return "...";
    }
}
