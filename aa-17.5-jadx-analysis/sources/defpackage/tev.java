package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class tev extends yqr {
    public static final AtomicInteger a = new AtomicInteger(7);
    private final String b;
    private final ypp c;

    public tev(String str) {
        super(str);
        this.b = str.substring(0, Math.min(str.length(), 23));
        this.c = yrc.c.a(str);
    }

    @Override // defpackage.ypp
    public final void a(ypo ypoVar) {
        this.c.a(ypoVar);
    }

    @Override // defpackage.ypp
    public final boolean b(Level level) {
        return spu.aS(this.b, yrm.f(level), a.get());
    }
}
