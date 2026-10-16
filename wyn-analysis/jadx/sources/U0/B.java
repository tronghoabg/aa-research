package u0;

import android.os.Handler;
import android.view.Choreographer;
import ef.C2532p;
import java.util.ArrayList;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class B extends Ef.A {

    /* renamed from: l, reason: collision with root package name */
    public static final C2532p f46080l = Fe.c.z(C4199w.f46393p);

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.android.gms.common.api.internal.f0 f46081m = new com.google.android.gms.common.api.internal.f0(2);

    /* renamed from: b, reason: collision with root package name */
    public final Choreographer f46082b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f46083c;

    /* renamed from: h, reason: collision with root package name */
    public boolean f46088h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f46089i;
    public final C k;

    /* renamed from: d, reason: collision with root package name */
    public final Object f46084d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final ff.l f46085e = new ff.l();

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f46086f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f46087g = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ChoreographerFrameCallbackC4161A f46090j = new ChoreographerFrameCallbackC4161A(this);

    public B(Choreographer choreographer, Handler handler) {
        this.f46082b = choreographer;
        this.f46083c = handler;
        this.k = new C(choreographer);
    }

    public static final void z(B b5) {
        boolean z2;
        do {
            Runnable runnableB = b5.B();
            while (runnableB != null) {
                runnableB.run();
                runnableB = b5.B();
            }
            synchronized (b5.f46084d) {
                if (b5.f46085e.isEmpty()) {
                    z2 = false;
                    b5.f46088h = false;
                } else {
                    z2 = true;
                }
            }
        } while (z2);
    }

    public final Runnable B() {
        Runnable runnable;
        synchronized (this.f46084d) {
            ff.l lVar = this.f46085e;
            runnable = (Runnable) (lVar.isEmpty() ? null : lVar.removeFirst());
        }
        return runnable;
    }

    @Override // Ef.A
    public final void i(InterfaceC3108h context, Runnable block) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(block, "block");
        synchronized (this.f46084d) {
            this.f46085e.addLast(block);
            if (!this.f46088h) {
                this.f46088h = true;
                this.f46083c.post(this.f46090j);
                if (!this.f46089i) {
                    this.f46089i = true;
                    this.f46082b.postFrameCallback(this.f46090j);
                }
            }
        }
    }
}
