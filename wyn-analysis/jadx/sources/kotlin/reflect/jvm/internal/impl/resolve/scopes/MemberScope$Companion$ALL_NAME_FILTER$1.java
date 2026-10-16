package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class MemberScope$Companion$ALL_NAME_FILTER$1 extends AbstractC3343n implements l {
    public static final MemberScope$Companion$ALL_NAME_FILTER$1 INSTANCE = new MemberScope$Companion$ALL_NAME_FILTER$1();

    public MemberScope$Companion$ALL_NAME_FILTER$1() {
        super(1);
    }

    @Override // tf.l
    @NotNull
    public final Boolean invoke(@NotNull Name it) {
        AbstractC3340k.e(it, "it");
        return Boolean.TRUE;
    }
}
