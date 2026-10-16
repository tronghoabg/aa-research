package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class ns extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    final /* synthetic */ nv b;

    public ns(nv nvVar) {
        this.b = nvVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        nv nvVar;
        View viewC;
        mo moVarJ;
        if (this.a && (viewC = (nvVar = this.b).c(motionEvent)) != null && (moVarJ = nvVar.o.j(viewC)) != null && nvVar.l.d(nvVar.o, moVarJ)) {
            int pointerId = motionEvent.getPointerId(0);
            int i = nvVar.k;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                nvVar.c = x;
                nvVar.d = y;
                nvVar.h = BitmapDescriptorFactory.HUE_RED;
                nvVar.g = BitmapDescriptorFactory.HUE_RED;
                nvVar.j(moVarJ, 2);
            }
        }
    }
}
