package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class yox<API extends defpackage.ypu<API>> {
    public final defpackage.yqu b;

    protected yox(defpackage.yqu yquVar) {
        this.b = yquVar;
    }

    public static void j(java.lang.String str, defpackage.yqt yqtVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        sb.append(new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new java.util.Date(yqtVar.am() / 1000000)));
        sb.append(": logging error [");
        defpackage.ysr.g(1, yqtVar.an(), sb);
        sb.append("]: ");
        sb.append(str);
        java.lang.System.err.println(sb);
        java.lang.System.err.flush();
    }

    public abstract defpackage.ypu a(java.util.logging.Level level);

    public final defpackage.ypu d() {
        return a(java.util.logging.Level.CONFIG);
    }

    public final defpackage.ypu e() {
        return a(java.util.logging.Level.FINE);
    }

    public final defpackage.ypu f() {
        return a(java.util.logging.Level.INFO);
    }

    public final defpackage.ypu g() {
        return a(java.util.logging.Level.SEVERE);
    }

    public final defpackage.ypu h() {
        return a(java.util.logging.Level.WARNING);
    }

    protected final java.lang.String i() {
        return this.b.f();
    }

    protected final boolean k(java.util.logging.Level level) {
        return this.b.b(level);
    }
}
