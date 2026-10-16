package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import ff.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class DeserializedMemberScope$classNames$2 extends AbstractC3343n implements a {
    final /* synthetic */ a $classNames;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$classNames$2(a aVar) {
        super(0);
        this.$classNames = aVar;
    }

    @Override // tf.a
    @NotNull
    public final Set<Name> invoke() {
        return o.X0((Iterable) this.$classNames.invoke());
    }
}
