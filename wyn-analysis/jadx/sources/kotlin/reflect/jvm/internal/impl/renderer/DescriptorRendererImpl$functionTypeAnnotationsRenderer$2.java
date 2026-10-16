package kotlin.reflect.jvm.internal.impl.renderer;

import ef.C2515C;
import ff.AbstractC2645F;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;
import tf.a;
import tf.l;

/* loaded from: classes5.dex */
public final class DescriptorRendererImpl$functionTypeAnnotationsRenderer$2 extends AbstractC3343n implements a {
    final /* synthetic */ DescriptorRendererImpl this$0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DescriptorRendererOptions) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull DescriptorRendererOptions withOptions) {
            AbstractC3340k.e(withOptions, "$this$withOptions");
            withOptions.setExcludedTypeAnnotationClasses(AbstractC2645F.Z(withOptions.getExcludedTypeAnnotationClasses(), AbstractC3935e.D(StandardNames.FqNames.extensionFunctionType, StandardNames.FqNames.contextFunctionTypeParams)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(DescriptorRendererImpl descriptorRendererImpl) {
        super(0);
        this.this$0 = descriptorRendererImpl;
    }

    @Override // tf.a
    @NotNull
    public final DescriptorRendererImpl invoke() {
        DescriptorRenderer descriptorRendererWithOptions = this.this$0.withOptions(AnonymousClass1.INSTANCE);
        AbstractC3340k.c(descriptorRendererWithOptions, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (DescriptorRendererImpl) descriptorRendererWithOptions;
    }
}
