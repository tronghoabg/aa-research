package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class TypedArrayValue extends ArrayValue {

    @NotNull
    private final KotlinType type;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ KotlinType $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(KotlinType kotlinType) {
            super(1);
            this.$type = kotlinType;
        }

        @Override // tf.l
        @NotNull
        public final KotlinType invoke(@NotNull ModuleDescriptor it) {
            AbstractC3340k.e(it, "it");
            return this.$type;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedArrayValue(@NotNull List<? extends ConstantValue<?>> value, @NotNull KotlinType type) {
        super(value, new AnonymousClass1(type));
        AbstractC3340k.e(value, "value");
        AbstractC3340k.e(type, "type");
        this.type = type;
    }

    @NotNull
    public final KotlinType getType() {
        return this.type;
    }
}
