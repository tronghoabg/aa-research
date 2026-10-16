package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agxf {
    public static void a(long j, java.lang.String str) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static boolean b(double d, int i, int i2) {
        return d >= ((double) i) && d < ((double) i2);
    }

    public static /* synthetic */ java.lang.String c(int i) {
        if (i == 1) {
            return "BOOL";
        }
        if (i == 2) {
            return "INT";
        }
        if (i != 3) {
            return i != 4 ? "BYTES" : "STRING";
        }
        return "FLOAT";
    }

    public static final boolean isJavaField(defpackage.agen agenVar) {
        agenVar.getClass();
        return agenVar.getGetter() == null;
    }
}
