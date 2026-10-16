package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class gnb extends Drawable {
    private static int[] b;
    private static int c;
    private static int d;
    private static float e;
    private static Drawable f;
    private static volatile boolean g;
    public Path a;
    private final Paint j;
    private String k;
    private int l;
    private float n;
    private final Rect h = new Rect();
    private final char[] i = new char[1];
    private final int m = 1;
    private boolean o = false;

    public gnb(Resources resources) {
        this.n = 1.0f;
        if (!g) {
            d(resources);
        }
        Paint paint = new Paint();
        this.j = paint;
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint.setTypeface(Typeface.create(resources.getString(R.string.letter_tile_font_family_name), resources.getInteger(R.integer.letter_tile_font_typeface)));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        this.n = 0.7f;
    }

    private static synchronized void d(Resources resources) {
        if (g) {
            return;
        }
        c = resources.getColor(R.color.letter_tile_default_color);
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(R.array.letter_tile_colors);
        if (typedArrayObtainTypedArray.length() == 0) {
            b = new int[]{c};
        } else {
            b = new int[typedArrayObtainTypedArray.length()];
            int length = typedArrayObtainTypedArray.length();
            while (true) {
                length--;
                if (length < 0) {
                    break;
                } else {
                    b[length] = typedArrayObtainTypedArray.getColor(length, c);
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        d = resources.getColor(R.color.letter_tile_font_color);
        e = resources.getFraction(R.fraction.letter_to_tile_ratio, 1, 1);
        f = resources.getDrawable(R.drawable.gs_person_fill1_vd_theme_48, null);
        resources.getDrawable(R.drawable.gs_person_fill1_vd_theme_48, null);
        resources.getDrawable(R.drawable.gs_person_fill1_vd_theme_48, null);
        g = true;
    }

    public final Bitmap a(int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect bounds = getBounds();
        setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        draw(canvas);
        setBounds(bounds);
        return bitmapCreateBitmap;
    }

    public final void b(String str, String str2) {
        int i;
        this.k = str;
        if (TextUtils.isEmpty(str2)) {
            i = c;
        } else {
            int iAbs = Math.abs(str2.hashCode());
            int[] iArr = b;
            i = iArr[iAbs % iArr.length];
        }
        this.l = i;
    }

    public final void c() {
        this.o = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        char cCharAt;
        Rect bounds = getBounds();
        if (!isVisible() || bounds.isEmpty()) {
            return;
        }
        Paint paint = this.j;
        paint.setColor(this.l);
        Rect bounds2 = getBounds();
        int iMin = Math.min(bounds2.width(), bounds2.height());
        Path path = this.a;
        if (path != null) {
            canvas.drawPath(path, paint);
        } else if (this.o) {
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), iMin / 2, paint);
        } else {
            canvas.drawRect(bounds2, paint);
        }
        if (!TextUtils.isEmpty(this.k) && (((cCharAt = this.k.charAt(0)) >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
            char[] cArr = this.i;
            cArr[0] = Character.toUpperCase(this.k.charAt(0));
            paint.setTextSize(this.n * e * iMin);
            paint.getTextBounds(cArr, 0, 1, this.h);
            paint.setColor(d);
            canvas.drawText(cArr, 0, 1, bounds2.centerX(), bounds2.centerY() + (bounds2.height() * BitmapDescriptorFactory.HUE_RED) + (r9.height() / 2), paint);
            return;
        }
        Drawable drawable = this.m != 1 ? f : f;
        Rect rectCopyBounds = copyBounds();
        int iMin2 = (int) ((this.n * Math.min(rectCopyBounds.width(), rectCopyBounds.height())) / 2.0f);
        rectCopyBounds.set(rectCopyBounds.centerX() - iMin2, (int) ((rectCopyBounds.centerY() - iMin2) + (rectCopyBounds.height() * BitmapDescriptorFactory.HUE_RED)), rectCopyBounds.centerX() + iMin2, (int) (rectCopyBounds.centerY() + iMin2 + (rectCopyBounds.height() * BitmapDescriptorFactory.HUE_RED)));
        drawable.setAlpha(paint.getAlpha());
        drawable.setColorFilter(d, PorterDuff.Mode.SRC_IN);
        drawable.setBounds(rectCopyBounds);
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.j.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
    }
}
