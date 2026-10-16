package kotlin.reflect.jvm.internal.impl.resolve.constants;

import ff.m;
import ff.o;
import ff.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;
import tf.l;

/* loaded from: classes5.dex */
public final class ConstantValueFactory {

    @NotNull
    public static final ConstantValueFactory INSTANCE = new ConstantValueFactory();

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory$createArrayValue$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ PrimitiveType $componentType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PrimitiveType primitiveType) {
            super(1);
            this.$componentType = primitiveType;
        }

        @Override // tf.l
        @NotNull
        public final KotlinType invoke(@NotNull ModuleDescriptor it) {
            AbstractC3340k.e(it, "it");
            SimpleType primitiveArrayKotlinType = it.getBuiltIns().getPrimitiveArrayKotlinType(this.$componentType);
            AbstractC3340k.d(primitiveArrayKotlinType, "getPrimitiveArrayKotlinType(...)");
            return primitiveArrayKotlinType;
        }
    }

    private ConstantValueFactory() {
    }

    public static /* synthetic */ ConstantValue createConstantValue$default(ConstantValueFactory constantValueFactory, Object obj, ModuleDescriptor moduleDescriptor, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            moduleDescriptor = null;
        }
        return constantValueFactory.createConstantValue(obj, moduleDescriptor);
    }

    @NotNull
    public final ArrayValue createArrayValue(@NotNull List<? extends ConstantValue<?>> value, @NotNull KotlinType type) {
        AbstractC3340k.e(value, "value");
        AbstractC3340k.e(type, "type");
        return new TypedArrayValue(value, type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ff.v] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory] */
    @Nullable
    public final ConstantValue<?> createConstantValue(@Nullable Object obj, @Nullable ModuleDescriptor moduleDescriptor) {
        if (obj instanceof Byte) {
            return new ByteValue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ShortValue(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new CharValue(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new BooleanValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new StringValue((String) obj);
        }
        if (obj instanceof byte[]) {
            return createArrayValue(m.G0((byte[]) obj), moduleDescriptor, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            return createArrayValue(m.M0((short[]) obj), moduleDescriptor, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return createArrayValue(m.J0((int[]) obj), moduleDescriptor, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return createArrayValue(m.K0((long[]) obj), moduleDescriptor, PrimitiveType.LONG);
        }
        boolean z2 = obj instanceof char[];
        ?? C3 = v.f35432a;
        int i5 = 0;
        if (z2) {
            char[] cArr = (char[]) obj;
            AbstractC3340k.e(cArr, "<this>");
            int length = cArr.length;
            if (length != 0) {
                if (length != 1) {
                    C3 = new ArrayList(cArr.length);
                    int length2 = cArr.length;
                    while (i5 < length2) {
                        C3.add(Character.valueOf(cArr[i5]));
                        i5++;
                    }
                } else {
                    C3 = AbstractC3935e.C(Character.valueOf(cArr[0]));
                }
            }
            return createArrayValue(C3, moduleDescriptor, PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            return createArrayValue(m.I0((float[]) obj), moduleDescriptor, PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            return createArrayValue(m.H0((double[]) obj), moduleDescriptor, PrimitiveType.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new NullValue();
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        AbstractC3340k.e(zArr, "<this>");
        int length3 = zArr.length;
        if (length3 != 0) {
            if (length3 != 1) {
                C3 = new ArrayList(zArr.length);
                int length4 = zArr.length;
                while (i5 < length4) {
                    C3.add(Boolean.valueOf(zArr[i5]));
                    i5++;
                }
            } else {
                C3 = AbstractC3935e.C(Boolean.valueOf(zArr[0]));
            }
        }
        return createArrayValue(C3, moduleDescriptor, PrimitiveType.BOOLEAN);
    }

    private final ArrayValue createArrayValue(List<?> list, ModuleDescriptor moduleDescriptor, PrimitiveType primitiveType) {
        List listS0 = o.S0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            ConstantValue constantValueCreateConstantValue$default = createConstantValue$default(this, it.next(), null, 2, null);
            if (constantValueCreateConstantValue$default != null) {
                arrayList.add(constantValueCreateConstantValue$default);
            }
        }
        if (moduleDescriptor == null) {
            return new ArrayValue(arrayList, new AnonymousClass1(primitiveType));
        }
        SimpleType primitiveArrayKotlinType = moduleDescriptor.getBuiltIns().getPrimitiveArrayKotlinType(primitiveType);
        AbstractC3340k.d(primitiveArrayKotlinType, "getPrimitiveArrayKotlinType(...)");
        return new TypedArrayValue(arrayList, primitiveArrayKotlinType);
    }
}
