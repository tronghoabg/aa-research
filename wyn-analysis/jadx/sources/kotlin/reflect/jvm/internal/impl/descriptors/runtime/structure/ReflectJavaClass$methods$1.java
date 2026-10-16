package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class ReflectJavaClass$methods$1 extends AbstractC3343n implements l {
    final /* synthetic */ ReflectJavaClass this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaClass$methods$1(ReflectJavaClass reflectJavaClass) {
        super(1);
        this.this$0 = reflectJavaClass;
    }

    @Override // tf.l
    @NotNull
    public final Boolean invoke(Method method) {
        boolean z2 = false;
        if (!method.isSynthetic() && (!this.this$0.isEnum() || !this.this$0.isEnumValuesOrValueOf(method))) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
