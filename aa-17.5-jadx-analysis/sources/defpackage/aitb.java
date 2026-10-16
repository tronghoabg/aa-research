package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public final class aitb extends aisz implements aiwe {
    public final Thread b;
    public final aius c;

    public aitb(afco afcoVar, Thread thread, aius aiusVar) {
        super(afcoVar, true);
        this.b = thread;
        this.c = aiusVar;
    }

    @Override // defpackage.afdb
    public final /* bridge */ StackTraceElement ea() {
        return aiwc.a(this);
    }

    @Override // defpackage.afdb
    public final /* bridge */ afdb eb() {
        int i;
        if (!aiwd.a || x()) {
            return null;
        }
        List listCD = woy.cD(this.b.getStackTrace());
        if (x()) {
            return null;
        }
        Iterator it = listCD.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (aijn.b((StackTraceElement) it.next())) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return null;
        }
        int size = listCD.size();
        while (true) {
            i2++;
            if (i2 >= size) {
                break;
            }
            if (!aijn.b((StackTraceElement) listCD.get(i2))) {
                i = i2;
                break;
            }
        }
        return aijn.a(listCD, i);
    }

    @Override // defpackage.aiwe
    public final /* bridge */ StackTraceElement k() {
        return aiwd.e;
    }

    @Override // defpackage.aivo
    protected final void l(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.b;
        if (affa.f(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }

    @Override // defpackage.aivo
    protected final boolean m() {
        return true;
    }
}
