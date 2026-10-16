package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class RawTypeImpl$render$newArgs$1 extends AbstractC3343n implements l {
    public static final RawTypeImpl$render$newArgs$1 INSTANCE = new RawTypeImpl$render$newArgs$1();

    public RawTypeImpl$render$newArgs$1() {
        super(1);
    }

    @Override // tf.l
    @NotNull
    public final CharSequence invoke(@NotNull String it) {
        AbstractC3340k.e(it, "it");
        return "(raw) ".concat(it);
    }
}
