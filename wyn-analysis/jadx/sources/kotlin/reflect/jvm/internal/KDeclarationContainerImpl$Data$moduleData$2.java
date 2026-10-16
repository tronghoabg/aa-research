package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import tf.a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KDeclarationContainerImpl$Data$moduleData$2 extends AbstractC3343n implements a {
    final /* synthetic */ KDeclarationContainerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KDeclarationContainerImpl$Data$moduleData$2(KDeclarationContainerImpl kDeclarationContainerImpl) {
        super(0);
        this.this$0 = kDeclarationContainerImpl;
    }

    @Override // tf.a
    public final RuntimeModuleData invoke() {
        return ModuleByClassLoaderKt.getOrCreateModule(this.this$0.getJClass());
    }
}
