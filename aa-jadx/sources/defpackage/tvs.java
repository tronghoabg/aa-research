package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tvs {
    public static final int a = android.view.ViewConfiguration.getLongPressTimeout();
    public static final int b = android.view.ViewConfiguration.getTapTimeout();
    public static final int c = android.view.ViewConfiguration.getDoubleTapTimeout();
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final android.os.Handler j;
    public final defpackage.tvq k;
    public android.view.GestureDetector.OnDoubleTapListener l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public android.view.MotionEvent q;
    public android.view.MotionEvent r;
    public boolean s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public android.view.VelocityTracker y;

    /* JADX WARN: Multi-variable type inference failed */
    public tvs(android.content.Context context, defpackage.tvq tvqVar, android.os.Handler handler) {
        int scaledTouchSlop;
        int touchSlop;
        int i;
        this.j = new defpackage.tvp(this, handler);
        this.k = tvqVar;
        if (tvqVar instanceof android.view.GestureDetector.OnDoubleTapListener) {
            this.l = tvqVar;
        }
        if (tvqVar == 0) {
            throw new java.lang.NullPointerException("OnGestureListener must not be null");
        }
        this.x = true;
        if (context == null) {
            touchSlop = android.view.ViewConfiguration.getTouchSlop();
            i = touchSlop + touchSlop;
            this.h = android.view.ViewConfiguration.getMinimumFlingVelocity();
            this.i = android.view.ViewConfiguration.getMaximumFlingVelocity();
            scaledTouchSlop = touchSlop;
        } else {
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.h = viewConfiguration.getScaledMinimumFlingVelocity();
            this.i = viewConfiguration.getScaledMaximumFlingVelocity();
            touchSlop = scaledTouchSlop2;
            i = scaledDoubleTapSlop;
        }
        this.d = touchSlop;
        this.e = touchSlop * touchSlop;
        this.f = scaledTouchSlop * scaledTouchSlop;
        this.g = i * i;
    }

    public final void a(android.view.MotionEvent motionEvent) {
        android.os.Handler handler = this.j;
        handler.removeMessages(1);
        handler.removeMessages(2);
        handler.removeMessages(3);
        if (this.s && this.l != null) {
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getMetaState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags());
            android.view.GestureDetector.OnDoubleTapListener onDoubleTapListener = this.l;
            onDoubleTapListener.getClass();
            onDoubleTapListener.onDoubleTapEvent(motionEventObtain);
        }
        this.s = false;
        this.o = false;
        this.p = false;
        if (this.n) {
            this.n = false;
        }
    }
}
