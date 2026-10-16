package android.support.v7.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class cr implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final float f1270a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1271b;

    /* renamed from: c, reason: collision with root package name */
    final View f1272c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1273d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f1274e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f1275f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1276g;

    /* renamed from: h, reason: collision with root package name */
    private int f1277h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f1278i = new int[2];

    public cr(View view) {
        this.f1272c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1270a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1271b = tapTimeout;
        this.f1273d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private final void e() {
        Runnable runnable = this.f1275f;
        if (runnable != null) {
            this.f1272c.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1274e;
        if (runnable2 != null) {
            this.f1272c.removeCallbacks(runnable2);
        }
    }

    public abstract android.support.v7.view.menu.ah a();

    protected boolean b() {
        throw null;
    }

    protected boolean c() {
        android.support.v7.view.menu.ah ahVarA = a();
        if (ahVarA == null || !ahVarA.u()) {
            return true;
        }
        ahVarA.k();
        return true;
    }

    final void d() {
        e();
        View view = this.f1272c;
        if (view.isEnabled() && !view.isLongClickable() && b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f1276g = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.cr.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1276g = false;
        this.f1277h = -1;
        Runnable runnable = this.f1274e;
        if (runnable != null) {
            this.f1272c.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
