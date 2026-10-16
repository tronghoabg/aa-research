package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import ff.o;
import java.util.List;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class DeserializedTypeParameterDescriptor$annotations$1 extends AbstractC3343n implements a {
    final /* synthetic */ DeserializedTypeParameterDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedTypeParameterDescriptor$annotations$1(DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor) {
        super(0);
        this.this$0 = deserializedTypeParameterDescriptor;
    }

    @Override // tf.a
    @NotNull
    public final List<AnnotationDescriptor> invoke() {
        return o.S0(this.this$0.f39775c.getComponents().getAnnotationAndConstantLoader().loadTypeParameterAnnotations(this.this$0.getProto(), this.this$0.f39775c.getNameResolver()));
    }
}
