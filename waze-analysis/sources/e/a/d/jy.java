package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public interface jy {

    /* renamed from: a, reason: collision with root package name */
    public static final jy f47262a;

    static {
        Cdo cdo;
        try {
            Class.forName("java.time.Instant");
            cdo = new Cdo(0);
        } catch (ClassNotFoundException unused) {
            cdo = new Cdo(1);
        }
        f47262a = cdo;
    }

    long a();
}
