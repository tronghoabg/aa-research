package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class wtv {
    public static final int[] a = new int[3];
    public static final float[] b = {BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
    public static final int[] c = new int[4];
    public static final float[] d = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public int h;
    public int i;
    public int j;
    public final Path k = new Path();
    public final Paint l;

    public wtv() {
        Paint paint = new Paint();
        this.l = paint;
        this.e = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.g = new Paint(paint2);
    }

    public final void a(int i) {
        int i2 = dvd.a;
        int i3 = i & 16777215;
        int i4 = 1140850688 | i3;
        this.h = i4;
        this.i = 335544320 | i3;
        this.j = i3;
        this.e.setColor(i4);
    }
}
