package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class AbstractTypeAliasDescriptor$constructors$2 extends AbstractC3343n implements a {
    final /* synthetic */ AbstractTypeAliasDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeAliasDescriptor$constructors$2(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        super(0);
        this.this$0 = abstractTypeAliasDescriptor;
    }

    @Override // tf.a
    @NotNull
    public final Collection<TypeAliasConstructorDescriptor> invoke() {
        return this.this$0.getTypeAliasConstructors();
    }
}
