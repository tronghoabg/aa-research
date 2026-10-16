package kotlin.reflect.jvm.internal.impl.utils.addToStdlib;

import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class AddToStdlibKt {

    @NotNull
    private static final ConcurrentHashMap<a, Object> constantMap = new ConcurrentHashMap<>();

    @NotNull
    public static final Void shouldNotBeCalled(@NotNull String message) {
        AbstractC3340k.e(message, "message");
        throw new IllegalStateException(message.toString());
    }

    public static /* synthetic */ Void shouldNotBeCalled$default(String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = "should not be called";
        }
        return shouldNotBeCalled(str);
    }
}
