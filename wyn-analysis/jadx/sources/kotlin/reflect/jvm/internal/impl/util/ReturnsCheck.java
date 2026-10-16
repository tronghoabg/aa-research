package kotlin.reflect.jvm.internal.impl.util;

import R8.v;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.util.Check;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public abstract class ReturnsCheck implements Check {

    @NotNull
    private final String description;

    @NotNull
    private final String name;

    @NotNull
    private final l type;

    public static final class ReturnsBoolean extends ReturnsCheck {

        @NotNull
        public static final ReturnsBoolean INSTANCE = new ReturnsBoolean();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsBoolean$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC3343n implements l {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // tf.l
            @NotNull
            public final KotlinType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                AbstractC3340k.e(kotlinBuiltIns, "$this$null");
                SimpleType booleanType = kotlinBuiltIns.getBooleanType();
                AbstractC3340k.d(booleanType, "getBooleanType(...)");
                return booleanType;
            }
        }

        private ReturnsBoolean() {
            super("Boolean", AnonymousClass1.INSTANCE, null);
        }
    }

    public static final class ReturnsInt extends ReturnsCheck {

        @NotNull
        public static final ReturnsInt INSTANCE = new ReturnsInt();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsInt$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC3343n implements l {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // tf.l
            @NotNull
            public final KotlinType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                AbstractC3340k.e(kotlinBuiltIns, "$this$null");
                SimpleType intType = kotlinBuiltIns.getIntType();
                AbstractC3340k.d(intType, "getIntType(...)");
                return intType;
            }
        }

        private ReturnsInt() {
            super("Int", AnonymousClass1.INSTANCE, null);
        }
    }

    public static final class ReturnsUnit extends ReturnsCheck {

        @NotNull
        public static final ReturnsUnit INSTANCE = new ReturnsUnit();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsUnit$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC3343n implements l {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // tf.l
            @NotNull
            public final KotlinType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                AbstractC3340k.e(kotlinBuiltIns, "$this$null");
                SimpleType unitType = kotlinBuiltIns.getUnitType();
                AbstractC3340k.d(unitType, "getUnitType(...)");
                return unitType;
            }
        }

        private ReturnsUnit() {
            super("Unit", AnonymousClass1.INSTANCE, null);
        }
    }

    public /* synthetic */ ReturnsCheck(String str, l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
        AbstractC3340k.e(functionDescriptor, "functionDescriptor");
        return AbstractC3340k.a(functionDescriptor.getReturnType(), this.type.invoke(DescriptorUtilsKt.getBuiltIns(functionDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.description;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }

    private ReturnsCheck(String str, l lVar) {
        this.name = str;
        this.type = lVar;
        this.description = v.f("must return ", str);
    }
}
