package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1 extends AbstractC3343n implements l {
    final /* synthetic */ TypeDeserializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1(TypeDeserializer typeDeserializer) {
        super(1);
        this.this$0 = typeDeserializer;
    }

    @Override // tf.l
    @Nullable
    public final ProtoBuf.Type invoke(@NotNull ProtoBuf.Type it) {
        AbstractC3340k.e(it, "it");
        return ProtoTypeTableUtilKt.outerType(it, this.this$0.f39772c.getTypeTable());
    }
}
