package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ko {
    public static final boolean a;
    public static final java.lang.reflect.Method b;
    public static final java.lang.reflect.Field c;
    public static final java.lang.reflect.Field d;
    public static final java.lang.reflect.Field e;
    public static final java.lang.reflect.Field f;

    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    static {
        java.lang.reflect.Method method;
        java.lang.reflect.Field field;
        java.lang.reflect.Field field2;
        java.lang.reflect.Field field3;
        boolean z;
        java.lang.reflect.Field field4;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.graphics.Insets");
            method = android.graphics.drawable.Drawable.class.getMethod("getOpticalInsets", null);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z = true;
                        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException unused) {
                            z = false;
                            field4 = null;
                        }
                    } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (java.lang.ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    z = false;
                    field4 = null;
                    if (z) {
                        b = method;
                        c = field;
                        d = field2;
                        e = field3;
                        f = field4;
                        a = true;
                        return;
                    }
                    b = null;
                    c = null;
                    d = null;
                    e = null;
                    f = null;
                    a = false;
                } catch (java.lang.NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    z = false;
                    field4 = null;
                    if (z) {
                        b = method;
                        c = field;
                        d = field2;
                        e = field3;
                        f = field4;
                        a = true;
                        return;
                    }
                    b = null;
                    c = null;
                    d = null;
                    e = null;
                    f = null;
                    a = false;
                } catch (java.lang.NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    z = false;
                    field4 = null;
                    if (z) {
                        b = method;
                        c = field;
                        d = field2;
                        e = field3;
                        f = field4;
                        a = true;
                        return;
                    }
                    b = null;
                    c = null;
                    d = null;
                    e = null;
                    f = null;
                    a = false;
                }
            } catch (java.lang.ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                z = false;
                field4 = null;
                if (z) {
                    b = method;
                    c = field;
                    d = field2;
                    e = field3;
                    f = field4;
                    a = true;
                    return;
                }
                b = null;
                c = null;
                d = null;
                e = null;
                f = null;
                a = false;
            } catch (java.lang.NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                z = false;
                field4 = null;
                if (z) {
                    b = method;
                    c = field;
                    d = field2;
                    e = field3;
                    f = field4;
                    a = true;
                    return;
                }
                b = null;
                c = null;
                d = null;
                e = null;
                f = null;
                a = false;
            } catch (java.lang.NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                z = false;
                field4 = null;
                if (z) {
                    b = method;
                    c = field;
                    d = field2;
                    e = field3;
                    f = field4;
                    a = true;
                    return;
                }
                b = null;
                c = null;
                d = null;
                e = null;
                f = null;
                a = false;
            }
        } catch (java.lang.ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (java.lang.NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (java.lang.NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z) {
            b = method;
            c = field;
            d = field2;
            e = field3;
            f = field4;
            a = true;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        a = false;
    }
}
