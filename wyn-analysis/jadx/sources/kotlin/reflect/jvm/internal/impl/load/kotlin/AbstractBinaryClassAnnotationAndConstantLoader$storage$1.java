package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class AbstractBinaryClassAnnotationAndConstantLoader$storage$1 extends AbstractC3343n implements l {
    final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<A, C> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader$storage$1(AbstractBinaryClassAnnotationAndConstantLoader<A, C> abstractBinaryClassAnnotationAndConstantLoader) {
        super(1);
        this.this$0 = abstractBinaryClassAnnotationAndConstantLoader;
    }

    @Override // tf.l
    @NotNull
    public final AnnotationsContainerWithConstants<A, C> invoke(@NotNull KotlinJvmBinaryClass kotlinClass) {
        AbstractC3340k.e(kotlinClass, "kotlinClass");
        return this.this$0.loadAnnotationsAndInitializers(kotlinClass);
    }
}
