package okhttp3.internal.c;

import androidx.core.app.NotificationCompat;
import h.g.b.x;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final long f56045a;

    /* renamed from: b, reason: collision with root package name */
    private final okhttp3.internal.b.c f56046b;

    /* renamed from: c, reason: collision with root package name */
    private final n f56047c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentLinkedQueue f56048d;

    public o(okhttp3.internal.b.e eVar, TimeUnit timeUnit) {
        x.f(eVar, "taskRunner");
        x.f(timeUnit, "timeUnit");
        this.f56045a = timeUnit.toNanos(5L);
        this.f56046b = eVar.c();
        this.f56047c = new n(this, String.valueOf(okhttp3.internal.b.f55959e).concat(" ConnectionPool"));
        this.f56048d = new ConcurrentLinkedQueue();
    }

    public final long a(long j2) throws IOException {
        Iterator it = this.f56048d.iterator();
        x.e(it, "iterator(...)");
        long j3 = Long.MIN_VALUE;
        m mVar = null;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            m mVar2 = (m) it.next();
            x.c(mVar2);
            synchronized (mVar2) {
                byte[] bArr = okhttp3.internal.b.f55955a;
                List listE = mVar2.e();
                int i4 = 0;
                while (true) {
                    if (i4 < listE.size()) {
                        Reference reference = (Reference) listE.get(i4);
                        if (reference.get() != null) {
                            i4++;
                        } else {
                            x.d(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                            okhttp3.internal.g.g.f56287a.f("A connection to " + mVar2.g().c().j() + " was leaked. Did you forget to close a response body?", ((h) reference).a());
                            listE.remove(i4);
                            mVar2.t();
                            if (listE.isEmpty()) {
                                mVar2.n(j2 - this.f56045a);
                                break;
                            }
                        }
                    } else if (listE.size() > 0) {
                        i3++;
                    }
                }
                i2++;
                long jB = j2 - mVar2.b();
                if (jB > j3) {
                    j3 = jB;
                }
                if (jB > j3) {
                    mVar = mVar2;
                }
            }
        }
        long j4 = this.f56045a;
        if (j3 < j4 && i2 <= 5) {
            if (i2 > 0) {
                return j4 - j3;
            }
            if (i3 > 0) {
                return j4;
            }
            return -1L;
        }
        x.c(mVar);
        synchronized (mVar) {
            if (mVar.e().isEmpty() && mVar.b() + j3 == j2) {
                mVar.t();
                this.f56048d.remove(mVar);
                okhttp3.internal.b.t(mVar.c());
                if (this.f56048d.isEmpty()) {
                    this.f56046b.d();
                }
                return 0L;
            }
            return 0L;
        }
    }

    public final void b(m mVar) {
        x.f(mVar, "connection");
        byte[] bArr = okhttp3.internal.b.f55955a;
        this.f56048d.add(mVar);
        this.f56046b.l(this.f56047c);
    }

    public final boolean c(okhttp3.a aVar, j jVar, List list, boolean z) {
        x.f(aVar, "address");
        x.f(jVar, NotificationCompat.CATEGORY_CALL);
        Iterator it = this.f56048d.iterator();
        x.e(it, "iterator(...)");
        while (it.hasNext()) {
            m mVar = (m) it.next();
            x.c(mVar);
            synchronized (mVar) {
                if (z) {
                    if (!mVar.s()) {
                        continue;
                    }
                }
                if (mVar.q(aVar, list)) {
                    jVar.q(mVar);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(m mVar) {
        x.f(mVar, "connection");
        byte[] bArr = okhttp3.internal.b.f55955a;
        if (!mVar.p()) {
            this.f56046b.l(this.f56047c);
            return false;
        }
        mVar.t();
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f56048d;
        concurrentLinkedQueue.remove(mVar);
        if (!concurrentLinkedQueue.isEmpty()) {
            return true;
        }
        this.f56046b.d();
        return true;
    }
}
