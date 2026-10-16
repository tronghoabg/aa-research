package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.Nullable;
import tf.a;

/* loaded from: classes5.dex */
public final class DeserializedClassDescriptor$valueClassRepresentation$1 extends AbstractC3343n implements a {
    final /* synthetic */ DeserializedClassDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$valueClassRepresentation$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.this$0 = deserializedClassDescriptor;
    }

    @Override // tf.a
    @Nullable
    public final ValueClassRepresentation<SimpleType> invoke() {
        return this.this$0.computeValueClassRepresentation();
    }
}
