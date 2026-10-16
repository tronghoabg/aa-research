package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import ff.o;
import java.util.List;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class GivenFunctionsMemberScope$allDescriptors$2 extends AbstractC3343n implements a {
    final /* synthetic */ GivenFunctionsMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GivenFunctionsMemberScope$allDescriptors$2(GivenFunctionsMemberScope givenFunctionsMemberScope) {
        super(0);
        this.this$0 = givenFunctionsMemberScope;
    }

    @Override // tf.a
    @NotNull
    public final List<DeclarationDescriptor> invoke() {
        List<FunctionDescriptor> listComputeDeclaredFunctions = this.this$0.computeDeclaredFunctions();
        return o.E0(this.this$0.createFakeOverrides(listComputeDeclaredFunctions), listComputeDeclaredFunctions);
    }
}
