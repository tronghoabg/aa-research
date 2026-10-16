package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;
import tf.l;

/* loaded from: classes5.dex */
public final class AbstractTypeConstructor$supertypes$2 extends AbstractC3343n implements l {
    public static final AbstractTypeConstructor$supertypes$2 INSTANCE = new AbstractTypeConstructor$supertypes$2();

    public AbstractTypeConstructor$supertypes$2() {
        super(1);
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Boolean) obj).booleanValue());
    }

    @NotNull
    public final AbstractTypeConstructor.Supertypes invoke(boolean z2) {
        return new AbstractTypeConstructor.Supertypes(AbstractC3935e.C(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes()));
    }
}
