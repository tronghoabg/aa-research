package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class nwl implements View.OnTouchListener {
    private static final yph a = yph.c("GH.HunSwipeHandler");
    private final Runnable b;
    private boolean c = false;
    private float d = BitmapDescriptorFactory.HUE_RED;
    private float e = BitmapDescriptorFactory.HUE_RED;

    public nwl(Runnable runnable) {
        this.b = runnable;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.c) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
            } else if (action == 2) {
                float x = motionEvent.getX() - this.d;
                float y = motionEvent.getY() - this.e;
                float fAbs = Math.abs(y);
                float fAbs2 = Math.abs(x);
                boolean z = true;
                boolean z2 = y < BitmapDescriptorFactory.HUE_RED && Math.abs(y) > Math.abs(x);
                float fAbs3 = Math.abs(x);
                float fAbs4 = Math.abs(y);
                if (fAbs > 60.0f && z2) {
                    this.b.run();
                    ((ype) a.l().ai((char) 5518)).u("Hun dismissed due to swipe up");
                } else if (fAbs2 <= 60.0f || fAbs3 <= fAbs4) {
                    z = false;
                } else {
                    this.b.run();
                    ((ype) a.l().ai((char) 5517)).u("Hun dismissed due to swipe left or right");
                }
                this.c = z;
            }
        }
        return this.c;
    }
}
