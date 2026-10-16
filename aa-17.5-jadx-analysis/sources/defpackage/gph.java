package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.PlaceMarker;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class gph {
    public final Bitmap a;
    public final Bitmap b;
    public final Path c;
    public final gpg d;
    private Bitmap e;
    private final Paint f;

    public gph(Context context, gpg gpgVar) throws Resources.NotFoundException {
        this.d = gpgVar;
        int i = gpgVar.d;
        Path pathF = f(i, gpgVar.f + i, gpgVar);
        this.c = pathF;
        int i2 = gpgVar.d;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, gpgVar.f + i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setDensity(gpgVar.s);
        b(new Canvas(bitmapCreateBitmap), gpgVar, gpgVar.a, gpgVar.b, pathF);
        this.b = bitmapCreateBitmap;
        Bitmap bitmapA = a(context, gpgVar.i, gpgVar);
        this.a = bitmapA;
        bitmapA.setDensity(gpgVar.s);
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static Bitmap a(Context context, int i, gpg gpgVar) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        Drawable drawable = resources.getDrawable(R.drawable.anchor_marker);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        Drawable drawable2 = resources.getDrawable(R.drawable.anchor_marker_border);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        drawable2.setColorFilter(gpgVar.j, PorterDuff.Mode.SRC_IN);
        Drawable drawable3 = resources.getDrawable(R.drawable.anchor_marker_circle);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        drawable3.setColorFilter(gpgVar.k, PorterDuff.Mode.SRC_IN);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setDensity(gpgVar.s);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.draw(canvas);
        drawable2.draw(canvas);
        drawable3.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static void b(Canvas canvas, gpg gpgVar, int i, int i2, Path path) {
        int width = canvas.getWidth();
        int i3 = gpgVar.d;
        if (width != i3) {
            path = f(canvas.getWidth(), i3 + gpgVar.f, gpgVar);
        }
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        canvas.drawPath(path, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i2);
        paint.setStrokeWidth(gpgVar.g);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPath(path, paint);
    }

    private static Path f(int i, int i2, gpg gpgVar) {
        Path path = new Path();
        RectF rectF = new RectF();
        int i3 = gpgVar.g;
        int i4 = i - i3;
        float f = i4;
        float f2 = f / 2.0f;
        float f3 = i2 - i3;
        path.moveTo(f2, f3);
        float f4 = gpgVar.e / 2.0f;
        float f5 = f3 - gpgVar.f;
        path.lineTo(f2 - f4, f5);
        int i5 = gpgVar.h;
        float f6 = i5;
        path.lineTo(f6, f5);
        int i6 = i5 + i5;
        float f7 = i6;
        float f8 = f5 - f7;
        rectF.set(BitmapDescriptorFactory.HUE_RED, f8, f7, f5);
        path.arcTo(rectF, 90.0f, 90.0f, false);
        path.lineTo(BitmapDescriptorFactory.HUE_RED, f6);
        RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f7, f7);
        path.arcTo(rectF2, 180.0f, 90.0f, false);
        path.lineTo(i4 - i5, BitmapDescriptorFactory.HUE_RED);
        float f9 = i4 - i6;
        rectF2.set(f9, BitmapDescriptorFactory.HUE_RED, f, f7);
        path.arcTo(rectF2, 270.0f, 90.0f, false);
        path.lineTo(f, f5 - f6);
        rectF2.set(f9, f8, f, f5);
        path.arcTo(rectF2, BitmapDescriptorFactory.HUE_RED, 90.0f, false);
        path.lineTo(f2 + f4, f5);
        path.close();
        float f10 = i3 / 2.0f;
        path.offset(f10, f10);
        return path;
    }

    private static boolean g(PlaceMarker placeMarker) {
        return placeMarker.getIconType() == 1;
    }

    public final Bitmap c(geu geuVar, PlaceMarker placeMarker) {
        CarText label = placeMarker.getLabel();
        Bitmap bitmapD = null;
        String string = label != null ? label.toString() : null;
        CarIcon icon = placeMarker.getIcon();
        if (icon != null) {
            bitmapD = d(geuVar, placeMarker, icon, false);
        } else if (string != null && !string.isEmpty()) {
            int iE = e(geuVar, placeMarker);
            gpg gpgVar = this.d;
            Paint paint = gpgVar.r;
            if (iE != paint.getColor()) {
                Paint paint2 = new Paint(paint);
                paint2.setColor(iE);
                paint = paint2;
            }
            Resources resources = geuVar.getResources();
            int i = gpgVar.t;
            bitmapD = i > 0 ? hbz.d(new BitmapDrawable(resources, hbz.f(string, paint)), i, i, resources.getDisplayMetrics().densityDpi, 3) : hbz.f(string, paint);
        }
        if (bitmapD != null) {
            bitmapD.setDensity(this.d.s);
        }
        return bitmapD;
    }

    public final Bitmap d(geu geuVar, PlaceMarker placeMarker, CarIcon carIcon, boolean z) {
        boolean zG = g(placeMarker);
        gpg gpgVar = this.d;
        int i = zG ? gpgVar.o : gpgVar.m;
        gpg gpgVar2 = this.d;
        hmb hmbVar = hmb.a;
        Bitmap bitmapE = hbz.e(geuVar, carIcon, i, i, new hmb(gpgVar2.l, !g(placeMarker), z, ghw.b, null, false, 0), 0);
        if (bitmapE == null) {
            gks.e("CarApp.H.Tem", "Failed to get bitmap for marker: %s", placeMarker);
            return bitmapE;
        }
        if (!zG) {
            return bitmapE;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        int i2 = gpgVar2.s;
        bitmapCreateBitmap.setDensity(i2);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Bitmap bitmap = this.e;
        if (bitmap == null) {
            int i3 = gpgVar2.o;
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i3, i3, Bitmap.Config.ALPHA_8);
            this.e = bitmapCreateBitmap2;
            bitmapCreateBitmap2.setDensity(i2);
            Canvas canvas2 = new Canvas(this.e);
            float f = i3;
            float f2 = gpgVar2.p;
            canvas2.drawRoundRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f, f2, f2, new Paint());
            bitmap = this.e;
        }
        canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        canvas.drawBitmap(bitmapE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f);
        return bitmapCreateBitmap;
    }

    public final int e(geu geuVar, PlaceMarker placeMarker) {
        return placeMarker.getIconType() != 1 ? gbt.k(geuVar, placeMarker.getColor(), !gca.f(geuVar), this.d.a, ghv.a, 0) : this.d.a;
    }
}
