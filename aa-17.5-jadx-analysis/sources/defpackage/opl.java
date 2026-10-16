package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class opl extends FrameLayout {
    public oog a;
    private float b;
    private final int c;
    private boolean d;

    public opl(Context context) {
        super(context, null, 0, 0);
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b = motionEvent.getY();
            this.d = false;
            return false;
        }
        if (action != 1) {
            if (action == 2) {
                if (Math.abs(motionEvent.getY() - this.b) > this.c) {
                    this.d = true;
                    return true;
                }
            } else if (action == 3) {
                this.d = false;
                this.b = BitmapDescriptorFactory.HUE_RED;
            }
        } else if (this.d) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return true;
    }
}
