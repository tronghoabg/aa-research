package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.RemoteException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiFunction;

/* loaded from: classes.dex */
public final class jad implements izx {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    public static final vqk j = new vqk("debug.car.framer_send_latency");
    final jcg b;
    public final AtomicBoolean c;
    public final Semaphore d;
    public jca e;
    public iyq f;
    final int g;
    public final boolean h;
    public final izj i;
    private final jab k;
    private final jac l;
    private final Context m;
    private final jap n;

    public jad(izw izwVar) {
        jac jacVar;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.c = atomicBoolean;
        this.d = new Semaphore(0);
        izj izjVar = izwVar.h;
        this.i = izjVar;
        this.e = null;
        this.f = izwVar.a;
        Context context = izwVar.g;
        this.m = context;
        izz izzVar = izwVar.e;
        this.g = izzVar.a;
        this.h = izzVar.d.o;
        jaa jaaVar = new jaa(izwVar.g, izwVar.c, izwVar.f, izzVar);
        jaaVar.start();
        this.n = new jap(jaaVar);
        int i = izwVar.e.b;
        if (i > 0) {
            jacVar = new jac(this, izwVar.d, i);
            this.l = jacVar;
        } else {
            jacVar = new jac(this, izwVar.d);
            this.l = jacVar;
        }
        izz izzVar2 = izwVar.e;
        BiFunction biFunction = izwVar.b;
        a.f().ai(1734).u("Creating per-channel priority writer thread.");
        this.b = new jbf(jacVar, izjVar, context, izzVar2, biFunction);
        this.k = new jab(this, izwVar.i);
        atomicBoolean.set(false);
    }

    @Override // defpackage.izx
    public final void a(PrintWriter printWriter) {
        printWriter.println("PerChannelQueues:");
        int i = 0;
        while (true) {
            jbe[] jbeVarArr = ((jbf) this.b).l;
            int length = jbeVarArr.length;
            if (i >= 256) {
                return;
            }
            jbe jbeVar = jbeVarArr[i];
            if (jbeVar != null) {
                jbeVar.g(i, printWriter);
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.izx
    public final void b() throws IOException {
        jcg jcgVar = this.b;
        jcgVar.e();
        while (true) {
            yrm.aE((Thread) jcgVar, 5L, TimeUnit.SECONDS);
            if (!((jbf) jcgVar).isAlive()) {
                return;
            } else {
                jbf.a.h().ai(1773).u("Joining PerChannelWriterThread is taking a long time...");
            }
        }
    }

    @Override // defpackage.izx
    public final void c(izd izdVar) {
        jbf jbfVar = (jbf) this.b;
        jbe[] jbeVarArr = jbfVar.l;
        int i = izdVar.b;
        if (jbeVarArr[i] != null) {
            jbf.a.h().ai(1772).w("InitializeForChannel called twice for channel %d", i);
            return;
        }
        jeb jebVar = izdVar.f;
        jeb jebVar2 = jeb.AUDIO_MEDIA;
        if (jebVar != jebVar2 && jebVar != jeb.AUDIO_GUIDANCE) {
            jbf.a.f().ai(1771).w("Creating PerChannelQueue for channel %d", i);
            jbeVarArr[i] = new jbe(jbfVar, jebVar);
            return;
        }
        jbf.a.f().ai(1770).w("Creating AudioPerChannelQueue for channel %d", i);
        ips ipsVar = (ips) jbfVar.g.apply(Integer.valueOf(jebVar == jebVar2 ? 3 : 5), false);
        long j2 = ipsVar.a * 1000000;
        long j3 = ipsVar.b * 1000000;
        long j4 = ipsVar.c * 1000000;
        long j5 = ipsVar.d * 1000000;
        if (j3 == 0) {
            j3 = Long.MAX_VALUE;
        }
        if (j2 == 0) {
            j2 = Long.MAX_VALUE;
        }
        jbeVarArr[i] = new jbd(jbfVar, jebVar, j2, j3, j4, j5);
    }

    @Override // defpackage.izx
    public final void d() throws IOException {
        Context context = this.m;
        if (context != null && (this.c.get() || this.b.k())) {
            ols.M(context, yxi.FRAMER_STOPPED);
        }
        try {
            Thread thread = null;
            if (this.c.compareAndSet(true, false)) {
                try {
                    thread = (Thread) jan.a(this.n.a());
                } catch (RemoteException e) {
                    a.g().p(e).ai(1741).u("Impossible");
                }
            }
            if (thread != null) {
                try {
                    thread.join(400L);
                } catch (InterruptedException unused) {
                }
                if (thread.isAlive()) {
                    a.h().ai(1740).u("reader thread stuck? Trying SIGQUIT.");
                    Process.sendSignal(Process.myPid(), 3);
                    Process.sendSignal(Process.myPid(), 3);
                    try {
                        thread.join(400L);
                    } catch (InterruptedException unused2) {
                    }
                    if (thread.isAlive()) {
                        Object obj = this.i.a;
                        ((ype) ((ype) joi.a.h()).ai((char) 2485)).u("Reader thread stuck.");
                    }
                }
            }
            try {
                this.b.j();
            } catch (RuntimeException e2) {
                a.g().p(e2).ai(1735).u("Exception while trying to stop writer thread.");
            }
        } catch (Throwable th) {
            try {
                this.b.j();
            } catch (RuntimeException e3) {
                a.g().p(e3).ai(1736).u("Exception while trying to stop writer thread.");
            }
            throw th;
        }
    }

    @Override // defpackage.izx
    public final void e(iyq iyqVar) {
        this.f = iyqVar;
        try {
            this.n.b(iyqVar != null ? new jak(iyqVar) : null);
        } catch (RemoteException e) {
            a.g().p(e).ai(1737).u("Impossible");
        }
    }

    @Override // defpackage.izx
    public final void f(jca jcaVar) {
        this.e = jcaVar;
        jcaVar.k[0] = ByteBuffer.allocateDirect(jcaVar.n + 8);
        this.d.release();
        a.l().ai(1738).u("Ssl negotiation complete, turning on encryption!");
    }

    @Override // defpackage.izx
    public final void g() {
        this.b.i();
        if (this.c.compareAndSet(false, true)) {
            try {
                jap japVar = this.n;
                jab jabVar = this.k;
                ypf ypfVar = jbp.a;
                if (!japVar.c(new jan(jabVar))) {
                    this.i.a(yzf.READER_INIT_FAIL);
                }
            } catch (RemoteException e) {
                a.g().p(e).ai(1739).u("Impossible");
            }
        }
        Context context = this.m;
        if (context != null) {
            ols.M(context, yxi.FRAMER_STARTED);
        }
    }

    @Override // defpackage.izx
    public final void h(int i, jcn jcnVar, boolean z, izn iznVar) {
        boolean z2 = !z;
        jac jacVar = this.l;
        if (z && jcnVar.d() > jacVar.e.g - 4) {
            throw new IllegalArgumentException("Message is too long to send as one fragment");
        }
        izm izmVar = new izm(i, jcnVar, z2, z, iznVar);
        jcg jcgVar = jacVar.e.b;
        if (((jbf) jcgVar).e) {
            long andIncrement = ((jbf) jcgVar).m.getAndIncrement();
            if (andIncrement <= 0) {
                throw new IllegalStateException();
            }
            izmVar.k = andIncrement;
        }
        synchronized (jcgVar) {
            if (!((jbf) jcgVar).j && !((jbf) jcgVar).i) {
                ((jbf) jcgVar).l[izmVar.b].e(izmVar);
                return;
            }
            jbf.a.h().ai(1777).u("Message sent after shutown ignored!");
            izmVar.c.close();
        }
    }
}
