package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ejy {
    VOID(java.lang.Void.class),
    INT(java.lang.Integer.class),
    LONG(java.lang.Long.class),
    FLOAT(java.lang.Float.class),
    DOUBLE(java.lang.Double.class),
    BOOLEAN(java.lang.Boolean.class),
    STRING(java.lang.String.class),
    BYTE_STRING(defpackage.eix.class),
    ENUM(java.lang.Integer.class),
    MESSAGE(java.lang.Object.class);

    public final java.lang.Class k;

    static {
        defpackage.eix eixVar = defpackage.eix.b;
    }

    ejy(java.lang.Class cls) {
        this.k = cls;
    }
}
