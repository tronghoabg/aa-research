package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class ypa extends yox {
    public static final yom a = new yoy();
    public static final ThreadLocal b = new yoz();
    final AtomicInteger e = new AtomicInteger();

    @Override // defpackage.yox
    public final void a() {
        this.e.decrementAndGet();
    }
}
