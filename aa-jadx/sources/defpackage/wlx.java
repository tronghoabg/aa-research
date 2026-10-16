package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class wlx<V extends android.view.View> extends defpackage.wma<V> {
    private java.lang.Runnable a;
    android.widget.OverScroller b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private android.view.VelocityTracker g;

    public wlx() {
        this.d = -1;
        this.f = -1;
    }

    public int A() {
        throw null;
    }

    public int B(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3) {
        throw null;
    }

    public void D(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        throw null;
    }

    public boolean F(android.view.View view) {
        throw null;
    }

    public final int I(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3) {
        return B(coordinatorLayout, view, A() - i, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // defpackage.dsn
    public final boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.VelocityTracker velocityTracker;
        int y;
        boolean z;
        android.widget.OverScroller overScroller;
        int iFindPointerIndex;
        if (this.f < 0) {
            this.f = android.view.ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.c) {
            int i = this.d;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (java.lang.Math.abs(y2 - this.e) > this.f) {
                    this.e = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.d = -1;
                    int x = (int) motionEvent.getX();
                    y = (int) motionEvent.getY();
                    if (F(view)) {
                        z = false;
                    } else {
                        z = false;
                    }
                    this.c = z;
                    if (z) {
                        this.e = y;
                        this.d = motionEvent.getPointerId(0);
                        if (this.g == null) {
                            this.g = android.view.VelocityTracker.obtain();
                        }
                        overScroller = this.b;
                        if (overScroller != null) {
                            this.b.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.g;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.d = -1;
                int x2 = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (F(view) || !coordinatorLayout.k(view, x2, y)) {
                    z = false;
                } else {
                    z = true;
                }
                this.c = z;
                if (z) {
                    this.e = y;
                    this.d = motionEvent.getPointerId(0);
                    if (this.g == null) {
                        this.g = android.view.VelocityTracker.obtain();
                    }
                    overScroller = this.b;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.b.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0 A[ADDED_TO_REGION] */
    @Override // defpackage.dsn
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z;
        android.view.VelocityTracker velocityTracker;
        android.view.VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.d);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i = this.e - y;
                this.e = y;
                I(coordinatorLayout, view, i, y(view), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.d = motionEvent.getPointerId(i2);
                    this.e = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.g;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.c || z;
        }
        android.view.VelocityTracker velocityTracker3 = this.g;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.g.computeCurrentVelocity(1000);
            float yVelocity = this.g.getYVelocity(this.d);
            int i3 = -z(view);
            java.lang.Runnable runnable = this.a;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.a = null;
            }
            android.widget.OverScroller overScroller = this.b;
            if (overScroller == null) {
                overScroller = new android.widget.OverScroller(view.getContext());
                this.b = overScroller;
            }
            overScroller.fling(0, J(), 0, java.lang.Math.round(yVelocity), 0, 0, i3, 0);
            if (this.b.computeScrollOffset()) {
                defpackage.wlw wlwVar = new defpackage.wlw(this, coordinatorLayout, view);
                this.a = wlwVar;
                view.postOnAnimation(wlwVar);
            } else {
                D(coordinatorLayout, view);
            }
            z = true;
        }
        this.c = false;
        this.d = -1;
        velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.g = null;
        }
        velocityTracker2 = this.g;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.c) {
        }
        z = false;
        this.c = false;
        this.d = -1;
        velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.g = null;
        }
        velocityTracker2 = this.g;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.c) {
        }
    }

    public int y(android.view.View view) {
        throw null;
    }

    public int z(android.view.View view) {
        throw null;
    }

    public wlx(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.f = -1;
    }
}
