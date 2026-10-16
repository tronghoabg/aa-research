package defpackage;

/* loaded from: classes3.dex */
public abstract class vjq {
    private static final ThreadLocal a = new vjn();

    public static vjq c() {
        return (vjq) a.get();
    }

    public abstract void a(vjo vjoVar);

    public abstract void b(vjo vjoVar);
}
