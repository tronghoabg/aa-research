package e.a.d;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f47212a = Logger.getLogger(j.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final String f47213b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f47214c;

    public j(long j2) {
        AtomicLong atomicLong = new AtomicLong();
        this.f47214c = atomicLong;
        com.google.d.b.an.m(j2 > 0, "value must be positive");
        this.f47213b = "keepalive time nanos";
        atomicLong.set(j2);
    }

    public final i a() {
        return new i(this, this.f47214c.get());
    }
}
