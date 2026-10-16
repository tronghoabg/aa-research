package defpackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Deprecated
/* loaded from: classes2.dex */
public final class ajxt extends ajxp {
    public final Log c = LogFactory.getLog(getClass());
    public final Lock d;
    protected final ajtd e;
    protected final Set f;
    protected final Queue g;
    protected final Queue h;
    protected final Map i;
    protected volatile boolean j;
    protected volatile int k;
    protected volatile int l;
    protected final ajxh m;

    public ajxt(ajxh ajxhVar, ajtd ajtdVar, int i) {
        ahgm.e(ajxhVar, "Connection operator");
        this.d = this.a;
        this.f = this.b;
        this.m = ajxhVar;
        this.e = ajtdVar;
        this.k = i;
        this.g = new LinkedList();
        this.h = new LinkedList();
        this.i = new HashMap();
    }

    public final void a(ajxq ajxqVar) {
        try {
            ajxqVar.e.close();
        } catch (IOException e) {
            this.c.debug("I/O error closing connection", e);
        }
    }

    public final void b(ajxq ajxqVar, boolean z, long j, TimeUnit timeUnit) {
        ajxx ajxxVar;
        String str;
        ajtg ajtgVar = ajxqVar.a;
        Log log = this.c;
        if (log.isDebugEnabled()) {
            log.debug("Releasing connection [" + String.valueOf(ajtgVar) + "][" + String.valueOf(ajxqVar.b) + "]");
        }
        Lock lock = this.d;
        lock.lock();
        try {
            if (this.j) {
                a(ajxqVar);
                lock.unlock();
                return;
            }
            this.f.remove(ajxqVar);
            ajxu ajxuVarD = d(ajtgVar);
            if (!z || ajxuVarD.a() < 0) {
                a(ajxqVar);
                ajxuVarD.b();
                this.l--;
            } else {
                if (log.isDebugEnabled()) {
                    if (j > 0) {
                        str = "for " + j + " " + String.valueOf(timeUnit);
                    } else {
                        str = "indefinitely";
                    }
                    log.debug("Pooling connection [" + String.valueOf(ajtgVar) + "][" + String.valueOf(ajxqVar.b) + "]; keep alive " + str);
                }
                int i = ajxuVarD.g;
                if (i <= 0) {
                    throw new IllegalStateException("No entry created for this pool. ".concat(String.valueOf(String.valueOf(ajxuVarD.b))));
                }
                LinkedList linkedList = ajxuVarD.e;
                if (i <= linkedList.size()) {
                    throw new IllegalStateException("No entry allocated from this pool. ".concat(String.valueOf(String.valueOf(ajxuVarD.b))));
                }
                linkedList.add(ajxqVar);
                ajxqVar.f = Math.min(Long.MAX_VALUE, j > 0 ? System.currentTimeMillis() + timeUnit.toMillis(j) : Long.MAX_VALUE);
                this.g.add(ajxqVar);
            }
            lock.lock();
            Queue queue = ajxuVarD.f;
            if (queue.isEmpty()) {
                Queue queue2 = this.h;
                if (queue2.isEmpty()) {
                    if (log.isDebugEnabled()) {
                        log.debug("Notifying no-one, there are no waiting threads");
                    }
                    ajxxVar = null;
                } else {
                    if (log.isDebugEnabled()) {
                        log.debug("Notifying thread waiting on any pool");
                    }
                    ajxxVar = (ajxx) queue2.remove();
                }
            } else {
                if (log.isDebugEnabled()) {
                    log.debug(a.bV(ajxuVarD.b, "Notifying thread waiting on pool [", "]"));
                }
                ajxxVar = (ajxx) queue.peek();
            }
            if (ajxxVar != null) {
                ajxxVar.b();
            }
            this.d.unlock();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.d.unlock();
        }
    }

    protected final ajxq c(ajxu ajxuVar, ajxh ajxhVar) {
        Log log = this.c;
        if (log.isDebugEnabled()) {
            log.debug("Creating new connection [" + String.valueOf(ajxuVar.b) + "]");
        }
        ajtg ajtgVar = ajxuVar.b;
        ajxq ajxqVar = new ajxq(ajxhVar, ajtgVar);
        this.d.lock();
        try {
            ahgm.a(ajtgVar.equals(ajxqVar.a), "Entry not planned for this pool");
            ajxuVar.g++;
            this.l++;
            this.f.add(ajxqVar);
            return ajxqVar;
        } finally {
            this.d.unlock();
        }
    }

    protected final ajxu d(ajtg ajtgVar) {
        this.d.lock();
        try {
            Map map = this.i;
            ajxu ajxuVar = (ajxu) map.get(ajtgVar);
            if (ajxuVar == null) {
                ajxuVar = new ajxu(ajtgVar, this.e);
                map.put(ajtgVar, ajxuVar);
            }
            return ajxuVar;
        } finally {
            this.d.unlock();
        }
    }
}
