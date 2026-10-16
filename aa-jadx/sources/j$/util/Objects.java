package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class Objects {
    public static void a(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException(str);
        }
    }

    public static int checkIndex(int i, int i2) {
        java.lang.String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        java.util.List listA = j$.desugar.sun.nio.fs.g.A(new java.lang.Integer[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)});
        if (listA != null) {
            switch (listA.size() != 2 ? "" : "checkIndex") {
                case "checkIndex":
                    str = java.lang.String.format("Index %d out of bounds for length %d", listA.get(0), listA.get(1));
                    break;
                case "checkFromToIndex":
                    str = java.lang.String.format("Range [%d, %d) out of bounds for length %d", listA.get(0), listA.get(1), listA.get(2));
                    break;
                case "checkFromIndexSize":
                    str = java.lang.String.format("Range [%d, %<d + %d) out of bounds for length %d", listA.get(0), listA.get(1), listA.get(2));
                    break;
                default:
                    str = java.lang.String.format("Range check failed: %s %s", "checkIndex", listA);
                    break;
            }
        } else {
            str = "Range check failed: checkIndex";
        }
        throw new java.lang.IndexOutOfBoundsException(str);
    }

    public static boolean deepEquals(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof java.lang.Object[]) && (obj2 instanceof java.lang.Object[])) {
            return java.util.Arrays.deepEquals((java.lang.Object[]) obj, (java.lang.Object[]) obj2);
        }
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return java.util.Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof short[]) && (obj2 instanceof short[])) {
            return java.util.Arrays.equals((short[]) obj, (short[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return java.util.Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return java.util.Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof char[]) && (obj2 instanceof char[])) {
            return java.util.Arrays.equals((char[]) obj, (char[]) obj2);
        }
        if ((obj instanceof float[]) && (obj2 instanceof float[])) {
            return java.util.Arrays.equals((float[]) obj, (float[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return java.util.Arrays.equals((double[]) obj, (double[]) obj2);
        }
        return ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) ? java.util.Arrays.equals((boolean[]) obj, (boolean[]) obj2) : obj.equals(obj2);
    }

    public static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hash(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }

    public static int hashCode(java.lang.Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static boolean nonNull(java.lang.Object obj) {
        return obj != null;
    }

    public static <T> T requireNonNullElse(T t, T t2) {
        if (t != null) {
            return t;
        }
        a(t2, "defaultObj");
        return t2;
    }

    public static java.lang.String toString(java.lang.Object obj, java.lang.String str) {
        return obj != null ? obj.toString() : str;
    }

    public static java.lang.String toString(java.lang.Object obj) {
        return java.lang.String.valueOf(obj);
    }
}
