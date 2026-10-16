package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class ErrorModuleDescriptor$builtIns$2 extends AbstractC3343n implements a {
    public static final ErrorModuleDescriptor$builtIns$2 INSTANCE = new ErrorModuleDescriptor$builtIns$2();

    public ErrorModuleDescriptor$builtIns$2() {
        super(0);
    }

    @Override // tf.a
    @NotNull
    public final DefaultBuiltIns invoke() {
        return DefaultBuiltIns.Companion.getInstance();
    }
}
