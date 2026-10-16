package defpackage;

/* loaded from: classes.dex */
public interface aeaa {
    public static final aeaa a;

    static {
        adul adulVar;
        try {
            Class.forName("java.time.Instant");
            adulVar = new adul(0);
        } catch (ClassNotFoundException unused) {
            adulVar = new adul(1);
        }
        a = adulVar;
    }

    long a();
}
