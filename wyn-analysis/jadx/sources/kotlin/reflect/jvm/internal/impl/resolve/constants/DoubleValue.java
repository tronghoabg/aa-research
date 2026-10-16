package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class DoubleValue extends ConstantValue<Double> {
    public DoubleValue(double d3) {
        super(Double.valueOf(d3));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return getValue().doubleValue() + ".toDouble()";
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public SimpleType getType(@NotNull ModuleDescriptor module) {
        AbstractC3340k.e(module, "module");
        SimpleType doubleType = module.getBuiltIns().getDoubleType();
        AbstractC3340k.d(doubleType, "getDoubleType(...)");
        return doubleType;
    }
}
