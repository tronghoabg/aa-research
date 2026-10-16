package net.zetetic.database;

/* loaded from: classes5.dex */
public class Logger {

    /* renamed from: a, reason: collision with root package name */
    public static LogTarget f41038a = new LogcatTarget();

    public static void a(Exception exc, String str, String str2) {
        b().a(6, exc, str, str2);
    }

    public static LogTarget b() {
        if (f41038a == null) {
            f41038a = new NoopTarget();
        }
        return f41038a;
    }
}
