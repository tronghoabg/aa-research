package kotlin.reflect.jvm.internal.impl.load.java.components;

import ef.C2527k;
import ff.AbstractC2641B;
import ff.w;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class JavaRetentionAnnotationDescriptor$allValueArguments$2 extends AbstractC3343n implements a {
    final /* synthetic */ JavaRetentionAnnotationDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor$allValueArguments$2(JavaRetentionAnnotationDescriptor javaRetentionAnnotationDescriptor) {
        super(0);
        this.this$0 = javaRetentionAnnotationDescriptor;
    }

    @Override // tf.a
    @NotNull
    public final Map<Name, ConstantValue<?>> invoke() {
        ConstantValue<?> constantValueMapJavaRetentionArgument$descriptors_jvm = JavaAnnotationTargetMapper.INSTANCE.mapJavaRetentionArgument$descriptors_jvm(this.this$0.getFirstArgument());
        Map<Name, ConstantValue<?>> mapE = constantValueMapJavaRetentionArgument$descriptors_jvm != null ? AbstractC2641B.E(new C2527k(JavaAnnotationMapper.INSTANCE.getRETENTION_ANNOTATION_VALUE$descriptors_jvm(), constantValueMapJavaRetentionArgument$descriptors_jvm)) : null;
        return mapE == null ? w.f35433a : mapE;
    }
}
