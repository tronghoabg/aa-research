package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaai {
    public static final int a = android.view.ViewConfiguration.getLongPressTimeout();
    public static final int b = android.view.ViewConfiguration.getTapTimeout();
    public static final int c = android.view.ViewConfiguration.getDoubleTapTimeout();
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final android.os.Handler i;
    public final android.view.GestureDetector.OnGestureListener j;
    public android.view.GestureDetector.OnDoubleTapListener k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public android.view.MotionEvent p;
    public android.view.MotionEvent q;
    public boolean r;
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;
    public android.view.VelocityTracker x;

    /* JADX WARN: Multi-variable type inference failed */
    public aaai(android.content.Context context, android.view.GestureDetector.OnGestureListener onGestureListener, android.os.Handler handler) {
        int scaledTouchSlop;
        int touchSlop;
        int i;
        this.i = new defpackage.aaah(this, handler);
        this.j = onGestureListener;
        this.k = onGestureListener;
        if (onGestureListener == 0) {
            throw new java.lang.NullPointerException("OnGestureListener must not be null");
        }
        this.w = true;
        if (context == null) {
            touchSlop = android.view.ViewConfiguration.getTouchSlop();
            i = touchSlop + touchSlop;
            this.g = android.view.ViewConfiguration.getMinimumFlingVelocity();
            this.h = android.view.ViewConfiguration.getMaximumFlingVelocity();
            scaledTouchSlop = touchSlop;
        } else {
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.g = viewConfiguration.getScaledMinimumFlingVelocity();
            this.h = viewConfiguration.getScaledMaximumFlingVelocity();
            touchSlop = scaledTouchSlop2;
            i = scaledDoubleTapSlop;
        }
        this.d = touchSlop * touchSlop;
        this.e = scaledTouchSlop * scaledTouchSlop;
        this.f = i * i;
    }
}
