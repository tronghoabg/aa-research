package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mq implements java.lang.Runnable {
    public android.widget.OverScroller a;
    android.view.animation.Interpolator b;
    final /* synthetic */ android.support.v7.widget.RecyclerView c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;

    public mq(android.support.v7.widget.RecyclerView recyclerView) {
        this.c = recyclerView;
        android.view.animation.Interpolator interpolator = android.support.v7.widget.RecyclerView.c;
        this.b = interpolator;
        this.f = false;
        this.g = false;
        this.a = new android.widget.OverScroller(recyclerView.getContext(), interpolator);
    }

    private final void e() {
        android.support.v7.widget.RecyclerView recyclerView = this.c;
        recyclerView.removeCallbacks(this);
        int[] iArr = defpackage.ebt.a;
        recyclerView.postOnAnimation(this);
    }

    public final void a(int i, int i2) {
        android.support.v7.widget.RecyclerView recyclerView = this.c;
        recyclerView.ac(2);
        this.e = 0;
        this.d = 0;
        android.view.animation.Interpolator interpolator = this.b;
        android.view.animation.Interpolator interpolator2 = android.support.v7.widget.RecyclerView.c;
        if (interpolator != interpolator2) {
            this.b = interpolator2;
            this.a = new android.widget.OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.a.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    final void b() {
        if (this.f) {
            this.g = true;
        } else {
            e();
        }
    }

    public final void c(int i, int i2, int i3, android.view.animation.Interpolator interpolator) {
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = java.lang.Math.abs(i);
            int iAbs2 = java.lang.Math.abs(i2);
            boolean z = iAbs > iAbs2;
            android.support.v7.widget.RecyclerView recyclerView = this.c;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (true != z) {
                iAbs = iAbs2;
            }
            i3 = java.lang.Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = android.support.v7.widget.RecyclerView.c;
        }
        if (this.b != interpolator) {
            this.b = interpolator;
            this.a = new android.widget.OverScroller(this.c.getContext(), interpolator);
        }
        this.e = 0;
        this.d = 0;
        this.c.ac(2);
        this.a.startScroll(0, 0, i, i2, i4);
        b();
    }

    public final void d() {
        this.c.removeCallbacks(this);
        this.a.abortAnimation();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        android.support.v7.widget.RecyclerView recyclerView = this.c;
        if (recyclerView.n == null) {
            d();
            return;
        }
        this.g = false;
        this.f = true;
        recyclerView.z();
        android.widget.OverScroller overScroller = this.a;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.d;
            int i7 = currY - this.e;
            this.d = currX;
            this.e = currY;
            int iAq = android.support.v7.widget.RecyclerView.aq(i6, recyclerView.A, recyclerView.C, recyclerView.getWidth());
            int iAq2 = android.support.v7.widget.RecyclerView.aq(i7, recyclerView.B, recyclerView.D, recyclerView.getHeight());
            int[] iArr = recyclerView.S;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.aj(iAq, iAq2, iArr, null, 1)) {
                iAq -= iArr[0];
                iAq2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.y(iAq, iAq2);
            }
            if (recyclerView.m != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.W(iAq, iAq2, iArr);
                int i8 = iArr[0];
                i3 = iArr[1];
                iAq -= i8;
                int i9 = iAq2 - i3;
                mn mnVar = recyclerView.n.t;
                if (mnVar != null && !mnVar.e && mnVar.f) {
                    int iA = recyclerView.N.a();
                    if (iA == 0) {
                        mnVar.i();
                    } else if (mnVar.f() >= iA) {
                        mnVar.b = iA - 1;
                        mnVar.h(i8, i3);
                    } else {
                        mnVar.h(i8, i3);
                    }
                }
                i = i9;
                i2 = i8;
            } else {
                i = iAq2;
                i2 = 0;
                i3 = 0;
            }
            if (!recyclerView.p.isEmpty()) {
                recyclerView.invalidate();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int i10 = iAq;
            int i11 = i2;
            int i12 = i3;
            recyclerView.D(i11, i12, i10, i, null, 1, iArr);
            int i13 = i;
            int i14 = i10 - iArr[0];
            int i15 = i13 - iArr[1];
            if (i11 != 0) {
                recyclerView.E(i11, i12);
                i4 = i12;
            } else if (i12 != 0) {
                i11 = 0;
                recyclerView.E(i11, i12);
                i4 = i12;
            } else {
                i11 = 0;
                i4 = 0;
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            int currX2 = overScroller.getCurrX();
            int finalX = overScroller.getFinalX();
            int currY2 = overScroller.getCurrY();
            int finalY = overScroller.getFinalY();
            if (overScroller.isFinished()) {
                z = true;
            } else if (currX2 != finalX && i14 == 0) {
                z = false;
                i14 = 0;
            } else if (currY2 == finalY || i15 != 0) {
                z = true;
            } else {
                z = false;
                i15 = 0;
            }
            mn mnVar2 = recyclerView.n.t;
            if ((mnVar2 == null || !mnVar2.e) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i14 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i14 > 0 ? currVelocity : 0;
                    }
                    if (i15 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i15 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.G();
                        if (recyclerView.A.isFinished()) {
                            recyclerView.A.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.H();
                        if (recyclerView.C.isFinished()) {
                            recyclerView.C.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.I();
                        if (recyclerView.B.isFinished()) {
                            recyclerView.B.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.F();
                        if (recyclerView.D.isFinished()) {
                            recyclerView.D.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                recyclerView.M.b();
            } else {
                b();
                defpackage.lb lbVar = recyclerView.L;
                if (lbVar != null) {
                    lbVar.a(recyclerView, i11, i4);
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                defpackage.ly.l(recyclerView, java.lang.Math.abs(overScroller.getCurrVelocity()));
            }
        }
        mn mnVar3 = recyclerView.n.t;
        if (mnVar3 != null && mnVar3.e) {
            mnVar3.h(0, 0);
        }
        this.f = false;
        if (this.g) {
            e();
        } else {
            recyclerView.ac(0);
            recyclerView.ag(1);
        }
    }
}
