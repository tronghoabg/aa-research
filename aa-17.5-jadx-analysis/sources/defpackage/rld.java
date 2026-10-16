package defpackage;

import android.util.SparseArray;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class rld {
    public static final ypf a = ols.R("CAR.GAL.SNOOP");
    public final LinkedBlockingDeque c;
    public final ydx d;
    public final boolean e;
    private ExecutorService f;
    private final rlh h;
    public final Object b = new Object();
    private final SparseArray i = new SparseArray();
    private final AtomicLong g = new AtomicLong();

    public rld(rlh rlhVar, LinkedBlockingDeque linkedBlockingDeque, ydx ydxVar, ExecutorService executorService) {
        this.h = rlhVar;
        this.e = rlhVar.a;
        this.c = linkedBlockingDeque;
        this.d = ydxVar;
        this.f = executorService;
    }

    public static rld a(rlh rlhVar) {
        yop yopVarAi = a.l().ai(8184);
        boolean z = rlhVar.a;
        int i = rlhVar.b;
        yopVarAi.O("Creating GAL Snoop, enabled:%b, capacity: %d", z, i);
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque(i);
        ydx ydxVar = new ydx(i);
        spu spuVar = ssr.a;
        return new rld(rlhVar, linkedBlockingDeque, ydxVar, spu.aF(1));
    }

    private final void h(rlf rlfVar) {
        if (this.e) {
            rlfVar.a = this.g.getAndIncrement();
            this.c.offer(rlfVar);
        }
    }

    public final void b(SparseArray sparseArray, PrintWriter printWriter) {
        PrintWriter printWriter2;
        ByteBuffer byteBuffer;
        synchronized (this.b) {
            ydx ydxVar = this.d;
            Iterator<E> it = ydxVar.iterator();
            while (it.hasNext()) {
                rlf rlfVar = (rlf) it.next();
                rll rllVar = (rll) sparseArray.get(rlfVar.b);
                if (rllVar == null || (byteBuffer = rlfVar.c) == null || byteBuffer.remaining() < 2) {
                    printWriter2 = printWriter;
                    printWriter2.println(rlfVar.toString());
                } else {
                    printWriter2 = printWriter;
                    rllVar.c(rlfVar.a(), rlfVar.a, rlfVar.d, byteBuffer, printWriter2);
                }
                printWriter = printWriter2;
            }
            ydxVar.clear();
        }
    }

    public final void c(int i, ByteBuffer byteBuffer, boolean z) {
        if (this.e) {
            ygr ygrVar = (ygr) this.i.get(i, yly.a);
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            if (ygrVar.contains(Integer.valueOf(byteBufferDuplicate.remaining() >= 2 ? (char) byteBufferDuplicate.getShort() : (char) 65535))) {
                return;
            }
            int i2 = rlf.e;
            ByteBuffer byteBufferB = rlf.b(byteBuffer.duplicate());
            h(new rlf(i, byteBufferB, byteBufferB.remaining(), z, false, abqu.a(abqu.d())));
        }
    }

    public final void d(int i, ByteBuffer byteBuffer, boolean z) {
        if (this.e) {
            int i2 = rlf.e;
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            ByteBuffer byteBufferB = rlf.b(byteBufferDuplicate);
            h(new rlf(i, byteBufferB, byteBufferB.remaining(), z, true, abqu.a(abqu.d())));
        }
    }

    public final void e() {
        if (!this.e) {
            a.l().ai(8187).u("GAL Snoop is not enabled");
            return;
        }
        ypf ypfVar = a;
        ypfVar.l().ai(8185).u("Starting the GAL Snoop");
        if (this.f.isShutdown()) {
            ypfVar.h().ai(8186).u("Previous worker thread was shutdown, start a new one");
            spu spuVar = ssr.a;
            this.f = spu.aF(1);
        }
        this.f.execute(new ral(this, 18, null));
    }

    public final void f() {
        ypf ypfVar = a;
        ypfVar.l().ai(8188).u("Shutdown GAL Snoop");
        this.f.shutdownNow();
        ypfVar.l().ai(8183).u("Clear the buffer");
        this.c.clear();
        synchronized (this.b) {
            this.d.clear();
        }
    }

    public final void g(int i, olm olmVar) {
        this.i.put(i, olmVar.i(this.h.c));
    }
}
