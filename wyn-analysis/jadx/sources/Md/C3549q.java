package md;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: md.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3549q {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f40712a = Logger.getLogger(C3549q.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final C3549q f40713b = new C3549q();

    public static C3549q b() {
        ((o0) AbstractC3547o.f40706a).getClass();
        C3549q c3549q = (C3549q) o0.f40708b.get();
        C3549q c3549q2 = f40713b;
        if (c3549q == null) {
            c3549q = c3549q2;
        }
        return c3549q == null ? c3549q2 : c3549q;
    }

    public final C3549q a() {
        ((o0) AbstractC3547o.f40706a).getClass();
        ThreadLocal threadLocal = o0.f40708b;
        C3549q c3549q = (C3549q) threadLocal.get();
        C3549q c3549q2 = f40713b;
        if (c3549q == null) {
            c3549q = c3549q2;
        }
        threadLocal.set(this);
        return c3549q == null ? c3549q2 : c3549q;
    }

    public final void c(C3549q c3549q) {
        if (c3549q == null) {
            throw new NullPointerException("toAttach");
        }
        ((o0) AbstractC3547o.f40706a).getClass();
        ThreadLocal threadLocal = o0.f40708b;
        C3549q c3549q2 = (C3549q) threadLocal.get();
        C3549q c3549q3 = f40713b;
        if (c3549q2 == null) {
            c3549q2 = c3549q3;
        }
        if (c3549q2 != this) {
            o0.f40707a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (c3549q != c3549q3) {
            threadLocal.set(c3549q);
        } else {
            threadLocal.set(null);
        }
    }
}
