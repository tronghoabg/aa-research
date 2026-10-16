package defpackage;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ayd implements View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback, bah {
    public static long a;
    private final View c;
    private boolean d;
    private boolean g;
    private long h;
    private long i;
    public final PriorityQueue b = new PriorityQueue(11, new azl(1));
    private final Choreographer e = Choreographer.getInstance();
    private final ayc f = new ayc();

    public ayd(View view) {
        this.c = view;
        if (a == 0) {
            Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            a = (long) (1.0E9f / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    private final boolean d() {
        PriorityQueue priorityQueue = this.b;
        Object objPeek = priorityQueue.peek();
        objPeek.getClass();
        boolean zE = ((bag) ((abmz) objPeek).b).e(this.f);
        if (!zE) {
            priorityQueue.poll();
        }
        return zE;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.post(this);
    }

    @Override // defpackage.bah
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(bag bagVar) {
        this.b.add(new abmz(1, bagVar));
        a();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.g) {
            this.h = j;
            this.c.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.g = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.g = false;
        this.c.removeCallbacks(this);
        this.e.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        PriorityQueue priorityQueue = this.b;
        if (!priorityQueue.isEmpty() && this.d && this.g) {
            View view = this.c;
            if (view.getWindowVisibility() == 0) {
                long jMax = Math.max(this.h, TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime()));
                long jNanoTime = System.nanoTime() - jMax;
                long j = a;
                boolean z3 = true;
                if (jNanoTime <= j + j) {
                    z = false;
                    z2 = false;
                } else if (this.i == jMax) {
                    jMax = System.nanoTime();
                    z2 = false;
                    z = true;
                } else {
                    this.i = jMax;
                    view.post(this);
                    z = false;
                    z2 = true;
                }
                ayc aycVar = this.f;
                aycVar.a = jMax + a;
                while (true) {
                    if (priorityQueue.isEmpty()) {
                        z3 = false;
                        break;
                    }
                    long jA = aycVar.a();
                    if (jA <= 0) {
                        break;
                    }
                    vs.i("compose:lazy:prefetch:available_time_nanos", jA);
                    if (z ? d() : d()) {
                        break;
                    } else {
                        z = false;
                    }
                }
                if (z2) {
                    return;
                }
                if (z3) {
                    this.e.postFrameCallback(this);
                    return;
                } else {
                    this.d = false;
                    return;
                }
            }
        }
        this.d = false;
    }
}
