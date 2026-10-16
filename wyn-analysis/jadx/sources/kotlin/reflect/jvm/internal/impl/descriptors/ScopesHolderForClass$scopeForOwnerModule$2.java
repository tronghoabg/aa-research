package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class ScopesHolderForClass$scopeForOwnerModule$2 extends AbstractC3343n implements a {
    final /* synthetic */ ScopesHolderForClass<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopesHolderForClass$scopeForOwnerModule$2(ScopesHolderForClass<T> scopesHolderForClass) {
        super(0);
        this.this$0 = scopesHolderForClass;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // tf.a
    @NotNull
    public final MemberScope invoke() {
        return (MemberScope) ((ScopesHolderForClass) this.this$0).scopeFactory.invoke(((ScopesHolderForClass) this.this$0).kotlinTypeRefinerForOwnerModule);
    }
}
