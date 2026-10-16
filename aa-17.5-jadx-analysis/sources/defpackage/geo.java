package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes2.dex */
final class geo extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ gep a;

    public geo(gep gepVar) {
        this.a = gepVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        gep gepVar = this.a;
        gepVar.k = motionEvent.getX();
        gepVar.l = motionEvent.getY();
        gepVar.m = 1;
        return true;
    }
}
