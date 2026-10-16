package kotlin.reflect.jvm.internal.impl.renderer;

import ef.C2515C;
import ff.x;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class DescriptorRenderer$Companion$COMPACT$1 extends AbstractC3343n implements l {
    public static final DescriptorRenderer$Companion$COMPACT$1 INSTANCE = new DescriptorRenderer$Companion$COMPACT$1();

    public DescriptorRenderer$Companion$COMPACT$1() {
        super(1);
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DescriptorRendererOptions) obj);
        return C2515C.f34653a;
    }

    public final void invoke(@NotNull DescriptorRendererOptions withOptions) {
        AbstractC3340k.e(withOptions, "$this$withOptions");
        withOptions.setWithDefinedIn(false);
        withOptions.setModifiers(x.f35434a);
    }
}
