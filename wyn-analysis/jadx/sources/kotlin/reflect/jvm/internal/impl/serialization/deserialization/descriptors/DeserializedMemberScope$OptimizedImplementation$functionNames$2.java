package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import ff.AbstractC2645F;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class DeserializedMemberScope$OptimizedImplementation$functionNames$2 extends AbstractC3343n implements a {
    final /* synthetic */ DeserializedMemberScope.OptimizedImplementation this$0;
    final /* synthetic */ DeserializedMemberScope this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$functionNames$2(DeserializedMemberScope.OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.this$0 = optimizedImplementation;
        this.this$1 = deserializedMemberScope;
    }

    @Override // tf.a
    @NotNull
    public final Set<Name> invoke() {
        return AbstractC2645F.Z(this.this$0.functionProtosBytes.keySet(), this.this$1.getNonDeclaredFunctionNames());
    }
}
