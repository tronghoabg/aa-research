package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gni extends android.graphics.drawable.Drawable {
    private static int[] b;
    private static int c;
    private static int d;
    private static float e;
    private static android.graphics.drawable.Drawable f;
    private static volatile boolean g;
    public android.graphics.Path a;
    private final android.graphics.Paint j;
    private java.lang.String k;
    private int l;
    private float n;
    private final android.graphics.Rect h = new android.graphics.Rect();
    private final char[] i = new char[1];
    private final int m = 1;
    private boolean o = false;

    public gni(android.content.res.Resources resources) {
        this.n = 1.0f;
        if (!g) {
            d(resources);
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        this.j = paint;
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint.setTypeface(android.graphics.Typeface.create(resources.getString(com.google.android.projection.gearhead.R.string.letter_tile_font_family_name), resources.getInteger(com.google.android.projection.gearhead.R.integer.letter_tile_font_typeface)));
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setAntiAlias(true);
        this.n = 0.7f;
    }

    private static synchronized void d(android.content.res.Resources resources) {
        if (g) {
            return;
        }
        c = resources.getColor(com.google.android.projection.gearhead.R.color.letter_tile_default_color);
        android.content.res.TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(com.google.android.projection.gearhead.R.array.letter_tile_colors);
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
        d = resources.getColor(com.google.android.projection.gearhead.R.color.letter_tile_font_color);
        e = resources.getFraction(com.google.android.projection.gearhead.R.fraction.letter_to_tile_ratio, 1, 1);
        f = resources.getDrawable(com.google.android.projection.gearhead.R.drawable.gs_person_fill1_vd_theme_48, null);
        resources.getDrawable(com.google.android.projection.gearhead.R.drawable.gs_person_fill1_vd_theme_48, null);
        resources.getDrawable(com.google.android.projection.gearhead.R.drawable.gs_person_fill1_vd_theme_48, null);
        g = true;
    }

    public final android.graphics.Bitmap a(int i) {
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Rect bounds = getBounds();
        setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        draw(canvas);
        setBounds(bounds);
        return bitmapCreateBitmap;
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        int i;
        this.k = str;
        if (android.text.TextUtils.isEmpty(str2)) {
            i = c;
        } else {
            int iAbs = java.lang.Math.abs(str2.hashCode());
            int[] iArr = b;
            i = iArr[iAbs % iArr.length];
        }
        this.l = i;
    }

    public final void c() {
        this.o = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        char cCharAt;
        android.graphics.Rect bounds = getBounds();
        if (!isVisible() || bounds.isEmpty()) {
            return;
        }
        android.graphics.Paint paint = this.j;
        paint.setColor(this.l);
        android.graphics.Rect bounds2 = getBounds();
        int iMin = java.lang.Math.min(bounds2.width(), bounds2.height());
        android.graphics.Path path = this.a;
        if (path != null) {
            canvas.drawPath(path, paint);
        } else if (this.o) {
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), iMin / 2, paint);
        } else {
            canvas.drawRect(bounds2, paint);
        }
        if (!android.text.TextUtils.isEmpty(this.k) && (((cCharAt = this.k.charAt(0)) >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
            char[] cArr = this.i;
            cArr[0] = java.lang.Character.toUpperCase(this.k.charAt(0));
            paint.setTextSize(this.n * e * iMin);
            android.graphics.Rect rect = this.h;
            paint.getTextBounds(cArr, 0, 1, rect);
            paint.setColor(d);
            canvas.drawText(cArr, 0, 1, bounds2.centerX(), bounds2.centerY() + (bounds2.height() * com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) + (rect.height() / 2), paint);
            return;
        }
        android.graphics.drawable.Drawable drawable = this.m != 1 ? f : f;
        android.graphics.Rect rectCopyBounds = copyBounds();
        int iMin2 = (int) ((this.n * java.lang.Math.min(rectCopyBounds.width(), rectCopyBounds.height())) / 2.0f);
        rectCopyBounds.set(rectCopyBounds.centerX() - iMin2, (int) ((rectCopyBounds.centerY() - iMin2) + (rectCopyBounds.height() * com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED)), rectCopyBounds.centerX() + iMin2, (int) (rectCopyBounds.centerY() + iMin2 + (rectCopyBounds.height() * com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED)));
        drawable.setAlpha(paint.getAlpha());
        drawable.setColorFilter(d, android.graphics.PorterDuff.Mode.SRC_IN);
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
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
    }
}
