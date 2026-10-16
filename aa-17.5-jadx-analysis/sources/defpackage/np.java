package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.List;

/* loaded from: classes2.dex */
final class np implements mc {
    final /* synthetic */ nv a;

    public np(nv nvVar) {
        this.a = nvVar;
    }

    @Override // defpackage.mc
    public final void c(boolean z) {
        if (z) {
            this.a.j(null, 0);
        }
    }

    @Override // defpackage.mc
    public final boolean j(MotionEvent motionEvent) {
        nv nvVar = this.a;
        nvVar.s.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        nu nuVar = null;
        if (actionMasked == 0) {
            nvVar.k = motionEvent.getPointerId(0);
            nvVar.c = motionEvent.getX();
            nvVar.d = motionEvent.getY();
            nvVar.f();
            if (nvVar.b == null) {
                List list = nvVar.n;
                if (!list.isEmpty()) {
                    View viewC = nvVar.c(motionEvent);
                    int size = list.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        nu nuVar2 = (nu) list.get(size);
                        if (nuVar2.h.a == viewC) {
                            nuVar = nuVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (nuVar != null) {
                    nvVar.c -= nuVar.l;
                    nvVar.d -= nuVar.m;
                    mo moVar = nuVar.h;
                    nvVar.d(moVar, true);
                    if (nvVar.a.remove(moVar.a)) {
                        nvVar.l.c(nvVar.o, moVar);
                    }
                    nvVar.j(moVar, nuVar.i);
                    nvVar.k(motionEvent, nvVar.m, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            nvVar.k = -1;
            nvVar.j(null, 0);
        } else {
            int i = nvVar.k;
            if (i != -1) {
                motionEvent.findPointerIndex(i);
            }
        }
        VelocityTracker velocityTracker = nvVar.q;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return nvVar.b != null;
    }

    @Override // defpackage.mc
    public final void k(MotionEvent motionEvent) {
        nv nvVar = this.a;
        nvVar.s.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = nvVar.q;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (nvVar.k == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(nvVar.k);
        mo moVar = nvVar.b;
        if (moVar != null) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        nvVar.k(motionEvent, nvVar.m, iFindPointerIndex);
                        nvVar.e(moVar);
                        Runnable runnable = nvVar.p;
                        nvVar.o.removeCallbacks(runnable);
                        runnable.run();
                        nvVar.o.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == nvVar.k) {
                        nvVar.k = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        nvVar.k(motionEvent, nvVar.m, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = nvVar.q;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            nvVar.j(null, 0);
            nvVar.k = -1;
        }
    }
}
