package androidx.navigation;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavTypeKt {
    public static final NavType<?> navTypeFromArgType(String str) {
        if (x.n(NavType.IntType.getName(), str)) {
            return NavType.IntType;
        }
        if (x.n(NavType.IntArrayType.getName(), str)) {
            return NavType.IntArrayType;
        }
        if (x.n(NavType.IntListType.getName(), str)) {
            return NavType.IntListType;
        }
        if (x.n(NavType.LongType.getName(), str)) {
            return NavType.LongType;
        }
        if (x.n(NavType.LongArrayType.getName(), str)) {
            return NavType.LongArrayType;
        }
        if (x.n(NavType.LongListType.getName(), str)) {
            return NavType.LongListType;
        }
        if (x.n(NavType.BoolType.getName(), str)) {
            return NavType.BoolType;
        }
        if (x.n(NavType.BoolArrayType.getName(), str)) {
            return NavType.BoolArrayType;
        }
        if (x.n(NavType.BoolListType.getName(), str)) {
            return NavType.BoolListType;
        }
        if (x.n(NavType.StringType.getName(), str)) {
            return NavType.StringType;
        }
        if (x.n(NavType.StringArrayType.getName(), str)) {
            return NavType.StringArrayType;
        }
        if (x.n(NavType.StringListType.getName(), str)) {
            return NavType.StringListType;
        }
        if (x.n(NavType.FloatType.getName(), str)) {
            return NavType.FloatType;
        }
        if (x.n(NavType.FloatArrayType.getName(), str)) {
            return NavType.FloatArrayType;
        }
        if (x.n(NavType.FloatListType.getName(), str)) {
            return NavType.FloatListType;
        }
        return null;
    }

    public static final NavType<Object> navTypeInferFromValue(String str) {
        x.f(str, "value");
        try {
            try {
                try {
                    try {
                        NavType.IntType.parseValue(str);
                        NavType<Integer> navType = NavType.IntType;
                        x.d(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType;
                    } catch (IllegalArgumentException unused) {
                        NavType.LongType.parseValue(str);
                        NavType<Long> navType2 = NavType.LongType;
                        x.d(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType2;
                    }
                } catch (IllegalArgumentException unused2) {
                    NavType<String> navType3 = NavType.StringType;
                    x.d(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return navType3;
                }
            } catch (IllegalArgumentException unused3) {
                NavType.FloatType.parseValue(str);
                NavType<Float> navType4 = NavType.FloatType;
                x.d(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType4;
            }
        } catch (IllegalArgumentException unused4) {
            NavType.BoolType.parseValue(str);
            NavType<Boolean> navType5 = NavType.BoolType;
            x.d(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType5;
        }
    }

    public static final NavType<Object> navTypeInferFromValueType(Object obj) {
        if (obj instanceof Integer) {
            NavType<Integer> navType = NavType.IntType;
            x.d(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType;
        }
        if (obj instanceof int[]) {
            NavType<int[]> navType2 = NavType.IntArrayType;
            x.d(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType2;
        }
        if (obj instanceof Long) {
            NavType<Long> navType3 = NavType.LongType;
            x.d(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType3;
        }
        if (obj instanceof long[]) {
            NavType<long[]> navType4 = NavType.LongArrayType;
            x.d(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType4;
        }
        if (obj instanceof Float) {
            NavType<Float> navType5 = NavType.FloatType;
            x.d(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType5;
        }
        if (obj instanceof float[]) {
            NavType<float[]> navType6 = NavType.FloatArrayType;
            x.d(navType6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType6;
        }
        if (obj instanceof Boolean) {
            NavType<Boolean> navType7 = NavType.BoolType;
            x.d(navType7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType7;
        }
        if (obj instanceof boolean[]) {
            NavType<boolean[]> navType8 = NavType.BoolArrayType;
            x.d(navType8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType8;
        }
        if (!(obj instanceof String) && obj != null) {
            return null;
        }
        NavType<String> navType9 = NavType.StringType;
        x.d(navType9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
        return navType9;
    }

    public static final <T> T navTypeParseAndPut(NavType<T> navType, Bundle bundle, String str, String str2, T t) {
        x.f(navType, "<this>");
        x.f(bundle, "bundle");
        x.f(str, "key");
        SavedStateReader.m13269constructorimpl(bundle);
        if (!SavedStateReader.m13270containsimpl(bundle, str)) {
            throw new IllegalArgumentException("There is no previous value in this savedState.");
        }
        if (str2 == null) {
            return t;
        }
        T value = navType.parseValue(str2, t);
        navType.put(bundle, str, value);
        return value;
    }

    public static final <T> T parseAndPutFromUri(NavType<T> navType, Bundle bundle, String str, String str2) {
        x.f(navType, "<this>");
        x.f(bundle, "bundle");
        x.f(str, "key");
        x.f(str2, "value");
        return navType.parseAndPut(bundle, str, NavUriUtils.INSTANCE.decode(str2));
    }

    public static final <T> T parseAndPutFromUri(NavType<T> navType, Bundle bundle, String str, String str2, T t) {
        x.f(navType, "<this>");
        x.f(bundle, "bundle");
        x.f(str, "key");
        x.f(str2, "value");
        return navType.parseAndPut(bundle, str, NavUriUtils.INSTANCE.decode(str2), t);
    }

    public static final <T> T navTypeParseAndPut(NavType<T> navType, Bundle bundle, String str, String str2) {
        x.f(navType, "<this>");
        x.f(bundle, "bundle");
        x.f(str, "key");
        x.f(str2, "value");
        T value = navType.parseValue(str2);
        navType.put(bundle, str, value);
        return value;
    }
}
