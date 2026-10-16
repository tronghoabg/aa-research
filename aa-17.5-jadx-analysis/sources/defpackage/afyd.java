package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class afyd {
    public final Map<aigw, aigw> kotlinArrayTypeToPrimitiveKotlinType;
    public final Map<aigl, aigw> primitiveKotlinTypeToKotlinArrayType;
    public final Map<afyi, aigw> primitiveTypeToArrayKotlinType;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
        } else if (i != 2) {
            objArr[0] = "primitiveTypeToArrayKotlinType";
        } else {
            objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private afyd(Map<afyi, aigw> map, Map<aigl, aigw> map2, Map<aigw, aigw> map3) {
        if (map == null) {
            $$$reportNull$$$0(0);
        }
        if (map2 == null) {
            $$$reportNull$$$0(1);
        }
        if (map3 == null) {
            $$$reportNull$$$0(2);
        }
        this.primitiveTypeToArrayKotlinType = map;
        this.primitiveKotlinTypeToKotlinArrayType = map2;
        this.kotlinArrayTypeToPrimitiveKotlinType = map3;
    }

    public /* synthetic */ afyd(Map map, Map map2, Map map3, afxz afxzVar) {
        this(map, map2, map3);
    }
}
