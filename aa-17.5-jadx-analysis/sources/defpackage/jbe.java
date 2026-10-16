package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
class jbe {
    protected final jeb f;
    final /* synthetic */ jbf i;
    protected final ArrayDeque e = new ArrayDeque();
    public final AtomicLong g = new AtomicLong(0);
    protected volatile boolean h = false;

    public jbe(jbf jbfVar, jeb jebVar) {
        this.i = jbfVar;
        this.f = jebVar;
    }

    public long b() {
        return 0L;
    }

    public synchronized izm c() {
        return (izm) this.e.getFirst();
    }

    public jeb d() {
        return this.f;
    }

    public synchronized void e(izm izmVar) {
        ArrayDeque arrayDeque = this.e;
        boolean zIsEmpty = arrayDeque.isEmpty();
        arrayDeque.add(izmVar);
        if (zIsEmpty) {
            this.i.c(this);
            this.g.set(SystemClock.elapsedRealtimeNanos());
        }
    }

    public synchronized void g(int i, PrintWriter printWriter) {
        printWriter.format(" %d messages on channel %d, priority = %d%n", Integer.valueOf(this.e.size()), Integer.valueOf(i), Integer.valueOf(d().j));
    }

    protected void h() throws IOException {
        j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0125, code lost:
    
        ((defpackage.iyo) r14.next()).b.h(r23, r25, r26, r4, r28);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbe.i():void");
    }

    protected final synchronized izm j() {
        izm izmVar;
        ArrayDeque arrayDeque = this.e;
        izmVar = (izm) arrayDeque.removeFirst();
        jbf jbfVar = this.i;
        jbfVar.h(this);
        if (arrayDeque.isEmpty()) {
            this.g.set(0L);
        } else {
            jbfVar.c(this);
        }
        return izmVar;
    }

    final synchronized void k() {
        while (true) {
            ArrayDeque arrayDeque = this.e;
            if (!arrayDeque.isEmpty()) {
                ((izm) arrayDeque.remove()).c.close();
            }
        }
    }

    public void f() {
    }
}
