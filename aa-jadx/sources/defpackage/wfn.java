package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wfn {
    public static final java.lang.reflect.Method a;

    static {
        java.lang.reflect.Method method = null;
        try {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", java.lang.String.class, java.lang.String.class);
                cls.getMethod("getInt", java.lang.String.class, java.lang.Integer.TYPE);
                cls.getMethod("getLong", java.lang.String.class, java.lang.Long.TYPE);
                cls.getMethod("getBoolean", java.lang.String.class, java.lang.Boolean.TYPE);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        } finally {
            a = method;
        }
    }
}
