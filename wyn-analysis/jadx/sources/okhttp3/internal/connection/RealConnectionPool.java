package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Address;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealConnectionPool {

    /* renamed from: a, reason: collision with root package name */
    public final long f42617a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskQueue f42618b;

    /* renamed from: c, reason: collision with root package name */
    public final RealConnectionPool$cleanupTask$1 f42619c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f42620d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        AbstractC3340k.e(taskRunner, "taskRunner");
        AbstractC3340k.e(timeUnit, "timeUnit");
        this.f42617a = timeUnit.toNanos(5L);
        this.f42618b = taskRunner.e();
        final String strK = AbstractC3340k.k(" ConnectionPool", Util.f42444g);
        this.f42619c = new Task(strK) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                RealConnectionPool realConnectionPool = this.f42621e;
                long jNanoTime = System.nanoTime();
                Iterator it = realConnectionPool.f42620d.iterator();
                int i5 = 0;
                long j8 = Long.MIN_VALUE;
                RealConnection realConnection = null;
                int i10 = 0;
                while (it.hasNext()) {
                    RealConnection connection = (RealConnection) it.next();
                    AbstractC3340k.d(connection, "connection");
                    synchronized (connection) {
                        if (realConnectionPool.b(connection, jNanoTime) > 0) {
                            i10++;
                        } else {
                            i5++;
                            long j10 = jNanoTime - connection.f42612q;
                            if (j10 > j8) {
                                realConnection = connection;
                                j8 = j10;
                            }
                        }
                    }
                }
                long j11 = realConnectionPool.f42617a;
                if (j8 < j11 && i5 <= 5) {
                    if (i5 > 0) {
                        return j11 - j8;
                    }
                    if (i10 > 0) {
                        return j11;
                    }
                    return -1L;
                }
                AbstractC3340k.b(realConnection);
                synchronized (realConnection) {
                    if (!realConnection.f42611p.isEmpty()) {
                        return 0L;
                    }
                    if (realConnection.f42612q + j8 != jNanoTime) {
                        return 0L;
                    }
                    realConnection.f42606j = true;
                    realConnectionPool.f42620d.remove(realConnection);
                    Socket socket = realConnection.f42600d;
                    AbstractC3340k.b(socket);
                    Util.d(socket);
                    if (realConnectionPool.f42620d.isEmpty()) {
                        realConnectionPool.f42618b.a();
                    }
                    return 0L;
                }
            }
        };
        this.f42620d = new ConcurrentLinkedQueue();
    }

    public final boolean a(Address address, RealCall call, List list, boolean z2) {
        AbstractC3340k.e(call, "call");
        Iterator it = this.f42620d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            RealConnection connection = (RealConnection) it.next();
            AbstractC3340k.d(connection, "connection");
            synchronized (connection) {
                if (z2) {
                    if (!(connection.f42603g != null)) {
                    }
                }
                if (connection.i(address, list)) {
                    call.a(connection);
                    return true;
                }
            }
        }
    }

    public final int b(RealConnection realConnection, long j8) {
        byte[] bArr = Util.f42438a;
        ArrayList arrayList = realConnection.f42611p;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i5);
            if (reference.get() != null) {
                i5++;
            } else {
                String str = "A connection to " + realConnection.f42598b.f42427a.f42144h + " was leaked. Did you forget to close a response body?";
                Platform.f42887a.getClass();
                Platform.f42888b.j(str, ((RealCall.CallReference) reference).f42596a);
                arrayList.remove(i5);
                realConnection.f42606j = true;
                if (arrayList.isEmpty()) {
                    realConnection.f42612q = j8 - this.f42617a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
