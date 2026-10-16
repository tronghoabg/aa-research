package od;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class P0 extends V {

    /* renamed from: c, reason: collision with root package name */
    public static final ReferenceQueue f41771c = new ReferenceQueue();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f41772d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f41773e = Logger.getLogger(P0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final O0 f41774b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(M0 m02) {
        super(m02);
        ReferenceQueue referenceQueue = f41771c;
        ConcurrentHashMap concurrentHashMap = f41772d;
        this.f41774b = new O0(this, m02, referenceQueue, concurrentHashMap);
    }

    @Override // md.S
    public final md.S m() {
        O0 o02 = this.f41774b;
        if (!o02.f41769e.getAndSet(true)) {
            o02.clear();
        }
        M0 m02 = this.f41815a;
        m02.v();
        return m02;
    }

    @Override // md.S
    public final md.S n() {
        O0 o02 = this.f41774b;
        if (!o02.f41769e.getAndSet(true)) {
            o02.clear();
        }
        M0 m02 = this.f41815a;
        m02.n();
        return m02;
    }
}
