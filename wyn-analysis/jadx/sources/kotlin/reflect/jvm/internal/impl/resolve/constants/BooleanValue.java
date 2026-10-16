package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class BooleanValue extends ConstantValue<Boolean> {
    public BooleanValue(boolean z2) {
        super(Boolean.valueOf(z2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public SimpleType getType(@NotNull ModuleDescriptor module) {
        AbstractC3340k.e(module, "module");
        SimpleType booleanType = module.getBuiltIns().getBooleanType();
        AbstractC3340k.d(booleanType, "getBooleanType(...)");
        return booleanType;
    }
}
