package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
final class ynx extends yox {
    public static final yom a = new ynv();
    public final AtomicLong b = new AtomicLong(-1);

    @Override // defpackage.yox
    public final void a() {
        AtomicLong atomicLong = this.b;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
