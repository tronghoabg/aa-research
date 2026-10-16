package defpackage;

/* loaded from: classes.dex */
public enum abop {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(abms.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class k;

    static {
        abms abmsVar = abms.d;
    }

    abop(Class cls) {
        this.k = cls;
    }
}
