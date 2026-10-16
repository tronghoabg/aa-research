package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface aeba {
    public static final defpackage.aeba a;

    static {
        defpackage.advm advmVar;
        try {
            java.lang.Class.forName("java.time.Instant");
            advmVar = new defpackage.advm(0);
        } catch (java.lang.ClassNotFoundException unused) {
            advmVar = new defpackage.advm(1);
        }
        a = advmVar;
    }

    long a();
}
