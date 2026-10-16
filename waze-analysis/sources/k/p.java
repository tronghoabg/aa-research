package k;

import java.io.Closeable;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public abstract class p implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public static final p f50864a;

    static {
        x wVar;
        try {
            Class.forName("java.nio.file.Files");
            wVar = new x();
        } catch (ClassNotFoundException unused) {
            wVar = new w();
        }
        w wVar2 = wVar;
        f50864a = wVar2;
        String str = ab.f50788a;
        String property = System.getProperty("java.io.tmpdir");
        h.g.b.x.e(property, "getProperty(...)");
        aq.c(property, false);
        ClassLoader classLoader = k.a.g.class.getClassLoader();
        h.g.b.x.e(classLoader, "getClassLoader(...)");
        new k.a.g(classLoader, wVar2);
    }

    public abstract n a(ab abVar);

    public abstract o b(ab abVar);

    public abstract am c(ab abVar);

    public abstract void d(ab abVar, ab abVar2);

    public final boolean e(ab abVar) {
        h.g.b.x.f(abVar, "path");
        h.g.b.x.f(this, "<this>");
        h.g.b.x.f(abVar, "path");
        return b(abVar) != null;
    }

    public abstract void f(ab abVar);

    public abstract void g(ab abVar);

    public abstract n h(ab abVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
