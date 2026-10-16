package kotlin.reflect.jvm.internal.impl.load.java.components;

import ef.C2527k;
import ff.AbstractC2641B;
import ff.w;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;
import tf.a;

/* loaded from: classes5.dex */
public final class JavaTargetAnnotationDescriptor$allValueArguments$2 extends AbstractC3343n implements a {
    final /* synthetic */ JavaTargetAnnotationDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor$allValueArguments$2(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        super(0);
        this.this$0 = javaTargetAnnotationDescriptor;
    }

    @Override // tf.a
    @NotNull
    public final Map<Name, ConstantValue<Object>> invoke() {
        JavaAnnotationArgument firstArgument = this.this$0.getFirstArgument();
        ConstantValue<?> constantValueMapJavaTargetArguments$descriptors_jvm = firstArgument instanceof JavaArrayAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(((JavaArrayAnnotationArgument) this.this$0.getFirstArgument()).getElements()) : firstArgument instanceof JavaEnumValueAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(AbstractC3935e.C(this.this$0.getFirstArgument())) : null;
        Map<Name, ConstantValue<Object>> mapE = constantValueMapJavaTargetArguments$descriptors_jvm != null ? AbstractC2641B.E(new C2527k(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), constantValueMapJavaTargetArguments$descriptors_jvm)) : null;
        return mapE == null ? w.f35433a : mapE;
    }
}
