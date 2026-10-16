package kotlin.reflect.jvm.internal.impl.utils;

import org.jetbrains.annotations.NotNull;
import tf.l;
import tf.p;
import tf.q;

/* loaded from: classes5.dex */
public final class FunctionsKt {

    @NotNull
    private static final l IDENTITY = FunctionsKt$IDENTITY$1.INSTANCE;

    @NotNull
    private static final l ALWAYS_TRUE = FunctionsKt$ALWAYS_TRUE$1.INSTANCE;

    @NotNull
    private static final l ALWAYS_NULL = FunctionsKt$ALWAYS_NULL$1.INSTANCE;

    @NotNull
    private static final l DO_NOTHING = FunctionsKt$DO_NOTHING$1.INSTANCE;

    @NotNull
    private static final p DO_NOTHING_2 = FunctionsKt$DO_NOTHING_2$1.INSTANCE;

    @NotNull
    private static final q DO_NOTHING_3 = FunctionsKt$DO_NOTHING_3$1.INSTANCE;

    @NotNull
    public static final <T> l alwaysTrue() {
        return ALWAYS_TRUE;
    }

    @NotNull
    public static final q getDO_NOTHING_3() {
        return DO_NOTHING_3;
    }
}
