package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import org.jetbrains.annotations.Nullable;
import tf.a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KPackageImpl$Data$kotlinClass$2 extends AbstractC3343n implements a {
    final /* synthetic */ KPackageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$kotlinClass$2(KPackageImpl kPackageImpl) {
        super(0);
        this.this$0 = kPackageImpl;
    }

    @Override // tf.a
    @Nullable
    public final ReflectKotlinClass invoke() {
        return ReflectKotlinClass.Factory.create(this.this$0.getJClass());
    }
}
