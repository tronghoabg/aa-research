package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: classes3.dex */
public final class zzd {
    public static final int a = ViewConfiguration.getLongPressTimeout();
    public static final int b = ViewConfiguration.getTapTimeout();
    public static final int c = ViewConfiguration.getDoubleTapTimeout();
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final Handler i;
    public final GestureDetector.OnGestureListener j;
    public GestureDetector.OnDoubleTapListener k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public MotionEvent p;
    public MotionEvent q;
    public boolean r;
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;
    public VelocityTracker x;

    /* JADX WARN: Multi-variable type inference failed */
    public zzd(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        int scaledTouchSlop;
        int touchSlop;
        int i;
        this.i = new zzc(this, handler);
        this.j = onGestureListener;
        this.k = onGestureListener;
        if (onGestureListener == 0) {
            throw new NullPointerException("OnGestureListener must not be null");
        }
        this.w = true;
        if (context == null) {
            touchSlop = ViewConfiguration.getTouchSlop();
            i = touchSlop + touchSlop;
            this.g = ViewConfiguration.getMinimumFlingVelocity();
            this.h = ViewConfiguration.getMaximumFlingVelocity();
            scaledTouchSlop = touchSlop;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
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
