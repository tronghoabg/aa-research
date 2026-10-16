package com.google.d.f;

import com.google.d.b.an;
import com.google.d.f.x;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class a<API extends x<API>> {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.d.f.b.g f7666a;

    protected a(com.google.d.f.b.g gVar) {
        this.f7666a = gVar;
    }

    private static void k(String str, com.google.d.f.b.f fVar) {
        StringBuilder sb = new StringBuilder();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(fVar.e() / 1000000)));
        sb.append(": logging error [");
        an.i(1, fVar.f(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract x a(Level level);

    public final x b() {
        return a(Level.CONFIG);
    }

    public final x c() {
        return a(Level.FINE);
    }

    public final x d() {
        return a(Level.FINEST);
    }

    public final x e() {
        return a(Level.INFO);
    }

    public final x f() {
        return a(Level.SEVERE);
    }

    public final x g() {
        return a(Level.WARNING);
    }

    protected final String h() {
        return this.f7666a.a();
    }

    final void i(com.google.d.f.b.f fVar) {
        try {
            com.google.d.f.f.c cVarC = com.google.d.f.f.c.c();
            try {
                if (cVarC.b() <= 100) {
                    this.f7666a.c(fVar);
                } else {
                    k("unbounded recursion in log statement", fVar);
                }
                if (cVarC != null) {
                    cVarC.close();
                }
            } finally {
            }
        } catch (RuntimeException e2) {
            try {
                this.f7666a.b(e2, fVar);
            } catch (com.google.d.f.b.h e3) {
                throw e3;
            } catch (RuntimeException e4) {
                k(e4.getClass().getName() + ": " + e4.getMessage(), fVar);
                try {
                    e4.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    protected final boolean j(Level level) {
        return this.f7666a.d(level);
    }
}
