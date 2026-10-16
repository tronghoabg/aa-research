package od;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* renamed from: od.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3677d {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f41932c = Logger.getLogger(C3677d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final String f41933a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f41934b;

    public C3677d(long j8) {
        AtomicLong atomicLong = new AtomicLong();
        this.f41934b = atomicLong;
        Fe.e.p("value must be positive", j8 > 0);
        this.f41933a = "keepalive time nanos";
        atomicLong.set(j8);
    }
}
