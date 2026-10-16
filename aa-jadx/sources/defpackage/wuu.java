package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wuu {
    public static final int[] a = new int[3];
    public static final float[] b = {com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
    public static final int[] c = new int[4];
    public static final float[] d = {com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
    public final android.graphics.Paint e;
    public final android.graphics.Paint f;
    public final android.graphics.Paint g;
    public int h;
    public int i;
    public int j;
    public final android.graphics.Path k = new android.graphics.Path();
    public final android.graphics.Paint l;

    public wuu() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.l = paint;
        this.e = new android.graphics.Paint();
        a(-16777216);
        paint.setColor(0);
        android.graphics.Paint paint2 = new android.graphics.Paint(4);
        this.f = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.g = new android.graphics.Paint(paint2);
    }

    public final void a(int i) {
        this.h = defpackage.dvk.e(i, 68);
        this.i = defpackage.dvk.e(i, 20);
        this.j = defpackage.dvk.e(i, 0);
        this.e.setColor(this.h);
    }
}
