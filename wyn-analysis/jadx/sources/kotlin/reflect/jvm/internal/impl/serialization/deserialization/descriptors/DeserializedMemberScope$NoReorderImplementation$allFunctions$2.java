package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import ff.o;
import java.util.List;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class DeserializedMemberScope$NoReorderImplementation$allFunctions$2 extends AbstractC3343n implements a {
    final /* synthetic */ DeserializedMemberScope.NoReorderImplementation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$NoReorderImplementation$allFunctions$2(DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
        super(0);
        this.this$0 = noReorderImplementation;
    }

    @Override // tf.a
    @NotNull
    public final List<SimpleFunctionDescriptor> invoke() {
        return o.E0(this.this$0.computeAllNonDeclaredFunctions(), this.this$0.getDeclaredFunctions());
    }
}
