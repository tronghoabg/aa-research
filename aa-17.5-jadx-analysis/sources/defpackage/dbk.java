package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class dbk implements GestureDetector.OnGestureListener {
    final /* synthetic */ dbl a;

    public dbk(dbl dblVar) {
        this.a = dblVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        dbl dblVar = this.a;
        if (!dblVar.c) {
            int i = dblVar.b;
            if (a.Y(i, 1)) {
                if (Math.abs(f) > Math.abs(f2)) {
                    dblVar.a.invoke(new chr(f > BitmapDescriptorFactory.HUE_RED ? 1 : 2));
                }
            } else if (a.Y(i, 2) && Math.abs(f2) > Math.abs(f)) {
                dblVar.a.invoke(new chr(f2 > BitmapDescriptorFactory.HUE_RED ? 1 : 2));
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
