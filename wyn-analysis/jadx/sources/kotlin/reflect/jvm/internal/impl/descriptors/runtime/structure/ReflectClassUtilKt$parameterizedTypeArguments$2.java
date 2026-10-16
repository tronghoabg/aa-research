package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import Af.k;
import ff.m;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class ReflectClassUtilKt$parameterizedTypeArguments$2 extends AbstractC3343n implements l {
    public static final ReflectClassUtilKt$parameterizedTypeArguments$2 INSTANCE = new ReflectClassUtilKt$parameterizedTypeArguments$2();

    public ReflectClassUtilKt$parameterizedTypeArguments$2() {
        super(1);
    }

    @Override // tf.l
    @NotNull
    public final k invoke(@NotNull ParameterizedType it) {
        AbstractC3340k.e(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        AbstractC3340k.d(actualTypeArguments, "getActualTypeArguments(...)");
        return m.d0(actualTypeArguments);
    }
}
