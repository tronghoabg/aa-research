package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;
import tf.a;

/* loaded from: classes5.dex */
public final class IntegerLiteralTypeConstructor$supertypes$2 extends AbstractC3343n implements a {
    final /* synthetic */ IntegerLiteralTypeConstructor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegerLiteralTypeConstructor$supertypes$2(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        super(0);
        this.this$0 = integerLiteralTypeConstructor;
    }

    @Override // tf.a
    @NotNull
    public final List<SimpleType> invoke() {
        SimpleType defaultType = this.this$0.getBuiltIns().getComparable().getDefaultType();
        AbstractC3340k.d(defaultType, "getDefaultType(...)");
        ArrayList arrayListG = AbstractC3935e.G(TypeSubstitutionKt.replace$default(defaultType, AbstractC3935e.C(new TypeProjectionImpl(Variance.IN_VARIANCE, this.this$0.type)), null, 2, null));
        if (!this.this$0.isContainsOnlyUnsignedTypes()) {
            arrayListG.add(this.this$0.getBuiltIns().getNumberType());
        }
        return arrayListG;
    }
}
