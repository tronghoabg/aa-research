package android.support.v7.widget.a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.eq;
import android.support.v7.widget.fe;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class b implements eq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f991a;

    b(j jVar) {
        this.f991a = jVar;
    }

    @Override // android.support.v7.widget.eq
    public final void a(boolean z) {
        if (z) {
            this.f991a.h(null, 0);
        }
    }

    @Override // android.support.v7.widget.eq
    public final boolean h(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        j jVar = this.f991a;
        jVar.o.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        i iVar = null;
        if (actionMasked == 0) {
            jVar.f1020g = motionEvent.getPointerId(0);
            jVar.f1016c = motionEvent.getX();
            jVar.f1017d = motionEvent.getY();
            VelocityTracker velocityTracker = jVar.m;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            jVar.m = VelocityTracker.obtain();
            if (jVar.f1015b == null) {
                List list = jVar.f1023j;
                if (!list.isEmpty()) {
                    View viewA = jVar.a(motionEvent);
                    int size = list.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        i iVar2 = (i) list.get(size);
                        if (iVar2.f1009h.itemView == viewA) {
                            iVar = iVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (iVar != null) {
                    jVar.f1016c -= iVar.f1013l;
                    jVar.f1017d -= iVar.m;
                    fe feVar = iVar.f1009h;
                    jVar.d(feVar, true);
                    if (jVar.f1014a.remove(feVar.itemView)) {
                        jVar.f1021h.d();
                    }
                    jVar.h(feVar, iVar.f1010i);
                    jVar.i(motionEvent, jVar.f1022i, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            jVar.f1020g = -1;
            jVar.h(null, 0);
        } else {
            int i2 = jVar.f1020g;
            if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) >= 0) {
                jVar.c(actionMasked, motionEvent, iFindPointerIndex);
            }
        }
        VelocityTracker velocityTracker2 = jVar.m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return jVar.f1015b != null;
    }

    @Override // android.support.v7.widget.eq
    public final void i(MotionEvent motionEvent) {
        j jVar = this.f991a;
        jVar.o.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = jVar.m;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (jVar.f1020g == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(jVar.f1020g);
        if (iFindPointerIndex >= 0) {
            jVar.c(actionMasked, motionEvent, iFindPointerIndex);
        }
        fe feVar = jVar.f1015b;
        if (feVar != null) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        jVar.i(motionEvent, jVar.f1022i, iFindPointerIndex);
                        jVar.e(feVar);
                        Runnable runnable = jVar.f1025l;
                        jVar.f1024k.removeCallbacks(runnable);
                        runnable.run();
                        jVar.f1024k.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == jVar.f1020g) {
                        jVar.f1020g = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        jVar.i(motionEvent, jVar.f1022i, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = jVar.m;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            jVar.h(null, 0);
            jVar.f1020g = -1;
        }
    }
}
