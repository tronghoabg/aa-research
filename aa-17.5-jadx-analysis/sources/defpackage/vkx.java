package defpackage;

import android.app.Activity;
import android.os.Looper;
import android.os.MessageQueue;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class vkx implements Executor, vqj {
    public final zgt a;
    private final vqk b;
    private final aezk e;
    private final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private volatile boolean d = false;
    private final AtomicBoolean f = new AtomicBoolean();

    public vkx(zgt zgtVar, vqk vqkVar, aezk aezkVar) {
        this.a = zgtVar;
        this.b = vqkVar;
        this.e = aezkVar;
        vqm vqmVar = ((vqn) vqkVar.a).a;
        int i = vqm.c;
        if (vqmVar.b.get() > 0) {
            k();
        } else {
            vqkVar.a(this);
        }
    }

    private final void j() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable == null) {
                return;
            } else {
                this.a.execute(runnable);
            }
        }
    }

    private final void k() {
        this.a.schedule(new iml(this, 6), 3000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.vqj
    public final void c(Activity activity) {
        this.b.b(this);
        k();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.d) {
            this.a.execute(runnable);
            return;
        }
        this.c.add(runnable);
        if (this.d) {
            j();
        } else {
            if (this.f.getAndSet(true)) {
                return;
            }
            if (((Boolean) ((xxh) ((acks) this.e).b).d(false)).booleanValue()) {
                Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: vkw
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        vkx vkxVar = this.a;
                        vkxVar.a.schedule(new iml(vkxVar, 5), 7000L, TimeUnit.MILLISECONDS);
                        return false;
                    }
                });
            } else {
                this.a.schedule(new iml(this, 5), 7000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void g() {
        this.d = true;
        j();
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void f(int i) {
    }
}
