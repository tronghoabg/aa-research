package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class dag extends aitu {
    public static final aezr a = woy.dG(new blv(20));
    public static final ThreadLocal b = new dae();
    public final Choreographer c;
    public final Handler d;
    public boolean h;
    public final bwj j;
    private boolean n;
    public final Object e = new Object();
    private final afaz m = new afaz();
    public List f = new ArrayList();
    public List g = new ArrayList();
    public final daf i = new daf(this);

    public dag(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.j = new daj(choreographer, this);
    }

    private final Runnable e() {
        Runnable runnable;
        synchronized (this.e) {
            runnable = (Runnable) this.m.g();
        }
        return runnable;
    }

    @Override // defpackage.aitu
    public final void a(afco afcoVar, Runnable runnable) {
        synchronized (this.e) {
            this.m.addLast(runnable);
            if (!this.n) {
                this.n = true;
                Handler handler = this.d;
                daf dafVar = this.i;
                handler.post(dafVar);
                if (!this.h) {
                    this.h = true;
                    this.c.postFrameCallback(dafVar);
                }
            }
        }
    }

    public final void b() {
        boolean z;
        do {
            Runnable runnableE = e();
            while (runnableE != null) {
                runnableE.run();
                runnableE = e();
            }
            synchronized (this.e) {
                if (this.m.isEmpty()) {
                    z = false;
                    this.n = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
