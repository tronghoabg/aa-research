package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1 extends AbstractC3343n implements l {
    final /* synthetic */ AbstractTypeConstructor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.this$0 = abstractTypeConstructor;
    }

    @Override // tf.l
    @NotNull
    public final Iterable<KotlinType> invoke(@NotNull TypeConstructor it) {
        AbstractC3340k.e(it, "it");
        return this.this$0.computeNeighbours(it, false);
    }
}
