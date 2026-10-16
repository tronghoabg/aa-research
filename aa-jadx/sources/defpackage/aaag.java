package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaag implements android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener {
    protected defpackage.aaaj a;
    public boolean b;
    private defpackage.aaak c;

    public final void a(android.content.Context context, defpackage.aaaj aaajVar, boolean z) {
        this.a = aaajVar;
        this.c = new defpackage.aaak(context, this, z);
    }

    public final void b(defpackage.aaak aaakVar, boolean z) {
        this.a.a();
        defpackage.aaaj aaajVar = this.a;
        if (z) {
            aaajVar.d(new defpackage.aaan(3, aaakVar));
        } else {
            aaajVar.d(new defpackage.aaan(2, aaakVar));
        }
    }

    public final boolean c(defpackage.aaak aaakVar, boolean z) {
        if (z) {
            return true;
        }
        return this.a.d(new defpackage.aaan(0, aaakVar));
    }

    public final boolean d(defpackage.aaak aaakVar, boolean z) {
        if (z) {
            return true;
        }
        boolean zD = this.a.d(new defpackage.aaan(1, aaakVar));
        if (zD) {
            this.a.b();
        }
        return zD;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:112:0x0202  */
    /* JADX WARN: Code duplicated, block: B:113:0x0209  */
    /* JADX WARN: Code duplicated, block: B:116:0x021a  */
    /* JADX WARN: Code duplicated, block: B:216:0x044d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc A[PHI: r2
  0x00bc: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v5 int) binds: [B:46:0x00b5, B:47:0x00b7, B:49:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    public final void e(android.view.MotionEvent motionEvent) {
        int i;
        int pointerCount;
        android.view.MotionEvent motionEvent2;
        int pointerCount2;
        defpackage.aaak aaakVar = this.c;
        int action = motionEvent.getAction();
        int i2 = (action >> 8) & 255;
        if (aaakVar.s) {
            i = -1;
            java.util.List<defpackage.aaaf> list = aaakVar.d;
            if (list.isEmpty()) {
                aaakVar.f(android.view.MotionEvent.obtain(motionEvent));
            } else if (action == 1) {
                aaakVar.e(motionEvent);
                if (i2 == 0) {
                    pointerCount = motionEvent.getPointerCount() - 1;
                } else {
                    pointerCount = 0;
                }
                aaakVar.e = motionEvent.getX(pointerCount);
                aaakVar.f = motionEvent.getY(pointerCount);
                if (!aaakVar.r) {
                    aaakVar.c();
                }
                aaakVar.d();
            } else if (action == 2) {
                aaakVar.e(motionEvent);
                aaakVar.f(aaakVar.c);
                if (aaakVar.m / aaakVar.n > 0.67f) {
                    boolean zG = false;
                    for (defpackage.aaaf aaafVar : list) {
                        defpackage.zlv.f(aaafVar.a);
                        if (!aaafVar.a) {
                            throw new java.lang.IllegalStateException("Gesture is not active: ".concat(java.lang.String.valueOf(aaafVar.getClass().getName())));
                        }
                        zG |= aaafVar.g(aaakVar);
                    }
                    if (zG) {
                        aaakVar.b = android.view.MotionEvent.obtain(motionEvent);
                    }
                }
            } else if (action == 3) {
                if (!aaakVar.r) {
                    aaakVar.c();
                }
                aaakVar.d();
            } else if (action == 6 || action == 262) {
                aaakVar.e(motionEvent);
                if (i2 == 0) {
                    pointerCount = motionEvent.getPointerCount() - 1;
                } else {
                    pointerCount = 0;
                }
                aaakVar.e = motionEvent.getX(pointerCount);
                aaakVar.f = motionEvent.getY(pointerCount);
                if (!aaakVar.r) {
                    aaakVar.c();
                }
                aaakVar.d();
            }
        } else if (action == 5 || action == 261 || action == 0) {
            i = -1;
            android.util.DisplayMetrics displayMetrics = aaakVar.a.getResources().getDisplayMetrics();
            float f = displayMetrics.widthPixels;
            float f2 = aaakVar.o;
            aaakVar.p = f - f2;
            aaakVar.q = displayMetrics.heightPixels - f2;
            aaakVar.d();
            aaakVar.b = android.view.MotionEvent.obtain(motionEvent);
            aaakVar.e(motionEvent);
            float f3 = aaakVar.p;
            float f4 = aaakVar.q;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fA = defpackage.aaak.a(motionEvent, motionEvent.getPointerCount() - 1);
            float fB = defpackage.aaak.b(motionEvent, motionEvent.getPointerCount() - 1);
            boolean z = rawX < f2 || rawY < f2 || rawX > f3 || rawY > f4;
            boolean z2 = fA < f2 || fB < f2 || fA > f3 || fB > f4;
            if (z && z2) {
                aaakVar.e = -1.0f;
                aaakVar.f = -1.0f;
                aaakVar.r = true;
            } else if (z) {
                aaakVar.e = motionEvent.getX(motionEvent.getPointerCount() - 1);
                aaakVar.f = motionEvent.getY(motionEvent.getPointerCount() - 1);
                aaakVar.r = true;
            } else if (z2) {
                aaakVar.e = motionEvent.getX(0);
                aaakVar.f = motionEvent.getY(0);
                aaakVar.r = true;
            } else {
                aaakVar.s = true;
            }
        } else if (action != 2) {
            i = -1;
            if (action != 6 || action == 262) {
                if (aaakVar.r) {
                    if (i2 == 0) {
                        pointerCount2 = motionEvent.getPointerCount() - 1;
                    } else {
                        pointerCount2 = 0;
                    }
                    aaakVar.e = motionEvent.getX(pointerCount2);
                    aaakVar.f = motionEvent.getY(pointerCount2);
                }
            } else if (action == 1) {
                action = 1;
                if (aaakVar.r) {
                    if (i2 == 0) {
                        pointerCount2 = motionEvent.getPointerCount() - 1;
                    } else {
                        pointerCount2 = 0;
                    }
                    aaakVar.e = motionEvent.getX(pointerCount2);
                    aaakVar.f = motionEvent.getY(pointerCount2);
                }
            }
        } else if (aaakVar.r) {
            float f5 = aaakVar.o;
            float f6 = aaakVar.p;
            float f7 = aaakVar.q;
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            float fA2 = defpackage.aaak.a(motionEvent, motionEvent.getPointerCount() - 1);
            i = -1;
            float fB2 = defpackage.aaak.b(motionEvent, motionEvent.getPointerCount() - 1);
            boolean z3 = rawX2 < f5 || rawY2 < f5 || rawX2 > f6 || rawY2 > f7;
            boolean z4 = fA2 < f5 || fB2 < f5 || fA2 > f6 || fB2 > f7;
            if (z3 && z4) {
                aaakVar.e = -1.0f;
                aaakVar.f = -1.0f;
            } else if (z3) {
                aaakVar.e = motionEvent.getX(motionEvent.getPointerCount() - 1);
                aaakVar.f = motionEvent.getY(motionEvent.getPointerCount() - 1);
            } else if (z4) {
                aaakVar.e = motionEvent.getX(0);
                aaakVar.f = motionEvent.getY(0);
            } else {
                aaakVar.r = false;
                aaakVar.s = true;
            }
            action = 2;
        } else {
            action = 2;
            i = -1;
            if (action != 6) {
                if (aaakVar.r) {
                    if (i2 == 0) {
                        pointerCount2 = motionEvent.getPointerCount() - 1;
                    } else {
                        pointerCount2 = 0;
                    }
                    aaakVar.e = motionEvent.getX(pointerCount2);
                    aaakVar.f = motionEvent.getY(pointerCount2);
                }
            } else if (aaakVar.r) {
                if (i2 == 0) {
                    pointerCount2 = motionEvent.getPointerCount() - 1;
                } else {
                    pointerCount2 = 0;
                }
                aaakVar.e = motionEvent.getX(pointerCount2);
                aaakVar.f = motionEvent.getY(pointerCount2);
            }
        }
        defpackage.aaai aaaiVar = aaakVar.t;
        int action2 = motionEvent.getAction();
        if (aaaiVar.x == null) {
            aaaiVar.x = android.view.VelocityTracker.obtain();
        }
        aaaiVar.x.addMovement(motionEvent);
        int i3 = action2 & 255;
        boolean z5 = i3 == 6;
        int actionIndex = z5 ? motionEvent.getActionIndex() : i;
        int pointerCount3 = motionEvent.getPointerCount();
        float x = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        float y = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        for (int i4 = 0; i4 < pointerCount3; i4++) {
            if (actionIndex != i4) {
                x += motionEvent.getX(i4);
                y += motionEvent.getY(i4);
            }
        }
        float f8 = z5 ? pointerCount3 - 1 : pointerCount3;
        float f9 = x / f8;
        float f10 = y / f8;
        if (i3 == 0) {
            if (aaaiVar.k != null) {
                android.os.Handler handler = aaaiVar.i;
                boolean zHasMessages = handler.hasMessages(3);
                if (zHasMessages) {
                    handler.removeMessages(3);
                }
                android.view.MotionEvent motionEvent3 = aaaiVar.p;
                if (motionEvent3 == null || (motionEvent2 = aaaiVar.q) == null || !zHasMessages || !aaaiVar.o || motionEvent.getEventTime() - motionEvent2.getEventTime() > defpackage.aaai.c) {
                    handler.sendEmptyMessageDelayed(3, defpackage.aaai.c);
                } else {
                    int x2 = (int) motionEvent3.getX();
                    int x3 = (int) motionEvent.getX();
                    int y2 = ((int) motionEvent3.getY()) - ((int) motionEvent.getY());
                    int i5 = x2 - x3;
                    if ((i5 * i5) + (y2 * y2) < aaaiVar.f) {
                        aaaiVar.r = true;
                        aaaiVar.k.onDoubleTap(aaaiVar.p);
                        aaaiVar.k.onDoubleTapEvent(motionEvent);
                    } else {
                        handler.sendEmptyMessageDelayed(3, defpackage.aaai.c);
                    }
                }
            }
            aaaiVar.s = f9;
            aaaiVar.u = f9;
            aaaiVar.t = f10;
            aaaiVar.v = f10;
            android.view.MotionEvent motionEvent4 = aaaiVar.p;
            if (motionEvent4 != null) {
                motionEvent4.recycle();
            }
            aaaiVar.p = android.view.MotionEvent.obtain(motionEvent);
            aaaiVar.n = true;
            aaaiVar.o = true;
            aaaiVar.l = true;
            aaaiVar.m = false;
            if (aaaiVar.w) {
                android.os.Handler handler2 = aaaiVar.i;
                handler2.removeMessages(2);
                handler2.sendEmptyMessageAtTime(2, aaaiVar.p.getDownTime() + ((long) defpackage.aaai.b) + ((long) defpackage.aaai.a));
            }
            aaaiVar.i.sendEmptyMessageAtTime(1, aaaiVar.p.getDownTime() + ((long) defpackage.aaai.b));
            aaaiVar.j.onDown(motionEvent);
        } else if (i3 == 1) {
            aaaiVar.l = false;
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
            if (aaaiVar.r) {
                aaaiVar.k.onDoubleTapEvent(motionEvent);
            } else if (aaaiVar.m) {
                aaaiVar.i.removeMessages(3);
                aaaiVar.m = false;
                aaaiVar.j.onSingleTapUp(motionEvent);
            } else if (aaaiVar.n) {
                aaaiVar.j.onSingleTapUp(motionEvent);
            } else {
                android.view.VelocityTracker velocityTracker = aaaiVar.x;
                int pointerId = motionEvent.getPointerId(0);
                velocityTracker.computeCurrentVelocity(1000, aaaiVar.h);
                float yVelocity = velocityTracker.getYVelocity(pointerId);
                float xVelocity = velocityTracker.getXVelocity(pointerId);
                if (java.lang.Math.abs(yVelocity) > aaaiVar.g || java.lang.Math.abs(xVelocity) > aaaiVar.g) {
                    aaaiVar.j.onFling(aaaiVar.p, motionEvent, xVelocity, yVelocity);
                }
            }
            android.view.MotionEvent motionEvent5 = aaaiVar.q;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            aaaiVar.q = motionEventObtain;
            android.view.VelocityTracker velocityTracker2 = aaaiVar.x;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                aaaiVar.x = null;
            }
            aaaiVar.r = false;
            android.os.Handler handler3 = aaaiVar.i;
            handler3.removeMessages(1);
            handler3.removeMessages(2);
        } else if (i3 == 2) {
            float f11 = aaaiVar.s - f9;
            float f12 = aaaiVar.t - f10;
            if (aaaiVar.r) {
                aaaiVar.k.onDoubleTapEvent(motionEvent);
            } else if (aaaiVar.n) {
                float f13 = f9 - aaaiVar.u;
                int i6 = (int) (f10 - aaaiVar.v);
                int i7 = (int) f13;
                int i8 = (i7 * i7) + (i6 * i6);
                if (i8 > aaaiVar.d) {
                    aaaiVar.j.onScroll(aaaiVar.p, motionEvent, f11, f12);
                    aaaiVar.s = f9;
                    aaaiVar.t = f10;
                    aaaiVar.n = false;
                    android.os.Handler handler4 = aaaiVar.i;
                    handler4.removeMessages(3);
                    handler4.removeMessages(1);
                    handler4.removeMessages(2);
                }
                if (i8 > aaaiVar.e) {
                    aaaiVar.o = false;
                }
            } else if (java.lang.Math.abs(f11) >= 1.0f || java.lang.Math.abs(f12) >= 1.0f) {
                aaaiVar.j.onScroll(aaaiVar.p, motionEvent, f11, f12);
                aaaiVar.s = f9;
                aaaiVar.t = f10;
            }
        } else if (i3 == 3) {
            android.os.Handler handler5 = aaaiVar.i;
            handler5.removeMessages(1);
            handler5.removeMessages(2);
            handler5.removeMessages(3);
            aaaiVar.x.recycle();
            aaaiVar.x = null;
            aaaiVar.r = false;
            aaaiVar.l = false;
            aaaiVar.n = false;
            aaaiVar.o = false;
            if (aaaiVar.m) {
                aaaiVar.m = false;
            }
        } else if (i3 == 5) {
            aaaiVar.s = f9;
            aaaiVar.u = f9;
            aaaiVar.t = f10;
            aaaiVar.v = f10;
            android.os.Handler handler6 = aaaiVar.i;
            handler6.removeMessages(1);
            handler6.removeMessages(2);
            handler6.removeMessages(3);
            aaaiVar.r = false;
            aaaiVar.n = false;
            aaaiVar.o = false;
            if (aaaiVar.m) {
                aaaiVar.m = false;
            }
        } else if (i3 == 6) {
            aaaiVar.s = f9;
            aaaiVar.u = f9;
            aaaiVar.t = f10;
            aaaiVar.v = f10;
            aaaiVar.x.computeCurrentVelocity(1000, aaaiVar.h);
            int actionIndex2 = motionEvent.getActionIndex();
            int pointerId2 = motionEvent.getPointerId(actionIndex2);
            float xVelocity2 = aaaiVar.x.getXVelocity(pointerId2);
            float yVelocity2 = aaaiVar.x.getYVelocity(pointerId2);
            for (int i9 = 0; i9 < pointerCount3; i9++) {
                if (i9 != actionIndex2) {
                    int pointerId3 = motionEvent.getPointerId(i9);
                    if ((aaaiVar.x.getXVelocity(pointerId3) * xVelocity2) + (aaaiVar.x.getYVelocity(pointerId3) * yVelocity2) < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                        aaaiVar.x.clear();
                        break;
                    }
                }
            }
        }
        if (action == 3 || action == 1) {
            aaakVar.u.a.f();
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        return this.a.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        return this.a.onDoubleTapEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent motionEvent) {
        this.a.onDown(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        return this.a.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent motionEvent) {
        this.a.onLongPress(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        return !this.b && this.a.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(android.view.MotionEvent motionEvent) {
        this.a.onShowPress(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        return this.a.onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return this.a.onSingleTapUp(motionEvent);
    }
}
