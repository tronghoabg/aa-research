package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oqe extends android.widget.FrameLayout {
    public defpackage.oox a;
    private float b;
    private final int c;
    private boolean d;

    public oqe(android.content.Context context) {
        super(context, null, 0, 0);
        this.c = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b = motionEvent.getY();
            this.d = false;
            return false;
        }
        if (action != 1) {
            if (action == 2) {
                if (java.lang.Math.abs(motionEvent.getY() - this.b) > this.c) {
                    this.d = true;
                    return true;
                }
            } else if (action == 3) {
                this.d = false;
                this.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            }
        } else if (this.d) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        motionEvent.getClass();
        return true;
    }
}
