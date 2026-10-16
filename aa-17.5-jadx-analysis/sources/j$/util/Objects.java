package j$.util;

import java.util.Arrays;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class Objects {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int checkIndex(int i, int i2) {
        String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        java.util.List listA = j$.desugar.sun.nio.fs.g.A(new Integer[]{Integer.valueOf(i), Integer.valueOf(i2)});
        if (listA != null) {
            switch (listA.size() != 2 ? "" : "checkIndex") {
                case "checkIndex":
                    str = String.format("Index %d out of bounds for length %d", listA.get(0), listA.get(1));
                    break;
                case "checkFromToIndex":
                    str = String.format("Range [%d, %d) out of bounds for length %d", listA.get(0), listA.get(1), listA.get(2));
                    break;
                case "checkFromIndexSize":
                    str = String.format("Range [%d, %<d + %d) out of bounds for length %d", listA.get(0), listA.get(1), listA.get(2));
                    break;
                default:
                    str = String.format("Range check failed: %s %s", "checkIndex", listA);
                    break;
            }
        } else {
            str = "Range check failed: checkIndex";
        }
        throw new IndexOutOfBoundsException(str);
    }

    public static boolean deepEquals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return ((obj instanceof Object[]) && (obj2 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj, (Object[]) obj2) : ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : ((obj instanceof short[]) && (obj2 instanceof short[])) ? Arrays.equals((short[]) obj, (short[]) obj2) : ((obj instanceof int[]) && (obj2 instanceof int[])) ? Arrays.equals((int[]) obj, (int[]) obj2) : ((obj instanceof long[]) && (obj2 instanceof long[])) ? Arrays.equals((long[]) obj, (long[]) obj2) : ((obj instanceof char[]) && (obj2 instanceof char[])) ? Arrays.equals((char[]) obj, (char[]) obj2) : ((obj instanceof float[]) && (obj2 instanceof float[])) ? Arrays.equals((float[]) obj, (float[]) obj2) : ((obj instanceof double[]) && (obj2 instanceof double[])) ? Arrays.equals((double[]) obj, (double[]) obj2) : ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) ? Arrays.equals((boolean[]) obj, (boolean[]) obj2) : obj.equals(obj2);
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static boolean nonNull(Object obj) {
        return obj != null;
    }

    public static <T> T requireNonNullElse(T t, T t2) {
        if (t != null) {
            return t;
        }
        a(t2, "defaultObj");
        return t2;
    }

    public static String toString(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }

    public static String toString(Object obj) {
        return String.valueOf(obj);
    }
}
