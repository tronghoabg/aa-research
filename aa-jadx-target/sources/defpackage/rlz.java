package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rlz {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.SNOOP");
    public final java.util.concurrent.LinkedBlockingDeque c;
    public final defpackage.yfd d;
    public final boolean e;
    private java.util.concurrent.ExecutorService f;
    private final defpackage.rmd h;
    public final java.lang.Object b = new java.lang.Object();
    private final android.util.SparseArray i = new android.util.SparseArray();
    private final java.util.concurrent.atomic.AtomicLong g = new java.util.concurrent.atomic.AtomicLong();

    public rlz(defpackage.rmd rmdVar, java.util.concurrent.LinkedBlockingDeque linkedBlockingDeque, defpackage.yfd yfdVar, java.util.concurrent.ExecutorService executorService) {
        this.h = rmdVar;
        this.e = rmdVar.a;
        this.c = linkedBlockingDeque;
        this.d = yfdVar;
        this.f = executorService;
    }

    public static defpackage.rlz a(defpackage.rmd rmdVar) {
        defpackage.ypu ypuVarAi = a.l().ai(8209);
        boolean z = rmdVar.a;
        int i = rmdVar.b;
        ypuVarAi.O("Creating GAL Snoop, enabled:%b, capacity: %d", z, i);
        java.util.concurrent.LinkedBlockingDeque linkedBlockingDeque = new java.util.concurrent.LinkedBlockingDeque(i);
        defpackage.yfd yfdVar = new defpackage.yfd(i);
        defpackage.sqs sqsVar = defpackage.stp.a;
        return new defpackage.rlz(rmdVar, linkedBlockingDeque, yfdVar, defpackage.sqs.h(1));
    }

    private final void h(rmb rmbVar) {
        if (this.e) {
            rmbVar.a = this.g.getAndIncrement();
            this.c.offer(rmbVar);
        }
    }

    public final void b(android.util.SparseArray sparseArray, java.io.PrintWriter printWriter) {
        java.io.PrintWriter printWriter2;
        java.nio.ByteBuffer byteBuffer;
        synchronized (this.b) {
            defpackage.yfd<rmb> yfdVar = this.d;
            for (rmb rmbVar : yfdVar) {
                defpackage.rmh rmhVar = (defpackage.rmh) sparseArray.get(rmbVar.b);
                if (rmhVar == null || (byteBuffer = rmbVar.c) == null || byteBuffer.remaining() < 2) {
                    printWriter2 = printWriter;
                    printWriter2.println(rmbVar.toString());
                } else {
                    printWriter2 = printWriter;
                    rmhVar.c(rmbVar.a(), rmbVar.a, rmbVar.d, byteBuffer, printWriter2);
                }
                printWriter = printWriter2;
            }
            yfdVar.clear();
        }
    }

    public final void c(int i, java.nio.ByteBuffer byteBuffer, boolean z) {
        if (this.e) {
            defpackage.yhx yhxVar = (defpackage.yhx) this.i.get(i, defpackage.ynd.a);
            java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            if (yhxVar.contains(java.lang.Integer.valueOf(byteBufferDuplicate.remaining() >= 2 ? (char) byteBufferDuplicate.getShort() : -1))) {
                return;
            }
            int i2 = rmb.e;
            java.nio.ByteBuffer byteBufferB = rmb.b(byteBuffer.duplicate());
            h(new rmb(i, byteBufferB, byteBufferB.remaining(), z, false, defpackage.abrx.a(defpackage.abrx.d())));
        }
    }

    public final void d(int i, java.nio.ByteBuffer byteBuffer, boolean z) {
        if (this.e) {
            int i2 = rmb.e;
            java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            java.nio.ByteBuffer byteBufferB = rmb.b(byteBufferDuplicate);
            h(new rmb(i, byteBufferB, byteBufferB.remaining(), z, true, defpackage.abrx.a(defpackage.abrx.d())));
        }
    }

    public final void e() {
        if (!this.e) {
            a.l().ai(8212).u("GAL Snoop is not enabled");
            return;
        }
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(8210).u("Starting the GAL Snoop");
        if (this.f.isShutdown()) {
            yqkVar.h().ai(8211).u("Previous worker thread was shutdown, start a new one");
            defpackage.sqs sqsVar = defpackage.stp.a;
            this.f = defpackage.sqs.h(1);
        }
        this.f.execute(new defpackage.rid(this, 4, null));
    }

    public final void f() {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(8213).u("Shutdown GAL Snoop");
        this.f.shutdownNow();
        yqkVar.l().ai(8208).u("Clear the buffer");
        this.c.clear();
        synchronized (this.b) {
            this.d.clear();
        }
    }

    public final void g(int i, defpackage.oml omlVar) {
        this.i.put(i, omlVar.J(this.h.c));
    }
}
