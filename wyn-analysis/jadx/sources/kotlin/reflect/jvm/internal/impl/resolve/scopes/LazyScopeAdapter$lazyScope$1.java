package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class LazyScopeAdapter$lazyScope$1 extends AbstractC3343n implements a {
    final /* synthetic */ a $getScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyScopeAdapter$lazyScope$1(a aVar) {
        super(0);
        this.$getScope = aVar;
    }

    @Override // tf.a
    @NotNull
    public final MemberScope invoke() {
        MemberScope memberScope = (MemberScope) this.$getScope.invoke();
        return memberScope instanceof AbstractScopeAdapter ? ((AbstractScopeAdapter) memberScope).getActualScope() : memberScope;
    }
}
