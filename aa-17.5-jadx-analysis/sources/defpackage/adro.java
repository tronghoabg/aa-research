package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class adro {
    public static final Logger a = Logger.getLogger(adro.class.getName());
    public final String b;
    public final AtomicLong c;

    public adro() {
        AtomicLong atomicLong = new AtomicLong();
        this.c = atomicLong;
        this.b = "keepalive time nanos";
        atomicLong.set(Long.MAX_VALUE);
    }
}
