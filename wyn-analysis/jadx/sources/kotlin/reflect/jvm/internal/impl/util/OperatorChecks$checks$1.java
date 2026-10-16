package kotlin.reflect.jvm.internal.impl.util;

import ff.o;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class OperatorChecks$checks$1 extends AbstractC3343n implements l {
    public static final OperatorChecks$checks$1 INSTANCE = new OperatorChecks$checks$1();

    public OperatorChecks$checks$1() {
        super(1);
    }

    @Override // tf.l
    @Nullable
    public final String invoke(@NotNull FunctionDescriptor $receiver) {
        AbstractC3340k.e($receiver, "$this$$receiver");
        List<ValueParameterDescriptor> valueParameters = $receiver.getValueParameters();
        AbstractC3340k.d(valueParameters, "getValueParameters(...)");
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) o.z0(valueParameters);
        boolean z2 = false;
        if (valueParameterDescriptor != null && !DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) && valueParameterDescriptor.getVarargElementType() == null) {
            z2 = true;
        }
        OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
        if (z2) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }
}
