package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adlo {
    private static final java.util.concurrent.atomic.AtomicLong b = new java.util.concurrent.atomic.AtomicLong();
    public final long a;
    private final java.lang.String c;
    private final java.lang.String d;

    public adlo(java.lang.String str, java.lang.String str2, long j) {
        str.getClass();
        defpackage.ysr.aY(!str.isEmpty(), "empty type");
        this.c = str;
        this.d = str2;
        this.a = j;
    }

    public static defpackage.adlo a(java.lang.Class cls, java.lang.String str) {
        cls.getClass();
        java.lang.String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return b(simpleName, str);
    }

    public static defpackage.adlo b(java.lang.String str, java.lang.String str2) {
        return new defpackage.adlo(str, str2, b.incrementAndGet());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.c + "<" + this.a + ">");
        java.lang.String str = this.d;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }
}
