package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tvt {
    protected final float a;
    protected final float b;
    protected final long c;
    protected final int d;
    private android.view.MotionEvent e;

    protected tvt(android.view.MotionEvent motionEvent) {
        this.e = motionEvent;
        int pointerCount = motionEvent.getPointerCount();
        this.d = pointerCount;
        if (pointerCount > 1) {
            int i = 0;
            double x = motionEvent.getX(0);
            double x2 = motionEvent.getX(0);
            double y = motionEvent.getY(0);
            double y2 = motionEvent.getY(0);
            double d = y;
            double d2 = x2;
            int i2 = 1;
            double d3 = x;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i2 < this.d) {
                int i6 = i;
                int i7 = i3;
                double x3 = motionEvent.getX(i2);
                double y3 = motionEvent.getY(i2);
                d3 = d3 > x3 ? x3 : d3;
                i4 = d3 > x3 ? i2 : i4;
                d2 = d2 < x3 ? x3 : d2;
                i5 = d2 < x3 ? i2 : i5;
                d = d > y3 ? y3 : d;
                i7 = d > y3 ? i2 : i7;
                y2 = y2 < y3 ? y3 : y2;
                i = y2 < y3 ? i2 : i6;
                i2++;
                i3 = i7;
            }
            int i8 = i3;
            double d4 = d2 - d3;
            double d5 = y2 - d;
            i5 = d4 <= d5 ? i : i5;
            int i9 = d4 <= d5 ? i8 : i4;
            double x4 = motionEvent.getX(i9) - motionEvent.getX(i5);
            double y4 = motionEvent.getY(i9) - motionEvent.getY(i5);
            this.a = (float) java.lang.Math.atan2(x4, y4);
            this.b = (float) java.lang.Math.hypot(x4, y4);
        } else {
            this.a = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            this.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        this.c = motionEvent.getEventTime();
    }

    public static float a(float f, float f2, float f3, float f4) {
        return (float) java.lang.Math.atan2(f3 - f, f4 - f2);
    }

    public final float b(int i) {
        android.view.MotionEvent motionEvent = this.e;
        motionEvent.getClass();
        return motionEvent.getX(i);
    }

    public final float c(int i) {
        android.view.MotionEvent motionEvent = this.e;
        motionEvent.getClass();
        return motionEvent.getY(i);
    }

    public final void d() {
        android.view.MotionEvent motionEvent = this.e;
        motionEvent.getClass();
        motionEvent.recycle();
        this.e = null;
    }
}
