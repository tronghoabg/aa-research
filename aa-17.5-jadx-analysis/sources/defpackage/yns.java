package defpackage;

import defpackage.yop;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class yns<API extends yop<API>> {
    public final ypp b;

    protected yns(ypp yppVar) {
        this.b = yppVar;
    }

    public static void j(String str, ypo ypoVar) {
        StringBuilder sb = new StringBuilder();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(ypoVar.am() / 1000000)));
        sb.append(": logging error [");
        yrm.j(1, ypoVar.an(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract yop a(Level level);

    public final yop d() {
        return a(Level.CONFIG);
    }

    public final yop e() {
        return a(Level.FINE);
    }

    public final yop f() {
        return a(Level.INFO);
    }

    public final yop g() {
        return a(Level.SEVERE);
    }

    public final yop h() {
        return a(Level.WARNING);
    }

    protected final String i() {
        return this.b.f();
    }

    protected final boolean k(Level level) {
        return this.b.b(level);
    }
}
