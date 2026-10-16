package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kmd implements android.view.View.OnTouchListener {
    float a;
    float b;
    float c;
    boolean d;
    android.view.VelocityTracker e;
    final float f;
    final int g;
    final int h;
    final int i;
    final /* synthetic */ defpackage.kme j;

    public kmd(defpackage.kme kmeVar) {
        this.j = kmeVar;
        this.f = kmeVar.getResources().getDisplayMetrics().density * 105.0f;
        this.g = kmeVar.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.car_home_touch_slop);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(kmeVar.getActivity());
        this.h = viewConfiguration.getScaledMinimumFlingVelocity();
        this.i = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private final float b(android.view.MotionEvent motionEvent) {
        return motionEvent.getRawY() + this.a;
    }

    private final void c() {
        defpackage.kme kmeVar = this.j;
        kmeVar.c();
        kmeVar.b();
        kmeVar.e.animate().y(kmeVar.c).setDuration(200L).start();
    }

    private final void d() {
        android.view.VelocityTracker velocityTracker = this.e;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.e = null;
        }
    }

    public final void a() {
        this.d = true;
        d();
        defpackage.bc activity = this.j.getActivity();
        ((defpackage.yqj) defpackage.kme.a.l().ai((char) 3205)).u("UnlockSwipeListener.unlock");
        defpackage.mpd.b().e();
        activity.finish();
        activity.overridePendingTransition(0, com.google.android.projection.gearhead.R.anim.abc_fade_out);
        activity.startActivity(new android.content.Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0133  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.VelocityTracker velocityTracker;
        float xVelocity;
        float yVelocity;
        float f;
        float f2;
        if (this.d) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            long jMin = 0;
            if (action == 1) {
                if (b(motionEvent) <= this.b) {
                    a();
                } else if (b(motionEvent) <= this.c) {
                    velocityTracker = this.e;
                    if (velocityTracker == null) {
                        defpackage.rox.o("GH.HomeFragment", "velocityTracker was null on for computing fling velocity", new java.lang.Object[0]);
                        xVelocity = 0.0f;
                        yVelocity = 0.0f;
                    } else {
                        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                        velocityTracker.computeCurrentVelocity(1000, this.i);
                        xVelocity = this.e.getXVelocity();
                        yVelocity = this.e.getYVelocity();
                    }
                    f = -yVelocity;
                    f2 = this.h;
                    float fAbs = java.lang.Math.abs(yVelocity);
                    float fAbs2 = java.lang.Math.abs(xVelocity);
                    if (f > f2 || fAbs <= fAbs2) {
                        c();
                    } else {
                        this.d = true;
                        float fAbs3 = java.lang.Math.abs(yVelocity);
                        if (fAbs3 != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                            float fAbs4 = java.lang.Math.abs((this.b - b(motionEvent)) / fAbs3);
                            java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.SECONDS;
                            jMin = java.lang.Math.min((long) (fAbs4 * 1000.0f), 200L);
                        }
                        defpackage.kme kmeVar = this.j;
                        kmeVar.b.animate().alpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED).setDuration(jMin).start();
                        kmeVar.f.animate().alpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED).setDuration(jMin).start();
                        kmeVar.e.animate().y(this.b).setDuration(jMin).setListener(new defpackage.kmc(this)).start();
                    }
                } else {
                    c();
                }
                d();
            } else if (action == 2) {
                android.view.VelocityTracker velocityTracker2 = this.e;
                if (velocityTracker2 == null) {
                    defpackage.rox.o("GH.HomeFragment", "velocityTracker was null on ACTION_MOVE", new java.lang.Object[0]);
                } else {
                    velocityTracker2.addMovement(motionEvent);
                }
                float fB = b(motionEvent);
                defpackage.kme kmeVar2 = this.j;
                float f3 = kmeVar2.c;
                if (fB <= f3 && fB >= this.b) {
                    float fMin = 1.0f - java.lang.Math.min((f3 - fB) / (this.f * 0.75f), 1.0f);
                    kmeVar2.b.setAlpha(fMin);
                    if (kmeVar2.e != null) {
                        kmeVar2.f.setAlpha(fMin);
                    }
                    kmeVar2.e.animate().y(java.lang.Math.max(fB, this.b)).setDuration(0L).start();
                }
            } else if (action != 3) {
                if (action != 4) {
                    return false;
                }
                if (b(motionEvent) <= this.b) {
                    a();
                } else if (b(motionEvent) <= this.c) {
                    velocityTracker = this.e;
                    if (velocityTracker == null) {
                        defpackage.rox.o("GH.HomeFragment", "velocityTracker was null on for computing fling velocity", new java.lang.Object[0]);
                        xVelocity = 0.0f;
                        yVelocity = 0.0f;
                    } else {
                        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.SECONDS;
                        velocityTracker.computeCurrentVelocity(1000, this.i);
                        xVelocity = this.e.getXVelocity();
                        yVelocity = this.e.getYVelocity();
                    }
                    f = -yVelocity;
                    f2 = this.h;
                    float fAbs5 = java.lang.Math.abs(yVelocity);
                    float fAbs6 = java.lang.Math.abs(xVelocity);
                    if (f > f2) {
                        c();
                    } else {
                        c();
                    }
                } else {
                    c();
                }
                d();
            } else {
                d();
                c();
            }
        } else {
            defpackage.kme kmeVar3 = this.j;
            kmeVar3.a();
            kmeVar3.c();
            this.a = kmeVar3.c - motionEvent.getRawY();
            float f4 = this.f;
            float f5 = kmeVar3.c;
            this.b = f5 - f4;
            this.c = f5 - this.g;
            android.view.VelocityTracker velocityTrackerObtain = this.e;
            if (velocityTrackerObtain == null) {
                velocityTrackerObtain = android.view.VelocityTracker.obtain();
                this.e = velocityTrackerObtain;
            }
            velocityTrackerObtain.clear();
            this.e.addMovement(motionEvent);
        }
        return true;
    }
}
