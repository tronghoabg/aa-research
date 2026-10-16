package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ayi implements android.view.View.OnAttachStateChangeListener, java.lang.Runnable, android.view.Choreographer.FrameCallback, defpackage.bam {
    public static long a;
    private final android.view.View c;
    private boolean d;
    private boolean g;
    private long h;
    private long i;
    public final java.util.PriorityQueue b = new java.util.PriorityQueue(11, new defpackage.azq(1));
    private final android.view.Choreographer e = android.view.Choreographer.getInstance();
    private final defpackage.ayh f = new defpackage.ayh();

    public ayi(android.view.View view) {
        this.c = view;
        if (a == 0) {
            android.view.Display display = view.getDisplay();
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
        java.util.PriorityQueue priorityQueue = this.b;
        java.lang.Object objPeek = priorityQueue.peek();
        objPeek.getClass();
        boolean zE = ((defpackage.bal) ((defpackage.abob) objPeek).b).e(this.f);
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

    @Override // defpackage.bam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(defpackage.bal balVar) {
        this.b.add(new defpackage.abob(1, balVar));
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
    public final void onViewAttachedToWindow(android.view.View view) {
        this.g = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.g = false;
        this.c.removeCallbacks(this);
        this.e.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        java.util.PriorityQueue priorityQueue = this.b;
        if (!priorityQueue.isEmpty() && this.d && this.g) {
            android.view.View view = this.c;
            if (view.getWindowVisibility() == 0) {
                long jMax = java.lang.Math.max(this.h, java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime()));
                long jNanoTime = java.lang.System.nanoTime() - jMax;
                long j = a;
                boolean z3 = true;
                if (jNanoTime <= j + j) {
                    z = false;
                    z2 = false;
                } else if (this.i == jMax) {
                    jMax = java.lang.System.nanoTime();
                    z2 = false;
                    z = true;
                } else {
                    this.i = jMax;
                    view.post(this);
                    z = false;
                    z2 = true;
                }
                defpackage.ayh ayhVar = this.f;
                ayhVar.a = jMax + a;
                while (true) {
                    if (priorityQueue.isEmpty()) {
                        z3 = false;
                        break;
                    }
                    long jA = ayhVar.a();
                    if (jA <= 0) {
                        break;
                    }
                    defpackage.vx.c("compose:lazy:prefetch:available_time_nanos", jA);
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
