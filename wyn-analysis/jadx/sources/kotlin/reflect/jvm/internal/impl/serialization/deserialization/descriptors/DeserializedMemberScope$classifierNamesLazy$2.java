package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import ff.AbstractC2645F;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.Nullable;
import tf.a;

/* loaded from: classes5.dex */
public final class DeserializedMemberScope$classifierNamesLazy$2 extends AbstractC3343n implements a {
    final /* synthetic */ DeserializedMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$classifierNamesLazy$2(DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.this$0 = deserializedMemberScope;
    }

    @Override // tf.a
    @Nullable
    public final Set<Name> invoke() {
        Set<Name> nonDeclaredClassifierNames = this.this$0.getNonDeclaredClassifierNames();
        if (nonDeclaredClassifierNames == null) {
            return null;
        }
        return AbstractC2645F.Z(AbstractC2645F.Z(this.this$0.getClassNames$deserialization(), this.this$0.impl.getTypeAliasNames()), nonDeclaredClassifierNames);
    }
}
