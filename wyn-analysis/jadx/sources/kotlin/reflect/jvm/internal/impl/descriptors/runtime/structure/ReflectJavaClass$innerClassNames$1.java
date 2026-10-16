package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class ReflectJavaClass$innerClassNames$1 extends AbstractC3343n implements l {
    public static final ReflectJavaClass$innerClassNames$1 INSTANCE = new ReflectJavaClass$innerClassNames$1();

    public ReflectJavaClass$innerClassNames$1() {
        super(1);
    }

    @Override // tf.l
    @NotNull
    public final Boolean invoke(Class<?> cls) {
        return Boolean.valueOf(cls.getSimpleName().length() == 0);
    }
}
