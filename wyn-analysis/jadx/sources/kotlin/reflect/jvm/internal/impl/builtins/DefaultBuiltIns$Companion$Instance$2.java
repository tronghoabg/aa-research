package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class DefaultBuiltIns$Companion$Instance$2 extends AbstractC3343n implements a {
    public static final DefaultBuiltIns$Companion$Instance$2 INSTANCE = new DefaultBuiltIns$Companion$Instance$2();

    public DefaultBuiltIns$Companion$Instance$2() {
        super(0);
    }

    @Override // tf.a
    @NotNull
    public final DefaultBuiltIns invoke() {
        return new DefaultBuiltIns(false, 1, null);
    }
}
