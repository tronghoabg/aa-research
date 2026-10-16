package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: classes3.dex */
public final class tuv {
    public static final int a = ViewConfiguration.getLongPressTimeout();
    public static final int b = ViewConfiguration.getTapTimeout();
    public static final int c = ViewConfiguration.getDoubleTapTimeout();
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final Handler j;
    public final tut k;
    public GestureDetector.OnDoubleTapListener l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public MotionEvent q;
    public MotionEvent r;
    public boolean s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public VelocityTracker y;

    /* JADX WARN: Multi-variable type inference failed */
    public tuv(Context context, tut tutVar, Handler handler) {
        int scaledTouchSlop;
        int touchSlop;
        int i;
        this.j = new tus(this, handler);
        this.k = tutVar;
        if (tutVar instanceof GestureDetector.OnDoubleTapListener) {
            this.l = tutVar;
        }
        if (tutVar == 0) {
            throw new NullPointerException("OnGestureListener must not be null");
        }
        this.x = true;
        if (context == null) {
            touchSlop = ViewConfiguration.getTouchSlop();
            i = touchSlop + touchSlop;
            this.h = ViewConfiguration.getMinimumFlingVelocity();
            this.i = ViewConfiguration.getMaximumFlingVelocity();
            scaledTouchSlop = touchSlop;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
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

    public final void a(MotionEvent motionEvent) {
        Handler handler = this.j;
        handler.removeMessages(1);
        handler.removeMessages(2);
        handler.removeMessages(3);
        if (this.s && this.l != null) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getMetaState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags());
            GestureDetector.OnDoubleTapListener onDoubleTapListener = this.l;
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
