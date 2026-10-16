package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ef.C2527k;
import ff.AbstractC2640A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class LazyJavaAnnotationDescriptor$allValueArguments$2 extends AbstractC3343n implements a {
    final /* synthetic */ LazyJavaAnnotationDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaAnnotationDescriptor$allValueArguments$2(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        super(0);
        this.this$0 = lazyJavaAnnotationDescriptor;
    }

    @Override // tf.a
    @NotNull
    public final Map<Name, ConstantValue<?>> invoke() {
        Collection<JavaAnnotationArgument> arguments = this.this$0.javaAnnotation.getArguments();
        LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (JavaAnnotationArgument javaAnnotationArgument : arguments) {
            Name name = javaAnnotationArgument.getName();
            if (name == null) {
                name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
            }
            ConstantValue constantValueResolveAnnotationArgument = lazyJavaAnnotationDescriptor.resolveAnnotationArgument(javaAnnotationArgument);
            C2527k c2527k = constantValueResolveAnnotationArgument != null ? new C2527k(name, constantValueResolveAnnotationArgument) : null;
            if (c2527k != null) {
                arrayList.add(c2527k);
            }
        }
        return AbstractC2640A.X(arrayList);
    }
}
