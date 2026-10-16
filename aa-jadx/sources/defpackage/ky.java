package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ky implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {
    private final float a;
    private final int b;
    final android.view.View c;
    public boolean d;
    private final int e;
    private java.lang.Runnable f;
    private java.lang.Runnable g;
    private int h;
    private final int[] i = new int[2];

    public ky(android.view.View view) {
        this.c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.e = (tapTimeout + android.view.ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public abstract defpackage.hx a();

    protected boolean b() {
        throw null;
    }

    protected boolean c() {
        defpackage.hx hxVarA = a();
        if (hxVarA == null || !hxVarA.u()) {
            return true;
        }
        hxVarA.k();
        return true;
    }

    public final void d() {
        java.lang.Runnable runnable = this.g;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = this.f;
        if (runnable2 != null) {
            this.c.removeCallbacks(runnable2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z;
        android.widget.ListView listViewDh;
        boolean z2 = this.d;
        android.view.View view2 = this.c;
        if (z2) {
            defpackage.hx hxVarA = a();
            if (hxVarA != null && hxVarA.u() && (listViewDh = hxVarA.dh()) != null) {
                defpackage.kt ktVar = (defpackage.kt) listViewDh;
                if (ktVar.isShown()) {
                    android.view.MotionEvent motionEventObtainNoHistory = android.view.MotionEvent.obtainNoHistory(motionEvent);
                    int[] iArr = this.i;
                    view2.getLocationOnScreen(iArr);
                    motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                    listViewDh.getLocationOnScreen(iArr);
                    motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                    boolean zA = ktVar.a(motionEventObtainNoHistory, this.h);
                    motionEventObtainNoHistory.recycle();
                    int actionMasked = motionEvent.getActionMasked();
                    boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                    if (zA && z3) {
                        z = true;
                    } else if (c()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else if (c()) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (c()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.h = motionEvent.getPointerId(0);
                    if (this.f == null) {
                        this.f = new defpackage.ku(this, 2);
                    }
                    view2.postDelayed(this.f, this.b);
                    if (this.g == null) {
                        this.g = new defpackage.ku(this, 3);
                    }
                    view2.postDelayed(this.g, this.e);
                } else if (actionMasked2 == 1) {
                    d();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.h);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.a;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            d();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (b()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    d();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.d = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.d = false;
        this.h = -1;
        java.lang.Runnable runnable = this.f;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
