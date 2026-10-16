package android.support.v7.widget.a;

import android.support.v7.widget.fe;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class g extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f1001a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1002b = true;

    g(j jVar) {
        this.f1001a = jVar;
    }

    final void a() {
        this.f1002b = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        j jVar;
        View viewA;
        fe feVarO;
        if (!this.f1002b || (viewA = (jVar = this.f1001a).a(motionEvent)) == null || (feVarO = jVar.f1024k.o(viewA)) == null || (jVar.f1021h.h(jVar.f1024k) & 16711680) == 0) {
            return;
        }
        int pointerId = motionEvent.getPointerId(0);
        int i2 = jVar.f1020g;
        if (pointerId == i2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(i2);
            float x = motionEvent.getX(iFindPointerIndex);
            float y = motionEvent.getY(iFindPointerIndex);
            jVar.f1016c = x;
            jVar.f1017d = y;
            jVar.f1019f = 0.0f;
            jVar.f1018e = 0.0f;
            jVar.h(feVarO, 2);
        }
    }
}
