package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.Nullable;
import tf.a;

/* loaded from: classes5.dex */
public final class NewCapturedTypeConstructor$_supertypes$2 extends AbstractC3343n implements a {
    final /* synthetic */ NewCapturedTypeConstructor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$_supertypes$2(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        super(0);
        this.this$0 = newCapturedTypeConstructor;
    }

    @Override // tf.a
    @Nullable
    public final List<UnwrappedType> invoke() {
        a aVar = this.this$0.supertypesComputation;
        if (aVar != null) {
            return (List) aVar.invoke();
        }
        return null;
    }
}
