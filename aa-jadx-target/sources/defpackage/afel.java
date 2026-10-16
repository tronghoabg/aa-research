package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afel {
    public static final java.lang.Integer a;

    static {
        java.lang.Integer num;
        java.lang.Integer num2 = null;
        try {
            java.lang.Object obj = java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        } catch (java.lang.Throwable unused) {
        }
        if (num != null && num.intValue() > 0) {
            num2 = num;
        }
        a = num2;
    }
}
