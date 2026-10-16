package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public final class CloseGuard {

    /* renamed from: b, reason: collision with root package name */
    public static final CloseGuard f41041b = new CloseGuard();

    /* renamed from: c, reason: collision with root package name */
    public static volatile Reporter f41042c;

    /* renamed from: a, reason: collision with root package name */
    public Throwable f41043a;

    public static final class DefaultReporter implements Reporter {
    }

    public interface Reporter {
    }

    public final void a() {
        if (this != f41041b) {
            this.f41043a = new Throwable("Explicit termination method 'close' not called");
        }
    }
}
