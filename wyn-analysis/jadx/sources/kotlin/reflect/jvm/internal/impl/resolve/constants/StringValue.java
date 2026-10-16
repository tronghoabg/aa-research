package kotlin.reflect.jvm.internal.impl.resolve.constants;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class StringValue extends ConstantValue<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringValue(@NotNull String value) {
        super(value);
        AbstractC3340k.e(value, "value");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return AbstractC0279p0.n(new StringBuilder("\""), getValue(), '\"');
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public SimpleType getType(@NotNull ModuleDescriptor module) {
        AbstractC3340k.e(module, "module");
        SimpleType stringType = module.getBuiltIns().getStringType();
        AbstractC3340k.d(stringType, "getStringType(...)");
        return stringType;
    }
}
