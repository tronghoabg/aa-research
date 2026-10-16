package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class OperatorChecks$checks$3 extends AbstractC3343n implements l {
    public static final OperatorChecks$checks$3 INSTANCE = new OperatorChecks$checks$3();

    public OperatorChecks$checks$3() {
        super(1);
    }

    @Override // tf.l
    @Nullable
    public final String invoke(@NotNull FunctionDescriptor $receiver) {
        boolean zIsSubtypeOf;
        AbstractC3340k.e($receiver, "$this$$receiver");
        ReceiverParameterDescriptor dispatchReceiverParameter = $receiver.getDispatchReceiverParameter();
        if (dispatchReceiverParameter == null) {
            dispatchReceiverParameter = $receiver.getExtensionReceiverParameter();
        }
        OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
        boolean z2 = false;
        if (dispatchReceiverParameter != null) {
            KotlinType returnType = $receiver.getReturnType();
            if (returnType != null) {
                KotlinType type = dispatchReceiverParameter.getType();
                AbstractC3340k.d(type, "getType(...)");
                zIsSubtypeOf = TypeUtilsKt.isSubtypeOf(returnType, type);
            } else {
                zIsSubtypeOf = false;
            }
            if (zIsSubtypeOf || operatorChecks.incDecCheckForExpectClass($receiver, dispatchReceiverParameter)) {
                z2 = true;
            }
        }
        if (z2) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }
}
