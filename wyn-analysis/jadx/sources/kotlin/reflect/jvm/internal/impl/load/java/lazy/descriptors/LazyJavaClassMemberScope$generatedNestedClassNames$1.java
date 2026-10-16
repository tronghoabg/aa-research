package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ff.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class LazyJavaClassMemberScope$generatedNestedClassNames$1 extends AbstractC3343n implements a {
    final /* synthetic */ LazyJavaResolverContext $c;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$generatedNestedClassNames$1(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(0);
        this.$c = lazyJavaResolverContext;
        this.this$0 = lazyJavaClassMemberScope;
    }

    @Override // tf.a
    @NotNull
    public final Set<Name> invoke() {
        LazyJavaResolverContext lazyJavaResolverContext = this.$c;
        return o.X0(lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().getNestedClassNames(lazyJavaResolverContext, this.this$0.getOwnerDescriptor()));
    }
}
