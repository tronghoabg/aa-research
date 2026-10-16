package androidx.navigation.serialization;

import androidx.navigation.NavType;
import h.g.b.x;
import h.l.s;
import h.n.o;
import kotlinx.b.a.q;
import kotlinx.b.a.w;
import kotlinx.b.b;
import kotlinx.b.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavTypeConverterKt {

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalType.values().length];
            try {
                iArr[InternalType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalType.STRING_NULLABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InternalType.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InternalType.BOOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InternalType.DOUBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InternalType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InternalType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InternalType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InternalType.INT_NULLABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[InternalType.BOOL_NULLABLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[InternalType.DOUBLE_NULLABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[InternalType.FLOAT_NULLABLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[InternalType.LONG_NULLABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[InternalType.INT_ARRAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[InternalType.BOOL_ARRAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[InternalType.DOUBLE_ARRAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[InternalType.FLOAT_ARRAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[InternalType.LONG_ARRAY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[InternalType.ARRAY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[InternalType.LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[InternalType.ENUM_NULLABLE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final NavType<?> getNavType(q qVar) {
        x.f(qVar, "<this>");
        InternalType internalType = toInternalType(qVar);
        InternalType internalType2 = InternalType.INT;
        switch (internalType.ordinal()) {
            case 0:
                return NavType.IntType;
            case 1:
                return InternalNavType.INSTANCE.getIntNullableType();
            case 2:
                return NavType.BoolType;
            case 3:
                return InternalNavType.INSTANCE.getBoolNullableType();
            case 4:
                return InternalNavType.INSTANCE.getDoubleType();
            case 5:
                return InternalNavType.INSTANCE.getDoubleNullableType();
            case 6:
                return NavType.FloatType;
            case 7:
                return InternalNavType.INSTANCE.getFloatNullableType();
            case 8:
                return NavType.LongType;
            case 9:
                return InternalNavType.INSTANCE.getLongNullableType();
            case 10:
                return InternalNavType.INSTANCE.getStringNonNullableType();
            case 11:
                return NavType.StringType;
            case 12:
                return NavType.IntArrayType;
            case 13:
                return NavType.BoolArrayType;
            case 14:
                return InternalNavType.INSTANCE.getDoubleArrayType();
            case 15:
                return NavType.FloatArrayType;
            case 16:
                return NavType.LongArrayType;
            case 17:
                int iOrdinal = toInternalType(qVar.g(0)).ordinal();
                return iOrdinal != 10 ? iOrdinal != 11 ? UNKNOWN.INSTANCE : InternalNavType.INSTANCE.getStringNullableArrayType() : NavType.StringArrayType;
            case 18:
                int iOrdinal2 = toInternalType(qVar.g(0)).ordinal();
                return iOrdinal2 != 0 ? iOrdinal2 != 2 ? iOrdinal2 != 4 ? iOrdinal2 != 6 ? iOrdinal2 != 8 ? iOrdinal2 != 19 ? iOrdinal2 != 10 ? iOrdinal2 != 11 ? UNKNOWN.INSTANCE : InternalNavType.INSTANCE.getStringNullableListType() : NavType.StringListType : NavTypeConverter_androidKt.parseEnumList(qVar) : NavType.LongListType : NavType.FloatListType : InternalNavType.INSTANCE.getDoubleListType() : NavType.BoolListType : NavType.IntListType;
            case 19:
                return NavTypeConverter_androidKt.parseEnum(qVar);
            case 20:
                return NavTypeConverter_androidKt.parseNullableEnum(qVar);
            default:
                return UNKNOWN.INSTANCE;
        }
    }

    public static final boolean matchKType(q qVar, s sVar) {
        x.f(qVar, "<this>");
        x.f(sVar, "kType");
        if (qVar.k() != sVar.c()) {
            return false;
        }
        b bVarC = p.c(sVar);
        if (bVarC != null) {
            return x.n(qVar, bVarC.getDescriptor());
        }
        throw new IllegalStateException("Cannot find KSerializer for [" + qVar.d() + "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
    }

    private static final InternalType toInternalType(q qVar) {
        String strAc = o.ac(qVar.d(), "?", "");
        return x.n(qVar.h(), w.f50939a) ? qVar.k() ? InternalType.ENUM_NULLABLE : InternalType.ENUM : x.n(strAc, "kotlin.Int") ? qVar.k() ? InternalType.INT_NULLABLE : InternalType.INT : x.n(strAc, "kotlin.Boolean") ? qVar.k() ? InternalType.BOOL_NULLABLE : InternalType.BOOL : x.n(strAc, "kotlin.Double") ? qVar.k() ? InternalType.DOUBLE_NULLABLE : InternalType.DOUBLE : x.n(strAc, "kotlin.Float") ? qVar.k() ? InternalType.FLOAT_NULLABLE : InternalType.FLOAT : x.n(strAc, "kotlin.Long") ? qVar.k() ? InternalType.LONG_NULLABLE : InternalType.LONG : x.n(strAc, "kotlin.String") ? qVar.k() ? InternalType.STRING_NULLABLE : InternalType.STRING : x.n(strAc, "kotlin.IntArray") ? InternalType.INT_ARRAY : x.n(strAc, "kotlin.DoubleArray") ? InternalType.DOUBLE_ARRAY : x.n(strAc, "kotlin.BooleanArray") ? InternalType.BOOL_ARRAY : x.n(strAc, "kotlin.FloatArray") ? InternalType.FLOAT_ARRAY : x.n(strAc, "kotlin.LongArray") ? InternalType.LONG_ARRAY : x.n(strAc, "kotlin.Array") ? InternalType.ARRAY : o.ah(strAc, "kotlin.collections.ArrayList") ? InternalType.LIST : InternalType.UNKNOWN;
    }
}
