package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2 extends AbstractC3343n implements l {
    public static final TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2 INSTANCE = new TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2();

    public TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2() {
        super(1);
    }

    @Override // tf.l
    @NotNull
    public final Integer invoke(@NotNull ProtoBuf.Type it) {
        AbstractC3340k.e(it, "it");
        return Integer.valueOf(it.getArgumentCount());
    }
}
