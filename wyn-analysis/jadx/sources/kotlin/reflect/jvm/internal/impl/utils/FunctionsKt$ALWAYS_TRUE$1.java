package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class FunctionsKt$ALWAYS_TRUE$1 extends AbstractC3343n implements l {
    public static final FunctionsKt$ALWAYS_TRUE$1 INSTANCE = new FunctionsKt$ALWAYS_TRUE$1();

    public FunctionsKt$ALWAYS_TRUE$1() {
        super(1);
    }

    @Override // tf.l
    @NotNull
    public final Boolean invoke(@Nullable Object obj) {
        return Boolean.TRUE;
    }
}
