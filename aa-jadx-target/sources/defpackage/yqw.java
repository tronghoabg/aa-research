package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yqw {
    public static final java.util.Locale a = java.util.Locale.ROOT;

    public static java.lang.String a(java.lang.Object obj, java.lang.RuntimeException runtimeException) {
        java.lang.String simpleName;
        try {
            simpleName = runtimeException.toString();
        } catch (java.lang.RuntimeException e) {
            simpleName = e.getClass().getSimpleName();
        }
        return e(obj, simpleName);
    }

    public static java.lang.String b(java.lang.Object obj) {
        try {
            return c(obj);
        } catch (java.lang.RuntimeException e) {
            return a(obj, e);
        }
    }

    public static java.lang.String c(java.lang.Object obj) {
        if (obj == null) {
            return "null";
        }
        if (!obj.getClass().isArray()) {
            java.lang.String string = obj.toString();
            return string != null ? string : e(obj, "toString() returned null");
        }
        if (obj instanceof int[]) {
            return java.util.Arrays.toString((int[]) obj);
        }
        if (obj instanceof long[]) {
            return java.util.Arrays.toString((long[]) obj);
        }
        if (obj instanceof byte[]) {
            return java.util.Arrays.toString((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return java.util.Arrays.toString((char[]) obj);
        }
        if (obj instanceof short[]) {
            return java.util.Arrays.toString((short[]) obj);
        }
        if (obj instanceof float[]) {
            return java.util.Arrays.toString((float[]) obj);
        }
        if (obj instanceof double[]) {
            return java.util.Arrays.toString((double[]) obj);
        }
        return obj instanceof boolean[] ? java.util.Arrays.toString((boolean[]) obj) : java.util.Arrays.toString((java.lang.Object[]) obj);
    }

    public static void d(java.lang.StringBuilder sb, long j, boolean z) {
        if (j == 0) {
            sb.append("0");
            return;
        }
        java.lang.String str = true != z ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int iNumberOfLeadingZeros = (63 - java.lang.Long.numberOfLeadingZeros(j)) & (-4); iNumberOfLeadingZeros >= 0; iNumberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> iNumberOfLeadingZeros) & 15)));
        }
    }

    private static java.lang.String e(java.lang.Object obj, java.lang.String str) {
        return "{" + obj.getClass().getName() + "@" + java.lang.System.identityHashCode(obj) + ": " + str + "}";
    }
}
